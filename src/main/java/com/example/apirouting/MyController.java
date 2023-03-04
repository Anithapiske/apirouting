
package com.example.apirouting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apirouting.MyService;
@RestController
public class MyController{
    String value = MyService.a();
    String value2=MyService.b();
    @GetMapping("/")
    public String homePage(){
        return value;
    }
    @GetMapping("/about")
    public String aboutPage(){
        return value2;

    }
}
