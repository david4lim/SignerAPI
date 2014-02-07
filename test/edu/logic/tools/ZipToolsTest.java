/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic.tools;

import java.io.File;
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

    ZipTools ziptTools= new ZipTools();
    String expResult = System.getProperty("user.dir") + "/TestFiles/testFiles.zip";
    String result = ziptTools.compressFiles(files, zipFile);
    assertEquals(expResult, result);

    System.out.println("The test case was successfull");
  }

  /**
   * Test of uncompressFiles method, of class ZipTools.
   */
  @Test
  public void testUncompressFiles_String_String() {
    System.out.println("uncompressFiles");
    // Expected result
    File file1 = new File(System.getProperty("user.dir") + "/TestFiles/uncompress/amazon.cer");
    File file2 = new File(System.getProperty("user.dir") + "/TestFiles/uncompress/amazon.sig");
    File file3 = new File(System.getProperty("user.dir") + "/TestFiles/uncompress/amazon.pdf");

    String zipFile = System.getProperty("user.dir") + "/TestFiles/compress.zip";
    String path = System.getProperty("user.dir") + "/TestFiles/uncompress";

    ZipTools instance = new ZipTools();

    ArrayDeque expResult = new ArrayDeque();
    expResult.add(file1);
    expResult.add(file2);
    expResult.add(file3);

    ArrayDeque result = instance.uncompressFiles(zipFile, path);
    
    assertEquals(expResult, result);

    System.out.println("The test case was successfull");
  }

  /**
   * Test of uncompressFiles method, of class ZipTools.
   */
  @Test
  public void testUncompressFiles_String() {
    System.out.println("uncompressFiles");
    // Expected result
    File file1 = new File(System.getProperty("user.dir") + "/TestFiles/compress/amazon.cer");
    File file2 = new File(System.getProperty("user.dir") + "/TestFiles/compress/amazon.sig");
    File file3 = new File(System.getProperty("user.dir") + "/TestFiles/compress/amazon.pdf");

    // Test file
    String zipFile = System.getProperty("user.dir") + "/TestFiles/compress.zip";
    ZipTools instance = new ZipTools();

    ArrayDeque expResult = new ArrayDeque();
    expResult.add(file1);
    expResult.add(file2);
    expResult.add(file3);

    ArrayDeque result = instance.uncompressFiles(zipFile);

    assertEquals(expResult, result);

    System.out.println("The test case was successfull");
  }
}