package Arrays;

public class Array_secondHighest_num {
    public static void main(String[] args) {
        int marks[] ={23, 44,33, 55, 66, 77, 88, 33,12};
        int highest = 0;
        int secondHighest = 0;

        for (int num : marks) {

            if (num > highest) {

                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;

            }

        }
        System.out.println(secondHighest);

    }

}