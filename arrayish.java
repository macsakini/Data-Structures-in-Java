import java.util.ArrayList;
import java.util.List;

class arrayish {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>();

        a.add(10);
        a.add(20);

        List <String> b = new ArrayList<String>();

        for(int i : a){
            System.out.println(String.valueOf(i));
            b.add(String.valueOf(i));
        }

        System.out.println(b);


    }
}
