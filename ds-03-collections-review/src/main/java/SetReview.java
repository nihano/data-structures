import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //1. create a set

        Set<Student> set = new LinkedHashSet<>();

        //2. add element

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(3, "Mike"));
        //add returns boolean, duplicates are not allowed so it's not added and returned false
        System.out.println(set.add(new Student(4, "Mary")));


        System.out.println(set);
        System.out.println(firstRepeatingChar("Java Developer"));

    }

    public static Character firstRepeatingChar(String str) {
        //what is the time complexity of the following code? O(n)

        // create HashSet
        Set<Character> chars = new HashSet<>(); //in here I have space complexity of O(n)
        // iterate over the char array and  add chars into  HashSet
        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        //if (!chars.add(ch)) ==> meaning if returns false

        // if add ops is false return that char
        return null;
    }
}

