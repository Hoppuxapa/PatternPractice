package com.java.Command;

public class HelloCommand implements ICommand {
    @Override
    public void doCommand() {
        System.out.println("Hello");
    }
}
