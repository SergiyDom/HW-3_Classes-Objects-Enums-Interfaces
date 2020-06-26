package com.homework_3.task_1.io;

public interface IData extends IReader, IPrint {
    default double input(String text) {
        print(text);
        return read();
    }
}