package weekTwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(23, 17, 12, 90, 84, 38, 5, 77, 44));
        BinarySearchDemo demo = new BinarySearchDemo();

        System.out.print("unsorted: ");
        for (int num : array)
            System.out.print(num + " ");
        System.out.println();

        // sort array
        ArrayList<Integer> sortedArray = selectionSort(array);
        System.out.print("sorted:   ");
        for (int num : sortedArray)
            System.out.print(num + " ");
        System.out.println();

        //search for number
        System.out.println("What number would you like to search for?");
        int key = Integer.parseInt(console.nextLine());

        Integer found = demo.binarySearch(key, sortedArray);
        if (found == -1)
        {
            System.out.println("Item not found.");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d",
                    found, found +1);
        }
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> unsortedArray)
            //.set()
    {
        ArrayList<Integer> sortedArray = unsortedArray;
        for (int i = 0; i < sortedArray.size() - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < sortedArray.size(); j++)
            {
                if (sortedArray.get(j) < sortedArray.get(min))
                {
                    min = j;
                }
            }
            int temp = sortedArray.get(i);
            int x = sortedArray.get(min);
            sortedArray.set(i, x);
            sortedArray.set(min,temp);
        }
        return sortedArray;
    }
}
