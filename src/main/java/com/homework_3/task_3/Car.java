package com.homework_3.task_3;

public class Car implements CarFunction {
    boolean onn;
    boolean off;
    boolean ride;
    int speed;

    public Car() {
    }

    public Car(boolean onn, int speed) {
        this.onn = onn;
        this.speed = speed;
    }

    public Car(boolean onn, boolean off, boolean ride, int speed) {
        this.onn = onn;
        this.off = off;
        this.ride = ride;
        this.speed = speed;
    }

    @Override
    public boolean carOff() {
        return false;
    }

    @Override
    public boolean carOnn() {
        return false;
    }

    @Override
    public void ride() {
        System.out.println("Car can ride");
    }

    @Override
    public int carSpeed() {
        return this.speed;
    }
}
