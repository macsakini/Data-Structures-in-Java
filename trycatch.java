import java.util.Scanner;

class trycatch {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7};

        try {
            System.out.println(a[9]);
        } catch (Exception e) {
            System.out.println(a[5]);
            System.out.println("no index 9");
        }

        //Example 2
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite number?");

        try {
            
            int n = scan.nextInt();

            System.out.println(n);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Sorry Please enter a number");
        }

        //Example 3

        try {
            int[] u = {3};

            System.out.println(u[1]);   
        } catch (NullPointerException e) {
            //TODO: handle exception
            System.out.println("I am a null");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds");
        } catch (Exception e){
            System.out.println("Could be something else");
        }
    }    
}
