/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.logic.pki;

import edu.api.SignVerifier;
import edu.api.signVerifierCreator;

/**
 *
 * @author DavidCamilo
 */
public class ExtSignVerifierCreator implements signVerifierCreator{

    @Override
    public SignVerifier getSignVerifier(String fileExt) {
        SignVerifier verifier;
        
        if(fileExt.equals("zip")){
            verifier = new FileSignVerifier();
        }
        else if(fileExt.equals("pdf")){
            verifier = new PDFSignVerifier();
        }
        else if(fileExt.equals("xml")){
            verifier = new XMLSignVerifier();
        }
        else{
            verifier = new FileSignVerifier();
        }
        
        return verifier;
    }
    
}
