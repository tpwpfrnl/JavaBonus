package edu.handong.csee.java.hw3;

 /** 
 * This is a class, SimpleCalculator.
 * The purpose of this is to calculate the numbers.
 * The input is one operator and two numbers
 * and the output is the each calculating result (sum, minus, sumRange, multiply, divide, remainder, leftShift, rightShift, square).
*/

public class SimpleCalculator{

     /** 
     * This is a main method for SimpleCalculator class.
     * The purpose of this is to run the program.
     * The input is one operator (args[0]) and two numbers (args[1], args[2])
     * and the output is the each calculating result (sum, minus, sumRange, multiply, divide, remainder, leftShift, rightShift, square).
    */

    public static void main(String[] args){

        String operator = args[0];

        SimpleCalculator mySimpleCalculator = new SimpleCalculator();

        if(operator.equals("+")){
            System.out.println(mySimpleCalculator.sum(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else if(operator.equals("-")){
            System.out.println(mySimpleCalculator.minus(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else if(operator.equals("++")){
            System.out.println(mySimpleCalculator.sumRange(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else if(operator.equals("X")){
            System.out.println(mySimpleCalculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else if(operator.equals("/")){
            if (Integer.parseInt(args[2]) == 0){
                System.out.println("Error: / by zero");
            }else{
                System.out.println(mySimpleCalculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
            }
        }else if(operator.equals("%")){
            System.out.println(mySimpleCalculator.remainder(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else if(operator.equals("<<")){
            System.out.println(mySimpleCalculator.leftShift(Integer.parseInt(args[1]), Integer.parseInt(args[2])));;
        }else if(operator.equals(">>")){
            System.out.println(mySimpleCalculator.rightShift(Integer.parseInt(args[1]), Integer.parseInt(args[2])));;
        }else if(operator.equals("^")){
            System.out.println(mySimpleCalculator.square(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        }else{
            System.out.println("Error: wrong operator");
        }
    }

    /** 
     * This is a method, sum.
     * The purpose of this is to sum firstNumber with secondNumber.
     * The input is two numbers
     * and the output is the result of the sum.
     */

    public int sum(int firstNumber,int secondNumber) {
        return firstNumber + secondNumber;
    }

    
    /** 
     * This is a method, minus.
     * The purpose of this is to subtract secondNumber from firstNumber.
     * The input is two numbers
     * and the output is the result of the minus.
     */
    
    public int minus(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    
    /** 
     * This is a method, sumRange.
     * The purpose of this is to sum all the integers from firstNumber to secondNumber.
     * The input is two numbers
     * and the output is the result of the sumRange.
     */
    
    public int sumRange(int firstNumber, int secondNumber){
        int temp = 0;
        if (secondNumber < firstNumber){
            temp = secondNumber;
            secondNumber = firstNumber;
            firstNumber = temp;
        }
        return (firstNumber + secondNumber) * (secondNumber - firstNumber + 1) / 2;
    }
    
    /** 
    * This is a method, multiply.
    * The purpose of this is to multiply firstNumber by secondNumber.
    * The input is two numbers
    * and the output is the result of the multiply.
    */

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    /** 
     * This is a method, divide.
     * The purpose of this is to divide firstNumber to secondNumber.
     * The input is two numbers
     * and the output is the result of the divide.
    */

    public double divide(int firstNumber, int secondNumber){
        double myDivide = (double) firstNumber / secondNumber;
        return myDivide;
    }

    /** 
     * This is a method, remainder.
     * The purpose of this is to calculate the remainder of firstNumber divided by secondNumber.
     * The input is two numbers
     * and the output is the remainder of the divide.
    */

    public int remainder(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }

    /** 
     * This is a method, leftShift.
     * The purpose of this is to shift firstNumber left as many as secondNumber.
     * The input is two numbers
     * and the output is the result of the leftShift.
    */

    public int leftShift(int firstNumber, int secondNumber){
        return firstNumber << secondNumber;
    }

    /** 
     * This is a method, rightShift.
     * The purpose of this is to shift firstNumber right as many as secondNumber.
     * The input is two numbers
     * and the output is the result of the rightShift.
    */

    public int rightShift(int firstNumber, int secondNumber){
        return firstNumber >> secondNumber;
    }

    /**
     * This is a method, square.
     * The purpose of this is to square firstNumber as secondNumber.
     * The input is two numbers
     * and the output is the result of the square.
     */

    public int square(int firstNumber, int secondNumber){
        int squareResult = 1;
        for(int i = 1; i <= secondNumber; i++){
            squareResult *= firstNumber;
        }
        return squareResult;
    }
}