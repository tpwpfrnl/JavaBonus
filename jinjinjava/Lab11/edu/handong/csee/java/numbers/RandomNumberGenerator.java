package edu.handong.csee.java.numbers;

public class RandomNumberGenerator{
    private int firstNumber;
    private int secondNumber;
    private int randomNumber;
    public static void main(String[] args){
        RandomNumberGenerator myRandomNumberGenerator = new RandomNumberGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        myRandomNumberGenerator.generateRandomNumber();
        System.out.println(myRandomNumberGenerator.getRandomNumber());
    }

    public RandomNumberGenerator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    public void generateRandomNumber(){
        randomNumber = (int)((Math.random() * (secondNumber - firstNumber + 1)) + (firstNumber));
    }

    public int getRandomNumber(){
        return randomNumber;
    }

}