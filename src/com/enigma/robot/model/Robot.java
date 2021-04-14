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

    public void move(String commandString) {
        Command command =  Command.valueOf(commandString);
        switch (command){
            case A:forward();
                    break;
            case L:direction = direction.turnLeft();
                    break;
            case R: direction = direction.turnRight();
                    break;
        }
    }

    private void forward() {
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

    public void moves(String commands) {
        String[] commandsArray = commands.split("");
        for (String command : commandsArray){
            move(command);
            System.out.println(this.toString());
        }
    }
}
