# Projeto de Controle Remoto - Command Pattern

Este projeto implementa um controle remoto utilizando o padrão de projeto Command.

## Descrição

O projeto consiste em um controle remoto que possui botões para ligar e desligar uma TV. O controle remoto utiliza o padrão de projeto Command, onde cada botão possui um comando associado que é executado quando o botão é pressionado.

## Funcionalidades

O projeto possui as seguintes classes:

- `Main`: Classe principal que demonstra o uso do controle remoto.
- `TV`: Classe que representa uma TV e possui métodos para ligar e desligar.
- `RemoteControl`: Classe que representa o controle remoto e possui os métodos para pressionar os botões e executar os comandos.
- `Command`: Interface que define um comando a ser executado.
- `TurnOnCommand`: Classe que implementa o comando de ligar a TV.
- `TurnOffCommand`: Classe que implementa o comando de desligar a TV.

## Pré-requisitos

- Java 8 ou superior.

## Executando o Exemplo

1. Clone o repositório para a sua máquina local.

2. Navegue até o diretório do projeto.

3. Compile os arquivos Java:

```bash
javac org/example/Main.java
```

4. Execute o programa:

```bash
java org.example.Main
```

5. Verifique a saída no console para ver as mensagens exibidas pelos observadores.

## Autor

Lucas Felipe Felicio Santos <br>
Email do Autor: lucasfelicio378@gmail.com

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema no código, tiver sugestões de melhorias ou novos
recursos, fique à vontade para abrir uma issue ou enviar um pull request.