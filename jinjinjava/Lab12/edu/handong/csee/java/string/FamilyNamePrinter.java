package edu.handong.csee.java.string;

public class FamilyNamePrinter{
    private String[] stringNames;
    private String[] familyNames;
    int i = 0;
    public static void main(String[] args){
        FamilyNamePrinter myNames = new FamilyNamePrinter(args[0]);
        myNames.printFamilyNames();
    }
    
    public FamilyNamePrinter(String names){
        stringNames = names.split(",");
        familyNames = new String[stringNames.length];
        for(String name:stringNames){
            familyNames[i] = name.trim().split(" ")[1];
            i++;
        }
    }
    
    public void printFamilyNames(){
        for(String name:familyNames){
            System.out.println(name);
        }
    }
}