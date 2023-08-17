/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {
    private int inicio;
    private int fin;
    public CountThread(int a, int b){
        this.inicio = a;
        this.fin = b;
    }
    @Override
    public void run(){
        for (int i = inicio; i <= fin; i++){
            System.out.println(i);
        }
    }
}
