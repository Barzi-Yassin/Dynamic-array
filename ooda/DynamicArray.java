package ds.lab2;

import java.util.Arrays;

/**
 *
 * @author barzy
 */
public class DynamicArray {

    int[] arr;
    int numOfItems = 0;
    int numOfShrunks = 0;
    int numOfGrows = 0;

    final boolean devShowArrayReferences = false; // on grow() and shrunk().

    public DynamicArray() {
        arr = new int[4];
    }

    public DynamicArray(int size) {
        arr = new int[size];
    }

    void addItem(int newNum) {
        if (numOfItems == arr.length) {
            if (devShowArrayReferences) {
                System.out.println("\narr  1:  " + arr);
            }
            growArray();
            if (devShowArrayReferences) {
                System.out.println("arr  2:  " + arr + "\n");
            }
        }
        arr[numOfItems++] = newNum;
        if (devShowArrayReferences) {
            System.out.println("+ a number added");
        }

    }

    void growArray() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < numOfItems; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        numOfGrows++;
        System.out.println("++ Grown(" + numOfGrows + "), new Size: " + arr.length);
        if (devShowArrayReferences) {
            System.out.println("  temp:  " + temp);
        } else {
            System.out.println();
        }
//        System.out.println("");

    }

    void removeItem() {
        if (numOfItems == 0) {
            System.out.println("the array is already empty...");
        } else {
            numOfItems--;
            if (devShowArrayReferences) {
                System.out.println("- a number removed");
            }
            if (numOfItems < (arr.length / 2) && (arr.length / 2) >= 4) {

                if (devShowArrayReferences) {
                    System.out.println("\narr  1:  " + arr);
                }
                shrink();
                if (devShowArrayReferences) {
                    System.out.println("arr  2:  " + arr);
                }
                System.out.println("");
            }
        }
    }

    void shrink() {
        int[] temp = new int[getHalfOfArrayLength()];
        for (int i = 0; i < numOfItems; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        numOfShrunks++;

        System.out.println("-- Shrunk(" + numOfShrunks + "), new size: " + arr.length + "");
//        System.out.println(temp.length);
//        System.out.println(Arrays.toString(temp));
//        System.gc();
//        System.out.println(temp.length);
//        System.out.println(Arrays.toString(temp));

        System.gc();
        if (devShowArrayReferences) {
            System.out.println("  temp:  " + temp);
//            System.out.println("");
        }
    }

    void printArray(boolean tillItemExist) {
        int length = 0;
        String preWord;
        if (tillItemExist) {
            length = numOfItems;
            preWord = "Existed ones:\n  ";
        } else {
            length = arr.length;
            preWord = "All:\n  ";
        }
        System.out.print("Print " + preWord);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n"); // 2 enter
    }

    void printArrayLength() {
        System.out.println("Length: " + arr.length + "\n");
    }

    int getHalfOfArrayLength() {
        int len = arr.length;
        if (len % 2 == 1) {
            return (len / 2) + 1;
        }
        return len / 2;
    }

    void search(int numToFind) {
        System.out.print("Searching for number " + numToFind + " in the array:\n  ");

        int numIndex = -1;
        for (int i = 0; i < numOfItems; i++) {
            final int currentItem = arr[i];
            if (currentItem == numToFind) {
                numIndex = i;
//                System.out.println("" + numIndex);
//                break;
            }
        }

        String result = "Number " + numToFind + " not found..!";
        if (numIndex != -1) {
            result = "Number " + numToFind + " found at arr[" + numIndex + "]";
        }
        System.out.println(result + "\n");
    }

}
