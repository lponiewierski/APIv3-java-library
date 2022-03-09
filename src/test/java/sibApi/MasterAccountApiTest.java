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

import sibModel.CreateModel;
import sibModel.CreateSubAccount;
import sibModel.ErrorModel;
import sibModel.GetSsoToken;
import sibModel.MasterDetailsResponse;
import sibModel.SsoTokenRequest;
import sibModel.SubAccountDetailsResponse;
import sibModel.SubAccountUpdatePlanRequest;
import sibModel.SubAccountsResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MasterAccountApi
 */
@Ignore
public class MasterAccountApiTest {

    private final MasterAccountApi api = new MasterAccountApi();

    
    /**
     * Get the details of requested master account
     *
     * This endpoint will provide the details of the master account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateMasterAccountGetTest() throws Exception {
        MasterDetailsResponse response = api.corporateMasterAccountGet();

        // TODO: test validations
    }
    
    /**
     * Get the list of all the sub-accounts of the master account.
     *
     * This endpoint will provide the list all the sub-accounts of the master account.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateSubAccountGetTest() throws Exception {
        Integer offset = null;
        Integer limit = null;
        SubAccountsResponse response = api.corporateSubAccountGet(offset, limit);

        // TODO: test validations
    }
    
    /**
     * Delete a sub-account
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateSubAccountIdDeleteTest() throws Exception {
        Long id = null;
        api.corporateSubAccountIdDelete(id);

        // TODO: test validations
    }
    
    /**
     * Get sub-account details
     *
     * This endpoint will provide the details of specified sub-account organization
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateSubAccountIdGetTest() throws Exception {
        Long id = null;
        SubAccountDetailsResponse response = api.corporateSubAccountIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Update sub-account plan
     *
     * This endpoint will update the sub-account plan
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateSubAccountIdPlanPutTest() throws Exception {
        Long id = null;
        SubAccountUpdatePlanRequest updatePlanDetails = null;
        api.corporateSubAccountIdPlanPut(id, updatePlanDetails);

        // TODO: test validations
    }
    
    /**
     * Create a new sub-account under a master account.
     *
     * This endpoint will create a new sub-account under a master account
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateSubAccountPostTest() throws Exception {
        CreateSubAccount subAccountCreate = null;
        CreateModel response = api.corporateSubAccountPost(subAccountCreate);

        // TODO: test validations
    }
    
    /**
     * Generate SSO token to access Sendinblue
     *
     * This endpoint generates an sso token to authenticate and access a sub-account of the master using the account endpoint https://app.sendinblue.com/account/login/sub-account/sso/[token], where [token] will be replaced with actual token.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void corporateSubAccountSsoTokenPostTest() throws Exception {
        SsoTokenRequest ssoTokenRequest = null;
        GetSsoToken response = api.corporateSubAccountSsoTokenPost(ssoTokenRequest);

        // TODO: test validations
    }
    
}
