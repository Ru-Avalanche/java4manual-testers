package com.db.edu.etl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Controller {


    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static int[] extract(RecordType recordType) {
        logger.debug("Start extracting for RecordType: " + recordType.name());
        logger.debug("End extracting for RecordType: " + recordType.name());
        return new int[] {1,2,recordType.ordinal()};
    }

           public static TransformationResultWithAverageDTO transform(RecordType recordType, String[] rawDataRecords) {
               float sum = 0;
               int[] recordsInt = new int[rawDataRecords.length];
               for (int i = 0; i < rawDataRecords.length; i++) {
                   recordsInt[i] = Integer.parseInt(rawDataRecords[i]);
               }

                if (recordsInt.length == 0) {
                         logger.error("Input data set is empty");
                        return new TransformationResultWithAverageDTO(recordsInt, 0);
                    } else {
                        for (int current : recordsInt) {
                                sum += current;
                            }
                    }
                logger.info("Average value in extracted list: " + sum/rawDataRecords.length);
               double average = (double)sum/recordsInt.length;
               return new TransformationResultWithAverageDTO(recordsInt, average);
           }



             public static void load(TransformationResultWithAverageDTO transformedData) {
                logger.debug("Start loading transformed data");
                logger.debug("End loading transformed data");
                 logger.info("---------- Loading has ended ----------");
          }
}
