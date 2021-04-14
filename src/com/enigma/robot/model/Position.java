package com.enigma.robot.model;

import java.util.Objects;

public class Position {

    private Integer coordinateX;
    private Integer coordinateY;

    public Position(Integer coordinateX, Integer coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Integer getCoordinateX() {
        return coordinateX;
    }

    public Integer getCoordinateY() {
        return coordinateY;
    }

    public Position getRight(){
       return new Position(this.coordinateX+1, this.coordinateY);

    }

    public Position getLeft(){
        return  new Position(this.coordinateX-1, this.coordinateY);
    }

    public Position getTop(){
        return new Position(this.coordinateX, this.coordinateY+1);
    }

    public Position getBottom(){
        return new Position(this.coordinateX, this.coordinateY-1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(coordinateX, position.coordinateX) && Objects.equals(coordinateY, position.coordinateY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }

    @Override
    public String toString() {
        return "(" +
                coordinateX +
                "," + coordinateY +
                ')';
    }
}
