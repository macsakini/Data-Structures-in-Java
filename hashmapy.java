import java.util.HashMap;

public class hashmapy {
    
    public static void main(String[] args){
        int a, b, c;
        a = 1;
        b = 2;
        c = 3;

        HashMap<String,Integer> happy = new HashMap<>();

        happy.put("a", a);
        happy.put("b", b);
        happy.put("c",c);


        System.out.println(happy.get("c"));

        HashMap<String, String> passuser = new HashMap<String, String>();

        passuser.put("macmaxwell", "fluffyjoe354");

        passuser.put("bobbyjunior", "loriharvey");

        System.out.println(passuser);

        System.out.println(passuser.size());

        passuser.replace("bobbyjunior", "loriharvey", "lincolnloud");

        System.out.println(passuser);

        System.out.println(passuser.keySet());
        System.out.println(passuser.values());


    }
}
