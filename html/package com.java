package com.LoopingStatements;

public class Reverse {
    public static void main(String[] args) {
         int num = 243
         int rev = 0

         while(num>0) {
            int res = num%10;

            rev = (rev*10)+res;

            num = num/10;
         }
         system.out.print(rev);
        }
          
}