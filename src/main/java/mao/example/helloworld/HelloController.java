package mao.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @mao
 * @create: 2020-10-01
 */
//RestController为开发提供了方便，在提供json接口时需要的配置操作不需要自己配置
    //RestController注解相当于@ResponseBody和@Controller的结合
@RestController
public class HelloController {
    //@Value("${hello.msg}")
    private String msg;
    //RequestMapping是一个用来处理请求地址映射的注解，使用的范围是：类或方法。用于类上，表示
    //类中所有响应请求的方法都是以该地址作为父路径。
    @RequestMapping("/hello") //将URL绑定到方法上
    //定义一个方法
    public String showMsg() {
        //String str=null;
        //str.length();
        throw new ApplicationException("出错了");
        //return this.msg;
    }
}

