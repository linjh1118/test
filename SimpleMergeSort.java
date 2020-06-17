package praticeOnBookLiang.Section7;

import java.util.Arrays;
import java.util.Scanner;


public class SimpleMergeSort {
    public static void main(String[] args) {
        int[] numbers = youngMergeSort( new int[] { 1, 2, 4, 6, 10 }, new int[] { 2, 4, 6, 8, 10 } );
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] youngMergeSort(int[] numbers1, int[] numbers2) {
        int[] numbers = new int[numbers1.length + numbers2.length];

        for (int i = 0, i1 = 0, i2 = 0;
             i < numbers.length; ) {                              // i 来 表征 numbers 的 被填充满 的程度，当 被填满后，就可跳出循环
                                                                  // 强调： 填充后 i++; 0号填满后，i为1; length-1填满后,i 为length;
            if (i1 == numbers1.length) {
                System.arraycopy(numbers2, i2, numbers, i, numbers2.length - i2 );     // I don't understand this suggestion.(i2:)
                break;
            }
            if (i2 == numbers2.length) {
                System.arraycopy(numbers1, i1, numbers, i, numbers1.length - i1 );     // I don't understand this suggestion.(i2:)
                break;
            }


            if (numbers1[i1] <= numbers2[i2]) {             
                numbers[i ++] = numbers1[i1 ++];
            } else {
                numbers[i ++] = numbers2[i2 ++];
            }

        }

        return numbers;                  
    }

}
