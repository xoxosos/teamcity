package com.example.teamcity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinRenJie
 */
@SpringBootApplication
@RestController
@RequestMapping("/hello/")
@Slf4j
public class TeamcityApplication {
@RequestMapping(value = "teamcity" , method = RequestMethod.GET)
 public String teamcity(){
    log.info("teamcity...");
    return "hello teamcity";
}
    public static void main(String[] args) {
        SpringApplication.run(TeamcityApplication.class, args);
    }

}
