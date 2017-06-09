package ru.itpark;

public class Main {

    public static void main(String[] args) {
		Car mersedes = new Car ();
		mersedes.modelCar = "S200";
		mersedes.numberCar = 121;
		mersedes.mileageCar = 35450;
		mersedes.gasolineUseCar = 18000;
		double mersedesFuel = mersedes.mileageCar / (mersedes.gasolineUseCar * 1.0);
        System.out.println(mersedesFuel);
        double mersedesFuel2 = mersedes.fuelCompusion();
		System.out.println(mersedesFuel2);
    }
}
