import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReplaceArray {
    public static boolean[] replace(int[] numbers) {

        List<Boolean> temp = new ArrayList<>();
        Arrays.stream(numbers).forEach(number ->{
            if(number%2 == 0){
                temp.add(false);
            }
            else temp.add(true);

        });

    return arraylistToArray(temp);
    }

    public static boolean[] arraylistToArray(List<Boolean> booleans){
        boolean[] values = new boolean[booleans.size()];
        int count =0;
        for (boolean bool:booleans){
            values[count] = bool;
            count++;
        }
            return values;
    }


}
