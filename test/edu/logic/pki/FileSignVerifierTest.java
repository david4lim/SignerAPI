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
public class FileSignVerifierTest {
    
    public FileSignVerifierTest() {
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
     * Test of verify method, of class FileSignVerifier.
     */
    @Test
    public void testVerify_3args() {
        String fileSign = "docs/prueba.sig";
        String fileCert = "docs/prueba.cer";
        String fileToVerify = "docs/prueba.jpg";
        
        System.out.println("verify: File 3 args");
        
        File file = new File(fileToVerify);
        File publicCert = new File(fileCert);
        File externalSign = new File(fileSign);
        FileSignVerifier instance = new FileSignVerifier();
        boolean expResult = true;
        boolean result = instance.verify(file, publicCert, externalSign);
        assertEquals(expResult, result);
        
        expResult = false;
        file = new File(fileCert);
        result = instance.verify(file, publicCert, externalSign);
        assertEquals(expResult, result);
        
        System.out.println("verify: File 3 args successfull");
    }

    /**
     * Test of verify method, of class FileSignVerifier.
     */
    @Test
    public void testVerify_File() {
        String fileSigned = "docs/prueba_signed.zip";
        String fileToVerify = "docs/prueba_fail.zip";
        
        System.out.println("verify: File 3 args");
        
        File file = new File(fileSigned);
        FileSignVerifier instance = new FileSignVerifier();
        boolean expResult = true;
        boolean result = instance.verify(file);
        assertEquals(expResult, result);
        
        expResult = false;
        file = new File(fileToVerify);
        result = instance.verify(file);
        assertEquals(expResult, result);
        
        System.out.println("verify: File 3 args successfull");
    }
}