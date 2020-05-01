package Commands;

import User.User;

import java.io.File;
import java.sql.SQLOutput;

public class GoDown implements Command {

    private User user;

    public GoDown() {
    }

    @Override
    public File execute(File file) {
        return file;
    }

    public File execute1(File file, String str) {

        String g = file.getAbsolutePath();
        g = g.replace("Test", "");


        System.out.print(g);
        System.out.print('\\');
        File dir = new File(g);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if(str.contains((CharSequence) item.getName())){
                    System.out.println(item.getName());
//                    System.out.println(file.getAbsolutePath()+ '/' + item.getName());
                    file = new File(file.getAbsolutePath() + '/' + item.getName());
                }
            }
        }else{
            System.out.println("This is not directory, you can use GoUp to exit.");
        }




        return file;
    }

}
