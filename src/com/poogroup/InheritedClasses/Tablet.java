package com.poogroup.InheritedClasses;

import com.poogroup.Interfaces.Equipo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Tablet implements Equipo {

    List<Equipo> tabletList = new ArrayList<>();
    private String fabricante;
    private String modelo;
    private String microprocesador;

    private String taPantalla;
    private String capacitiva;
    private String memoria;
    private String sistemaOp;

    public Tablet(String fabricante, String modelo, String microprocesador, String taPantalla, String capacitiva, String memoria, String sistemaOp){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.taPantalla = taPantalla;
        this.sistemaOp = capacitiva;
        this.memoria = memoria;
        this.sistemaOp = sistemaOp;
        
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
   
    public String getTaPantalla() {
        return "taPantalla";
    }

    
    public String getCapacitiva() {
        return "capacitiva";
    }

 
    @Override
    public String getMemoria() {
        return "memoria";
    }

 
  
    public String getSistemaOp() {
        return "sistemaOp";
    }


 

    @Override
    public void registrarAsset() {

        fabricante=JOptionPane.showInputDialog("Ingrese el Fabricante");
        modelo=JOptionPane.showInputDialog("Ingrese el modelo");
        microprocesador=JOptionPane.showInputDialog("Ingrese el microprocesador");
        taPantalla=JOptionPane.showInputDialog("Ingrese el tamaño diagonal de pantalla");
        capacitiva=JOptionPane.showInputDialog("Ingrese la capacitiva o resistiva");
        memoria=JOptionPane.showInputDialog("Ingrese el tamaño de memoria NAND");
        sistemaOp=JOptionPane.showInputDialog("Ingrese el sistema operativo");
        

    }

    @Override
    public void mostrarAssets() {

        System.out.println("Fabricante: " +fabricante);
        System.out.println("Modelo: " +modelo);
        System.out.println("Microprocesador: " +microprocesador);
        System.out.println("Tamaño diagonal de pantalla: " +taPantalla);
        System.out.println("la capacitiva o resistiva: " +capacitiva);
        System.out.println("tamaño de memoria NAND" +memoria);
        System.out.println("Sistema Operativo: " +sistemaOp);

    }
}
