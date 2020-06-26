package com.homework_3.task_1;

import com.homework_3.task_1.io.*;
import com.homework_3.task_1.model.Circle;
import com.homework_3.task_1.service.CircleArea;
import com.homework_3.task_1.service.ICircleArea;

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
    }
}
