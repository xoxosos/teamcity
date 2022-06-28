package com.example.teamcity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinRenJie
 */
@SpringBootApplication
@RestController("/hello/")
public class TeamcityApplication {
@RequestMapping(value = "teamcity" , method = RequestMethod.GET)
 public String teamcity(){
    return "hello teamcity";
}
    public static void main(String[] args) {
        SpringApplication.run(TeamcityApplication.class, args);
    }

}
