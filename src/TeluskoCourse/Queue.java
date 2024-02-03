package TeluskoCourse;/* Created by: Jamie
 * Created on:{03/02/2024}
 * This is a program is:
 */

public class Queue {

    int[] queue = new int[5];
    int size;
    int rear;
    int front;

    public void enQueue(int data){
        queue[rear] = data;
        rear += 1;
        size += 1;
    }

    public int deQueue(){
        int data = queue[front];
        front = front+1;
        size -= 1;
        return data;
    }

    public void show(){

        System.out.println("Element in Queue: ");
        for (int i = 0; i < size; i++){
            System.out.print(queue[front + i] + " ");
        }
    }

}//class
