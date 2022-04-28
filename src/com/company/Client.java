package com.company;

public class Client {
    String name;
    int age;
    double cash;
    boolean creditNeed;
    boolean creditWish;
    boolean driversLicense;
    double creditPayment;

    public boolean adult() {
        if (age >= 18) {
            return true;
        } else {
            int lackOfAge = 18 - age;
            System.out.println("Sorry, come back later, after " + lackOfAge + " years.");
            return false;
        }
    }

    public void license() {
        if (driversLicense) {
            System.out.println("Great!, you may pick up yor new car and try it right away!");
        } else {
            System.out.println("Note: When buying a car, you need to be accompanied by a person with a driver's license or order a special vehicle for transporting a car");
        }
    }

    public void carSelling(double price) {
        if (adult()) {
            if (cash >= price) {
                System.out.println("Dear " + name + ", Congratulations! We can start to wrap your 'rocket' right about now!");
            } else {
                carCredit(price);
            }
        }
        license();
    }

    public void carCredit(double price) {
        creditPayment = Math.round((price - cash) / 36);
            if (creditNeed && creditWish) {
                System.out.println("Monthly loan payment will be:  " + creditPayment + "$.");
                System.out.println("Dear " + name + ", we have a great news. You can come to our office,get a loan and pick up your new car!");
            } else if (creditNeed && !creditWish) {
                System.out.println("Monthly loan payment will be: " + creditPayment + "$.");
                System.out.println("Ok, come back later, when you feel like applying for a loan.");
            } else {
                System.out.println("Ok. Bye. We will be glad to see you again.");
        }
    }
}
