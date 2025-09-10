package yechan.inflearn_spring_mvc_1_1.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MappingController {

    @RequestMapping({"/hello-basic", "/hello-hello"})
    public String helloBasic() {

        return "hello basic";
    }
}
