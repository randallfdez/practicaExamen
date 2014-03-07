/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uia.is12.business;

import com.uia.is12.data.PoemDAO;
import com.uia.is12.domain.Poem;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Vera
 */
public class PoemBusiness {

    private PoemDAO poemDAO;
    
    public PoemBusiness() {
    
        this.poemDAO = new PoemDAO();
    }
    
    public Poem getPoem(){
    
        return poemDAO.getPoem();
    }
    
    //Pueden crear un metodo main para probar que todo este funcionando
    public static void main(String args[]){
        //NOTA: instancia de tipo PoemBusiness
        PoemBusiness poemBusiness = new PoemBusiness();
        ArrayList<Verse> verses= poemBusiness.getPoem().getVerse();
        
        for(Verse v: verses){
            System.out.println(v.getParagraph());
        }
        
    }
    
}
