package core;

public class RemoteControl {
    private Command turnOnCommand;
    private Command turnOffCommand;

    public RemoteControl(Command turnOnCommand, Command turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void pressTurnOnButton() {
        System.out.println("Pressionando o botão para ligar a TV.");
        turnOnCommand.execute();
    }

    public void pressTurnOffButton() {
        System.out.println("Pressionando o botão para desligar a TV.");
        turnOffCommand.execute();
    }
}
