package com.homework_3.task_2;

public class CountClass implements IClass{
    private static int count;

    public static int getCount() {
        return count;
    }

    public CountClass() {
        count++;
    }
}
