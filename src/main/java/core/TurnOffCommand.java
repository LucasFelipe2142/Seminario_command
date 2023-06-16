package core;

import interfaces.Command;

/**
 * Classe que representa o comando de desligar a TV.
 */
public class TurnOffCommand implements Command {
    private TV tv;

    /**
     * Construtor que cria o comando de desligar a TV.
     *
     * @param tv a instância da TV a ser desligada
     */
    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    /**
     * Executa o comando de desligar a TV.
     * Chama o método de desligar na instância da TV.
     */
    public void execute() {
        System.out.println("Executando comando para desligar a TV.");
        tv.turnOff();
    }
}
