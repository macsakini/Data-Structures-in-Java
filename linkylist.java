package questions;
import java.util.Iterator;
import java.util.LinkedList;

class Linkylist {
    public static void main(String[] args){
        LinkedList<String> linky = new LinkedList<String>();

        //you can add elements to the LinkedAList 
        linky.add("Rob");
        linky.add("animal");
        linky.add("Hose");

        linky.getFirst();
        //linky.remove();

        System.out.println(linky);

        LinkedList<Integer> numlinky = new LinkedList<Integer>();

        numlinky.add(1);
        numlinky.add(78);
        numlinky.add(456);

        System.out.println(numlinky.get(2));

        //iterating through the linkedlist to find a number

        Iterator it = numlinky.iterator();

        while(it.hasNext()){
            if((int) it.next() == 78){
                System.out.println("We have found 78");
            }
        }
        

    }
}