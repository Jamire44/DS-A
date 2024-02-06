package TeluskoCourse.linkedlists;

public class Main {
    public static void main(String[] args) {

        LinkedLists list = new LinkedLists();
        list.insert(6);
        list.insert(7);
        list.insert(2);
        list.insertAtStart(1);
        list.insertAtStart(23);
        list.insertAt(0,44);
//        list.deleteAt(1);
        list.show();

    }
}//class
