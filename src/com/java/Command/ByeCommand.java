package com.java.Command;

public class ByeCommand implements ICommand {
    @Override
    public void doCommand() {
        System.out.println("Good Bye");
    }
}
