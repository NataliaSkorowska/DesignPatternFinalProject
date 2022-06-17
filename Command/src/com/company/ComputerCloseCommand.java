package com.company;

public class ComputerCloseCommand {
    Computer computer;
    public ComputerCloseCommand(Computer computer)
    {
        this.computer = computer;
    }
    public void execute()
    {
        computer.close();
    }
}
