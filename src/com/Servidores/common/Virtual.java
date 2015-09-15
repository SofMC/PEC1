/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servidores.common;

/**
 *
 * @author Jose León Morales
 */
public class Virtual extends Servidor {
    
    private String dataCenter;
    private String virtualizacion;
    private String tecnologia;
   //-----------------------------------CONSTRUCTOR------------------------------ 
    public Virtual(){
    dataCenter="";
    virtualizacion="";
    tecnologia=""; 
    }
    public Virtual(String dataCenter, String virtualizacion, String tecnologia){
    this.dataCenter=dataCenter;
    this.virtualizacion=virtualizacion;
    this.tecnologia=tecnologia;
    }
   
    //------------------------------------SET------------------------------------
    public void setDataCenter(String dataCenter){
    this.dataCenter=dataCenter;
    }
    public void setVirtualizacion(String virtualizacion){
    this.virtualizacion=virtualizacion;
    }
    public void setTecnologia(String tecnologia){
    this.tecnologia=tecnologia;
    }
    //------------------------------------GET------------------------------------
    public String getDataCenter(){
    return dataCenter;
    }
    public String getVirtualizacion(){
    return virtualizacion;
    }
    public String getTecnologia(){
    return tecnologia;
    }
}
