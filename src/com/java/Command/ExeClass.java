package com.java.Command;


public class ExeClass {
    public static void main(String[] args) {

        Commands commands = new Commands();
        commands.addCommand(new HelloCommand());
        commands.addCommand(new ByeCommand());
        commands.executeCommands();
    }
}


