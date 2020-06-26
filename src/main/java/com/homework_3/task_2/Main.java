package com.homework_3.task_2;

public class Main {
    public static void main(String[] args) {
        CountClass one = new CountClass();
        CountClass two = new CountClass();
        CountClass three = new CountClass();
        CountClass four = new PodClass();
        IClass five = new CountClass();

        System.out.println("The number of created objects of this class: " + CountClass.count);
    }
}
