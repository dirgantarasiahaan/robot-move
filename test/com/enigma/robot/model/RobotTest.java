package com.enigma.robot.model;

import junit.framework.TestCase;
import org.junit.Test;

public class RobotTest extends TestCase {

    @Test
    void test(){
        Position position = new Position(2,3);

        Position expect = new Position(2,3);

        assertEquals(expect, position);

    }



}