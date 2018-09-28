package Model;

import javafx.scene.image.Image;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class Phone {

    private String make, model, os, processor, colour;
    private double screenSize, memory, frontCamRes, rearCamRes, price;
    private Image phoneImage;

    public Phone(String make, String model, String os, String processor, String colour, double screenSize, double memory, double frontCamRes, double rearCamRes, double price, Image phoneImage) throws SQLException {
        setMake(make);
        setModel(model);
        setOs(os);
        setProcessor(processor);
        setColour(colour);
        setScreenSize(screenSize);
        setMemory(memory);
        setFrontCamRes(frontCamRes);
        setRearCamRes(rearCamRes);
        setPrice(price);
        setPhoneImage(phoneImage);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) throws SQLException {
        ArrayList<String> validMakes = DBConnect.getPhoneManufacturers();
        if ((validMakes.contains(make)))
        {
            this.make=make;}
            else{
                throw new IllegalArgumentException("Make must be one of" + validMakes);
        }


//        ArrayList<String> validMakes = (ArrayList<String>)Arrays.asList("Samsung",
//                "HTC","Apple","Google","LG");
//        if (validMakes.contains(make))
//            this.make = make;
//        else
//            throw new IllegalArgumentException("Invalid make provided");


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isEmpty() && model.length() <= 30)
            this.model = model;
        else
            throw new IllegalArgumentException("model name cannot be empty and" +
                    "must be less than 30 characters");
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getFrontCamRes() {
        return frontCamRes;
    }

    public void setFrontCamRes(double frontCamRes) {
        this.frontCamRes = frontCamRes;
    }

    public double getRearCamRes() {
        return rearCamRes;
    }

    public void setRearCamRes(double rearCamRes) {
        this.rearCamRes = rearCamRes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Image getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(Image phoneImage) {
        this.phoneImage = phoneImage;
    }
}
