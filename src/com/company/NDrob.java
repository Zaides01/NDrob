package com.company;

public class NDrob {
    private int num;
    private int denom;

    //служебные методы: сеторы, геторы, конструкторы и пр.

    public void setNum(int num) {
        this.num = num;
    }

    public void setDenom(int denom) {
        if (denom!=0)
            this.denom = denom;
        else
            this.denom = 1;

    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return denom;
    }

    //вычислительные методы
    public NDrob multi (NDrob secondmn){
        NDrob rez = new NDrob();
        rez.num = this.num * secondmn.num;
        rez.denom = this.denom * secondmn.denom;
        return rez;
    }
    public NDrob divi (NDrob dilit){
        NDrob rez = new NDrob();
        rez.num = this.num * dilit.denom;
        rez.denom = this.denom * dilit.num;
        return rez;
    }
    public NDrob add (NDrob secondsl){
        NDrob rez = new NDrob();
        rez.num = this.num * secondsl.denom + secondsl.num * this.denom;
        rez.denom = this.denom * secondsl.denom;
        return rez;
    }
    public NDrob sub (NDrob vich) {
        NDrob rez = new NDrob();
        rez.num = this.num * vich.denom - vich.num * this.denom;
        rez.denom = this.denom * vich.denom;
        return rez;
    }
    //методы поддержки
public void print(){
    System.out.println(num + "/" + denom);
}

    @Override
    public String toString() {
        return num + "/" + denom;
    }
}
