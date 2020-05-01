package User;

import Commands.AllCommands;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        AllCommands allCommands= new AllCommands();

        File file = new File("Test");
        file.createNewFile();
        Path defaultPath = Paths.get(file.getAbsolutePath());
        Path path = defaultPath;

        System.out.println("Hi, it's file manager. Write \"Help\" to see list of all commands now available.");
        System.out.println("Write your command:\n");

        String action = sc.nextLine();

        while(!action.equals("Stop")) {


            if(action.contains("GiveInfo")){
                file = allCommands.giveInfo.execute(file);
            }else{
                if(action.contains("Help")){
                    file = allCommands.help.execute(file);
                }else{
                    if(action.contains("GoUp")){
                        file = allCommands.goUp.execute(file);
                    }else{
                        if(action.contains("GoDown")){
                            file = allCommands.goDown.execute1(file, action);
                        }else{
                            System.out.println("Illegal command");
                        }
                    }
                }
            }
            action = sc.nextLine();
        }
        file = allCommands.stop.execute(file);
        file.delete();
    }
}
