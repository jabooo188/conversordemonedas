package com.aluracursos.conversor.modelos;

import java.io.IOException;
import java.util.Scanner;

public class Conversiones {
    private String monedaBase;
    private String monedaConvertir;
    private double montoConvertir;


    Scanner lectura = new Scanner(System.in);
    ConsultaAPI conversion;

    public Conversiones(ConsultaAPI conversion){
        this.conversion=conversion;
    }

    public void setMontoConvertir(double montoConvertir) {
        this.montoConvertir = montoConvertir;
    }

    public void setMonedaConvertir(String monedaConvertir) {
        this.monedaConvertir = monedaConvertir;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public double getMontoConvertir() {
        return montoConvertir;
    }

    public void extraerValores (String monedaBase, String monedaConvertir){
        this.monedaBase = monedaBase;
        this.monedaConvertir = monedaConvertir;

        System.out.println("Ingrese la cantidad");

        this.montoConvertir = Double.parseDouble(lectura.nextLine());

    }

    public String mensajeResultado () throws IOException, InterruptedException {
        String respuesta = "$" + getMontoConvertir() + "  En dolares es:  " + getMonedaConvertir().toUpperCase() + "   " + conversion.consultarMonedas(getMonedaBase(), getMonedaConvertir(), getMontoConvertir());
        System.out.println(respuesta);
        return respuesta;
    }

}
