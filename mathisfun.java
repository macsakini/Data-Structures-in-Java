// package questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class mathisfun {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

        Collections.addAll(a,5,6,7,8);

        // Iterator listy = a.iterator();

        // while(listy.hasNext()){
        //     if((int) listy.next() == 5){
        //         System.out.println("Print Next");
        //     }
        // }

        for(int i = 0; i < a.size(); i++){
            System.out.println(Math.log10(78));
        }

        //declarative
        a.stream()
            //.forEach(System.out.println(8))
            .collect(Collectors.toList());
    }    
}
