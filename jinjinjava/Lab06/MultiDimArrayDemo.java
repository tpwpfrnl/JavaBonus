package Lab06;

public class MultiDimArrayDemo{

    public static void main(String[] args){
        String[][] names = {
            {"Mr.","Ms."},
            {"Seungmoon Choi", "Jooyoung Jang", "Jihyun Kwon", "Sihyun An", "Hagyung Lee", "Myeongbin Hwang", "Joowon Dang", "Youngchae Kwon"},
            {"1998-01-22", "1998-08-15", "1999-06-17", "1999-02-12", "1999-06-26", "1999-12-09", "1999-07-03", "1999-10-02"}
        };
        System.out.println(names[0][0] + names[1][0] + " " + names[2][0]);
        System.out.println(names[0][0] + names[1][1] + " " + names[2][1]);
        System.out.println(names[0][1] + names[1][2] + " " + names[2][2]);
        System.out.println(names[0][1] + names[1][3] + " " + names[2][3]);
        System.out.println(names[0][1] + names[1][4] + " " + names[2][4]);
        System.out.println(names[0][0] + names[1][5] + " " + names[2][5]);
        System.out.println(names[0][0] + names[1][6] + " " + names[2][6]);
        System.out.println(names[0][1] + names[1][7] + " " + names[2][7]);
    } 
}  