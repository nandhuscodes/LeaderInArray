import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class LeaderInArray {
    static ArrayList<Integer> leaderInArray(int[] array){
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = array[array.length-1];
        leaders.add(max);
        for(int i = array.length-2; i >= 0; i--){
            if(array[i]>max){
                max = array[i];
                leaders.add(array[i]);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int N = scanner.nextInt();
        int array[] = new int[N];
        System.out.print("Array Elements: ");
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(leaderInArray(array));
    }
}
