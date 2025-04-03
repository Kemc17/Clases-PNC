package com.dog.democoach.controller;

import com.dog.democoach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    @Autowired
    private Coach myCoach;

    private String teamName = "Lions";

    @Autowired
    public CoachController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    // Setter injection Coach type
    @GetMapping("/dailyWorkout")
    public String getCoach() {
        return myCoach.getDailyWorkout();
    }

}
