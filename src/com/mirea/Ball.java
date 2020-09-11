package com.mirea;

public class Ball {
    private int size;
    private BallType ballType;

    public Ball(){

    }

    public Ball(BallType ballType, int size){
        this.size = size;
        this.ballType = ballType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BallType getBallType() {
        return ballType;
    }

    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    @Override
    public String toString() {
        return "This ball is for " + ballType.toString() + "\nit's size is about: " + size + " cm\n";
    }
}

enum BallType{
    FOOTBALL, BASEBALL, BASKETBALL, TENNIS
}
