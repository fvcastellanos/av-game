package edu.umg.ia.command.domain;

public class Command {
    private String name;
    private String item;
    private String toItem;
    private boolean toInventory;
    private String message;
    private CommandEnum command;

    private Command(Builder builder) {
        name = builder.name;
        item = builder.item;
        toItem = builder.toItem;
        toInventory = builder.toInventory;
        message = builder.message;
        command = builder.command;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }

    public boolean isToInventory() {
        return toInventory;
    }

    public String getMessage() {
        return message;
    }

    public CommandEnum getCommand() {
        return command;
    }

    public String getToItem() {
        return toItem;
    }

    public static final class Builder {
        private String name;
        private String item;
        private String toItem;
        private boolean toInventory;
        private String message;
        private CommandEnum command;

        private Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder item(String val) {
            item = val;
            return this;
        }

        public Builder toItem(String val) {
            toItem = val;
            return this;
        }

        public Builder toInventory(boolean val) {
            toInventory = val;
            return this;
        }

        public Builder message(String val) {
            message = val;
            return this;
        }

        public Builder command(CommandEnum val) {
            command = val;
            return this;
        }

        public Command build() {
            return new Command(this);
        }
    }
}
