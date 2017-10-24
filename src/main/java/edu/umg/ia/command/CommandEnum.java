package edu.umg.ia.command;

public enum CommandEnum {
    ERROR("Syntax validation error"),

    START_GAME("iniciar juego"),
    USE("usar item"),
    WHERE_AM_I("donde estoy");

    private String text;

    CommandEnum(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
