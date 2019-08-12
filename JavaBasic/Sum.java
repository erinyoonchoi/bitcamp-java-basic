import java.util.Scanner;
class Sample{}
class Sum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, total = 0;
        String op = "";
        System.out.println("첫번째 수를 입력하세요.");
        num1 = scan.nextInt();

        System.out.println("두번째 수를 입력하세요");
        num2 = scan.nextInt();
                            
        System.out.println("연산종류를 선택하세요. +, -, x, /");
        op = scan.next();
        if(op.equals("+")){
            total = num1+num2;
            System.out.println(String.format("%d + %d = %d", num1, num2, total));
        }
        else if(op.equals("-")){
            total = num1-num2;
            System.out.println(String.format("%d - %d = %d", num1, num2, total));
        }
        else if(op.equals("x")){
            total = num1*num2;
            System.out.println(String.format("%d x %d = %d", num1, num2, total));
        }
        else if(op.equals("/")){
            total = num1/num2;
            System.out.println(String.format("%d / %d = %d", num1, num2, total));
        }
        else{
            System.out.println("없는 연산자 입니다. 다시 선택해주세요. ");
        }    
        
        
    }
}