package signer;

import edu.logic.pki.KeyStoreTools;
import edu.logic.pki.PDFSigner;
import java.io.File;

public class Signer {

    public static void main(String[] args) {
      File fileToSign;

      PDFSigner signer = new PDFSigner();

      fileToSign = new File("/Users/lmparra/Documents/pruebas/prueba.pdf");
      KeyStoreTools kst = new KeyStoreTools("ruta-del-keystore", "parafrase");
      signer.sign(null, null, null, null);

    }
}
