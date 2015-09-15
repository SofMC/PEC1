/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuario.common;
import java.io.Serializable;
/**
 *
 * @author Jose León Morales
 */
public class Usuario implements Serializable{
    private String nombre;
    private String nombreusu;
    private String clave;
    
    //-------------------------------COMSTRUCTOR---------------------------------
    public Usuario(){
    nombre="";
    nombreusu="";
    clave="";
    }
    public Usuario(String nombre, String nombreusu, String clave){
        this.nombre=nombre;
        this.nombreusu=nombreusu;
        this.clave=clave;
     }
    //-----------------------------SET-------------------------------------------
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public void setNombreusu(String nombreusu){
    this.nombreusu=nombreusu;
    }
    public void setClave(String clave){
    this.clave=clave;
    }
   //-----------------------------GET-------------------------------------------- 
    public String getNombre(){
    return nombre;
    }
    public String getNombreusu(){
    return nombreusu;
    }
    public String getClave(){
    return clave;
    }
    //----------------------------EDITAR-----------------------------------------
    
    
    //----------------------------ELIMINAR---------------------------------------
    
    //----------------------------AGREGAR----------------------------------------
}
