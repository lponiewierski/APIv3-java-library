/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibApi;

import sendinblue.ApiException;
import sibModel.CreateSender;
import sibModel.CreateSenderModel;
import sibModel.ErrorModel;
import sibModel.GetIps;
import sibModel.GetIpsFromSender;
import sibModel.GetSendersList;
import sibModel.UpdateSender;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SendersApi
 */
@Ignore
public class SendersApiTest {

    private final SendersApi api = new SendersApi();

    
    /**
     * Create a new sender
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSenderTest() throws ApiException {
        CreateSender sender = null;
        CreateSenderModel response = api.createSender(sender);

        // TODO: test validations
    }
    
    /**
     * Delete a sender
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSenderTest() throws ApiException {
        Long senderId = null;
        api.deleteSender(senderId);

        // TODO: test validations
    }
    
    /**
     * Return all the dedicated IPs for your account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIpsTest() throws ApiException {
        GetIps response = api.getIps();

        // TODO: test validations
    }
    
    /**
     * Return all the dedicated IPs for a sender
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIpsFromSenderTest() throws ApiException {
        Long senderId = null;
        GetIpsFromSender response = api.getIpsFromSender(senderId);

        // TODO: test validations
    }
    
    /**
     * Get the list of all your senders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSendersTest() throws ApiException {
        String ip = null;
        String domain = null;
        GetSendersList response = api.getSenders(ip, domain);

        // TODO: test validations
    }
    
    /**
     * Update a sender
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSenderTest() throws ApiException {
        Long senderId = null;
        UpdateSender sender = null;
        api.updateSender(senderId, sender);

        // TODO: test validations
    }
    
}
