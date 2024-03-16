package com.poogroup.InheritedClasses;

import com.poogroup.Interfaces.Equipo;

import javafx.scene.chart.XYChart.Series;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Laptop implements Equipo {

List<Equipo> laptopList = new ArrayList<>();
private String fabricante;
private String modelo;
private String microprocesador;
private String memoria;
private String pantalla;
private String discoduro;


public Laptop(String fabricante, String modelo, String microprocesador, String memoria, String pantalla, String discoduro){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.microprocesador = microprocesador;
    this.memoria = memoria;
    this.discoduro = discoduro;
    this.pantalla = pantalla;
}

    @Override
    public String getFabricante() {
        return "fabricante";
    }

    @Override
    public String getModelo() {
        return "modelo";
    }

    @Override
    public String getMicroprocesador() {
        return "microprocesador";
    }

    @Override
    public String getMemoria() {
        return "memoria";
    }

    @Override
    public String getPantalla() {
        return "pantalla";
    }

    @Override
    public String getDiscoDuro() {
        return "discoduro";
    }

    @Override
    public void registrarAsset() { fabricante=JOptionPane.showInputDialog("Ingrese el Fabricante");
    modelo=JOptionPane.showInputDialog("Ingrese el modelo");
    microprocesador=JOptionPane.showInputDialog("Ingrese el microprocesador");
    memoria=JOptionPane.showInputDialog("Ingrese la memoria");
    pantalla=JOptionPane.showInputDialog("Ingrese el tamaño de la pantalla");
    discoduro=JOptionPane.showInputDialog("Ingrese capacidad de disco duro");
    }

    @Override
    public void mostrarAssets() {
       System.out.println("Fabricante: " +fabricante);
       System.out.println("Modelo: " +modelo);
       System.out.println("Microprocesador: " +microprocesador);
       System.out.println("Memoria: "+memoria);
       System.out.println("Pantala: " +pantalla);
       System.out.println("Disco duro: " + discoduro);
    }
}
