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
    public boolean license() {
        if (driversLicense) {
            System.out.println("Congratulations!, you may pick up yor new car and try it right away!");
            return true;
        } else {
            System.out.println("Note: When buying a car, you need to be accompanied by a person with a driver's license or order a special vehicle for transporting a car");
            return false;
        }
    }

    public void carSelling(double price) {
        if (adult() && license()) {
            if (cash >= price) {
            } else {
                carCredit(price);
            }
        }
    }

    public void carCredit(double price) {
        creditPayment = Math.round((price - cash) / 36);
            if (creditNeed && creditWish) {
                System.out.println("The monthly loan payment will be:  " + creditPayment + "$ per month.");
                System.out.println("Dr. " + name + ", congratulations! You can pick up your new credit car!");
            } else if (creditNeed && !creditWish) {
                System.out.println("The monthly loan payment will be: " + creditPayment + "$ per month.");
                System.out.println("Sorry, come back later, when you will want to buy credit");
            } else {
                System.out.println("Sorry, come back");
        }
    }
}
