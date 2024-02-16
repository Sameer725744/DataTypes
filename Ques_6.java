//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.

public class Ques_6 {

    public static void main(String[] args) {

        char ch = 'd';
        System.out.println("Character is :" + ch);

        int a = (int) ch + 3;
        char c = (char) a;
        System.out.println("The equivalent character is :" + c);
        
        // another method
        char New_c = (char) (ch + 3);
        System.out.println("The equivalent character is :" + New_c);

    }
}
