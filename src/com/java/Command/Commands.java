package com.java.Command;

import java.util.ArrayList;
import java.util.List;

public class Commands {


    List<ICommand> commandList = new ArrayList<>();

    void addCommand(ICommand command) {
        commandList.add(command);
    }

    void executeCommands() {
        for (ICommand command : commandList
        ) {
            command.doCommand();
        }
    }
}

