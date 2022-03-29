package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    //add new fields
    private String emailAddress;
    private String team;
    //default constructor
    public CricketCoach(){
        System.out.println("CricketCoach:inside default constructor");
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach:inside setter method-setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach:inside setter method-setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
