package edu.logic.pki;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.security.PdfPKCS7;
import edu.api.SignVerifier;
import java.io.File;
import java.io.IOException;
import java.security.Security;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 *
 * <code>PDFSignVerifier</code> class allow to verify a file signed by an instance 
 * of <code>PDFSigner</code> Class. It has two verification methods where one of 
 * this receives the digital certificate and public signature and another receives 
 * a file attached signature and digital certificate.
 * 
 * @author David Camilo Nova
 * @author Luis Fernando Muñoz
 */
public class PDFSignVerifier  implements SignVerifier{

    @Override
    public boolean verify(File file, File publicCert, File externalSign) {
        return verify(file);
    }

    @Override
    public boolean verify(File file) {
        boolean isValid = false;
        
        try {
            BouncyCastleProvider provider = new BouncyCastleProvider();
            Security.addProvider(provider);
            
            PdfReader reader = new PdfReader(file.getAbsolutePath());
            
            AcroFields fields = reader.getAcroFields();
            ArrayList<String> names = fields.getSignatureNames();
            PdfPKCS7 pkcs7 = fields.verifySignature("signature");
            if(pkcs7 != null){
                isValid =  pkcs7.verify();
            }
            else{
                isValid = false;
            }
        } catch (SignatureException ex) {
            Logger.getLogger(PDFSignVerifier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PDFSignVerifier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isValid;
    }
    
}
