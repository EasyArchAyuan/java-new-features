import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author Ayuan
 * @Description: 全新的HttpClient使用,支持HTTP2和WebSocket协议
 * @date 2022/9/30 15:01
 */
public class Http {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        //直接创建一个新的HttpClient
        HttpClient client =HttpClient.newHttpClient();
        //现在我们只需要构造一个Http请求实体，就可以让客户端帮助我们发送出去了（实际上就跟浏览器访问类似）
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://www.baidu.com")).build();
        //现在我们就可以把请求发送出去了，注意send方法后面还需要一个响应体处理器（内置了很多）这里我们选择ofString直接吧响应实体转换为String字符串
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
