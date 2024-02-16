//Write a program to find the square of the number 3.9.

public class Ques_8 {
    public static void main(String[] args) {
        float x = 3.9f, sq;
        sq = x * x;
        System.out.println("Square of the number is : " + sq);

        // By using Math function

        double sqr = Math.pow(x, 2);
        System.out.println("Square of the number is : " +sqr);
    }
}
