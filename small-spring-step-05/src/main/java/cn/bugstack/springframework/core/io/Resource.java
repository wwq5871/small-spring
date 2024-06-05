package cn.bugstack.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;


/**
 * @description:
 * @author: wwq
 * @date: 2024/06/05/16:42
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}

