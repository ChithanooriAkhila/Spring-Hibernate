package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    //default constructor
    public CricketCoach(){
        System.out.println("CricketCoach:inside default constructor");
    }

    //setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach:inside setter method-setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 min a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
