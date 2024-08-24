package Myservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class myservice {

    @Value("${mywebpage}")
    String weburl;

    public void setWeburl(String weburl) {
        this.weburl = weburl;
    }

    public String getWeburl() {
        return weburl;
    }
}
