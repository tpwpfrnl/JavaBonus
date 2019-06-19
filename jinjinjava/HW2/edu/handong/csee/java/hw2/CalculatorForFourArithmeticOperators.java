package edu.handong.csee.java.hw2;

 /** 
 * This is a class, CalculatorForFourArithmeticOperators.
 * The purpose of this is to calculate the numbers.
 * The input is two numbers
 * and the output is the four results (sum, subtract, multiply, divide).
*/

public class CalculatorForFourArithmeticOperators implements Calculator {

    /** 
     * This is a integer variable, numberOfArithmeticOperatorProcessed.
     * The purpose of this is to count how many arithmetic operator processed.
     * This will be a input for displayNumberOfArithmeticOperatorProcessed().
    */

    int numberOfArithmeticOperatorProcessed = 0;

     /** 
     * This is a main method for CalculatorForFourArithmeticOperators class.
     * The purpose of this is to run the program.
     * The input is two numbers (args[o], args[1])
     * and the output is the four results (sum, subtract, multiply, divide).
    */

    public static void main(String[] args) {

        // create myCalculator instnace from CalculatorForFourArithmeticOperators class! 
        CalculatorForFourArithmeticOperators myCalculator = new CalculatorForFourArithmeticOperators();

        System.out.println("SUM: " + myCalculator.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        System.out.println("SUBTRACT: " + myCalculator.subtract(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        System.out.println("MULTIPLY: " + myCalculator.multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
        System.out.println("DIVIDE: " + myCalculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

        myCalculator.displayNumberOfArithmeticOperatorProcessed();
    }

     /** 
     * This is a method, sum.
     * The purpose of this is to sum firstNumber with secondNumber.
     * The input is two numbers
     * and the output is the result of the sum.
    */

    public int sum(int firstNumber,int secondNumber) {
        numberOfArithmeticOperatorProcessed++;
        return firstNumber+secondNumber;
    }

     /** 
     * This is a method, subtract.
     * The purpose of this is to subtract secondNumber from firstNumber.
     * The input is two numbers
     * and the output is the result of the subtract.
    */

    public int subtract(int firstNumber,int secondNumber) {
        numberOfArithmeticOperatorProcessed++;
        return firstNumber-secondNumber;
    }

     /** 
     * This is a method, multiply.
     * The purpose of this is to multiply firstNumber by secondNumber.
     * The input is two numbers
     * and the output is the result of the multiply.
    */

    public int multiply(int firstNumber, int secondNumber) {
        numberOfArithmeticOperatorProcessed++;
        return firstNumber*secondNumber;
    }

    /** 
     * This is a method, divide.
     * The purpose of this is to divide firstNumber to secondNumber.
     * The input is two numbers
     * and the output is the result of the divide.
    */

    public int divide(int firstNumber,int secondNumber) {
        numberOfArithmeticOperatorProcessed++;
        return firstNumber/secondNumber;
    }

    /** 
     * This is displayNumberOfArithmeticOperatorProcessed.
     * The purpose of this is to show how many arithmetic operator processed.
     * The input is the number of arithmetic operator processed
     * and the output is the same.
    */

    public void displayNumberOfArithmeticOperatorProcessed(){
        System.out.println("The number of arithmetic operators processed!: " + numberOfArithmeticOperatorProcessed);
    }
}