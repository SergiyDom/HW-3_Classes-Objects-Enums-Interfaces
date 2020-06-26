package com.homework_3;

import com.homework_3.task_1.io.*;
import com.homework_3.task_1.model.Circle;
import com.homework_3.task_1.service.CircleArea;
import com.homework_3.task_1.service.ICircleArea;
import com.homework_3.task_2.CountClass;
import com.homework_3.task_2.IClass;
import com.homework_3.task_2.PodClass;
import com.homework_3.task_3.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IPrint print = new PrintConsole();
        ICircleArea circleArea = new CircleArea();
        IData data = new Data(reader, print);
        Circle circle = new Circle();
        circle.inti(data);
        circle.calc(circleArea);
        circle.done(print);

        CountClass one = new CountClass();
        CountClass two = new CountClass();
        CountClass three = new CountClass();
        CountClass four = new PodClass();
        IClass five = new CountClass();

        System.out.println("The number of created objects of this class: " + CountClass.getCount());

        Car car = new Car();
        Car car2 = new Car(true, 60);
    }
}
