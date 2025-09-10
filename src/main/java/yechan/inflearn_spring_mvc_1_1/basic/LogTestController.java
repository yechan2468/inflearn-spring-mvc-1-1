package yechan.inflearn_spring_mvc_1_1.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    @RequestMapping("/log-test")
    public String logTest() {
        String message = "hello";

        log.trace("logger says '{}'", message);
        log.debug("logger says '{}'", message);
        log.info("logger says '{}'", message);
        log.warn("logger says '{}'", message);
        log.error("logger says '{}'", message);

        return message;
    }
}
