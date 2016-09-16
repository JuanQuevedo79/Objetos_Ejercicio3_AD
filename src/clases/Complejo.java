/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USER
 */
public class Complejo {
    private int real;
    private int imaginario;

    public Complejo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }
    public Complejo Sumar(Complejo f2) {
        real = this.getReal()+f2.getReal();
        imaginario = this.getImaginario()+f2.getImaginario();
        Complejo f = new Complejo(real, imaginario);
        return f;
    }
    public Complejo Resta(Complejo f2){
        real = this.getReal()-f2.getReal();
        imaginario = this.getImaginario()-f2.getImaginario();
        Complejo f = new Complejo(real, imaginario);
        return f;
    }
    public Complejo Multiplicacion(Complejo f2){
        real = (this.getReal() * f2.getImaginario()) - (this.getImaginario()* f2.getImaginario());
        imaginario = (this.getReal() * f2.getReal()) + (this.getImaginario() * f2.getReal());
        Complejo f = new Complejo(real, imaginario);
        return f;
    }
    public Complejo Dividir(Complejo f2){
       real = (this.getReal() * f2.getReal()) + (this.getImaginario() * f2.getImaginario());
       imaginario = (this.getImaginario() * f2.getReal()) - (this.getReal() * f2.getImaginario());
       Complejo f = new Complejo(real, imaginario);
       return f;
    }
}
