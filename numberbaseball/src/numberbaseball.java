import java.util.*;
import java.io.*;

public class numberbaseball {

    public static int playGame() throws IOException{
        int x,y,z;
        Random r = new Random();
        x = Math.abs(r.nextInt()%9)+1;
        do{
            y = Math.abs(r.nextInt()%9)+1;
        } while (y==x) ; // y와 x가 같아지면 그만함
        do{
            z = Math.abs(r.nextInt()%9)+1;
        }while ((x==z) || (y==z));
        System.out.println(x + "," + y + "," + z);
        return playGame(x,y,z);
    }
    public static int playGame(int x,int y,int z) throws IOException { //메소드 오버라이드 인수가 있으면 이 플레이게임을 사용함
        int strike = 0;
        int ball = 0;
        int[] usr = new int[3]; // 사용자가 입력할 숫자
        int[] com = {x, y, z}; // 컴퓨터의 숫자
        System.out.println("숫자 야구 게임");
        int count;
        for(count=0;count<=10;count++) {
            System.out.println("\n 카운트: " + count);
            Scanner sc = new Scanner(System.in);
            String user;
            System.out.println("1번째 숫자: ");
            usr[0] = sc.nextInt();
            System.out.println("2번째 숫자: ");
            usr[1] = sc.nextInt();
            System.out.println("3번째 숫자: ");
            usr[2] = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                if (usr[i] == 0 || usr[i] > 9) {
                    System.out.println("입력값이 잘못되었습니다(1~9). 다시 진행해주세요");
                }
            }
            int cnt= 0;
            for (int i = 0; i < 3; i++) {
                if (usr[i] == com[0] || usr[i] == com[1] || usr[i] == com[2]) {
                    strike++;
                    cnt++;
                } else ball++;
            }
            if(cnt==3)break;
            System.out.println("Strike: " + strike + " Ball: " + ball);
            strike=ball=0;
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        int result;
        if(args.length==3){
            int x = Integer.valueOf(args[0]).intValue();
            int y = Integer.valueOf(args[1]).intValue();
            int z = Integer.valueOf(args[2]).intValue();
            result =playGame(x,y,z);
        }else{
            result=playGame();
        }
        System.out.println(result);

    }
}
