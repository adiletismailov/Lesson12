package com.company;

public class Main {

    public static void main(String[] args) {
        Universities university1 = new Universities();
        university1.setNameUniversity("Politeh");
        university1.setFloor(5);
        university1.setCabinet(50);

        Universities university2 = new Universities();
        university2.setNameUniversity("Autsa");
        university2.setFloor(3);
        university2.setCabinet(30);

        Universities university3 = new Universities();
        university3.setNameUniversity("KRSU");
        university3.setFloor(3);
        university3.setCabinet(20);

        Universities[] universities = {university1,university2,university3};
        System.out.println("Universities[]...");
        for (Universities a: universities) {
            System.out.println("Name: "+a.getNameUniversity()+"! Floor: "+a.getFloor()+"! Cabinet: "+a.getCabinet());
        }

        Schools schools1 = new Schools();
        schools1.setNameSchool("Alykul Osmonov");
        schools1.setFloor(3);
        schools1.setCabinet(15);

        Schools schools2 = new Schools();
        schools2.setNameSchool("Joomart Bokonbaev");
        schools2.setFloor(4);
        schools2.setCabinet(20);

        Schools schools3 = new Schools();
        schools3.setNameSchool("Adilet Ismailov");
        schools3.setFloor(5);
        schools3.setCabinet(30);

        Schools [] schools = {schools1,schools2,schools3};
        System.out.println("Schools[]...");
        for (Schools a:schools) {
            System.out.println("Name: "+a.getNameSchool()+"! Floor: "+a.getFloor()+"! Cabinet: "+a.getCabinet());
        }

        Cars cars1 = new Cars();
        cars1.setNameCar("Mercedes Benz");
        cars1.setColorCar("Black");
        cars1.setPriceCar(1000000);

        Cars cars2 = new Cars();
        cars2.setNameCar("BMW");
        cars2.setColorCar("White");
        cars2.setPriceCar(850000);

        Cars cars3 = new Cars();
        cars3.setNameCar("Toyota");
        cars3.setColorCar("Black");
        cars3.setPriceCar(700000);

        Cars[] cars = {cars1,cars2,cars3};
        System.out.println("Cars[]...");
        for (Cars a:cars) {
            System.out.println("Name: "+a.getNameCar()+"! Color: "+a.getColorCar()+"! Price: "+a.getPriceCar());
        }

        People persons1 = new People();
        persons1.setNamePer("Adilet");
        persons1.setAgePer(22);
        persons1.setHobbyPer("Program ");

        People persons2 = new People();
        persons2.setNamePer("Albert");
        persons2.setAgePer(24);
        persons2.setHobbyPer("Program");

        People persons3 = new People();
        persons3.setNamePer("Meder");
        persons3.setAgePer(22);
        persons3.setHobbyPer("Program");

        People[] persons = {persons1,persons2,persons3};
        System.out.println("People[]...");
        for (People a:persons) {
            System.out.println("Name: "+a.getNamePer()+"! Age: "+a.getAgePer()+"! Hobby: "+a.getHobbyPer());
        }
    }
}