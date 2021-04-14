package com.enigma.robot.model;

public class Robot {

    private Position position;
    private Direction direction;

    public Robot(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return direction + "->" + position;
    }

    public void move(String command) {
        if (command.equals("A")){
            if (this.direction==Direction.EAST){
                position = position.getRight();
            }
            if (this.direction==Direction.NORTH){
                position = position.getTop();
            }
            if (this.direction==Direction.SOUTH){
                position = position.getBottom();
            }
            if (this.direction==Direction.WEST){
                position = position.getLeft();
            }
        }

        if (command.equals("R")){
            switch (direction){
                case EAST: direction = Direction.SOUTH;
                break;
                case NORTH: direction = Direction.EAST;
                break;
                case SOUTH: direction = Direction.WEST;
                break;
                case WEST: direction = Direction.NORTH;
                break;
            }
        }

//        if (command.equals("L")){
//            switch (direction){
//                case EAST: direction = Direction.SOUTH;
//                    break;
//                case NORTH: direction = Direction.WEST;
//                    break;
//                case SOUTH: direction = Direction.WEST;
//                    break;
//                case WEST: direction = Direction.NORTH;
//                    break;
//            }
//        }
    }
}
