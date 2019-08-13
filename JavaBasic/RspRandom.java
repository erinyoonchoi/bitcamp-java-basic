import java.util.Scanner;
import java.util.Random;

class RspRandom{
    public static void main(String[] args){
    /**
     * 가위바위보에서 
     * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
     * 컴퓨터가 만든 값이 1: 가위를 낸 것이고
     * 2: 바위를 낸 것이고
     * 3: 보를 낸 것으로 할 때,
     * 
     * 사용자측이 가위, 바위, 보를 냈을 때
     * 승패를 결정하는 프로그램을 작성하시오
     */
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    int com = ran.nextInt(3)+1;
    System.out.println(String.format("랜덤 값 %d",com));
    String initial = "";
    if(com == 1){
        initial = "가위";
    }else if(com == 2){
        initial = "바위";
    }else if(com == 3){
        initial = "보";
    }

    String win = "";
    if(com == 1){
        win = "바위";
    }else if(com == 2){
        win = "보";
    }else if(com == 3){
        win = "가위";
    }
   
    String even = "";
    if(com == 1){
        even = "가위";
    }else if(com ==2){
        even = "바위";
    }else if(com == 3){
        even = "보";
    }

    String lose = "";
    if(com == 1){
        lose = "보";
    }else if(com ==2){
        lose = "가위";
    }else if(com ==3){
        lose = "주먹";
    }
    
    System.out.println("가위/바위/보 중에 하나를 입력 하세요.");
    String play = scan.next();
    if(play.equals(win)){
        System.out.println("승");
    }else if(play.equals(even)){
        System.out.println("비김");
    }else if(play.equals(lose)){
        System.out.println("패배");
    }

    }
}