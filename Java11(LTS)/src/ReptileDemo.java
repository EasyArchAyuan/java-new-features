import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author Ayuan
 * @Description: 爬虫demo
 * @date 2022/9/30 15:06
 */
public class ReptileDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        for (int i = 0; i < 10; i++) {
            HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://pic.netbian.com/tupian/" + (29327 + i) + ".html")).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String html = response.body();
            //先找好我们要截取的前面一段，作为前缀去匹配位置
            String prefix = "<a href=\"\" id=\"img\"><img src=\"";
            //再找好我们要截取的屁股后面紧接着的位置，作为后缀去匹配位置
            String suffix = "\" data-pic=";
            html = html.substring(html.indexOf(prefix) + prefix.length());
            html = html.substring(0, html.indexOf(suffix));
            //创建请求，把图片取到
            HttpRequest imageRequest = HttpRequest.newBuilder().uri(new URI("https://pic.netbian.com" + html)).build();
            //这里以输入流的方式获取，不过貌似可以直接下载文件，各位小伙伴可以单独试试看
            HttpResponse<InputStream> imageResponse = client.send(imageRequest, HttpResponse.BodyHandlers.ofInputStream());
            //拿到输入流和文件输出流
            InputStream imageInput = imageResponse.body();
            //一会要保存的格式
            FileOutputStream stream = new FileOutputStream("images/" + i + ".jpg");
            //直接把要close的变量放进来就行，简洁一些了
            try (stream; imageInput) {
                int size;
                byte[] data = new byte[1024];
                while ((size = imageInput.read(data)) > 0) {
                    stream.write(data, 0, size);
                }
            }
        }
    }
}
