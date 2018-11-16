package autoConfiguration.test;

import autoConfiguration.AutoConfiguration.properties.MyProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestMyProperties {

    private MyProperties myProperties;
    //实验证明  有参构造会把参数MyProperties加入到容器中，并获取这个对象myProperties，既构造依赖注入
    public TestMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @RequestMapping("/h")
    @ResponseBody
    public  String hello(){
        System.out.println(myProperties.getName()+"\n"+myProperties.getPath());
        return "hello";
    }

}
