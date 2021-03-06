package ch.iterate.openstack.swift.handler;

import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.junit.Test;

import ch.iterate.openstack.swift.exception.AuthorizationException;

public class AuthenticationXml11ResponseHandlerTest {

    @Test(expected = AuthorizationException.class)
    public void testFailure() throws Exception {
        new AuthenticationXml11ResponseHandler().handleResponse(new BasicHttpResponse(
                new BasicStatusLine(new ProtocolVersion("http", 1, 1), 403, "OK")
        ));
    }

    @Test
    public void testGetToken() throws Exception {

    }
}
