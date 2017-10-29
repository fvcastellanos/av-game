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

    public static Command whereAmI() {
        return Command.newBuilder()
                .command(CommandEnum.WHERE_AM_I)
                .toInventory(false)
                .message("En donde estoy?")
                .build();
    }

    public static Command viewInventory() {
        return Command.newBuilder()
                .command(CommandEnum.VIEW_INVENTORY)
                .toInventory(false)
                .message("Ver el inventario")
                .build();
    }

    public static Command getInstructions() {
        return Command.newBuilder()
                .command(CommandEnum.GET_INSTRUCTIONS)
                .toInventory(false)
                .message("Obtener instrucciones")
                .build();
    }

    public static Command getAClue() {
        return Command.newBuilder()
                .command(CommandEnum.CLUE)
                .toInventory(false)
                .message("Obtener una pista")
                .build();
    }

    public static Command takeItem(String item) {
        return Command.newBuilder()
                .command(CommandEnum.TAKE)
                .item(item)
                .toInventory(true)
                .message("Tomando el objeto: " + item)
                .build();
    }

    public static Command viewItem(String item) {
        return Command.newBuilder()
                .command(CommandEnum.VIEW)
                .item(item)
                .toInventory(false)
                .message("Viendo el objeto: " + item)
                .build();
    }

    public static Command openItem(String item) {
        return Command.newBuilder()
                .command(CommandEnum.OPEN)
                .item(item)
                .toInventory(false)
                .message("Abriendo el objeto: " + item)
                .build();
    }

    public static Command closeItem(String item) {
        return Command.newBuilder()
                .command(CommandEnum.CLOSE)
                .item(item)
                .toInventory(false)
                .message("Cerrando el objeto: " + item)
                .build();
    }

    public static Command writeItem(String item) {
        return Command.newBuilder()
                .command(CommandEnum.WRITE)
                .item(item)
                .toInventory(false)
                .message("Escribiendo en el objeto: " + item)
                .build();
    }
}
