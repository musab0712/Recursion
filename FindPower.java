import java.util.*;
class FindPower{
    public static int findPower(int b, int p){
        if(p==1)
            return b;
        return b*findPower(b,p-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int p = sc.nextInt();
        int result = findPower(b,p);
        System.out.println(result);
    }
}