/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.api;

import java.security.cert.Certificate;

/**
 *
 * @author DavidCamilo
 */
public interface Signable {
    public boolean isSigned();
    public Certificate getSignatureCertificate();
}
