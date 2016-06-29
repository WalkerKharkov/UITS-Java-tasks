/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task1.thing;

/**
 *
 * @author Alex
 */
public class House extends Thing{
    
    public short apartmentNumber;
    public float apartmentSquare;
    public byte floor;
    public byte roomsNumber;
    public String street;
    public String buildingType;
    public short exploitationTerm;
    
    public House(Thing thing){
        super(thing);
    }
    
    public House(Thing thing, short apartmentNumber, float apartmentSquare,
                 byte floor, byte roomsNumber, String street, String buildingType,
                 short exploitationTerm){
        super(thing);
        this.apartmentNumber = apartmentNumber;
        this.apartmentSquare = apartmentSquare;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }
    
    public House(int id, short apartmentNumber, float apartmentSquare,
                 byte floor, byte roomsNumber, String street, String buildingType,
                 short exploitationTerm){
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.apartmentSquare = apartmentSquare;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }
    
    public void setHouseSettings(short apartmentNumber, float apartmentSquare, byte floor,
                                 byte roomsNumber, String street, String buildingType,
                                 short exploitationTerm){
        this.apartmentNumber = apartmentNumber;
        this.apartmentSquare = apartmentSquare;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.street = street;
        this.buildingType = buildingType;
        this.exploitationTerm = exploitationTerm;
    }
    
    @Override
    public String toString(){
        return "House : \n id : " + this.id + "\napartment number : " + this.apartmentNumber +
               "\napartment square : " + this.apartmentSquare + "\nfloor : " + this.floor +
               "\nrooms number : " + this.roomsNumber + "\nstreet : " + this.street +
               "\nbuilding type : " + this.buildingType + "\nexploitation term : " +
               this.exploitationTerm + "\n";
    }
    
}
