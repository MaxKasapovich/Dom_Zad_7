package com.company;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client();
        client1.name = "Vin Diesel";
        client1.age = 51;
        client1.cash = 50_000.00;
        client1.creditNeed = false;
        client1.creditWish = true;
        client1.driversLicense = true;

        Car car1 = new Car();
        car1.carBrand = "Dodge";
        car1.model = " Phantom";
        car1.price = 30_000.00;
        car1.carYear = 1988;

        Client client2 = new Client();
        client2.name = "Nick Cage";
        client2.age = 56;
        client2.cash = 20_000.00;
        client2.creditNeed = true;
        client2.creditWish = false;
        client2.driversLicense = true;

        Car car2 = new Car();
        car2.carBrand = "Ford";
        car2.model = " Mustang GT 500";
        car2.price = 30_000.00;
        car2.carYear = 1965;

        Client client3 = new Client();
        client3.name = "Ken Block";
        client3.age = 16;
        client3.cash = 10_000.00;
        client3.creditNeed = true;
        client3.creditWish = true;
        client3.driversLicense = false;

        Car car3 = new Car();
        car3.carBrand = "Subaru";
        car3.model = " WRX STI";
        car3.price = 28_500.00;
        car3.carYear = 2006;

        Client client4 = new Client();
        client4.name = "Michael Schumacher";
        client4.age = 53;
        client4.cash = 100_000.00;
        client4.creditNeed = true;
        client4.creditWish = true;
        client4.driversLicense = true;

        Car car4 = new Car();
        car4.carBrand = "Mercedes-Benz";
        car4.model = " C291";
        car4.price = 333_000.00;
        car4.carYear = 1991;

        System.out.println("Client 1: " + client1.name);
        System.out.println("Car: " + car1.carBrand + car1.model);
        client1.carSelling(car1.price);

        System.out.println("Client 2: " + client2.name);
        System.out.println("Car: " + car2.carBrand + car2.model);
        client1.carSelling(car2.price);

        System.out.println("Client 3: " + client3.name);
        System.out.println("Car: " + car3.carBrand + car3.model);
        client1.carSelling(car3.price);

        System.out.println("Client 4: " + client4.name);
        System.out.println("Car: " + car4.carBrand + car4.model);
        client1.carSelling(car4.price);
    }
}
