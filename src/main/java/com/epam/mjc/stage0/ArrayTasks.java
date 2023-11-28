package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    
    public String[] seasonsArray() {
        String[] season=new String[]{"winter","spring","summer","autumm"};
        return season;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int number=1;
        int[] positiveNumbers=new int[length];
        for (int counter=0;counter<length;counter++){
            positiveNumbers[counter]=number;
            number++;
        }
        return positiveNumbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int lenght= arr.length;
        int tSum=0;
        for(int counter=0;counter<lenght;counter++){
            tSum = arr[counter]+tSum;
        }
        return tSum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {

        int index=-1;
        for (int counter=0;counter<= arr.length;counter++){
            if(arr[counter]==number){
                index=counter;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int length= arr.length;
        String temp;
        for(int counter=0;counter<=length/2;counter++){
            temp=arr[counter];
            arr[counter]=arr[length-counter-1];
            arr[length-1-counter]=temp;
        }
        return arr;
        
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int counterA;
        int counterPositive=0;
        for (counterA=0;counterA<arr.length;counterA++){
            if (arr[counterA]>=0){
                counterPositive++;
            }
        }
        int[]posArr=new int[counterPositive];
        counterPositive=0;
        for (counterA=0;counterA<arr.length;counterA++){
            if (arr[counterA]>=0){
                posArr[counterPositive]=arr[counterA];
                counterPositive++;
            }
        }
        return posArr;

    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    // Swap arrays if they are not in ascending order of length
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort elements within each one-dimensional array using bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        // Swap elements if they are not in ascending order
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        return arr;
    }
}
