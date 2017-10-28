package edu.umg.ia.command.domain;

public class CommandFactory {
    public static Command startGame() {
        return Command.newBuilder()
                .command(CommandEnum.START_GAME)
                .toInventory(false)
                .message("Iniciando el juego...")
                .build();
    }

    public static Command useItemInToItem(String item, String toItem) {
        return Command.newBuilder()
                .command(CommandEnum.USE)
                .toInventory(false)
                .message("Usando " + item + " en " + toItem)
                .item(item)
                .toItem(toItem)
                .build();
    }

    public static Command error() {
        return Command.newBuilder()
                .command(CommandEnum.ERROR)
                .toInventory(false)
                .message("No entiendo lo que dijiste")
                .build();
    }
}
