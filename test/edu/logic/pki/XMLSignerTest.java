/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.pki;

import java.io.File;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DavidCamilo
 */
public class XMLSignerTest {
    
    public XMLSignerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sign method, of class XMLSigner.
     */
    @Test
    public void testSign_4args() {
        String xmlFile = "docs/prueba.xml";
        String xmlSigned = "docs/prueba_signed_4.xml";
        
        //Load Private Key and Certificate
        KeyStoreTools kst = new KeyStoreTools("docs/ks", "password");
        Certificate[] certificates = kst.getCertificateChain("prueba prueba");
        
        System.out.println("sign: XML 4 args");
        File fileToSign = new File(xmlFile);
        File outputFile = new File(xmlSigned);
        PrivateKey keyToSign = (PrivateKey) kst.getKey("prueba prueba", "password".toCharArray());
        Certificate certificate = certificates[0];
        XMLSigner instance = new XMLSigner();
        File expResult = outputFile;
        File result = instance.sign(fileToSign, outputFile, keyToSign, certificate);
        assertEquals(expResult, result);
        System.out.println("sign: XML 4 args successfull");
    }

    /**
     * Test of sign method, of class XMLSigner.
     */
    @Test
    public void testSign_3args() {
        
        String xmlFile = "docs/prueba.xml";
        String xmlSigned = "docs/prueba_signed.xml";
        
        //Load Private Key and Certificate
        KeyStoreTools kst = new KeyStoreTools("docs/ks", "password");
        Certificate[] certificates = kst.getCertificateChain("prueba prueba");
        
        System.out.println("sign: XML 3 args");
        File fileToSign = new File(xmlFile);
        File outputFile = new File(xmlSigned);
        PrivateKey keyToSign = (PrivateKey) kst.getKey("prueba prueba", "password".toCharArray());
        Certificate certificate = certificates[0];
        XMLSigner instance = new XMLSigner();
        File expResult = outputFile;
        File result = instance.sign(fileToSign, keyToSign, certificate);
        assertEquals(expResult, result);
        System.out.println("sign: XML 3 args successfull");
    }
}