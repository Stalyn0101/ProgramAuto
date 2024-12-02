/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejercicioauto.Autom;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class Autom {

    private String Marca;
    private int Modelo;
    private double Motor;
    private TipoCombus tipoCombus;
    private TipoAuto tipoAuto;
    private int numPuertas;
    private int numAsientos;
    private double velocMaxima;
    private Color color;
    private double velocActual = 0;

    public Autom(String Marca, int Modelo, int numAsientos, TipoCombus tipoCombus, TipoAuto tipoAuto, int numPuertas, int par3, int velocMaxima, Color color) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.tipoCombus = tipoCombus;
        this.tipoAuto = tipoAuto;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velocMaxima = velocMaxima;
        this.color = color;
        this.velocActual = velocActual;

    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public double getMotor() {
        return Motor;
    }

    public void setMotor(double Motor) {
        this.Motor = Motor;
    }

    public TipoCombus getTipoCombus() {
        return tipoCombus;
    }

    public void setTipoCombus(TipoCombus tipoCombus) {
        this.tipoCombus = tipoCombus;
    }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(TipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public double getVelocMaxima() {
        return velocMaxima;
    }

    public void setVelocMaxima(double velocMaxima) {
        this.velocMaxima = velocMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelocActual() {
        return velocActual;
    }

    public void setVelocActual(double velocActual) {
        this.velocActual = velocActual;
    }

    public void acelerar(int incremento) {
        if (velocActual + incremento <= velocMaxima) {
            velocActual = velocActual + incremento;
        } else {
            System.out.println("No puede exceder la velocidad Maxima");

        }

    }

    public void descacelerar(int decremento) {
        if (velocActual - decremento >= 0) {
            velocActual = velocActual - decremento;
        } else {
            System.out.println("La velocidad no debe ser negativa");

        }
    }

    public void frenar() {
        velocActual = 0;

    }

    //Calcular el tiempo de llegada
    public double calcularTiempoLlegada(double distancia) {
        if (velocActual > 0) {
            return distancia / velocActual;
        } else {
            System.out.println("El vehiculo se ha detenido");
            return -1;
        }
    }

    //Mostrar atributos
    public void MostarAtributos() {
        System.out.println("Ingrese marca del auto:" + Marca);
        System.out.println("Ingrese el modelo:" + Modelo);
        System.out.println("Ingrese el motor:" + Motor + "tanque");
        System.out.println("Tipo de combustible:" + tipoCombus);
        System.out.println("Ingrese el tipo de auto:" + tipoAuto);
        System.out.println("Ingrese el numero de puertas:" + numPuertas);
        System.out.println("Ingrese el numero de asientos:" + numAsientos);
        System.out.println("Ingrese la velocidad maxima:" + velocMaxima);
        System.out.println("Ingrese el color:" + color);
        System.out.println("Ingreese la velocidad:" + velocActual);
    }


    }


