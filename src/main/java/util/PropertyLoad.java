package com.sample.frontdesk.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * Property Load.
 * Created: 10-May-2018
 * Modified:
 * Version: 1.0
 */
public class PropertyLoad {

    private static final String PROP_FILE = "/application.properties";
    private static final Logger logger = Logger.getLogger(PropertyLoad.class);

    private PropertyLoad() {}

    public static String loadProperty(String name) {
        Properties props = new Properties();
        try {
            props.load(PropertyLoad.class
                    .getResourceAsStream(PROP_FILE));
        } catch (IOException e) {
            if (logger.isDebugEnabled()) {
                logger.debug("Debug: " + e);
            }
            if (logger.isInfoEnabled()) {
                logger.info("Info: " + e);
            }

            logger.warn("Warning: " + e);
        }

        String value = "";

        if (name != null) {
            value =  props.getProperty(name);
        }

        return value;
    }

}
