package Commands;

import User.User;

import java.io.File;

public class Help implements Command {

    private User user;

    public Help() {
    }

    @Override
    public File execute(File file) {
        System.out.println("Для получения сведений об определенной команде наберите HELP <имя команды>");//TODO реализацию для каждой команды

        for(String commands : AllCommandsInfo.commandsNames){
            System.out.printf("%-10s %s \n", commands, "someinfo");
        }
        return file;
    }
}
