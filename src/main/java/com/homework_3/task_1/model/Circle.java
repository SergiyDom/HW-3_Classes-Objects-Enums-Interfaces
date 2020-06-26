package com.homework_3.task_1.model;

import com.homework_3.task_1.io.IData;
import com.homework_3.task_1.io.IPrint;
import com.homework_3.task_1.service.ICircleArea;

public class Circle {
    private double radius;
    private double area;

    public void inti(IData data) {
        boolean wrongNum = false;
        radius = data.input("Enter radius: ");
        while (!wrongNum) {
            if (radius < 0) {
                System.out.print("Enter correct radius:");
                radius = data.read();
            } else wrongNum = true;
        }
    }

    public void calc(ICircleArea circleArea) {
        area = circleArea.calculate(radius);
    }

    public void done(IPrint print) {
        System.out.print("Circle area = ");
        System.out.println(area);
    }
}
