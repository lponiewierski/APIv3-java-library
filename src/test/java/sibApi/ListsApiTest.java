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
import sibModel.AddContactToList;
import sibModel.CreateList;
import sibModel.CreateModel;
import sibModel.ErrorModel;
import sibModel.GetContacts;
import sibModel.GetExtendedList;
import sibModel.GetFolderLists;
import sibModel.GetLists;
import org.threeten.bp.OffsetDateTime;
import sibModel.PostContactInfo;
import sibModel.RemoveContactFromList;
import sibModel.UpdateList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListsApi
 */
@Ignore
public class ListsApiTest {

    private final ListsApi api = new ListsApi();

    
    /**
     * Add existing contacts to a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContactToListTest() throws ApiException {
        Long listId = null;
        AddContactToList contactEmails = null;
        PostContactInfo response = api.addContactToList(listId, contactEmails);

        // TODO: test validations
    }
    
    /**
     * Create a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createListTest() throws ApiException {
        CreateList createList = null;
        CreateModel response = api.createList(createList);

        // TODO: test validations
    }
    
    /**
     * Delete a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteListTest() throws ApiException {
        Long listId = null;
        api.deleteList(listId);

        // TODO: test validations
    }
    
    /**
     * Get contacts in a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsFromListTest() throws ApiException {
        Long listId = null;
        OffsetDateTime modifiedSince = null;
        Long limit = null;
        Long offset = null;
        GetContacts response = api.getContactsFromList(listId, modifiedSince, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get lists in a folder
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFolderListsTest() throws ApiException {
        Long folderId = null;
        Long limit = null;
        Long offset = null;
        GetFolderLists response = api.getFolderLists(folderId, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Get a list&#39;s details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        Long listId = null;
        GetExtendedList response = api.getList(listId);

        // TODO: test validations
    }
    
    /**
     * Get all the lists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListsTest() throws ApiException {
        Long limit = null;
        Long offset = null;
        GetLists response = api.getLists(limit, offset);

        // TODO: test validations
    }
    
    /**
     * Delete a contact from a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeContactFromListTest() throws ApiException {
        Long listId = null;
        RemoveContactFromList contactEmails = null;
        PostContactInfo response = api.removeContactFromList(listId, contactEmails);

        // TODO: test validations
    }
    
    /**
     * Update a list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateListTest() throws ApiException {
        Long listId = null;
        UpdateList updateList = null;
        api.updateList(listId, updateList);

        // TODO: test validations
    }
    
}
