package com.db.edu.etl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
    private static Logger logger = LoggerFactory.getLogger(Controller.class);

    public static String extract(RecordType recordType) {
        logger.debug("Starting to extract");
        logger.debug("Extract succeeded");
        return null;
    }
    public static String[] transform(RecordType recordType, String[] rawDataRecords) {

        int counter = 0;
        while(true)
        {
            if (counter < rawDataRecords.length) break;
            counter++;

            if ((rawDataRecords[counter] == null) || (rawDataRecords[counter] == ""))
            {
                continue;
            }
        }

        switch (recordType) {
            case EIS1_DATA_FILE: {
                return rawDataRecords.split(",");
            }
            case EIS2_DATA_FILE: {
                return rawDataRecords.split(";");
            }
            default: return null;
        }
    }
    public static void load(String... transform){
        logger.debug("Starting to load data");
        logger.debug("Load finished");
    }
}