package util;

import org.eclipse.microprofile.config.spi.Converter;

/**
 * @author <a href="mailto:mjurc@redhat.com">Michal Jurc</a> (c) 2018 Red Hat, Inc.
 */
public class ReturnZeroIntConverter implements Converter<Integer> {

    @Override
    public Integer convert(String value) {
        return 0;
    }
}
