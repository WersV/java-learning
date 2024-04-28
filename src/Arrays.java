import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<100;i++) {
            if(i % 3 == 0 && i != 0) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
        int[] reversedArray = new int[numbers.size()];

        for(int i=0; i < reversedArray.length; i++) {
            reversedArray[i] = numbers.get(reversedArray.length - 1 - i);
            System.out.println(reversedArray[i]);
        }
    }
}
