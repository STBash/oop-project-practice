package pl.stbash.file.image;

import pl.stbash.file.AbstractFile;
import pl.stbash.file.FileType;

public class AbstractImageFile extends AbstractFile {


    public AbstractImageFile(String name, int size) {
       super(name, size);
    }


    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
