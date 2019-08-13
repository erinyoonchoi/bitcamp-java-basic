import java.util.Scanner;
import java.util.Random;

class Dice{
    public static void main(String[] args){
        /**
         * 컴퓨터가 주사위를 던져서 나온 값은 'random'
         * 사용자가 홀수와 짝수둘중에 하나를 입력하면 
         * 정답이 맞는지 아닌지 출력.
         */  
        
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;
        //System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        String answer = "";
        if(dice % 2 == 0){
            answer = "짝";
        }else{
            answer = "홀";
        }

        System.out.println("주사위 값을 예측한 홀, 짝 입력[ ]");
        String client = "";
        client = scan.next();
        if(client.equals(answer)){
            System.out.println("정답 입니다.");
        }else if(!client.equals(answer)){
            System.out.println(String.format("오답 입니다. %d 입니다.", dice));
        }else{
            System.out.println("잘못 입력하셨습니다. 재입력 하세요.");
        }
    }
}