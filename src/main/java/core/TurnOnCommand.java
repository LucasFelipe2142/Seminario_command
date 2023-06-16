package core;

import interfaces.Command;

/**
 * Classe que representa o comando de ligar a TV.
 */
public class TurnOnCommand implements Command {
    private TV tv;

    /**
     * Construtor que cria o comando de ligar a TV.
     *
     * @param tv a instância da TV a ser ligada
     */
    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    /**
     * Executa o comando de ligar a TV.
     * Chama o método de ligar na instância da TV.
     */
    public void execute() {
        System.out.println("Executando comando para ligar a TV.");
        tv.turnOn();
    }
}
