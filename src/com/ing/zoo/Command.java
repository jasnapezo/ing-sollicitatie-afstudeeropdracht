package com.ing.zoo;

public enum Command {

    HELLO("hello"),
    GIVE_LEAVES("give leaves"),
    GIVE_MEAT("give meat"),
    PERFORM_TRICK("perform trick"),
    EXIT("exit"),
    UNKNOWN("unknown");

    private final String value;

    Command(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Command fromString(String value){
        for(Command command : Command.values()){
            if(command.value.equalsIgnoreCase(value)){
                return command;
            }
        }
        if(value.toLowerCase().startsWith(HELLO.value)){
            return HELLO;
        }
        return UNKNOWN;
    }
}
