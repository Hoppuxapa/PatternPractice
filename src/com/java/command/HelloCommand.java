package com.java.command;

public class HelloCommand implements ICommand {
    @Override
    public void doCommand() {
        System.out.println("Hello");
    }
}
