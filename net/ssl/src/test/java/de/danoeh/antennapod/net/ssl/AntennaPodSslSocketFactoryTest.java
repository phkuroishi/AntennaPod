package de.danoeh.antennapod.net.ssl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.Socket;
import java.security.cert.CertificateException;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.X509Certificate;

public class AntennaPodSslSocketFactoryTest {

    @Test
    public void test_creatSocket() throws IOException {
        TrustManager trustAllCertificates = new X509TrustManager() {
            @Override
            public void checkClientTrusted(java.security.cert.X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            @Override
            public void checkServerTrusted(java.security.cert.X509Certificate[] x509Certificates, String s) throws CertificateException {

            }

            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        };

        AntennaPodSslSocketFactory antennaPodSslSocketFactory = new AntennaPodSslSocketFactory(trustAllCertificates);
        Socket res = antennaPodSslSocketFactory.createSocket();
        Assert.assertNotNull(res);
    }
}
