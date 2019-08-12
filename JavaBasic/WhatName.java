import java.util.Scanner;

class WhatName{
      public static void main(String[] args){

        System.out.println("이름이 뭔가요?"); 
        String name = "";
        
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        
        System.out.println(String.format("제 이름은 %s 입니다.", name)); 
        System.out.println("몇살 이예요?");
        int age = 0;
        age = scanner.nextInt();
        System.out.println(String.format("제 나이는 %d 입니다.", age));
      }
}