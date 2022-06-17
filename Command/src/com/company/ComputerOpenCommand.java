package com.company;

public class ComputerOpenCommand implements Command{
    Computer computer;

    public ComputerOpenCommand(Computer computer)
    {
        this.computer = computer;
    }

    public void execute()
    {
        computer.open();
    }
}
