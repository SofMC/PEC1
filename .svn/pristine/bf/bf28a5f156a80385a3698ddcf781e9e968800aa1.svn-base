 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ArregloInv.common;
import com.Servidores.common.*;
import com.Aplicacion.common.Aplicacion;
import com.usuario.common.Usuario;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author Jose León Morales
 */
public class Arreglo implements Serializable{
    private List Fisico= new ArrayList ();
    private List Virt= new ArrayList ();
    private List Usuar= new ArrayList();
    private List Appl= new ArrayList();
 
    //-----------------------------------CARGARNUEVO-----------------------------
    public boolean CargarFisico(Servidor ser){
        boolean x=true;
        Iterator it= Fisico.iterator();
            while(it.hasNext()){
                Servidor fis = (Servidor)it.next();
                if(fis.getSerie().equals(ser.getSerie())|| fis.getHostname().equals(ser.getHostname())|| fis.getIp().equals(ser.getIp())){
                x=false;
                }}
            if("".equals(ser.getSerie())||"".equals(ser.getHostname())||"".equals(ser.getIp())){
                x=false;
    } else {}
            if(x==true)
        Fisico.add(ser);
     return x;
    }
    
    public boolean CargarVirt(Virtual vi){
         boolean x=true;
     Iterator it= Virt.iterator();
        while(it.hasNext()){
            Virtual vir= (Virtual)it.next();
                if(vir.getSerie().equals(vi.getSerie())|| vir.getHostname().equals(vi.getHostname())|| vir.getIp().equals(vi.getIp())){
                  x=false; }} 
        if("".equals(vi.getSerie())||"".equals(vi.getHostname())||"".equals(vi.getIp())){
                x=false;
    }
        if(x==true){Virt.add(vi);}
    return x;
 }
    
    public boolean CargarUsuar(Usuario us2){
        boolean x=true;
        Iterator it= Usuar.iterator();
            while(it.hasNext()){
                Usuario per= (Usuario)it.next();
                    if(us2.getNombreusu().equals(per.getNombreusu())){
                        x=false;
                    }}
            
            if(x==true){
             Usuar.add(us2);
            }
                return x;
    }
    
    public boolean CargarAppl(Aplicacion apl){
        boolean x=true;
        Iterator it= Appl.iterator();
            while(it.hasNext()){
                Aplicacion ap= (Aplicacion)it.next();
                    if(apl.getNomb().equals(ap.getNomb())){
                      x=false; }}
             if("".equals(apl.getNomb())){
                x=false;
    }
            if(x==true)
          Appl.add(apl);
    return x;
    }
 
    //----------------------------------ELINIMAR---------------------------------
    public boolean EliminarFisico(Servidor ser){
      Iterator it= Fisico.iterator();
            while(it.hasNext()){
                Servidor fis = (Servidor)it.next();
                    if( fis.getSerie().equals(ser.getSerie())){
                        it.remove();
         return true;
                    }
            }
    return false;
    }
    
    public boolean EliminarVirt(Virtual vi){
        Iterator it= Virt.iterator();
            while(it.hasNext()){
                Virtual vir = (Virtual)it.next();
                    if( vir.getSerie().equals(vi.getSerie())){
                        it.remove();
                    return true;
                    }
            }
         return false;
    }
    
    public boolean EliminarUsuar(Usuario us){
        Iterator it= Usuar.iterator();
            while(it.hasNext()){
                Usuario per= (Usuario)it.next();
                    if(us.getNombreusu().equals(per.getNombreusu())){
                        it.remove();
                            return true;
                    }
            } 
            return false;
    }
     
    public boolean EliminarAppl(Aplicacion apl){
        Iterator it= Appl.iterator();
            while(it.hasNext()){
                Aplicacion ap= (Aplicacion)it.next();
                    if(apl.getNomb().equals(ap.getNomb())){
                        it.remove();   
                    return true;
                    }
            }
    return false;
    }
 
     //--------------------------------GUARDAR ARRAYS----------------------------
     public void GuardarFisico(){
         Path path = Paths.get("C:\\Inventario\\Servidores");
         try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);//creo un objeto que me escribe.
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){ //aqui creo el objeto que me va a traducir y le envio el objeto que quiero escribir
            
            //escribiendo objeto customer
            oos.writeObject(Fisico);
            outputStream.close();
            //escribiendo un String
            
          oos.writeObject("Servidores Fisicos");
                              
    } catch (IOException e){
        System.out.print ("IOException");
         }}
     
     public void GuardarVirt(){
     Path path = Paths.get("C:\\Inventario\\Virtual");
         try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);//creo un objeto que me escribe.
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){ //aqui creo el objeto que me va a traducir y le envio el objeto que quiero escribir
            
            //escribiendo objeto customer
            oos.writeObject(Virt);
            outputStream.close();
            //escribiendo un String
            
          oos.writeObject("Servidores Virtuales");
                              
    } catch (IOException e){
        System.out.print ("IOException");
         }
     }
     
     public void GuardarUsuar(){
     Path path = Paths.get("C:\\Inventario\\Usuario");
         try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);//creo un objeto que me escribe.
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){ //aqui creo el objeto que me va a traducir y le envio el objeto que quiero escribir
            
            //escribiendo objeto customer
            oos.writeObject(Usuar);
            outputStream.close();
            //escribiendo un String        
          oos.writeObject("Usuarios");
                              
    } catch (IOException e){
        System.out.print ("IOException");
         }
     }
     
     public void GuardarAplic(){
     Path path = Paths.get("C:\\Inventario\\Aplicacion");
         try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);//creo un objeto que me escribe.
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){ //aqui creo el objeto que me va a traducir y le envio el objeto que quiero escribir
            
            //escribiendo objeto customer
            oos.writeObject(Appl);
            outputStream.close();
            //escribiendo un String
            
          oos.writeObject("Aplicaciones");
                              
    } catch (IOException e){
        System.out.print ("IOException");
         }}
     
     //--------------------------------SUBIR ARRAYS------------------------------
    public void SubirFisico(){
        Path path = Paths.get("C:\\Inventario\\Servidores");
     try (InputStream inputStream=Files.newInputStream(path,
                        StandardOpenOption.READ);
                ObjectInputStream ois = new ObjectInputStream (inputStream)){
                
                //leer el primer objeto
              ArrayList Fis = (ArrayList) ois.readObject();
              Fisico=(List) Fis;
               
            } catch (ClassNotFoundException ex){
                System.out.println("ClassNotFound "+ ex.getMessage());
            } 
        
        catch (IOException ex2) {
                System.out.println("IOException " + ex2.getMessage());
            }}
    
    public void SubirVirtual(){
        Path path = Paths.get("C:\\Inventario\\Virtual");
     try (InputStream inputStream=Files.newInputStream(path,
                        StandardOpenOption.READ);
                ObjectInputStream ois = new ObjectInputStream (inputStream)){
                
                //leer el primer objeto
              ArrayList Vi = (ArrayList) ois.readObject();
              Virt=(List) Vi;
               
            } catch (ClassNotFoundException ex){
                System.out.println("ClassNotFound "+ ex.getMessage());
            } 
        catch (IOException ex2) {
                System.out.println("IOException " + ex2.getMessage());
            }}
    
     public void SubirUsuario(){
        Path path = Paths.get("C:\\Inventario\\Usuario");
     try (InputStream inputStream=Files.newInputStream(path,
                        StandardOpenOption.READ);
                ObjectInputStream ois = new ObjectInputStream (inputStream)){
                
                //leer el primer objeto
              ArrayList Us = (ArrayList) ois.readObject();
              Usuar=(List) Us;
               
            } catch (ClassNotFoundException ex){
                System.out.println("ClassNotFound "+ ex.getMessage());
            } 
        
        catch (IOException ex2) {
                System.out.println("IOException " + ex2.getMessage());
            }}
     
      public void SubirAplicaciones(){
        Path path = Paths.get("C:\\Inventario\\Aplicacion");
     try (InputStream inputStream=Files.newInputStream(path,
                        StandardOpenOption.READ);
                ObjectInputStream ois = new ObjectInputStream (inputStream)){
                
              ArrayList  Ap = (ArrayList) ois.readObject();
              Appl=(List) Ap;
               
            } catch (ClassNotFoundException ex){
                System.out.println("ClassNotFound "+ ex.getMessage());
            } 
        
        catch (IOException ex2) {
                System.out.println("IOException " + ex2.getMessage());
            }}
    
    
    //--------------------------------VALIDAR USUARIO Y CLAVE--------------------

    public boolean ValidarUsuar(Usuario us){
         Iterator it= Usuar.iterator();
          while(it.hasNext()){
                Usuario per= (Usuario) it.next();
                    if(us.getNombreusu().equals(per.getNombreusu())){
                        if(us.getClave().equals(per.getClave()))
                            return true;
                    }
            } 
    return false;
    }

    //------------------------------METODOS GETLIST------------------------------
 public List getFisico(){
return Fisico;
}
 public List GetVirtual(){
 return Virt;
 }
 public List GetApp(){
 return Appl;
 }
}