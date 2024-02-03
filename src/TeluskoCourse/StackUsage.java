package TeluskoCourse;

import java.lang.reflect.Array;

public class StackUsage {
    public static void main(String[] args) {

        DStack stack = new DStack();

        stack.add(10);
        stack.add(11);
        stack.add(12);
        stack.add(13);
        stack.add(14);
        stack.pop();
        stack.pop();

        stack.show();



    }
}
