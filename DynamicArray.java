//Developed by: Barzy Yasin Karim.

import java.util.Scanner;
//import java.util.Random;

class DynamicArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// Random rn = new Random();

		System.out
				.print("Implementing arraylist from array. \nBy: Barzy Yasin Karim.\n\n<--Welcome to dynamic array program--> \n\n");

		System.out.print("* Please enter the array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int j = 11; // we can use user input or random class for the array
					// values. but i prefer that it will be better in static bcs
					// it's just for test.
		// the array values staticly starts from (11) till enfinity.
		for (int i = 0; i < arr.length; i++) {
			// System.out.print("enter arr["+i+"]= ");
			// arr[i]=rn.nextInt(9)+1;
			arr[i] = j++;
		}

		System.out.println("\nYour array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]= " + arr[i]);
		}

		while (true) {

			System.out.print("\n------------menu------------\n");

			System.out.println("tap ( 1 ) to add a new value.");
			System.out.println("tap ( 2 ) to see the array.");
			System.out.println("tap ( 3 ) to update a value.");
			System.out.println("tap ( 4 ) to delete a value.");
			System.out.println("tap ( 5 ) to swap two values.");
			System.out.println("tap ( 6 ) to exit the program.");
			System.out.print("\n- Enter your input here -> ");
			int crud = sc.nextInt();

			switch (crud) {
			case 1: // adding index and value

				int arrTempAdd[] = new int[arr.length + 1];

				for (int i = 0; i < arr.length; i++) {
					arrTempAdd[i] = arr[i];
				}

				int newValueIndex = arrTempAdd.length - 1;
				System.out.print("# Enter new value in arr[" + newValueIndex
						+ "]: ");
				arrTempAdd[newValueIndex] = sc.nextInt();

				arr = new int[arrTempAdd.length];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = arrTempAdd[i];
				}

				for (int i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "]= " + arr[i]);
				}

				// System.out.println("\n");
				break;

			case 2: // printing all the array index. but the commented area is
					// for printing an index value.
				// System.out.print("# Enter the index number to see its value: ");
				// int arrGetValue = sc.nextInt();
				// if (arrGetValue > -1 && arrGetValue < arr.length)
				// System.out.println("The value of arr[" + arrGetValue
				// + "]= " + arr[arrGetValue]);
				// else
				// System.out.println("arr[" + arrGetValue
				// + "] doesn't exist! ");
				// show the array content.
				for (int i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "]= " + arr[i]);
				}
				break;

			case 3: // updating index value
				System.out
						.print("# Enter the index number \n  of the value you want to change: ");
				int arrSetValue = sc.nextInt();
				if (arrSetValue < 0 || arrSetValue > arr.length - 1) {
					System.out.println("arr[" + arrSetValue
							+ "] doesn't exist! ");
					break;
				}

				System.out.print("arr[" + arrSetValue + "]= "
						+ arr[arrSetValue] + ".");
				System.out.print("\n- Enter new value of arr[" + arrSetValue
						+ "]: ");
				arr[arrSetValue] = sc.nextInt();

				// show the array content.
				for (int i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "]= " + arr[i]);
				}
				break;

			case 4: // deleting an index
				System.out
						.print("# Enter the index number to delete his value: ");
				int arrDelIndex = sc.nextInt();
				if (arrDelIndex < 0 || arrDelIndex > arr.length - 1) {
					System.out.println("arr[" + arrDelIndex
							+ "] doesn't exist! ");
					break;
				}
				// 19009 is prime number
				arr[arrDelIndex] = 0;

				for (int i = arrDelIndex; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}

				int arrTempDel[] = new int[arr.length - 1];

				for (int i = 0; i < arrTempDel.length; i++) {
					arrTempDel[i] = arr[i];
				}

				arr = new int[arrTempDel.length];

				for (int i = 0; i < arrTempDel.length; i++) {
					arr[i] = arrTempDel[i];
				}

				// show the array content.
				for (int i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "]= " + arr[i]);
				}

				break;

			case 5: // swapping two values.
				System.out
						.print("# Enter the index number\n  of the First value to swap: ");
				int arrSwapIndex1 = sc.nextInt();
				if (arrSwapIndex1 < 0 || arrSwapIndex1 > arr.length - 1) {
					System.out.println("arr[" + arrSwapIndex1
							+ "] doesn't exist! ");
					break;
				}
				System.out
						.print("# Enter the index number\n  of the Second value to swap: ");
				int arrSwapIndex2 = sc.nextInt();
				if (arrSwapIndex2 < 0 || arrSwapIndex2 > arr.length - 1) {
					System.out.println("arr[" + arrSwapIndex2
							+ "] doesn't exist! ");
					break;
				}

				int swapTemp = arr[arrSwapIndex1];
				arr[arrSwapIndex1] = arr[arrSwapIndex2];
				arr[arrSwapIndex2] = swapTemp;
				System.out.println();

				// show the array content.
				for (int i = 0; i < arr.length; i++) {
					System.out.println("arr[" + i + "]= " + arr[i]);
				}
				break;

			case 6: // exit the program
				System.out
						.print("*Hope you get benefits <3 \n Have a good day...");
				return;

			default:
				System.out
						.println(" Sorry, your input number is out of the range!!!\n Please look down the menu again.");

			}
		}
	}
}
