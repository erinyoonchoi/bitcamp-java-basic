import java.util.Scanner;
class Sample{}
class Sum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, total, op = 0;

        System.out.println("첫번째 수를 입력하세요.");
        num1 = scan.nextInt();

        System.out.println("두번째 수를 입력하세요");
        num2 = scan.nextInt();
        
        
            
        System.out.println("연산종류를 선택하세요. 1)+ 2)- 3)x 4)/");
        op = scan.nextInt();
        if(op == 1){
            total = num1+num2;
            System.out.println(String.format("%d + %d = %d", num1, num2, total));
        }
        else if(op == 2){
            total = num1-num2;
            System.out.println(String.format("%d - %d = %d", num1, num2, total));
        }
        else if(op == 3){
            total = num1*num2;
            System.out.println(total);
        }
        else if(op ==4){
            total = num1/num2;
            System.out.println(total);
        }
        else{
            System.out.println("없는 기능입니다. 다시 선택해주세요. ");
        }    
        
        
    }
}