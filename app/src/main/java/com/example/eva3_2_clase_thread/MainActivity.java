package com.example.eva3_2_clase_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Trace;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // A traves de clases anónimas
        Thread miHilo = new Thread(){
            @Override
            public void  run() {
                super.run();
                for(int i=0; i <10; i++){
                    try {
                        Thread.sleep(1000);
                        Log.wtf("MI HILO", i +"");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

miHilo.start();
MiHilote miHilote = new MiHilote();
miHilote.start();


    }
}

class MiHilote extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i=0; i <10; i++){
            try {
                Thread.sleep(1000);
                Log.wtf("MI HILO 2", i +"");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}