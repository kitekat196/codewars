import java.util.Arrays;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr){
        if (dir == 'R'){
            Arrays.sort(arr);
        } else if (dir == 'L'){
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }

        return arr;
    }
}

/*
Arrays.stream(arr).boxed()
                 .sorted(dir=='L'? (a,b)->b-a : (a,b)->a-b)
                 .mapToInt(Integer::intValue)
                 .toArray();
 */