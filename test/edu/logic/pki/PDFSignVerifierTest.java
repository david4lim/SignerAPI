/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.pki;

import java.io.File;
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
public class PDFSignVerifierTest {
    
    public PDFSignVerifierTest() {
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
     * Test of verify method, of class PDFSignVerifier.
     */
    @Test
    public void testVerify_3args() {
        
        String pdfSigned = "docs/prueba_signed.pdf";
        String pdfFile = "docs/prueba.pdf";
        
        System.out.println("verify: PDF 3 args");
        
        File file = new File(pdfSigned);
        File publicCert = null;
        File externalSign = null;
        PDFSignVerifier instance = new PDFSignVerifier();
        boolean expResult = true;
        boolean result = instance.verify(file, publicCert, externalSign);
        assertEquals(expResult, result);
        
        expResult = false;
        file = new File(pdfFile);
        result = instance.verify(file, publicCert, externalSign);
        assertEquals(expResult, result);
        
        System.out.println("verify: PDF 3 args successfull");
    }

    /**
     * Test of verify method, of class PDFSignVerifier.
     */
    @Test
    public void testVerify_File() {
         
        String pdfSigned = "docs/prueba_signed.pdf";
        String pdfFile = "docs/prueba.pdf";
        
        System.out.println("verify: PDF");
        
        File file = new File(pdfSigned);
        PDFSignVerifier instance = new PDFSignVerifier();
        boolean expResult = true;
        boolean result = instance.verify(file);
        assertEquals(expResult, result);
        
        expResult = false;
        file = new File(pdfFile);
        result = instance.verify(file);
        assertEquals(expResult, result);
        
        System.out.println("verify: PDF successfull");
    }
}