package Commands;

import java.io.File;

public interface Command {
    File execute(File file);
}
