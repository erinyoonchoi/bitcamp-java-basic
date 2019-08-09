import java.util.Scanner;

class WhatName{
      public static void main(String[] args){

        System.out.println("이름이 뭔가요?"); 
        String name = "";
        
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        
        System.out.println("제 이름은 "+ name +"입니다."); 
        System.out.println("몇살 이예요?");
        int age = 0;
        age = scanner.nextInt();
        System.out.println("제 나이는" +age+"입니다.");
      }
}