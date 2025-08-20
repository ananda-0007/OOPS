// Sum of Numbers from start to end
class W {
    int sum = 0;

    void add(int start, int end) {
        sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum from " + start + " to " + end + " is " + sum);
    }
}

public class SumNumbers {
    public static void main(String[] args) {
        W obj = new W();

        obj.add(1, 100);
        obj.add(1, 50);
        obj.add(50, 100);
        obj.add(1, 10);
        obj.add(1, 1);
    }
}
