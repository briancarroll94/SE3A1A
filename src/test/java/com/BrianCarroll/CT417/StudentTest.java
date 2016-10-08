package com.BrianCarroll.CT417;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StudentTest extends TestCase
{
    public void testModuleID() {
        Module module = new Module("Software Engineeering III", "CT417");
        assertEquals("CT417", module.getMid());
    }
}

