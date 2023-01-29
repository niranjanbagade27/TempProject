package com.temp.project.designpatterns.facade;

interface CarInACountry{
    public void drive();
    public void fillTank();
}

class CarInInda implements CarInACountry{

    @Override
    public void drive() {
        System.out.println("Driving on the left size of the road");
    }

    @Override
    public void fillTank() {
        System.out.println("Tank capacity in liters");
    }
}

class CarInUSA implements CarInACountry{

    @Override
    public void drive() {
        System.out.println("Drive on the right side of the road");
    }

    @Override
    public void fillTank() {
        System.out.println("Tank capacity in gallons");
    }
}

class CarFacade{
    public static void drive(String country, String fillTank){
        switch(country){
            case "India":
                CarInInda indianCar = new CarInInda();
                indianCar.drive();
                indianCar.fillTank();
                break;
            case "USA":
                CarInUSA americanCar = new CarInUSA();
                americanCar.drive();
                americanCar.fillTank();
                break;
            default:
                break;
        }
    }
}

public class FacadeMain {
    public static void main(String[] args) {
        CarFacade.drive("USA", "Filltank");
    }
}
