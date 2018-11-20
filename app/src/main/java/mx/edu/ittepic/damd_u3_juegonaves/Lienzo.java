package mx.edu.ittepic.damd_u3_juegonaves;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {
    Imagen nave, marciano1, marciano2,marciano3, marciano4, perdiste, regresar,isla2,isla3,isla4,punto, balas, balasm,balasm1,balasm2,balasm3;
    float bala, balam,balam1,balam2,balam3,contador;

    public Lienzo(Context context) {
        super(context);

        nave = new Imagen(R.drawable.nave,0,1500,this);
        marciano1 = new Imagen(R.drawable.mars,20,50,this);
        marciano2 = new Imagen(R.drawable.mars,300,250,this);
        isla2 = new Imagen(R.drawable.palma,300,20,this);
        marciano3 = new Imagen(R.drawable.mars,600,50,this);
        isla3 = new Imagen(R.drawable.palma,600,300,this);
        marciano4 = new Imagen(R.drawable.mars,850,150,this);
        isla4 = new Imagen(R.drawable.palma,850,30,this);
        balas = new Imagen(R.drawable.balass,0+(nave.ancho()/2+1),1500,this);
        balasm =new Imagen(R.drawable.balass,300,250+(marciano2.ancho()/2+4),this);
        balasm1 =new Imagen(R.drawable.balass,20,50+(marciano1.ancho()/2+4),this);
        balasm2 =new Imagen(R.drawable.balass,600,80+(marciano3.ancho()/2+4),this);
        balasm3 =new Imagen(R.drawable.balass,850,250+(marciano4.ancho()/2+4),this);
        perdiste = new Imagen(R.drawable.perdiste,280,600,this);
        perdiste.hacervisible(false);
        regresar = new Imagen(R.drawable.regre,980,1650,this);
        regresar.hacervisible(false);
        //Desplazar los marcianos//

        marciano1.movery(10);
        marciano2.moverm2(6);
        marciano3.moverm3(8);
        marciano4.moverm4(4);
        isla2.moverpalma2(10);
        isla3.moverpalma3(10);
        isla4.moverpalma4(10);
        balas.moverbala(15);
        balasm.moverbalam1(11);
        balasm1.moberb1(13);
        balasm2.moberb2(12);
        balasm3.moberb3(10);

        punto = null;

    }

    public void onDraw(Canvas c) {

        super.onDraw(c);
        Paint p = new Paint();
        c.drawColor(Color.BLACK);

        isla2.pintar(c,p);
        isla3.pintar(c,p);
        isla4.pintar(c,p);
        marciano1.pintar(c,p);
        marciano2.pintar(c,p);
        marciano3.pintar(c,p);
        marciano4.pintar(c,p);
        perdiste.pintar(c,p);
        regresar.pintar(c,p);

        nave.pintar(c,p);
        balas.pintar(c,p);
        balasm.pintar(c,p);
        balasm1.pintar(c,p);
        balasm2.pintar(c,p);
        balasm3.pintar(c,p);

        //colision para la bala choque con las naves

            if (balas.colision(marciano1) ){

                marciano1.hacervisible(false);
                balasm1.hacervisible(false);
            }

            if (balas.colision(marciano2)){
                marciano2.hacervisible(false);
                balasm.hacervisible(false);
            }

            if(balas.colision(marciano3)){
                marciano3.hacervisible(false);
                balasm2.hacervisible(false);
            }
            if (balasm.colision(nave) && balasm.visi()){
                perdiste.hacervisible(true);
                regresar.hacervisible(true);
                nave.hacervisible(false);
                marciano1.hacervisible(false);
                marciano2.hacervisible(false);
                marciano3.hacervisible(false);
                marciano4.hacervisible(false);
                isla2.hacervisible(false);
                isla3.hacervisible(false);
                isla4.hacervisible(false);
                balas.hacervisible(false);
                balasm.hacervisible(false);
                balasm2.hacervisible(false);
                balasm3.hacervisible(false);
                balasm1.hacervisible(false);

            }

        if (balasm1.colision(nave) && balasm1.visi()){
            perdiste.hacervisible(true);
            regresar.hacervisible(true);
            nave.hacervisible(false);
            marciano1.hacervisible(false);
            marciano2.hacervisible(false);
            marciano3.hacervisible(false);
            marciano4.hacervisible(false);
            isla2.hacervisible(false);
            isla3.hacervisible(false);
            isla4.hacervisible(false);
            balas.hacervisible(false);
            balasm.hacervisible(false);
            balasm2.hacervisible(false);
            balasm3.hacervisible(false);
            balasm1.hacervisible(false);

        }

        if (balasm2.colision(nave) && balasm2.visi()){
            perdiste.hacervisible(true);
            regresar.hacervisible(true);
            nave.hacervisible(false);
            marciano1.hacervisible(false);
            marciano2.hacervisible(false);
            marciano3.hacervisible(false);
            marciano4.hacervisible(false);
            isla2.hacervisible(false);
            isla3.hacervisible(false);
            isla4.hacervisible(false);
            balas.hacervisible(false);
            balasm.hacervisible(false);
            balasm2.hacervisible(false);
            balasm3.hacervisible(false);
            balasm1.hacervisible(false);

        }

        if (balasm3.colision(nave) && balasm3.visi()){
            perdiste.hacervisible(true);
            regresar.hacervisible(true);
            nave.hacervisible(false);
            marciano1.hacervisible(false);
            marciano2.hacervisible(false);
            marciano3.hacervisible(false);
            marciano4.hacervisible(false);
            isla2.hacervisible(false);
            isla3.hacervisible(false);
            isla4.hacervisible(false);
            balas.hacervisible(false);
            balasm.hacervisible(false);
            balasm2.hacervisible(false);
            balasm3.hacervisible(false);
            balasm1.hacervisible(false);

        }

            if(balas.colision(marciano4)){
            marciano4.hacervisible(false);
            balasm3.hacervisible(false);
            }

            balam = marciano2.retornoy()+(marciano2.ancho()/2+4);
            balam1 = marciano1.retornoy()+(marciano1.ancho()/2+4);
            balam2 = marciano3.retornoy()+(marciano3.ancho()/2+4);
            balam3 = marciano4.retornoy()+(marciano4.ancho()/2+4);


    }

    public boolean onTouchEvent(MotionEvent e) {
        float xp = e.getX();
        float yp = e.getY();


        switch (e.getAction()) {

            case MotionEvent.ACTION_DOWN:

                if(nave.estaenarea(xp,yp)) {

                    punto = nave;
                }

                if (regresar.estaenarea(xp,yp)){

                    nave = new Imagen(R.drawable.nave,0,1500,this);
                    marciano1 = new Imagen(R.drawable.mars,20,50,this);
                    marciano2 = new Imagen(R.drawable.mars,300,250,this);
                    isla2 = new Imagen(R.drawable.palma,300,20,this);
                    marciano3 = new Imagen(R.drawable.mars,600,50,this);
                    isla3 = new Imagen(R.drawable.palma,600,300,this);
                    marciano4 = new Imagen(R.drawable.mars,850,150,this);
                    isla4 = new Imagen(R.drawable.palma,850,30,this);
                    balas = new Imagen(R.drawable.balass,0+(nave.ancho()/2+1),1500,this);
                    balasm =new Imagen(R.drawable.balass,300,250+(marciano2.ancho()/2+4),this);
                    balasm1 =new Imagen(R.drawable.balass,20,50+(marciano1.ancho()/2+4),this);
                    balasm2 =new Imagen(R.drawable.balass,600,80+(marciano3.ancho()/2+4),this);
                    balasm3 =new Imagen(R.drawable.balass,850,250+(marciano4.ancho()/2+4),this);
                    perdiste = new Imagen(R.drawable.perdiste,280,600,this);
                    perdiste.hacervisible(false);
                    regresar = new Imagen(R.drawable.regre,980,1650,this);
                    regresar.hacervisible(false);
                    //Desplazar los marcianos//

                    marciano1.movery(10);
                    marciano2.moverm2(6);
                    marciano3.moverm3(8);
                    marciano4.moverm4(4);
                    isla2.moverpalma2(10);
                    isla3.moverpalma3(10);
                    isla4.moverpalma4(10);
                    balas.moverbala(15);
                    balasm.moverbalam1(11);
                    balasm1.moberb1(13);
                    balasm2.moberb2(12);
                    balasm3.moberb3(10);

                    punto = null;
                }



                break;

            case MotionEvent.ACTION_MOVE:
                if (punto!= null){

                    if (punto == nave){

                      punto.mover(xp,yp);
                      bala = punto.retornox()+(nave.ancho()/2+1);

                    }



                }
                if (punto!= null){

                    if (punto.colision(marciano1) && punto == nave ){

                        perdiste.hacervisible(true);
                        regresar.hacervisible(true);
                        nave.hacervisible(false);
                        marciano1.hacervisible(false);
                        marciano2.hacervisible(false);
                        marciano3.hacervisible(false);
                        marciano4.hacervisible(false);
                        isla2.hacervisible(false);
                        isla3.hacervisible(false);
                        isla4.hacervisible(false);
                        balas.hacervisible(false);

                    }
                 }

                if (punto!= null){

                    if (punto.colision(marciano2) && punto == nave ){

                        perdiste.hacervisible(true);
                        regresar.hacervisible(true);
                        nave.hacervisible(false);
                        marciano1.hacervisible(false);
                        marciano2.hacervisible(false);
                        marciano3.hacervisible(false);
                        marciano4.hacervisible(false);
                        isla2.hacervisible(false);
                        isla3.hacervisible(false);
                        isla4.hacervisible(false);
                        balas.hacervisible(false);

                    }
                }

                if (punto!= null){

                    if (punto.colision(marciano3) && punto == nave ){

                        perdiste.hacervisible(true);
                        regresar.hacervisible(true);
                        nave.hacervisible(false);
                        marciano3.hacervisible(false);
                        marciano1.hacervisible(false);
                        marciano2.hacervisible(false);
                        marciano4.hacervisible(false);
                        isla2.hacervisible(false);
                        isla3.hacervisible(false);
                        isla4.hacervisible(false);
                        balas.hacervisible(false);
                    }
                }

                if (punto!= null){

                    if (punto.colision(marciano4) && punto == nave ){

                        perdiste.hacervisible(true);
                        regresar.hacervisible(true);
                        nave.hacervisible(false);
                        balas.hacervisible(false);
                        marciano4.hacervisible(false);
                        marciano1.hacervisible(false);
                        marciano2.hacervisible(false);
                        marciano3.hacervisible(false);
                        isla2.hacervisible(false);
                        isla3.hacervisible(false);
                        isla4.hacervisible(false);
                    }
                }






                /*if (punto!= null){
                    punto.mover(xp,yp);

                    if (punto.colision(icono3) && punto == icono6){
                        icono3.hacervisible(false);
                        icono6.hacervisible(false);
                    }
                }

                if (punto!= null){
                    punto.mover(xp,yp);

                    if (punto.colision(icono5) && punto == icono2){
                        icono5.hacervisible(false);
                        icono2.hacervisible(false);
                    }
                }*/
                break;


            case MotionEvent.ACTION_UP:
                punto = null;
                break;

        }
        invalidate();
        return true;
    }





}
