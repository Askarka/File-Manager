package Commands;

import User.User;

import java.io.File;

public class GiveInfo implements Command {

    private User user;

    public GiveInfo() {
    }

    @Override
    public File execute(File file) {
        String a = file.getAbsolutePath();
        a = a.replace("Test", "");

        System.out.println(a);
        System.out.println();
        File dir = new File(a);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.printf("%-25s  \t folder\n", item.getName());
                } else {
                    System.out.printf("%-25s\t file\n", item.getName());
                }
            }
        }
        return file;
    }
}