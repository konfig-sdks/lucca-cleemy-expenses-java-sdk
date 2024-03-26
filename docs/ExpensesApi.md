# ExpensesApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTemporaryExpense**](ExpensesApi.md#createNewTemporaryExpense) | **POST** /api/v3/expenseTempItems | Create a new temporary expense |
| [**getById**](ExpensesApi.md#getById) | **GET** /api/v3/expenseTempItems/{expenseTempItemId} | Get an ExpenseTempItem by id |
| [**listTempItems**](ExpensesApi.md#listTempItems) | **GET** /api/v3/expenseTempItems | List ExpenseTempItems (temporary expense) |
| [**updateExpenseTempItem**](ExpensesApi.md#updateExpenseTempItem) | **PUT** /api/v3/expenseTempItems/{expenseTempItemId} | Update an ExpenseTempItem by id |


<a name="createNewTemporaryExpense"></a>
# **createNewTemporaryExpense**
> ExpensesCreateNewTemporaryExpenseResponse createNewTemporaryExpense().expenseTempItem(expenseTempItem).execute();

Create a new temporary expense

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaCleemyExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaCleemyExpenses client = new LuccaCleemyExpenses(configuration);
    OffsetDateTime purchasedOn = OffsetDateTime.now(); // Day the expense was made.
    Integer expenseNatureId = 56; // Nature of the expense: Meals, Train, Taxi, Hotels, Taxi, Mileage... List depends on the app configuration.
    Integer id = 56;
    ExpenseTempItemOriginalTransaction originalTransaction = new ExpenseTempItemOriginalTransaction();
    ExpenseTempItemProcessedAmounts processedAmounts = new ExpenseTempItemProcessedAmounts();
    ExpenseTempItemMileage mileage = new ExpenseTempItemMileage();
    Integer quantity = 1; // The quantity when the expense type is 'Quantity'.
    Integer effectiveQuantity = 56; // Calculated quantity when the expense type is 'Quantity' or 'Invitations' (number of attendees).
    ExpenseTempItemAttendees attendees = new ExpenseTempItemAttendees();
    List<Object> axisSections = Arrays.asList(null); // Axis sections values.
    Map<String, ExpenseTempItemCustomFieldsValue> customFields = new HashMap(); // Values for custom fields.
    Object merchant = null; // Merchant of the expense.
    Object comment = null;
    List<ExpenseReceipt> expenseReceipts = Arrays.asList(); // The original receipt (PDF file, image, ...).
    ExpenseTempItemAuthorizedActions authorizedActions = new ExpenseTempItemAuthorizedActions();
    SourceId sourceId = new SourceId();
    ModelEnum source = new ModelEnum();
    Integer ownerId = 56; // Unique identifier of the user that made this expense.
    PaymentMethodId paymentMethodId = PaymentMethodId.fromValue("0");
    ModelEnum paymentMethod = new ModelEnum();
    StatusId statusId = new StatusId();
    ModelEnum status = new ModelEnum();
    try {
      ExpensesCreateNewTemporaryExpenseResponse result = client
              .expenses
              .createNewTemporaryExpense(purchasedOn, expenseNatureId)
              .id(id)
              .originalTransaction(originalTransaction)
              .processedAmounts(processedAmounts)
              .mileage(mileage)
              .quantity(quantity)
              .effectiveQuantity(effectiveQuantity)
              .attendees(attendees)
              .axisSections(axisSections)
              .customFields(customFields)
              .merchant(merchant)
              .comment(comment)
              .expenseReceipts(expenseReceipts)
              .authorizedActions(authorizedActions)
              .sourceId(sourceId)
              .source(source)
              .ownerId(ownerId)
              .paymentMethodId(paymentMethodId)
              .paymentMethod(paymentMethod)
              .statusId(statusId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#createNewTemporaryExpense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpensesCreateNewTemporaryExpenseResponse> response = client
              .expenses
              .createNewTemporaryExpense(purchasedOn, expenseNatureId)
              .id(id)
              .originalTransaction(originalTransaction)
              .processedAmounts(processedAmounts)
              .mileage(mileage)
              .quantity(quantity)
              .effectiveQuantity(effectiveQuantity)
              .attendees(attendees)
              .axisSections(axisSections)
              .customFields(customFields)
              .merchant(merchant)
              .comment(comment)
              .expenseReceipts(expenseReceipts)
              .authorizedActions(authorizedActions)
              .sourceId(sourceId)
              .source(source)
              .ownerId(ownerId)
              .paymentMethodId(paymentMethodId)
              .paymentMethod(paymentMethod)
              .statusId(statusId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#createNewTemporaryExpense");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expenseTempItem** | [**ExpenseTempItem**](ExpenseTempItem.md)|  | [optional] |

### Return type

[**ExpensesCreateNewTemporaryExpenseResponse**](ExpensesCreateNewTemporaryExpenseResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getById"></a>
# **getById**
> ExpensesGetByIdResponse getById(expenseTempItemId).execute();

Get an ExpenseTempItem by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaCleemyExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaCleemyExpenses client = new LuccaCleemyExpenses(configuration);
    Integer expenseTempItemId = 56; // Unique identifier of the ExpenseTempItem.
    try {
      ExpensesGetByIdResponse result = client
              .expenses
              .getById(expenseTempItemId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpensesGetByIdResponse> response = client
              .expenses
              .getById(expenseTempItemId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expenseTempItemId** | **Integer**| Unique identifier of the ExpenseTempItem. | |

### Return type

[**ExpensesGetByIdResponse**](ExpensesGetByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listTempItems"></a>
# **listTempItems**
> ExpensesListTempItemsResponse listTempItems(paging).ownerId(ownerId).orderBy(orderBy).purchasedOn(purchasedOn).execute();

List ExpenseTempItems (temporary expense)

Retrieve a list of &#x60;ExpenseTempItems&#x60;.  The &#x60;purchasedOn&#x60; query parameter can operate comparisons with a given date-time value: - &#x60;?purchasedOn&#x3D;2021-01-01&#x60;: strict equality. - &#x60;?purchasedOn&#x3D;since,2021-01-01&#x60;: greater than or equal. - &#x60;?purchasedOn&#x3D;until,2021-01-01&#x60;: lower than or equal. - &#x60;?purchasedOn&#x3D;between,2021-01-01,2021-01-31&#x60;: comprised between two dates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaCleemyExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaCleemyExpenses client = new LuccaCleemyExpenses(configuration);
    String paging = "100,0"; // {offset},{limit}. Defaults to 0,1000.
    List<Object> ownerId = null; // Comma-separated list of user identifiers (int).
    String orderBy = "orderBy_example"; // {fieldName},{'asc'||'desc'}. Example: `?orderby=purchasedOn,desc`
    String purchasedOn = "purchasedOn_example"; // Examples: `between,2022-01-01,202201-31`.
    try {
      ExpensesListTempItemsResponse result = client
              .expenses
              .listTempItems(paging)
              .ownerId(ownerId)
              .orderBy(orderBy)
              .purchasedOn(purchasedOn)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#listTempItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpensesListTempItemsResponse> response = client
              .expenses
              .listTempItems(paging)
              .ownerId(ownerId)
              .orderBy(orderBy)
              .purchasedOn(purchasedOn)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#listTempItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paging** | **String**| {offset},{limit}. Defaults to 0,1000. | |
| **ownerId** | [**List&lt;Object&gt;**](Object.md)| Comma-separated list of user identifiers (int). | [optional] |
| **orderBy** | **String**| {fieldName},{&#39;asc&#39;||&#39;desc&#39;}. Example: &#x60;?orderby&#x3D;purchasedOn,desc&#x60; | [optional] |
| **purchasedOn** | **String**| Examples: &#x60;between,2022-01-01,202201-31&#x60;. | [optional] |

### Return type

[**ExpensesListTempItemsResponse**](ExpensesListTempItemsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateExpenseTempItem"></a>
# **updateExpenseTempItem**
> ExpensesUpdateExpenseTempItemResponse updateExpenseTempItem(expenseTempItemId).expenseTempItem(expenseTempItem).execute();

Update an ExpenseTempItem by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaCleemyExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpensesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaCleemyExpenses client = new LuccaCleemyExpenses(configuration);
    OffsetDateTime purchasedOn = OffsetDateTime.now(); // Day the expense was made.
    Integer expenseNatureId = 56; // Nature of the expense: Meals, Train, Taxi, Hotels, Taxi, Mileage... List depends on the app configuration.
    Integer expenseTempItemId = 56; // Unique identifier of the ExpenseTempItem.
    Integer id = 56;
    ExpenseTempItemOriginalTransaction originalTransaction = new ExpenseTempItemOriginalTransaction();
    ExpenseTempItemProcessedAmounts processedAmounts = new ExpenseTempItemProcessedAmounts();
    ExpenseTempItemMileage mileage = new ExpenseTempItemMileage();
    Integer quantity = 1; // The quantity when the expense type is 'Quantity'.
    Integer effectiveQuantity = 56; // Calculated quantity when the expense type is 'Quantity' or 'Invitations' (number of attendees).
    ExpenseTempItemAttendees attendees = new ExpenseTempItemAttendees();
    List<Object> axisSections = Arrays.asList(null); // Axis sections values.
    Map<String, ExpenseTempItemCustomFieldsValue> customFields = new HashMap(); // Values for custom fields.
    Object merchant = null; // Merchant of the expense.
    Object comment = null;
    List<ExpenseReceipt> expenseReceipts = Arrays.asList(); // The original receipt (PDF file, image, ...).
    ExpenseTempItemAuthorizedActions authorizedActions = new ExpenseTempItemAuthorizedActions();
    SourceId sourceId = new SourceId();
    ModelEnum source = new ModelEnum();
    Integer ownerId = 56; // Unique identifier of the user that made this expense.
    PaymentMethodId paymentMethodId = PaymentMethodId.fromValue("0");
    ModelEnum paymentMethod = new ModelEnum();
    StatusId statusId = new StatusId();
    ModelEnum status = new ModelEnum();
    try {
      ExpensesUpdateExpenseTempItemResponse result = client
              .expenses
              .updateExpenseTempItem(purchasedOn, expenseNatureId, expenseTempItemId)
              .id(id)
              .originalTransaction(originalTransaction)
              .processedAmounts(processedAmounts)
              .mileage(mileage)
              .quantity(quantity)
              .effectiveQuantity(effectiveQuantity)
              .attendees(attendees)
              .axisSections(axisSections)
              .customFields(customFields)
              .merchant(merchant)
              .comment(comment)
              .expenseReceipts(expenseReceipts)
              .authorizedActions(authorizedActions)
              .sourceId(sourceId)
              .source(source)
              .ownerId(ownerId)
              .paymentMethodId(paymentMethodId)
              .paymentMethod(paymentMethod)
              .statusId(statusId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#updateExpenseTempItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpensesUpdateExpenseTempItemResponse> response = client
              .expenses
              .updateExpenseTempItem(purchasedOn, expenseNatureId, expenseTempItemId)
              .id(id)
              .originalTransaction(originalTransaction)
              .processedAmounts(processedAmounts)
              .mileage(mileage)
              .quantity(quantity)
              .effectiveQuantity(effectiveQuantity)
              .attendees(attendees)
              .axisSections(axisSections)
              .customFields(customFields)
              .merchant(merchant)
              .comment(comment)
              .expenseReceipts(expenseReceipts)
              .authorizedActions(authorizedActions)
              .sourceId(sourceId)
              .source(source)
              .ownerId(ownerId)
              .paymentMethodId(paymentMethodId)
              .paymentMethod(paymentMethod)
              .statusId(statusId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpensesApi#updateExpenseTempItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expenseTempItemId** | **Integer**| Unique identifier of the ExpenseTempItem. | |
| **expenseTempItem** | [**ExpenseTempItem**](ExpenseTempItem.md)|  | [optional] |

### Return type

[**ExpensesUpdateExpenseTempItemResponse**](ExpensesUpdateExpenseTempItemResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

