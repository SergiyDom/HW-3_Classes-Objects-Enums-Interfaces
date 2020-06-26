package com.homework_3.task_1.io;

import java.util.Scanner;

public class ReaderConsole implements IReader {
    private Scanner scanner;

    public ReaderConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public double read() {
        return scanner.nextDouble();
    }
}
