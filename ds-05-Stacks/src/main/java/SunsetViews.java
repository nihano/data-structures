import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {
        int[] buildings={3,5,2,6};
        System.out.println(sunsetViews(buildings, "east"));
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack=new Stack<>();// stack to hold building indicies that can see sunset
        // this part is for East by default
        int i=0;
        int step=1;
        // this part is for west
        if(direction.equalsIgnoreCase("west")) {
            i= buildings.length-1;
            step=-1;
        }
        while(i>=0 && i< buildings.length) {

            while(!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){ //i=0 | i=1 | i=2 | i=3
                stack.pop();
            }
            stack.push(i);//3 | 5 | 5,2 |6
            i+=step;//2 |3 |4
        }
        // now I have a stack with the building indicies that can see sunset
        if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);

        return new ArrayList<Integer>(stack);
    }
}
