package com.src.smartkent.liftSimulation.Model;

public class Lift {
    private int liftId;
    private String state;
    private String direction;
    private int person; // No of people in the lift
    private int floor; // Current floor

    public Lift() {
        super();
        this.floor = 1; // Floor number starts from 1
    }

    public Lift(int liftId, String state, String direction, int person) {
        this.liftId = liftId;
        this.state = state;
        this.direction = direction;
        this.person = person;
        this.floor = 1;
    }

    public int getLiftId() {
        return liftId;
    }

    public void setLiftId(int liftId) {
        this.liftId = liftId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "liftId=" + liftId +
                ", state='" + state + '\'' +
                ", direction='" + direction + '\'' +
                ", person=" + person +
                ", floor=" + floor +
                '}';
    }
}
