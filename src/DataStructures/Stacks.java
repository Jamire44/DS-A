package DataStructures;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // pop takes from last
        String myFavGame = stack.pop();


        System.out.println(stack.search("DOOM"));
        System.out.println(stack.peek());
        System.out.println(stack);

    }//main
}//class
