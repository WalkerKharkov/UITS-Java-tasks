/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.transport.taxi;

/**
 *
 * @author Alex
 */
public class Taxi extends Car{
    
    public int passengerNumber;
    public String type;
    public String model;
    
    private String[] types = {"Passenger", "Cargo"};
    private String[] passengerModels = {"Mercedes 123", "VAZ - 2109", "Daewoo Lanos", "Mitsubishi Lancer"};
    private String[] cargoModels = {"Gazel", "Bogdan", "Volkswagen Transporter", "Mercedes Sprinter"};
    
    public Taxi(){
        super();
        int rand = (int)(Math.random() * 1);
        switch (rand){
            case (0) : {
                this.type = this.types[0];
                this.passengerNumber = (int)(Math.random() * 3 + 2);
                this.model = this.passengerModels[(int)(Math.random() * (this.passengerModels.length - 1))];
                break;
            }
            case (1) : {
                this.type = this.types[1];
                this.passengerNumber = 1;
                this.model = this.cargoModels[(int)(Math.random() * (this.cargoModels.length - 1))];
                break;
            }
        }
        this.fuelConsumption = (int)(Math.random() * 10 + 6);
        this.price = (int)(Math.random() * 20000 + 5000);
        this.speed = (int)(Math.random() * 100 + 100);
    }
    
    @Override
    public String toString(){
        return this.type + " taxi. Model " + this.model + ", price : $" + this.price +
               ", speed : " + this.speed + ", passengers number : " + this.passengerNumber + 
               ", fuel consumption : " + this.fuelConsumption;
    }
}
