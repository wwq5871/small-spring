package cn.bugstack.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: wwq
 * @date: 2024/06/07/16:33
 */
public class FileSystemResourceLoader implements Resource{

    private final File file;

    private final String path;

    public FileSystemResourceLoader(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResourceLoader(String path) {
        this.file = new File(path);
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(this.file);
    }

    public String getPath() {
        return path;
    }
}
