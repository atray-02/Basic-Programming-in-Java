package BasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    static void copyArray(int[] arr1, int[] arr2) {
        System.out.println("Elements of orignal array : ");
        for (int element : arr1) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of new array : ");
        for (int element : arr2) {
            System.out.print(element + " ");
        }
    }

    static void frequency(int[] arr) {
        boolean[] fr = new boolean[arr.length];
        Arrays.fill(fr, false);
        for (int i = 0; i < arr.length; i++) {
            //skip element if already counted.
            if (fr[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    fr[j] = true;
                    count++;
                }
            }
            System.out.println("Frequency of " + arr[i] + " is " + count);
        }
    }


    static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void leftRotate(int[] arr, int n) {
        int first;
        System.out.print("Orignal array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        System.out.println();
        System.out.print("After rotating " + n + " number of times to the left : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void rightRotate(int[] arr, int n) {
        int last;
        System.out.print("Orignal array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        last = arr[arr.length - 1];
        for (int i = 0; i < n; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println();
        System.out.print("After rotating " + n + " number of times to the right : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void duplicate(int[] arr) {
        System.out.print("Duplicate elements are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    static void printEvenPos(int[] arr) {
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }

    static void printOddPos(int[] arr) {
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }

    static void largest(int[] arr) {
        int max;
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
//          if(min>arr[i] for minimum element.
                max = arr[i];
            }
        }
        System.out.print("The maximum element is : " + max);
    }

    static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is : " + sum);
    }


    static void ascending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");

        }
    }

    static void descending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    static int nLargest(int[] arr, int n) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n - 1];
    }

    static void oddAndEven(int[] arr) {
        System.out.print("Even elements are : ");
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.print("Odd elements are : ");
        for (int ele : arr) {
            if (ele % 2 != 0) {
                System.out.print(ele + " ");
            }
        }
    }

    static void removeDuplicate(int []arr){
        //int [] temp = new int[arr.length];
        int j=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                //temp[j] = arr[i];
                arr[j] = arr[i];
                j++;
            }
        }
        //for Leftover element
        //temp[j] = arr[arr.length-1];
        arr[j] = arr[arr.length-1];
//        for (int ele:temp) {
//            System.out.print(ele + " ");
//        }
        for (int i = 0; i < j+1; i++) {
            System.out.print(arr[i] + " ");
        }
    }


        public static void main (String[]args){
            int[] arr1 = {1, 3, 5, 6, 7, 1, 5, 1};
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr2 = new int[arr1.length];
//        copyArray(arr1,arr2);
//        frequency(arr1);
//        reverse(arr1);
//        leftRotate(arr1,n);
//        rightRotate(arr1,n);
//        duplicate(arr1);
//        printEvenPos(arr1);
//        printOddPos(arr1);
//        largest(arr1);
//        sum(arr1);
//        ascending(arr1);
//        descending(arr1);
//        int third = nLargest(arr1,3);
//        System.out.println("third highest element is : " + third);
//        int second = nLargest(arr1,2);
//        System.out.println("second highest element is : " + second);
//        oddAndEven(arr1);
        removeDuplicate(arr1);
        }
    }
