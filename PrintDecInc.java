import java.util.*;
class PrintDecInc{
    public static void printDecInc(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printDecInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecInc(n);
    }
}