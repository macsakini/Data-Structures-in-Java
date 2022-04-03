package questions;

import java.util.LinkedList;
import java.util.Queue;

public class queueish {
    public static void main(String[] args){
        //Example one
        Queue<String> bbq = new LinkedList<String>();

        bbq.add("Jeff");

        bbq.add("Tyrique");

        bbq.add("Susan");
        
        bbq.peek();

        System.err.println(bbq);

        //Jeff
        bbq.poll();
        //Tyrqique
        bbq.poll();
        //Susan
        System.out.println(bbq.poll());

        //Example two

        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");

        q.poll();

        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.contains("A"));

        System.out.println(q.toArray()[1]);

    }

}
