package resttemplatedemo;

import org.springframework.web.client.RestTemplate;

public class Client {
    public static void main(String[] args) {
        String url = "http://localhost:8080/sayHello";
        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject(url, String.class);
        System.out.println(str);
    }
}
