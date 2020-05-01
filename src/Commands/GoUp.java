package Commands;

import User.User;

import java.io.File;

public class GoUp implements Command {

    private User user;

    public GoUp() {
    }


    @Override
    public File execute(File file) {

        String a = file.getAbsolutePath();

        a = a.replace("Test", "");


//        for(int i = 0; i < 4; i++){
//            a = (a.substring(0, a.length() - 1));
//        }


        while(a.charAt(a.length() - 1) != '\\' && a.charAt(a.length() - 1) != '/'){
            a = (a.substring(0, a.length() - 1));
        }
        a = (a.substring(0, a.length() - 1));
        while(a.charAt(a.length() - 1) != '\\' && a.charAt(a.length() - 1) != '/'){
            a = (a.substring(0, a.length() - 1));
        }

        file.delete();

        file = new File(a);

        System.out.println(file.getAbsolutePath());

        return file;
    }
}
