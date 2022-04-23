# Data-Structures-in-Java 😒👌
This is a collection of some of the most fundamental data structures and functions done in Java.

Each file in this repository is a snippet of the java function assigned. The name of the repository is also closely related to the task at hand.
i.e getset.java concernes getters and setters.

The function below shows a snippet that shows creation of a hashmap. 

```java
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
    })
 }
```

This second excercises a try and catch block.

```java
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
    })
    
}

```
