package ittepic.com.mx.tpdm_u4_practica1;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Circulo {
    float x, y;
    float velX, velY;
    int tamaño;
    int color;

    public Circulo(int posx, int posy, int tamaño) {
        this.tamaño = tamaño;

        color = (int) (Math.random() * 6) + 1;

        x = posx;
        y = posy;

        if (tamaño > 0 && tamaño < 100) {
            velX = 25;
            velY = 25;
        } else if (tamaño > 100 && tamaño < 200) {
            velX = 10;
            velY = 10;
        } else if (tamaño > 200 && tamaño < 500) {
            velX = 5;
            velY = 5;
        }


    }// constructor

    public void pintar(final Canvas c, final Paint p) {
        //System.out.println("DATOS "+(int)Math.random() * x);

        switch (color) {
            case 1:
                p.setColor(Color.RED);
                break;
            case 2:
                p.setColor(Color.GRAY);
                break;
            case 3:
                p.setColor(Color.GREEN);
                break;
            case 4:
                p.setColor(Color.BLUE);
                break;
            case 5:
                p.setColor(Color.BLACK);
                break;
            case 6:
                p.setColor(Color.CYAN);
                break;
            case 7:
                p.setColor(Color.YELLOW);
                break;

        }

        c.drawCircle(x, y, tamaño, p);


        mover(c);

    }// pintar

    public void mover(Canvas c) {
        if ((x > c.getWidth() - tamaño) || (x - tamaño < 0)) {
            velX = -velX;
            //System.out.println("VALORES EN X "+velX);
        }

        x = x + velX;

        if ((y > c.getHeight() - tamaño) || (y - tamaño < 0)) {
            velY = -velY;
            //   System.out.println("VALORES EN Y "+velY);
        }

        y = y + velY;
    }

}// class
