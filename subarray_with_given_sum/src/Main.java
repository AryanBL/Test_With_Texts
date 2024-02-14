import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        int arr[]= new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;
        array=Solution.subarraySum(arr,10,15);
        for (int n:array){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}