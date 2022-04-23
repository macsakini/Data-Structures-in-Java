import java.util.Stack;

public class stacky {
    public static void main(String[] args){
        Stack<String> games = new Stack<String>();

        games. add("Call of Duty");

        games.add("Super Monkey Ball");

        games.add("Guitar Hero");

        System.out.println(games);

        //if you would like to get topmost one 
        System.out.println(games.pop());

        //to get second from top
        System.out.println(games.pop());

        // to get remaining stack after two pop operations
        System.out.println(games);

        //to check the first item on the stack 
        System.out.println(games.peek());

        // Y
        // B
        // R

        Stack<Character> tower = new Stack<Character>();

        tower.add('R');
        tower.add('B');
        tower. add('R');

        System.out.println(tower.empty());
        System.out.println(tower.get(1));
        System.out.println(tower.set(1, 'P'));
        System.out.println(tower.size());



    }
}
