package ittepic.com.mx.tpdm_u4_practica1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Lienzo extends View {
    Circulo circulo, circulo2, circulo3,circulo4,circulo5,circulo6;

    public Lienzo(Context context) {
        super(context);

        circulo = new Circulo(
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 200) + 50);
        circulo2 = new Circulo(
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 100) + 20);

        circulo3 = new Circulo(
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 200) + 20);

        circulo4 = new Circulo(
                (int) (Math.random() * 300) + 200,
                (int) (Math.random() * 300) + 200,
                (int) (Math.random() * 200) + 20);

        circulo5 = new Circulo(
                (int) (Math.random() * 200) + 200,
                (int) (Math.random() * 200) + 200,
                (int) (Math.random() * 250) + 20);

        circulo6 = new Circulo(
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 100) + 200,
                (int) (Math.random() * 200) + 20);


    }// constructor


    protected void onDraw(Canvas c) {


        Paint p = new Paint();

        circulo.pintar(c, p);
        circulo2.pintar(c, p);
        circulo3.pintar(c, p);
        circulo4.pintar(c, p);
        circulo5.pintar(c, p);
        circulo6.pintar(c, p);

        invalidate();

    }// onDraw


}// class
