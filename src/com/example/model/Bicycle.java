package com.example.model;

public class Bicycle extends Vehicle {
    public Bicycle(String name, String color) {
      super(name, color);
    }
  
    public void run(int distance) {
      System.out.println(distance + "km走ります");
      this.distance += distance;
      System.out.println("走行距離：" + this.distance + "km");
    }
}  