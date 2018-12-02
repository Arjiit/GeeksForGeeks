import java.io.*;
import java.util.*;

public class PriorityQueueJava {
    public static void main(String[] args) {

        PriorityQueue<String> pQueue = new PriorityQueue<String>();

        pQueue.add("C");
        pQueue.add("C++");
        pQueue.add("Java");
        pQueue.add("Python");

         // Printing the most priority element 
        System.out.println("Head value using peek function"+ pQueue.peek());
        
        System.out.println("Printing all elements");

        Iterator itr1 =  pQueue.iterator();
        while (itr1.hasNext())  {
            System.out.println(itr1.next());
        }

        pQueue.poll();
        System.out.println("After removing the first element");

        Iterator itr2 =  pQueue.iterator();

        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }      

        pQueue.remove("Java");
        System.out.println("After removing Java");

        Iterator itr3 =  pQueue.iterator();

        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        boolean b = pQueue.contains("C");
        System.out.println("Priority Queue contains C or not" + b);

        Object[] arr = pQueue.toArray();
        System.out.println("Value in array");
        for (int i=0; i<arr.length; i++) {
            System.out.println("Value:" + arr[i].toString());
        }
    }
}