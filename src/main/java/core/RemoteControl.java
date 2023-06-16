package core;

import interfaces.Command;

/**
 * Classe que representa um controle remoto.
 */
public class RemoteControl {
    private Command turnOnCommand;
    private Command turnOffCommand;

    /**
     * Construtor que cria um controle remoto com os comandos de ligar e desligar.
     *
     * @param turnOnCommand  o comando de ligar a TV
     * @param turnOffCommand o comando de desligar a TV
     */
    public RemoteControl(Command turnOnCommand, Command turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    /**
     * Pressiona o botão para ligar a TV.
     * Executa o comando de ligar a TV.
     */
    public void pressTurnOnButton() {
        System.out.println("Pressionando o botão para ligar a TV.");
        turnOnCommand.execute();
    }

    /**
     * Pressiona o botão para desligar a TV.
     * Executa o comando de desligar a TV.
     */
    public void pressTurnOffButton() {
        System.out.println("Pressionando o botão para desligar a TV.");
        turnOffCommand.execute();
    }
}
