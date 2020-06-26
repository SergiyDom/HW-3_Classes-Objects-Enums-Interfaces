package com.homework_3.task_1.service;

import static java.lang.Math.PI;

public class CircleArea implements ICircleArea {

    @Override
    public double calculate(double radius) {
        return Math.round(PI * Math.pow(radius, 2) * 100) / 100.0;
    }
}
