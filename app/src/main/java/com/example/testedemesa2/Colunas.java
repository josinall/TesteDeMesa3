package com.example.testedemesa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Colunas extends AppCompatActivity {

    String A;
    String B;
    String C;

    public Colunas(String A, String B, String C) {
        super();
        this.A = A;
        this.B = B;
        this.C = C;

    }
    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public String getB() {
        return B;
    }

    public void setB(String B) {
        this.B = B;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Matris{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colunas);



    }
}