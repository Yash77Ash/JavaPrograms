import java.util.ArrayList;

public class A2{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(69);
        numbers.add(79);
        numbers.add(99);

       
        int sum = calculateEvenSum(numbers);
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int calculateEvenSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { 
                sum += num; 
            }
        }
        return sum;
    }
}
