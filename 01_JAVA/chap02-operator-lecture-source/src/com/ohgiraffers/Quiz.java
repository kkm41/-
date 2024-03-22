package com.ohgiraffers;

public class Quiz {
    public static void main(String[] args) {
        int x =2;
        int y =5;
        char c ='A'; //'A'의 문자코드 65

        System.out.println(y>=5 || x<0 && x>2); //true, y=5이기 때문에 앞에서 true반환, ||연산자는 앞에서 true가 나오면 뒤는 작동안함
        System.out.println(y+=10 - x++); //13, y+=는 y=y+5와 같다. 따라서 y+=10 ->15이고 x++은 계산 후 1증가이기 때문에 15-2 =13이다.
        System.out.println(x+=2); //5, 앞서 x++에서 1이 증가하였다 즉, 3+2=5
        System.out.println(!('A'<=c && c<='Z')); //
        System.out.println('C' - c);
        System.out.println(!('5' - '0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);


        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */

    }
}
