/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosEstudiante;
import vista.FRM_VentanaPrincipal;

/**
 *
 * @author Marko

 */
public class Controlador_FRM_VentanaPrincipal implements ActionListener{
    FRM_VentanaPrincipal ventana;
    MetodosEstudiante metodos;

    public Controlador_FRM_VentanaPrincipal( FRM_VentanaPrincipal controlador) {
this.ventana=controlador;
metodos=new MetodosEstudiante();
    }
    
    
    
    public void actionPerformed(ActionEvent e)
    
    {
    if(e.getActionCommand().equals("Buscar")){
if(metodos.buscarEstudiante(ventana.devolverCedula())){

ventana.mostrarInformacion(metodos.arregloInformacion());
ventana.deshabilitarCedula();
ventana.habilitarOpciones();
}else{
        System.out.println("el estudiante no se encuentra");
ventana.habilitarAgregar();
ventana.deshabilitarCedula();

}


    }
    
    if(e.getActionCommand().equals("Agregar")){
        metodos.agregar(ventana.devolverInformacion());
        ventana.limpiar();
        ventana.estadoInicial();
    }
    
    if(e.getActionCommand().equals("Modificar")){
        metodos.modificar(ventana.devolverInformacion());
        ventana.limpiar();
        ventana.estadoInicial();

    }
    
    if(e.getActionCommand().equals("Eliminar")){
        metodos.eliminar(ventana.devolverInformacion());
    ventana.limpiar();
        ventana.estadoInicial();
    }
    }
    
    }
   
    
    
    
    

