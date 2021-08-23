package org.kr.yoon92;

class Calculator{
    int[] oprands;
     
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
     
    public void sum(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }
      
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}
public class test {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(new int[]{10,20});
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();       
        c1.avg();   
    }
}