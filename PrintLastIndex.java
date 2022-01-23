import java.util.*;

class PrintLastIndex{
    public static void printLastIndex(int[] array, int n){
        if(n<0)
            return;
        if(n==(array.length)-1)
            System.out.print(array[n]);
        printLastIndex(array,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        printLastIndex(array,n-1);
    }
}