/*
 * Hub Administration
 * This version of the API allows management of OPA Hub users, deployments, and version information.
 *
 * OpenAPI spec version: 12.2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package oracle.opa.hub.client.api;

import oracle.opa.hub.client.ApiException;
import oracle.opa.hub.client.api.AboutApi;
import oracle.opa.hub.client.model.About;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AboutApi
 */
@Ignore
public class AboutApiTest {

    private final AboutApi api = new AboutApi();

    
    /**
     * Get an about
     *
     * This operation will get basic \&quot;about\&quot; information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAboutTest() throws ApiException {
        About response = api.getAbout();

        // TODO: test validations
    }
    
}
