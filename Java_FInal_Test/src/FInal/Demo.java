package FInal;

import java.util.*;

public class Demo {

	public static void main(String[] args) {

		int arr[] = { 2, 12, 3, 8, 5, 36 };
		Scanner can = new Scanner(System.in);
		System.out.println("enter Number");
		int num = can.nextInt();

		boolean find = false;
		int max = 0;
		int min = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("elements present in array");
				find = true;
				break;
			}
		}

		if (find == false) {

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			// [2, 3, 5, 8, 12, 36]

			System.out.println(Arrays.toString(arr));

			if (arr[0] > num) {
				System.out.println("Nearest Number is:" + arr[0]);
			} else if (num > arr[arr.length - 1]) {
				System.out.println("Nearest Number is:" + arr[arr.length - 1]);
			} else {
				for (int i = 0; i < arr.length; i++) {
					if (num > arr[i]) {

						count++;

					}

				}
				// System.out.println(count);
				min = arr[count - 1];
				max = arr[count];
				// System.out.println(min + " ->" + max);

				int min1 = num - min;
				int max1 = max - num;

				if (min1 > max1) {
					System.out.println("Nearest Number is:" + max);
				} else {
					System.out.println("Nearest Number is:" + min);
				}

			}

		}

	}

}
