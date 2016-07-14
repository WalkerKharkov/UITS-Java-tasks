/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605.filatov.homeworks.oop.task2.moto;

/**
 *
 * @author Alex
 */
public abstract class Dress {
    
    public byte size;
    public int weight;
    public int price;
    public String material;
    public String brand;
    
    public Dress(){
        this.weight = (int)(Math.random() * 3000 + 500);
        this.price = (int)(Math.random() * 2000 + 300);
    }
    
    @Override
    public String toString(){
        return "size: " + this.size + ", weight: " + this.weight + ", material: " +
               this.material + ", price: $" + this.price;
    }
    
}
