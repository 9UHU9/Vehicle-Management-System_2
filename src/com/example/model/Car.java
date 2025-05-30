package com.example.model;

public class Car extends Vehicle {
    private int fuel = 50;
  
    public Car(String name, String color) {
      super(name, color);
    }
  
    public int getFuel() {
      return this.fuel;
    }
  
    public void printData() {
      super.printData();
      System.out.println("ガソリン量：" + this.fuel + "L");
    }
  
    public void run(int distance) {
      System.out.println(distance + "km走ります");
      if (distance <= this.fuel) {
        this.distance += distance;
        this.fuel -= distance;
      } else {
        System.out.println("ガソリンが足りません");
      }
      System.out.println("走行距離：" + this.distance + "km");
      System.out.println("ガソリン量：" + this.fuel + "L");
    }
  
    public void charge(int litre) {
      System.out.println(litre + "L給油します");
      if (litre <= 0) {
        System.out.println("給油できません");
      } else if (litre + this.fuel >= 100) {
        System.out.println("満タンまで給油します");
        this.fuel = 100;
      } else {
        this.fuel += litre;
      }
      System.out.println("ガソリン量：" + this.fuel + "L");
    }
}