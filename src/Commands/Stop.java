package Commands;

import User.User;

import java.io.File;

public class Stop implements Command {

    private User user;

    public Stop() {
    }

    @Override
    public File execute(File file) {

        return file;
    }
}
