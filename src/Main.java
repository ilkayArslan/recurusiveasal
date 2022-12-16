import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        boolean result = isAsal(number,2);
        System.out.println(result?"evet asal sayıdır":"hayır asal sayı değildir");
    }
    static boolean isAsal(int num,int b){
        boolean asal=true;
        while (b<num){
            if (num%b==0){
            return asal= false;
            }else {
              return isAsal(num,b+1);

            }

        };
        return asal;
    };
}