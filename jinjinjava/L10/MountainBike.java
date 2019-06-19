public class MountainBike extends Bicycle{
    private int currentGear;
    private int currentSpeed;

    public MountainBike(){
        new MountainBike(3,0);
    }

    private MountainBike(int currentGear, int initialSpeed){
        this.currentGear = currentGear;
        currentSpeed = initialSpeed;
    }

    public void setCurrentSpeed(int speedToBeChanged){
        currentSpeed = speedToBeChanged;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }


    public void setCurrentGear(int gearToBeChanged){
        currentGear = gearToBeChanged;
    }

    public int getCurrentGear(){
        return currentGear;
    }
}