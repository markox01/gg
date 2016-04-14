/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Marko
 */
public class MetodosEstudiante {
    ArrayList <Estudiante> arrayEstudiante;
    String arregloInformacion[]=new String[3];

    public MetodosEstudiante() {
        arrayEstudiante=new ArrayList<Estudiante>();
        
        
    }
    public boolean buscarEstudiante(String cedula){
        
        boolean encontro=false;
    for(int contador=0;contador<arrayEstudiante.size();contador++){
        if(arrayEstudiante.get(contador).getCedula().equals(cedula)){
       
            arregloInformacion[0]=arrayEstudiante.get(contador).getNombre();
            arregloInformacion[1]=arrayEstudiante.get(contador).getDireccion();
            arregloInformacion[2]=""+arrayEstudiante.get(contador).getHorario();

          encontro=true;  
        }
    
    }
    return encontro;
    }
    
    public String[] arregloInformacion(){
    return this.arregloInformacion;
    }
    public void agregar(String informacion[]){
    Estudiante tempo= new Estudiante(informacion[0],informacion[1],informacion[2],Integer.parseInt(informacion[3]));
    arrayEstudiante.add(tempo);
    }
    
    public void modificar(String arreglo[])
    {
    for(int i=0;i<arrayEstudiante.size();i++)
    {
    if(arrayEstudiante.get(i).getCedula().equals(i)){
        
        arrayEstudiante.get(i).setNombre(arreglo[1]);
                arrayEstudiante.get(i).setDireccion(arreglo[2]);

                        arrayEstudiante.get(i).setHorario(Integer.parseInt(arreglo[3]));

    }
    
    }
}
        public void eliminar(String arreglo[]){
               for(int i=0;i<arrayEstudiante.size();i++){
                       if(arrayEstudiante.get(i).getCedula().equals(i)){
                           arrayEstudiante.remove(i);
                           
                       }

                   
               }
 
        }

    
}