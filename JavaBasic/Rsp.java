import java.util.Scanner;
class Rsp{
    public static void main(String[] args){
        int op = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("가위바위보 게임");
        System.out.println("1.가위 2.바위 3.보");
        //컴퓨터는 바위
        op = scan.nextInt();
        if(op == 1){
            System.out.println("컴퓨터 승!");
        }
        else if(op == 2){
            System.out.println("비김.");
        }
        else if(op == 3){
            System.out.println("사용자 승!");
        }
        else{
            System.out.println("번호를 잘못 입력하셨습니다. ");
        }
        
    }
}