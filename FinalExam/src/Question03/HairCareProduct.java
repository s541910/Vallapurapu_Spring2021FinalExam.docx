/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Ramu Vallapurapu
 */
public class HairCareProduct {

    private String brand;
    private double price;

    public HairCareProduct(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "HairCareProduct{" + "brand=" + brand + ", price=" + price + '}';
    }

}
