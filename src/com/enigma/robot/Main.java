package com.enigma.robot;

import com.enigma.robot.model.Direction;
import com.enigma.robot.model.Position;
import com.enigma.robot.model.Robot;

public class Main {
    public static void main(String[] args) {

        Position initialPosition = new Position(2,3);
        Direction direction = Direction.NORTH;

        Robot robot = new Robot(initialPosition, direction);
//        System.out.println(robot);

//        robot.move("L");
//        System.out.println(robot);

        robot.moves("AAARAA");

    }
}
