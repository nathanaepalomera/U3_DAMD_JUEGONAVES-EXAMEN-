package mx.edu.ittepic.damd_u3_juegonaves;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Imagen {
    private Bitmap icono ;
    private float x,y,yp;
    int despalzamientoy,desplazamientom1,desplazamientom2,desplazamientom3,desplazamientom4,despalma1,despalma2,despalma3,despalma4;
    CountDownTimer timer,ti,tu,te,tito,teto,timerpalma1,timerpalma2,timerpalma3,timerpalma4,timerb1,timerb2,timerb3;
    private boolean visible,vi;
    float yc;


    public Imagen(int resource, float _x,float _y, final Lienzo l)
    {
        icono = BitmapFactory.decodeResource(l.getResources(), resource);
        x = _x;
        y = _y;
        visible = true;
        despalzamientoy =5;
        desplazamientom1 = 5;
        desplazamientom2 = 5;
        desplazamientom3 = 5;
        desplazamientom4 = 5;
        despalma1 = 5;
        despalma2 = 5;
        despalma3 = 5;
        despalma4 = 5;


        ti = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (y <= -50){
                    y = 1500;
                    x= l.bala;
                }
                else{
                    y-= despalzamientoy;
                }
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerpalma4 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (y >=l.getHeight()){
                    x = 360;
                    y= l.balam;
                }
                else{
                    y+= despalzamientoy;
                }
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerb1 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (y >=l.getHeight()){
                    x = 40;
                    y= l.balam1;
                }
                else{
                    y+= despalzamientoy;
                }
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerb2 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (y >=l.getHeight()){
                    x = 650;
                    y= l.balam2;
                }
                else{
                    y+= despalzamientoy;
                }
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerb3 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (y >=l.getHeight()){
                    y= l.balam3;
                    x = 870;
                }
                else{
                    y+= despalzamientoy;
                }
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        te = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
            ;

                if (y >= l.getHeight()){

                    y = 50;
                    x= 20;
                }
                else{
                    y+= desplazamientom1;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        tu = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                ;

                if (y >= l.getHeight()){
                    y = 250;
                    x= 300;
                }
                else{
                    y+= desplazamientom2;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        tito = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                ;

                if (y >= l.getHeight()){
                    y = 80;
                    x= 600;
                }
                else{
                    y+= desplazamientom3;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };


        teto = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                ;

                if (y >= l.getHeight()){
                    y = 250;
                    x= 850;
                }
                else{
                    y+= desplazamientom4;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerpalma1 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                ;

                if (y >= l.getHeight()){
                    y = 20;
                    x= 300;
                }
                else{
                    y+= despalma1;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerpalma2 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                ;

                if (y >= l.getHeight()){
                    y = 300;
                    x= 600;
                }
                else{
                    y+= despalma2;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };

        timerpalma3 = new CountDownTimer(1000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                ;

                if (y >= l.getHeight()){
                    y = 30;
                    x= 850;
                }
                else{
                    y+= despalma3;
                }



                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();
            }
        };
    }

    public void pintar (Canvas c, Paint p)
    {

        if(visible)
        {
            c.drawBitmap(icono,x,y,p);
        }

    }

    public void hacervisible (boolean v)
    {

        visible = v;
    }

    public boolean estaenarea (float xp, float yp){
        if (!visible) return false;

        float x2, y2;
        x2 = x+icono.getWidth();
        y2 = y+icono.getHeight();

        if (xp>=x && xp<= x2){
            if (yp>=y && yp<= y2){
                return true;
            }
        }

        return false;

    }

    public void desplazamiento ( final float yp, final Lienzo l){
        y = yp;
        final float y2 = x + icono.getHeight();
       despalzamientoy = 5;
       timer = new CountDownTimer(1000,100) {
           @Override
           public void onTick(long millisUntilFinished) {
               y += despalzamientoy;

               if (yp <= y2){
                   despalzamientoy *= -1;

               }
               if (yp>=0){
                   despalzamientoy *= -1;

               }


               l.invalidate();
           }

           public void onFinish() {
             start();
           }
       };


    }


    public void mover (float xp, float yp){

        x = xp-(icono.getWidth()/2);

    }

    public void movery (int c){

        desplazamientom1 = c;
        te.start();

    }

    public void moverm2 (int c){

        desplazamientom2 = c;
        tu.start();

    }

    public void moverm3 (int c){

        desplazamientom3 = c;
        tito.start();

    }

    public void moverm4 (int c){

        desplazamientom4 = c;
        teto.start();

    }

    public void moverpalma2 (int c){

        despalma1 = c;
        timerpalma1.start();

    }

    public void moverpalma3(int c){

        despalma2 = c;
        timerpalma2.start();

    }

    public void moverpalma4(int c){

        despalma3 = c;
        timerpalma3.start();

    }



    public boolean colision(Imagen objetoB){
        float x2 = x+icono.getWidth();
        float y2 = y+icono.getHeight();

        if (objetoB.estaenarea(x2,y)){
            return true;
        }

        if (objetoB.estaenarea(x,y)){//caso 2
            return true;
        }

        if (objetoB.estaenarea(x2,y2)){//caso 3
            return true;
        }

        if (objetoB.estaenarea(x,y2)){//caso 4
            return true;
        }

        return false;
    }

    public float retornox()
    {
        return x;
    }

    public float retornoy(){return y;}

    public int ancho (){

        int ancho = icono.getWidth();
        return ancho;
    }

    public int alto (){

        int alto = icono.getHeight();
        return alto;
    }

    public void moverbala (int c)
    {
        despalzamientoy = c;
        ti.start();
    }

    public void moverbalam1 (int c)
    {
        despalzamientoy = c;
        timerpalma4.start();
    }

    public void moberb1 (int c){
        despalzamientoy = c;
        timerb1.start();
    }

    public void moberb2 (int c){
        despalzamientoy = c;
        timerb2.start();
    }

    public void moberb3 (int c){
        despalzamientoy = c;
        timerb3.start();
    }

    public Boolean visi (){
        return visible;
    }
}
