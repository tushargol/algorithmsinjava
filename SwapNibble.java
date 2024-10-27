import java.util.Scanner;
public class SwapNibble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int swapnum;
        swapnum=((num& 0x0f)<<4)|((num&0xf0)>>4);
        System.out.println("After swapping nibbles: "+swapnum);
        sc.close();
    }
}
