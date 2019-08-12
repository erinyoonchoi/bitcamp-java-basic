import java.util.Scanner;

class WhereLive{
    public static void main(String[] args){
        String place = "";
        System.out.println("사는 곳이 어딘가요?");
        Scanner scan = new Scanner(System.in);
        place = scan.next();
        System.out.println(String.format("저는 %s 에 삽니다.", place));
    }
}