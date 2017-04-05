package thymeleafexamples.stsm.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HealthCheckController {

    @RequestMapping({ "/live" })
    public ResponseEntity<String> livenessProbe() {
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @RequestMapping({ "/ready" })
    public ResponseEntity<String> readinessProbe() {
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
