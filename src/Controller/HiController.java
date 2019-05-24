package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // 引入Model类
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {

//  处理路径为rootUrl/hi/say
    @RequestMapping("/say")
    public String say(Model model){
        model.addAttribute("name","名字");
        model.addAttribute("url","http://long95288.github.io");
        return "say";
    }
// 处理路径为rootUrl/hi/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
