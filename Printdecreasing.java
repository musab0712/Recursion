import java.util.*;
class Printdecreasing{
    public static void printdecreasing(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printdecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecreasing(n);
    }
}