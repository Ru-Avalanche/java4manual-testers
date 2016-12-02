package com.db.edu;
import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ControllerTest{
    @Test
    public void shouldGetAverageWhenTransform() {
        Controller.transform(RecordType.EIS1_DATA_FILE,
                new int [] {1,2,3}
        );

assertEquals(2.,Controller.getAverage());
    }
}