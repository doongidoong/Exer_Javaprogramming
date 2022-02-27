import java.util.Scanner;

public class Gugudan {
    public static  void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("사용자가 입력한 값 : "+ number);
        if(number>=2 && number<=9){
        for(int i=1;i<10;i++){
            System.out.print(number*i+" ");
        }}
        else{
            System.out.println("값을 잘못 입력했습니다.");
        }

    }
}
