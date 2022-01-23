import java.util.*;
class PrintIncreasing{
    public static void printIncreasing(int n){
        if(n==0)
            return;
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}