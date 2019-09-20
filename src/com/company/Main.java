package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Education ed;
    static Experience ex;
    static Skills sk;
    static JSeeker jSeeker;
    static ArrayList<JSeeker> inputJSeeker = new ArrayList<>();
    static ArrayList<Education> inputEd = new ArrayList<>();
    static ArrayList<Experience> inputExp = new ArrayList<>();
    static ArrayList<Skills> inputSk = new ArrayList<>();
    static ArrayList<Integer> edCounter = new ArrayList<>();
    static int iEd = 0;
    static int iExp = 0;
    static int iSk = 0;
    static ArrayList<Integer> expCounter = new ArrayList<>();
    static ArrayList<Integer> skillCounter = new ArrayList<>();
    static String skill;
    static String proficiency;


    public static void main(String[] args) {

        do {
            String choice;
            System.out.println(" \n");
            System.out.println("Erica's Robo Resume");
            System.out.println("press '1' to Add Resume Information");
            System.out.println("press '2' to Clear All Resume Information");
            System.out.println("press '3' to Show Resume");
            System.out.println("press '4' to Exit");
            System.out.println(" \n");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addJSeeker();
                    break;
                case "2":
                    clearResume();
                    break;
                case "3":
                    showResume();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Please choose: ");
            }
        } while (true);
    }

    public static void education() {
        iEd = 0; //counter
        do {
            System.out.println("EDUCATION");
            System.out.println("School/University:");
            String school = scanner.nextLine();
            System.out.println("Graduation Year:");
            String year = scanner.nextLine();
            System.out.println("Major:");
            String major = scanner.nextLine();
            System.out.println("Degree:");
            String degree = scanner.nextLine();
            System.out.println("Degree Type: (enter one of the values):\n" +
                    "High School Diploma | " +
                    "Associate | " +
                    "Bachelor's | " +
                    "Master's | " +
                    "PhD");
            String type= scanner.nextLine();
            ed = new Education(school, year, major, degree, type);
            inputEd.add(ed);
            iEd++;
            System.out.println("Do you want to add more? (Y|N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y"))) {

            } else {
                edCounter.add(iEd);
                break;
            }
        } while (true);
    }

    public static void experience() {
        iExp = 0; //counter
        do {
            System.out.println("WORK EXPERIENCE");
            System.out.println("Company:");
            String company = scanner.nextLine();
            System.out.println("Job Title:");
            String title = scanner.nextLine();
            System.out.println("Dates worked:");
            String date = scanner.nextLine();
            System.out.println("Job Description:");
            String description = scanner.nextLine();
            ex = new Experience(company, title, date, description);
            inputExp.add(ex);
            iExp++;
            System.out.println("Do you want to add more to your experience? (Y|N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y"))) {

            } else {
                expCounter.add(iExp);
                break;
            }
        } while (true);
    }


    public static void skill() {
        iSk = 0; //counter
        do {
            System.out.println("Enter a skill:");
            skill = scanner.nextLine();
            System.out.println("Proficiency Rating:\n" +
                    "Fundamental | " +
                    "Novice | " +
                    "Intermediate | " +
                    "Advanced | " +
                    "Expert");
            proficiency = scanner.nextLine();

            sk = new Skills(skill, proficiency);
            String choice = "y";
            inputSk.add(sk);
            iSk++;
            System.out.println("Do you want to add more to your skills? (Y|N)\n(Note: If skills are less than 3 the answer will default to Yes.)");
            choice = scanner.nextLine();

            if (iSk<3 || (choice.equalsIgnoreCase("yes") || (choice.equalsIgnoreCase("y")))) {

            } else {
                skillCounter.add(iSk);
                break;
            }
        } while (true);
    }

    public static void addJSeeker() {
        System.out.println("Please Enter");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Email Address:");
        String email = scanner.nextLine();
        System.out.println("Phone Number:");
        String phone = scanner.nextLine();
        education();
        experience();
        skill();
        jSeeker= new JSeeker(name, email, phone, ed, ex, sk);
        inputJSeeker.add(jSeeker);
    }

    public static void showResume() {

        if (inputJSeeker.size() == 0) {
            System.out.println();
            System.out.println("No resume in the Erica's Robo Resume");
        } else {

            System.out.println("\n========================================================================================\n");


            for (int i = 0; i < inputJSeeker.size(); i++) {
                System.out.println("Name:" + inputJSeeker.get(i).getName()+"\n\n");

                System.out.println("PERSONAL INFORMATION");
                System.out.println("Email:" + inputJSeeker.get(i).getEmail());
                System.out.println("Phone Number:" + inputJSeeker.get(i).getPhoneNum());

                System.out.println();
                System.out.println("EDUCATION:");

                for (int j = 0; j < edCounter.get(i); j++) {
                    System.out.println("Major:" + inputEd.get(j).getMajor());
                    System.out.println("School: " + inputEd.get(j).getSchool());
                    System.out.println("Graduation Year: " + inputEd.get(j).getYear());
                    System.out.println();
                }

                System.out.println("WORK EXPERIENCE:");

                for (int k = 0; k < expCounter.get(i); k++) {
                    System.out.println("Company:" + inputExp.get(k).getCompany());
                    System.out.println("Job Title: " + inputExp.get(k).getTitle());
                    System.out.println("Date: " + inputExp.get(k).getDatesOfEmployment());
                    System.out.println("Job Description: " + inputExp.get(k).getJobDescription());
                    System.out.println();
                }

                System.out.println("SKILLS:");
                //System.out.println(skillCounter.get(i));
                for (int l = 0; l < skillCounter.get(i); l++) {
                  //  System.out.print("Skill:" + inputSk.get(l).getSkill()+"\t ") ;
                    System.out.println("Skill:" + inputSk.get(l).getSkill()+"\t "+"Proficiency Rating: " + inputSk.get(l).getProficiency_rating()) ;
                 //   System.out.println("Proficiency Rating: " + inputSk.get(l).getProficiency_rating());
                  //  System.out.println("\n================================================================================\n");

                             }
                System.out.println(" \n ");
            }
        }

    }


    public static void clearResume() {
        inputJSeeker.clear();
        inputEd.clear();
        inputExp.clear();
        inputSk.clear();
        System.out.println("Your Resume Has Been Cleared");

    }




}