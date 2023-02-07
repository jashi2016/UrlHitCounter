package com.kiran.urlHitCounter.Controller;

import com.kiran.urlHitCounter.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kiran.urlHitCounter.Service.urlHit;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class urlHitCounterController {
    @Autowired
    urlHit urlhit;

    @GetMapping("/count")
    public ResponseEntity<String> getHitCount(){
        String count = urlhit.getHitCount();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }
}
