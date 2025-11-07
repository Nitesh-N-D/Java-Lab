## Parking Lot Simulation using Semaphore in Java  
Program to simulate a **parking lot** with limited parking spaces using **semaphores**.  
The program:  
- Uses **threads** to represent cars attempting to park  
- Controls access to parking spots with a **Semaphore**, limiting concurrent parking  
- Ensures cars **wait for available spots** if the parking is full  
- Demonstrates **synchronization and resource management** in multithreaded Java programs

import java.util.concurrent.Semaphore;
class Car extends Thread {
    String name;
    Semaphore parking;
     Car(Semaphore parking, String name) {
        this.parking = parking;
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is going to park");

        try {
            parking.acquire(); 
            System.out.println(name + " has parked");

            Thread.sleep(2000); 

            System.out.println(name + " is leaving the parking");
            parking.release(); 
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
public class Parkinglot {
    public static void main(String[] args) {
        Semaphore parking = new Semaphore(2); 
        Car c1 = new Car(parking, "Car 1");
        Car c2 = new Car(parking, "Car 2");
        Car c3 = new Car(parking, "Car 3");
        Car c4 = new Car(parking, "Car 4");
        Car c5 = new Car(parking, "Car 5");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
    }
}
