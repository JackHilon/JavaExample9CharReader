package javaexample9charreader;

import java.io.InputStreamReader;

public class JavaExample9CharReader {

    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);

        System.out.print("Please enter your character: ");

        char myChar = 'S';
        String myStr;

        try {
            myChar = (char) in.read();
            myStr= Character.toString(myChar);
            
        } catch (Exception e) {
            System.out.println("e.toString()");
            myStr="This is not a character!!!!";
        }

        System.out.println("Your character is: " + myChar);
        System.out.println("Your character \"as a string\" is: "+myStr);
    }

}
