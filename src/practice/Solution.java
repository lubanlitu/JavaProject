package practice;

public class Solution {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("Khosru Zaman");
        Solution obj = new Solution();
        obj.doSummation();
        obj.doDivision();
        obj.doResult();
        obj.doRemainder();
        obj.doRes();
        obj.doSum();
        obj.doDisplay();
        obj.doDisplay1();
        obj.doDisplay2();
        obj.doDisplay3();
        obj.doDisplay4();
        obj.doDisplay5();
        obj.doDisplay6();
    }
    public void doSummation(){
        int number1 = 74;
        int number2 = 36;
        int summation = number1 + number2;
        System.out.println("summation is " +summation);
    }
    public static void doDivision(){
        int number1 = 50;
        int number2 = 3;
        int summation = number1 / number2;
        System.out.println("devision result is " +summation);
    }
        public void doResult(){
            int number1 = -5;
            int number2 = 8*6;
            int summation = number1 + number2;
            System.out.println(" result is " +summation);
        }
        public void doRemainder(){
        int number1 = 55 + 9;
        int number2 = 9;
        int summation = number1 % number2;
        System.out.println("Remainder result is " +summation);
    }
        public void doRes(){
        int number1 = 20;
        int number2 = -3*5;
        int number3 = 8;
        int summation = number1 + number2 / number3;
        System.out.println(" result is " +summation);
    }
    public void doSum() {
        int number1 = 5 ;
        int number2 = 15/3*2 ;
        int number3 = 8%3;
        int summation = number1 + number2 - number3 ;
        System.out.println(" result is " + summation);
    }
    public void doDisplay(){
        int number1 = 25;
        int number2 = 5;
        int summation = number1 * number2;
        System.out.println(" 25 * 5 = " +summation);
    }


    public void doDisplay1(){
        int number1 = 125;
        int number2 = 24;
        int summation = number1 + number2;
        System.out.println( summation);
    }
    public void doDisplay2(){
        int number1 = 125;
        int number2 = 24;
        int summation = number1 - number2;
        System.out.println( summation);
    }

    public void doDisplay3(){
        int number1 = 125;
        int number2 = 24;
        int summation = number1 * number2;
        System.out.println( summation);
    }
    public void doDisplay4(){
        int number1 = 125;
        int number2 = 24;
        int summation = number1 / number2;
        System.out.println( summation);
    }

    public void doDisplay5(){
        int number1 = 125;
        int number2 = 24;
        int summation = number1 % number2;
        System.out.println( summation);
    }

    public void doDisplay6(){
        double number1 =(25.5 * 3.5 - 3.5*3.5) ;
        double number2 = 40.5-4.5;
        double summation = number1 / number2;
        System.out.println( summation);
    }




}
