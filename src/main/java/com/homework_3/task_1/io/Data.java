package com.homework_3.task_1.io;

public class Data implements IData {
    private IReader reader;
    private IPrint printer;

    public Data(IReader reader, IPrint printer) {
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public double read() {
        return reader.read();
    }
}
