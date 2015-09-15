/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Aplicacion.common;
import java.io.Serializable;
/**
 *
 * @author Jose León Morales
 */
public class Aplicacion implements Serializable {
    private String nomb;
    private String dep;
    private String encarg;
    private String servidorun;
    private String tecnologia;
    private String categoria;
    
    //----------------------------CONSTRUCTOR------------------------------------
    public Aplicacion(){
    nomb="";
    dep="";
    encarg="";
    servidorun="";
    tecnologia="";
    categoria="";
    }
    
    public Aplicacion(String nomb, String dep, String encarg, String servidorun, String tecnologia, String categoria){
    this.nomb=nomb;
    this.dep=dep;
    this.encarg=encarg;
    this.servidorun=servidorun;
    this.tecnologia=tecnologia;
    this.categoria=categoria;

    }
    //--------------------------SET----------------------------------------------
    public void setNomb(String nomb){
    this.nomb=nomb;
    }
    public void setDep(String dep){
    this.dep=dep;
    }
    public void setEncarg(String encarg){
    this.encarg=encarg;
    }
    public void setServidrun(String servidorun){
    this.servidorun=servidorun;
    }
    public void setTecnologia(String tecnologia){
    this.tecnologia=tecnologia;
    }
    public void setCategoria(String categoria){
    this.categoria=categoria;
    }
    //------------------------GET------------------------------------------------
    
    public String getNomb(){
    return nomb;
    }
    public String getDep(){
    return dep;
    }
    public String getEncarg(){
    return encarg;
    }
    public String getServidorun(){
    return servidorun;
    }
    public String getTecnologia(){
    return tecnologia;
    }
    public String getCategoria(){
    return categoria;
    }
}
