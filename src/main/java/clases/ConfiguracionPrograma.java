/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
/*Clase para guardar las diferentes configuraciones del programa
 */
public final class ConfiguracionPrograma {

    String ArchProp = "config.properties";

    public void leerPropiedades() {
        //Leer Todas las propiedades del programa
        try {
            config.load(new BufferedReader(new FileReader(ArchProp)));
            KeyApi = config.getProperty("KeyApi");
            Base = config.getProperty("Base");
            NombreCoach = config.getProperty("nombreCoach");
            NombreLead = config.getProperty("nombreLead");
            ProyectoNombre = config.getProperty("proyectoNombre");
            CierreAsistencia = config.getProperty("cierreAsistencia");
            ComienzoBreak = config.getProperty("comienzoBreak");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error cargando configuración (Leer)\n"
                    + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void GuardarPropiedades() {
        //configOutput = new FileOutputStream(ArchProp);
        config.setProperty("KeyApi", KeyApi);
        config.setProperty("Base", Base);
        config.setProperty("nombreCoach", NombreCoach);
        config.setProperty("nombreLead", NombreLead);
        config.setProperty("proyectoNombre", ProyectoNombre);
        config.setProperty("cierreAsistencia", CierreAsistencia);
        config.setProperty("comienzoBreak", ComienzoBreak);
    }

    //comienzo Variables de clase
    public String KeyApi;
    public String Base;
    public String NombreCoach;
    public String NombreLead;
    public String ProyectoNombre;
    public String CierreAsistencia;
    public String ComienzoBreak;
    Properties config = new Properties();
    InputStream configInput = null;
    OutputStream configOutput = null;
    //Fin de variables de clase

}
