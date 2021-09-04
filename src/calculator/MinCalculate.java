package calculator;

import java.util.ArrayList;

public class MinCalculate {
    private double x,y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setOp(char op) {
        this.op = op;
    }
    private char op;
    ArrayList<Integer> delayList;
    ArrayList<Integer> sat;
    public MinCalculate(double x, double y, char op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }

    public MinCalculate() {
        delayList = new ArrayList();
        sat = new ArrayList();
        
    }
    public double calculate(){
        double result=0;
         switch (op) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    result = x / y;
                    break;
            }
         return result;  
    }

  
}
