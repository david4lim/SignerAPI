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
public class PDFSignerTest {
    
    public PDFSignerTest() {
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
     * Test of sign method, of class PDFSigner.
     */
    @Test
    public void testSign_4args() {
        String pdfFile = "docs/prueba.pdf";
        String pdfSigned = "docs/prueba_signed_4.pdf";
        
        System.out.println("sign: PDF 4 args");
        //Load Private Key and Certificate
        KeyStoreTools kst = new KeyStoreTools("docs/ks", "password");
        Certificate[] certificates = kst.getCertificateChain("prueba prueba");
        
        File fileToSign = new File(pdfFile);
        File outputFile = new File(pdfSigned);
        PrivateKey keyToSign = (PrivateKey) kst.getKey("prueba prueba", "password".toCharArray());
        Certificate certificate = certificates[0];
        PDFSigner instance = new PDFSigner();
        File expResult = outputFile;
        File result = instance.sign(fileToSign, outputFile, keyToSign, certificate);
        assertEquals(expResult, result);
        System.out.println("sign: PDF 4 args successfull");
        
//        System.out.println("sign failed 4 args");
//        result = instance.sign(fileToSign, outputFile, keyToSign, null);
//        assertNull(result);
    }

    /**
     * Test of sign method, of class PDFSigner.
     */
    @Test
    public void testSign_3args() {
        System.out.println("sign: PDF 3 args");
        String pdfFile = "docs/prueba.pdf";
        String pdfSigned = "docs/prueba_signed.pdf";
        
        //Load Private Key and Certificate
        KeyStoreTools kst = new KeyStoreTools("docs/ks", "password");
        Certificate[] certificates = kst.getCertificateChain("testpk");
        
        File fileToSign = new File(pdfFile);
        PrivateKey keyToSign = (PrivateKey) kst.getKey("testpk", "password".toCharArray());
        Certificate certificate = certificates[0];
        PDFSigner instance = new PDFSigner();
        File expResult = new File(pdfSigned);
        File result = instance.sign(fileToSign, keyToSign, certificate);
        
        assertEquals(expResult, result);
        System.out.println("sign: PDF 3 args successfull");
    }
}