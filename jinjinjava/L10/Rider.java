public class Rider{

    MountainBike currentBikeRiding;
    public static void main(String[] args){

        Rider jc = new Rider();
        MountainBike myMTB = new MountainBike(1,0);

        jc.ride(myMTB);
          
    }
    public void ride(MountainBike currentBike){
        currentBikeRiding = currentBike;
        System.out.println("C Gear = " + currentBikeRiding.getCurrentGear());
    }

}