package com.company;

public class Skills {

    private static String skill;
    private static String Proficiency_rating;


    public Skills(String skill, String proficiency_rating) {
        this.skill = skill;
        this.Proficiency_rating = proficiency_rating;
    }

    public static String getSkill() {
        return skill;
    }

    public static String getProficiency_rating() {
        return Proficiency_rating;
    }

    public static void setSkill(String skill) {
        Skills.skill = skill;
    }

    public static void setProficiency_rating(String proficiency_rating) {
        Proficiency_rating = proficiency_rating;
    }
}