/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.pki;

import edu.api.SignerInterface;
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
public class ExtFileSignerCreatorTest {
    
    public ExtFileSignerCreatorTest() {
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
     * Test of getSigner method, of class ExtFileSignerCreator.
     */
    @Test
    public void testGetSigner() {
        System.out.println("getSigner");
        String fileExt = "pdf";
        ExtFileSignerCreator instance = new ExtFileSignerCreator();
        boolean result = instance.getSigner(fileExt) instanceof PDFSigner;
        assertTrue(result);
        fileExt = "xml";
        result = instance.getSigner(fileExt) instanceof XMLSigner;
        assertTrue(result);
        fileExt = "jpg";
        result = instance.getSigner(fileExt) instanceof FileSigner;
        assertTrue(result);
        System.out.println("getSigner sucessfull");
    }
}