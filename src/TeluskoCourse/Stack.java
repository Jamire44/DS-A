package TeluskoCourse;/* Created by: Jamie
 * Created on:{31/01/2024}
 * This is a program is:
 */

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void add(int data){
        if(top == 5){
            System.out.println("\nStack is full");
        }else {
            stack[top] = data;
            top++;
        }
    }

    public int pop(){
        int data = 0;
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }

    public int peek(){
        return stack[top - 1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;

    }

    public void show(){
        for (int val : stack){
            System.out.print(val + " ");
        }
    }

}//class
