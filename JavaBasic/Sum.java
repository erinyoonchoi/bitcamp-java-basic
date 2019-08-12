import java.util.Scanner;

class Sum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("샘을 할 첫번째 수를 입력하세요.");
        num1 = scan.nextInt();

        System.out.println("두번째 수를 입력하세요");
        num2 = scan.nextInt();
        
        int total = num1+num2;
        System.out.println("결과: "+total+"입니다.");
    }
}