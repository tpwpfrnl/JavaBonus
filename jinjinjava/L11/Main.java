class Main{

    int[] numbers;

    public static void main(String[] args){
        Main myMain = new Main();
        myMain.methodForArbitraryNumberOfArguments(1, 2, 3);
    }

    public void methodForArbitraryNumberOfArguments(int... numbers){
        this.numbers = numbers;
        
    }
}