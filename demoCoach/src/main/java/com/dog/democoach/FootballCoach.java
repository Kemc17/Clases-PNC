package com.dog.democoach;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    // This is a Spring component
    @Override
    public String getDailyWorkout() {
        return "Do 5 goals";
    }
}
