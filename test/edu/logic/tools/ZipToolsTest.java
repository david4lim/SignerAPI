/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.tools;

import java.util.ArrayDeque;
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
public class ZipToolsTest {

  public ZipToolsTest() {
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
   * Test of compressFiles method, of class ZipTools.
   */
  @Test
  public void testCompressFiles() {

    System.out.println("compressFiles");
    ArrayDeque<String> files = new ArrayDeque<String>();
    // Compressed file
    String zipFile = System.getProperty("user.dir") + "/TestFiles/testFiles.zip";
    // Add files to compress
    files.add(System.getProperty("user.dir") + "/TestFiles/amazon.cer");
    files.add(System.getProperty("user.dir") + "/TestFiles/amazon.sig");
    files.add(System.getProperty("user.dir") + "/TestFiles/amazon.pdf");

    ZipTools instance = new ZipTools();
    String expResult = "";
    String result = instance.compressFiles(files, zipFile);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");

    System.out.println("The test case was successfull");
  }

  /**
   * Test of uncompressFiles method, of class ZipTools.
   */
  @Test
  public void testUncompressFiles_String_String() {
    System.out.println("uncompressFiles");
    String zipFile = System.getProperty("user.dir") + "/TestFiles/testFiles.zip";
    String path = System.getProperty("user.dir") + "/TestFiles/testFiles2";
    ZipTools instance = new ZipTools();
    ArrayDeque expResult = null;
    ArrayDeque result = instance.uncompressFiles(zipFile, path);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");

    System.out.println("The test case was successfull");
  }

  /**
   * Test of uncompressFiles method, of class ZipTools.
   */
  @Test
  public void testUncompressFiles_String() {
    System.out.println("uncompressFiles");
    // Test file
    String zipFile = System.getProperty("user.dir") + "/TestFiles/testFiles.zip";
    ZipTools instance = new ZipTools();
    ArrayDeque expResult = null;
    ArrayDeque result = instance.uncompressFiles(zipFile);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");

    System.out.println("The test case was successfull");
  }
}