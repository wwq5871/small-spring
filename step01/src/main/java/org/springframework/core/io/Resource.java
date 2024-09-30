package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author mikael wang
 * @date 2024/9/28 13:10
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
