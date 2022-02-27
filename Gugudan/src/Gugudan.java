import java.util.Scanner;

public class Gugudan {
    public  static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times* (i + 1);
        }
        return result;
    }
    public static void print(int[] result){
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static  void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("사용자가 입력한 값 : "+ number);
        if(number>=2 && number<=9){
            int[] time = calculate(number);
            print(time);
            }
        else{
            System.out.println("값을 잘못 입력했습니다.");
        }
    }
}
