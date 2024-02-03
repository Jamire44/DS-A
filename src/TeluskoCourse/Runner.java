package TeluskoCourse;/* Created by: Jamie
 * Created on:{03/02/2024}
 * This is a program is:
 */

public class Runner {
    public static void main(String[] args) {


        Queue q = new Queue();

        q.enQueue(5);
        q.enQueue(3);
        q.enQueue(2);
        q.enQueue(11);
        q.deQueue();

        q.show();
    }
}//class
