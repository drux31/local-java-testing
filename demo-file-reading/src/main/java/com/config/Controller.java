package com.config;

import com.commons.Command;

public class Controller {
    
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
