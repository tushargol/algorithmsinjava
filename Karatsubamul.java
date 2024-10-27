import java.util.Scanner;

public class Karatsubamul {
    public static long Karatsubamul(long a, long b) {
        if(a<10||b<10) {
            return a*b;
        }
        int l=Math.max(Long.toString(a).length(),Long.toString(b).length());
        int hl=l/2;
        long max1=a/(long)Math.pow(10,hl);
        long min1=a%(long)Math.pow(10,hl);
        long max2=b/(long)Math.pow(10,hl);
        long min2=b%(long)Math.pow(10,hl);
        long bd=Karatsubamul(min1,min2);
        long ac=Karatsubamul(max1,max2);
        long ab_cd=Karatsubamul(min1+max1,min2+max2);
        return(ac*(long)Math.pow(10,l))+((ab_cd-ac-bd)*(long)Math.pow(10,hl))+bd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        System.out.println(Karatsubamul(a,b));
        sc.close();
    }
}
