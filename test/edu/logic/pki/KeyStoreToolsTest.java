/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.pki;

import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Random;
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
public class KeyStoreToolsTest {
    private KeyStoreTools kst;
    private String kstPath = "docs/ks";
    private String pass = "password";
    public KeyStoreToolsTest() {
        kst = new KeyStoreTools(kstPath, pass);
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
     * Test of createKeyStore method, of class KeyStoreTools.
     */
    @Test
    public void testCreateKeyStore() {
        System.out.println("createKeyStore");
        String path = "";
        String password = "";
        KeyStoreTools instance = new KeyStoreTools();
        boolean expResult = false;
//        boolean result = instance.createKeyStore(path, password);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadKeyStore method, of class KeyStoreTools.
     */
    @Test
    public void testLoadKeyStore() {
        System.out.println("loadKeyStore");
        String path = "";
        String password = "";
        KeyStoreTools instance = new KeyStoreTools();
        boolean expResult = false;
//        boolean result = instance.loadKeyStore(path, password);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCertificate method, of class KeyStoreTools.
     */
    @Test
    public void testAddCertificate() {
        System.out.println("addCertificate");
        String alias = "";
        Certificate certificate = null;
        String password = "";
        KeyStoreTools instance = new KeyStoreTools();
        boolean expResult = false;
//        boolean result = instance.addCertificate(alias, certificate, password);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCertificateP12 method, of class KeyStoreTools.
     */
    @Test
    public void testAddCertificateP12() throws Exception {
        System.out.println("addCertificateP12");
        String pathToCert = "docs/prueba.pfx";
        String password = "password";
        KeyStoreTools instance = new KeyStoreTools(kstPath,pass);
        boolean expResult = true;
        boolean result = instance.addCertificateP12(pathToCert, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCertificate method, of class KeyStoreTools.
     */
    @Test
    public void testGetCertificate() {
        System.out.println("getCertificate");
        String alias = "";
        KeyStoreTools instance = new KeyStoreTools();
        Certificate expResult = null;
//        Certificate result = instance.getCertificate(alias);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPrivateKey method, of class KeyStoreTools.
     */
    @Test
    public void testAddPrivateKey() {
        System.out.println("addPrivateKey");
        String alias = "";
        PrivateKey key = null;
        String password = "";
        Certificate[] chain = null;
        KeyStoreTools instance = new KeyStoreTools();
        boolean expResult = false;
//        boolean result = instance.addPrivateKey(alias, key, password, chain);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class KeyStoreTools.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        String alias = "";
        char[] password = null;
        KeyStoreTools instance = new KeyStoreTools();
        Key expResult = null;
//        Key result = instance.getKey(alias, password);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCertificateChain method, of class KeyStoreTools.
     */
    @Test
    public void testGetCertificateChain() {
        System.out.println("getCertificateChain");
        String alias = "";
        KeyStoreTools instance = new KeyStoreTools();
        Certificate[] expResult = null;
//        Certificate[] result = instance.getCertificateChain(alias);
//        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliasList method, of class KeyStoreTools.
     */
    @Test
    public void testGetAliasList() {
        System.out.println("getAliasList");
//        KeyStoreTools instance = new KeyStoreTools();
        KeyStoreTools instance = kst;
        String[] expResult = null;
        String[] result = instance.getAliasList();
        for (String string : result) {
            System.out.println(string);
        }
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeyList method, of class KeyStoreTools.
     */
    @Test
    public void testGetKeyList() {
        System.out.println("getKeyList");
//        KeyStoreTools instance = new KeyStoreTools();
        KeyStoreTools instance = kst;
        String[] expResult = null;
        String[] result = instance.getKeyList();
        for (String string : result) {
            System.out.println(string);
        }
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCertificateList method, of class KeyStoreTools.
     */
    @Test
    public void testGetCertificateList() {
        System.out.println("getCertificateList");
//        KeyStoreTools instance = new KeyStoreTools();
        KeyStoreTools instance = kst;
        String[] expResult = null;
        String[] result = instance.getCertificateList();
        for (String string : result) {
            System.out.println(string);
        }
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAliasDate method, of class KeyStoreTools.
     */
    @Test
    public void testGetAliasDate() {
        System.out.println("getAliasDate");
        String alias = "";
        KeyStoreTools instance = new KeyStoreTools();
        Date expResult = null;
//        Date result = instance.getAliasDate(alias);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeyStore method, of class KeyStoreTools.
     */
    @Test
    public void testGetKeyStore() {
        System.out.println("getKeyStore");
        KeyStoreTools instance = new KeyStoreTools();
        KeyStore expResult = null;
//        KeyStore result = instance.getKeyStore();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}