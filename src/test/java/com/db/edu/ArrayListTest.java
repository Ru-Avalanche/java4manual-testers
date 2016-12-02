package com.db.edu;
import org.junit.Test;
import org.omg.CORBA.*;
import org.omg.CORBA.Object;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    @Test
    public void shouldSizeIncrementedWhenElementAdd() {
        //region Given
        ArrayList sut = new ArrayList();
        java.lang.Object dummy = new java.lang.Object();
        //endregion

        //regionWhen
        sut.add(dummy);
        //endregion

        //region Then
        //if (size !=) throw AssertionError
        assertEquals(expected: 1, sut.size());
        //endregion
        }

    }