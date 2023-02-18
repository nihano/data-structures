import java.util.ArrayList;
import java.util.Arrays;

public class SunsetTrialWithArray {
    public static void main(String[] args) {
        int[] buildings = new int[]{3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(sunsetViews(buildings, "eaSt"));
    }

    //NOT AN OPTIMUM SOLUTION - JUST TRYING
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] newBuildings = new int[buildings.length];
        if (direction.equalsIgnoreCase("east")) {
            newBuildings = buildings;
        } else {
            int j=0;
            for (int i = buildings.length-1; i >=0; i--) {
                newBuildings[j]=buildings[i];
                j++;
            }
        }
        for (int i = 0; i < newBuildings.length - 1; i++) {
            int max = 0;
            for (int j = i + 1; j < newBuildings.length; j++) {
                if (buildings[j] >= max) {
                    max = newBuildings[j];
                }
            }
            if (max < newBuildings[i]) {
                list.add(i);
            }
        }
        list.add(buildings.length - 1);
        return list;
    }
}

