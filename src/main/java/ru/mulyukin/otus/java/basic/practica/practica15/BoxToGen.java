package ru.mulyukin.otus.java.basic.practica.practica15;

public class BoxToGen <A, B>{
    private A field1;
    private A field2;
    private B field3;

    public BoxToGen(A field1, A field2, B field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public A getField1() {
        return field1;
    }

    public void setField1(A field1) {
        this.field1 = field1;
    }

    public A getField2() {
        return field2;
    }

    public void setField2(A field2) {
        this.field2 = field2;
    }

    public B getField3() {
        return field3;
    }

    public void setField3(B field3) {
        this.field3 = field3;
    }
}
