import java.util.*;

class PrintFirstIndex{
    public static void printFirstIndex(int[] array, int n){
        if(n==0){
            System.out.print(array[n]);
            return;
        }
        printFirstIndex(array,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        printFirstIndex(array,n);
    }
}