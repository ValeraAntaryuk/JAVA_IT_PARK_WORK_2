package ru.itpark;

/**
 * Created by Student11 on 12.05.2017.
 */
public class Car {
    String modelCar ;
    int numberCar ;
    int mileageCar ;
    int gasolineUseCar ;

    Car (){
        modelCar = "Default name";
        numberCar = 111;
        mileageCar = 0;
        gasolineUseCar = 0;
    }
    Car (String modelCar,int numberCar,int mileageCar, int gasolineUseCar){
        this.modelCar = modelCar;
        this.numberCar = numberCar;
        this.mileageCar = mileageCar;
        this.gasolineUseCar = gasolineUseCar;
    }
    Car (Car original){
        modelCar = original.modelCar;
        numberCar = original.numberCar;
        mileageCar = original.mileageCar;
        gasolineUseCar = original.gasolineUseCar;
    }
    double fuelCompusion (){
        double compusion = this.mileageCar / (this.gasolineUseCar * 1.0);
        return compusion;
    }
}
