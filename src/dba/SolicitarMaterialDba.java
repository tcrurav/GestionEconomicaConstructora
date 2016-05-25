/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

import POJOS.AdministrativoObra;
import POJOS.MaterialParaObra;
import POJOS.JefeDeObra;
import POJOS.Material;
import POJOS.Obra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1-DAM-T
 */
public class SolicitarMaterialDba {
   
    
 public static MaterialParaObra getMaterialParaObra(int identificador) throws SQLException{
      
      MaterialParaObra materialParaObra=new MaterialParaObra();

        
        String sql = "Select * from materialparaobra where ID=" + identificador;
            try {
                Connection conn = MySQL.getConnection();
                Statement sentencia = conn.createStatement();
                ResultSet rs = sentencia.executeQuery(sql);
                
                if(rs.next()){
    
                    materialParaObra.setPK_ID(rs.getInt("ID"));               

                    materialParaObra.setJefeDeObra(dba.PersonaDba.getJefeDeObra(rs.getInt("JefeDeObraQueSolicitaID")));

                    materialParaObra.setAdministrativoObra(dba.PersonaDba.getAdministrativoObra(rs.getInt("AdministrativoObraQueRecogeID")));

                    materialParaObra.setCantidadMaterial(rs.getFloat("CantidadMaterial"));
                    materialParaObra.setCoste(rs.getFloat("Coste"));
                    materialParaObra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                    materialParaObra.setFechaRecepcion(rs.getDate("FechaRecepcion"));

                    materialParaObra.setObra(dba.ObraDba.getObra(rs.getInt("ObraID")));

                    materialParaObra.setMaterial(dba.MaterialDba.getMaterial(rs.getInt("MaterialID")));

                } else {
                    return null;
                }

            } catch (SQLException ex) {
                throw ex;
            }
       
        return materialParaObra;
    }
    
    public static ArrayList<MaterialParaObra> getMaterialesParaObras() throws SQLException{        
        Connection conn = MySQL.getConnection();
        String sql = "select * from materialparaobra";
        
        ArrayList<MaterialParaObra> materialesParaObras = new ArrayList<MaterialParaObra>();
        
        try {
            Statement sentencia = conn.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            
            while(rs.next()){
                MaterialParaObra materialParaObra=new MaterialParaObra();             
                materialParaObra.setPK_ID(rs.getInt("ID"));
                
                materialParaObra.setJefeDeObra(dba.PersonaDba.getJefeDeObra(rs.getInt("JefeDeObraQueSolicitaID")));
         
                materialParaObra.setAdministrativoObra(dba.PersonaDba.getAdministrativoObra(rs.getInt("AdministrativoObraQueRecogeID")));//CREAR getAdministrativoObra

                materialParaObra.setCantidadMaterial(rs.getFloat("CantidadMaterial"));
                materialParaObra.setCoste(rs.getFloat("Coste"));
                materialParaObra.setFechaSolicitud(rs.getDate("FechaSolicitud"));
                materialParaObra.setFechaRecepcion(rs.getDate("FechaRecepcion"));

                //Al ArrayList materialParaObra le añadimos la Obra que
                //consultando la BBDD Obra, coincida el ID con el ID recibido en la consulta  
                materialParaObra.setObra(dba.ObraDba.getObra(rs.getInt("ObraID")));

                materialParaObra.setMaterial(dba.MaterialDba.getMaterial(rs.getInt("MaterialID")));//HAY QUE HACER LA dba.Material!!!

                materialesParaObras.add(materialParaObra);
            }
            
            return materialesParaObras;
            
        } catch (SQLException ex) {
            throw ex;
        }
        
    }
    
    public static boolean insertMaterialParaObra(MaterialParaObra materialParaObra) throws SQLException{     
        System.out.println("DENTRO DE InsertMaterialparaOBra");
        
        Connection conn = MySQL.getConnection();
        String sql = "insert into materialparaobra (ID,JefeDeObraQueSolicitaID,AdministrativoObraQueRecogeID, " 
                + "CantidadMaterial,Coste,FechaSolicitud, " 
                + "FechaRecepcion,ObraID, "
                + "MaterialID) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
           
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, materialParaObra.getPK_ID());
            ps.setInt(2, materialParaObra.jefeDeObra.getPK_ID());
            ps.setInt(3, materialParaObra.administrativoObra.getPK_ID()); 
            ps.setFloat(4,materialParaObra.getCantidadMaterial());
            ps.setFloat(5, materialParaObra.getCoste());
            ps.setString(6, sdf.format(materialParaObra.getFechaSolicitud()));
            ps.setString(7, sdf.format(materialParaObra.getFechaRecepcion()));
            ps.setInt(8,materialParaObra.obra.getPK_ID());
            ps.setInt(9,materialParaObra.material.getPK_ID());
            

            System.out.println("Sentencia sql-->"+ps.toString());  
            
            int n = ps.executeUpdate();
                 
            if(n>0){
                //JOptionPane.showMessageDialog(null, "Datos guardados");
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
            
        }
        return false;
    }
    
    //public static boolean updateObra(Obra obra) throws SQLException{
    public static boolean updateMaterialParaObra(MaterialParaObra materialParaObra) throws SQLException{        
        System.out.println("Entro en UpdateMaterialParaObra");
        Connection conn = MySQL.getConnection();
        
        String sql = "update materialparaobra set JefeDeObraQueSolicitaID=?, AdministrativoObraQueRecogeID=?, CantidadMaterial=?, " 
                + "Coste=?, FechaSolicitud=?, FechaRecepcion=?, " 
                + "ObraID=?, MaterialID=? "
                +" where ID=?";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PreparedStatement ps;
        try {
            ps = conn.prepareCall(sql);
            System.out.println("Comenzando la sentencia");
            ps.setInt(1, materialParaObra.jefeDeObra.getPK_ID());
            ps.setInt(2, materialParaObra.administrativoObra.getPK_ID());
            ps.setFloat(3,materialParaObra.getCantidadMaterial());
            ps.setFloat(4, materialParaObra.getCoste());
            ps.setString(5, sdf.format(materialParaObra.getFechaSolicitud()));
            ps.setString(6, sdf.format(materialParaObra.getFechaRecepcion()));
            ps.setInt(7,materialParaObra.obra.getPK_ID());
            ps.setInt(8,materialParaObra.material.getPK_ID());
            ps.setInt(9, materialParaObra.getPK_ID());
            
            System.out.println("Sentencia sql-->"+ps.toString()); 
            int n = ps.executeUpdate();
            
            if(n>0){
                return true;
            }
            
        } catch (SQLException ex) {
            throw ex;
        } 
        return false;
    }
    
    public static boolean deleteMaterialParaObra(int identificador) throws SQLException{
        Connection conn = MySQL.getConnection();
        String sql = "delete from materialparaobra where id=" + identificador;
        try {
            Statement sentencia = conn.createStatement();
            int n = sentencia.executeUpdate(sql);
            if (n>0){
                //JOptionPane.showMessageDialog(null, "Datos Borrados");
                return true;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return false;
    }
    
}
