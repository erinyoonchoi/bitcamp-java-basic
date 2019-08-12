import java.util.Scanner;

class MinusTest{
    public static void main(String[] args){
        System.out.println("뺄샘 하기");
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("첫번째 수 입력");
        num1 = scan.nextInt();
        
        System.out.println("두번째 수 입력");
        num2 = scan.nextInt();

        int total = num1-num2;
        System.out.println("결과:"+total+"입니다.");
        
    }
}
