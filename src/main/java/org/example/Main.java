package org.example;

import core.RemoteControl;
import core.TV;
import core.TurnOffCommand;
import core.TurnOnCommand;
import interfaces.Command;

/**
 * Classe principal que demonstra o uso do controle remoto e dos comandos para ligar e desligar a TV.
 */
public class Main {
    /**
     * Método principal que inicia a execução do programa.
     *
     * @param args os argumentos de linha de comando (não utilizados neste exemplo)
     */
    public static void main(String[] args) {
        // Criação do Receptor
        TV tv = new TV();

        // Criação dos Comandos concretos
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        // Criação do Invoker (Controle Remoto)
        RemoteControl remoteControl = new RemoteControl(turnOnCommand, turnOffCommand);

        // Pressionando os botões do controle remoto
        remoteControl.pressTurnOnButton();
        System.out.println();
        remoteControl.pressTurnOffButton();
    }
}
