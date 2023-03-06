package Homework6;

public class Laptop {
    private String model;
    private String brand;
    private int RAM;
    private int ROM;
    private String OS;
    private String color;

    public Laptop(String model, String brand, int RAM, int ROM, String OS, String color) {
        this.model = model;
        this.brand = brand;
        this.RAM = RAM;
        this.ROM = ROM;
        this.OS = OS;
        this.color = color;
    }

    public Laptop(){
        this.model = "none";
        this.brand = "none";
        this.RAM = 8;
        this.ROM = 512;
        this.OS = "Windows";
        this.color = "черный";
    }


    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public int getRAM() {
        return RAM;
    }
    public int getROM() {
        return ROM;
    }
    public String getOS() {
        return OS;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public void setROM(int ROM) {
        this.ROM = ROM;
    }
    public void setOS(String OS) {
        this.OS = OS;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Ноутбук: " + this.model + "\n\tПроизводитель: " + this.brand +  "\n\tОЗУ: " + this.RAM + "\n\tОбъем жесткого диска: " + this.ROM + "\n\tОперационная система: " + this.OS + "\n\tЦвет: " + this.color + "\n";
    }

    public void getInfo() {
        System.out.println("Ноутбук: " + this.model + "\n\tПроизводитель: " + this.brand +  "\n\tОЗУ: " + this.RAM + "\n\tОбъем жесткого диска: " + this.ROM + "\n\tОперационная система: " + this.OS + "\n\tЦвет: " + this.color + "\n");
    }
}
