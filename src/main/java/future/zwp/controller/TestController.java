package future.zwp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        System.out.println("哈哈哈哈哈哈哈");
        return "哈哈哈";
    }



    @RequestMapping("test2")
    public String test2(){
        System.out.println("跳转jsp==================");
        return "index";
    }
}
