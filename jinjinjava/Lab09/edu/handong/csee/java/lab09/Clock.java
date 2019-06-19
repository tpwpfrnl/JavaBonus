package edu.handong.csee.java.lab09;

class Clock{

    private String currentTime;
    private String color;
    private String type;
    public static void main(String[] args){
        Clock myClock = new Clock();

        myClock.setCurrentTime(args[0]);
        myClock.setColor(args[1]);
        myClock.setType(args[2]);

        System.out.println("The current time of my clock is " + myClock.getCurrentTime());
        System.out.println("The color of my clock is " + myClock.getColor());
        System.out.println("The type of my clock is " + myClock.getType());

    } 

    public void setCurrentTime(String timeToBeChanged){
        currentTime = timeToBeChanged;
    }

    public String getCurrentTime(){
        return currentTime;
    }

    public void setColor(String colorToBeChanged){
        color = colorToBeChanged;
    }

    public String getColor(){
        return color;
    }

    public void setType(String typeToBeChanged){
        type = typeToBeChanged;
    }

    public String getType(){
        return type;
    }

}