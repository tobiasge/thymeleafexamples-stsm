package thymeleafexamples.stsm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HealthCheckController {

    @RequestMapping({ "/live" })
    public String livenessProbe() {
        return "health";
    }

    @RequestMapping({ "/ready" })
    public String readinessProbe() {
        return "health";
    }
}
