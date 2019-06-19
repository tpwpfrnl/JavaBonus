package edu.handong.csee.java.langbasics;

public class Lecture07Demo{
    int number;
    public static void main(String[] args) {
        // System.out.println("Enter your number: ");
        Lecture07Demo myLecture07Demo = new Lecture07Demo();
        myLecture07Demo.plus(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        
    
    }

    public void plus(int a, int b, int c){
        if(a >= b){
            if(b >= c){
                System.out.println(a + "is the largest!");
            }
            if(a <= c){
                System.out.println(a + "is not the largest!");
            }
            System.out.println(a + "is larger than b!");
        }
        
    }

}