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
public class XMLSignVerifierTest {
    
    public XMLSignVerifierTest() {
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
     * Test of verify method, of class XMLSignVerifier.
     */
    @Test
    public void testVerify_3args() {
        String xmlSigned = "docs/prueba_signed.xml";
        String xmlFile = "docs/prueba.xml";
        
        System.out.println("verify: XML 3 args");
        File file = new File(xmlSigned);
        File publicCert = null;
        File externalSign = null;
        XMLSignVerifier instance = new XMLSignVerifier();
        boolean expResult = true;
        boolean result = instance.verify(file, publicCert, externalSign);
        assertEquals(expResult, result);
        
        expResult = false;
        file = new File(xmlFile);
        result = instance.verify(file, publicCert, externalSign);
        assertEquals(expResult, result);
        
        System.out.println("verify: XML 3 args successfull");
    }

    /**
     * Test of verify method, of class XMLSignVerifier.
     */
    @Test
    public void testVerify_File() {
        String xmlSigned = "docs/prueba_signed.xml";
        String xmlFile = "docs/prueba.xml";
        
        System.out.println("verify: XML");
        File file = new File(xmlSigned);
        XMLSignVerifier instance = new XMLSignVerifier();
        boolean expResult = true;
        boolean result = instance.verify(file);
        assertEquals(expResult, result);
        
        expResult = false;
        file = new File(xmlFile);
        result = instance.verify(file);
        assertEquals(expResult, result);
        
        System.out.println("verify: XML successfull");
    }
}