package com.db.edu;
import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import  com.db.edu.etl.TransformationResultWithAverageDTO;

public class ControllerTest{
    @Test
    public void shouldGetTransformedDataAndAverageWhenValidData() {
        String[] rawDataRecords = {"1", "2", "3"};
        TransformationResultWithAverageDTO a = Controller.transform(RecordType.EIS1_DATA_FILE, rawDataRecords);

assertEquals(2.,a.getAverage(), 0.01);
    }
}