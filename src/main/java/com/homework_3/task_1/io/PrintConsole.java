package com.homework_3.task_1.io;

public class PrintConsole implements IPrint {

    @Override
    public void print(String text) {
        System.out.print(text);
    }
}
