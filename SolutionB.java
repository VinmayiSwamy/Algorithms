import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class SolutionB {
    public static void main(String[] args) {
        int[] list;
        String st;
        String[] stNew;
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        
        int[] arr = new int[100];;
        int i =0;
        while (scan.hasNext())
        {
          arr[i] = scan.nextInt();
          i++;
        }

        int ans = 0;
        for (i = 0; i < arr.length; i++){
            ans = findIndex(arr, M);
        }

        if (ans==-1)
            System.out.println("NOT_FOUND");
        else
            System.out.print(ans);
    }
    
    public static int findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
}