package Mycontroller;


import Myservice.myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {


    myservice ms;

    @RequestMapping("/home")
    public String display()
    {
        //return "Welcome to Spring profile";
        return "<html><body><h1>"+ms.getWeburl()+"</h1></body></html>";
    }

    @Autowired
    public void setMs(myservice ms) {
        this.ms = ms;
    }
}
