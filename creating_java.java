import java.util.Arrays;
import java.util.Scanner;
public class array {
public static void main(String args[]){
    Scanner aki=new Scanner(System.in);
    System.out.println("Enter the length of your array:");
    int a=aki.nextInt();
    int b[]=new int[a];
    System.out.println("Enter the elements:");
    for(int i=0;i<a;i++){
        b[i]=aki.nextInt();
    }
    System.out.println("The Arrays are:"+Arrays.toString(b));
}}
