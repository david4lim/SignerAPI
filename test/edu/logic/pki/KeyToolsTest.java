/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.pki;

import java.io.File;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lmparra
 */
public class KeyToolsTest {

  public KeyToolsTest() {
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
   * Test of generateKeyPair method, of class KeyTools.
   */
  @Test
  public void testGenerateKeyPair() {
    System.out.println("generateKeyPair");
    KeyTools instance = new KeyTools();
    KeyPair expResult = null;
    KeyPair result = instance.generateKeyPair();
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");

    System.out.println("The test case was successfull");
  }

  /**
   * Test of generateSelfSignedCertificate method, of class KeyTools.
   */
  @Test
  public void testGenerateSelfSignedCertificate() {
    System.out.println("generateSelfSignedCertificate");
    KeyPair pair = null;
    String DN = "";
    KeyTools instance = new KeyTools();
    Certificate expResult = null;
    // Test case
    pair = instance.generateKeyPair();

    Certificate result = instance.generateSelfSignedCertificate(pair, DN);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");

    System.out.println("The test case was successfull");
  }

  /**
   * Test of generateCSR method, of class KeyTools.
   */
  @Test
  public void testGenerateCSR_4args() {
    System.out.println("generateCSR");
    String DN = "";
    PrivateKey privateKey = null;
    PublicKey publicKey = null;
    String path = "";
    KeyTools instance = new KeyTools();
    File expResult = null;
    // Test case
    KeyPair pair = instance.generateKeyPair();

    File result = instance.generateCSR(DN, pair.getPrivate(), pair.getPublic(), path);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of generateCSR method, of class KeyTools.
   */
  @Test
  public void testGenerateCSR_3args() {
    System.out.println("generateCSR");
    String DN = "";
    PrivateKey privateKey = null;
    PublicKey publicKey = null;
    KeyTools instance = new KeyTools();
    String expResult = "";
    // Test case
    KeyPair pair = instance.generateKeyPair();

    String result = instance.generateCSR(DN, pair.getPrivate(), pair.getPublic());
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");

    System.out.println("The test case was successfull");
  }
}