# ExpenseClaimsApi

All URIs are relative to *https://example.ilucca.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewExpenseClaim**](ExpenseClaimsApi.md#createNewExpenseClaim) | **POST** /api/v3/expenseClaims/creation | Create a new ExpenseClaim |
| [**list**](ExpenseClaimsApi.md#list) | **GET** /api/v3/expenseClaims | List ExpenseClaims |


<a name="createNewExpenseClaim"></a>
# **createNewExpenseClaim**
> ExpenseClaimsCreateNewExpenseClaimResponse createNewExpenseClaim().expenseClaimsCreateNewExpenseClaimRequestInner(expenseClaimsCreateNewExpenseClaimRequestInner).execute();

Create a new ExpenseClaim

When a user wants to declare his expenses, he creates an &#x60;ExpenseClaim&#x60;.  An &#x60;ExpenseClaim&#x60; is created by regrouping one or more &#x60;ExpenseTempItems&#x60; and converting them into ExpenseClaimItems.  Once created, an &#x60;ExpenseClaim&#x60; has to be approved by his manager.  Multiple &#x60;ExpenseClaims&#x60; can be created through a single request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaCleemyExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseClaimsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://example.ilucca.net";
    
    configuration.authorization  = "YOUR API KEY";
    LuccaCleemyExpenses client = new LuccaCleemyExpenses(configuration);
    try {
      ExpenseClaimsCreateNewExpenseClaimResponse result = client
              .expenseClaims
              .createNewExpenseClaim()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#createNewExpenseClaim");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseClaimsCreateNewExpenseClaimResponse> response = client
              .expenseClaims
              .createNewExpenseClaim()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#createNewExpenseClaim");
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
| **expenseClaimsCreateNewExpenseClaimRequestInner** | [**List&lt;ExpenseClaimsCreateNewExpenseClaimRequestInner&gt;**](ExpenseClaimsCreateNewExpenseClaimRequestInner.md)|  | [optional] |

### Return type

[**ExpenseClaimsCreateNewExpenseClaimResponse**](ExpenseClaimsCreateNewExpenseClaimResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="list"></a>
# **list**
> ExpenseClaimsListResponse list(paging).ownerId(ownerId).orderBy(orderBy).declaredOn(declaredOn).statusId(statusId).execute();

List ExpenseClaims

Retrieve a list of &#x60;ExpenseClaims&#x60;.  The &#x60;declaredOn&#x60; query parameter can operate comparisons with a given date-time value: - &#x60;?declaredOn&#x3D;2021-01-01&#x60;: strict equality. - &#x60;?declaredOn&#x3D;since,2021-01-01&#x60;: greater than or equal. - &#x60;?declaredOn&#x3D;until,2021-01-01&#x60;: lower than or equal. - &#x60;?declaredOn&#x3D;between,2021-01-01,2021-01-31&#x60;: comprised between two dates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.LuccaCleemyExpenses;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ExpenseClaimsApi;
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
    List<Integer> ownerId = Arrays.asList(); // Comma-separated list of user identifiers (int).
    String orderBy = "orderBy_example"; // {fieldName},{'asc'||'desc'}. Example: `?orderby=declaredOn,desc`
    String declaredOn = "declaredOn_example"; // Examples: `between,2022-01-01,202201-31`.
    String statusId = "statusId_example"; // 1: Created; 2: PartiallyApproved; 3: Approved; 4: Controlled; 5: ApprovedAndControlled; 6: PaymentInitiated; 7: Paid; 8: Refused; 9: Cancelled. Examples: `2,3` or `PartiallyApproved,Approved`.
    try {
      ExpenseClaimsListResponse result = client
              .expenseClaims
              .list(paging)
              .ownerId(ownerId)
              .orderBy(orderBy)
              .declaredOn(declaredOn)
              .statusId(statusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExpenseClaimsListResponse> response = client
              .expenseClaims
              .list(paging)
              .ownerId(ownerId)
              .orderBy(orderBy)
              .declaredOn(declaredOn)
              .statusId(statusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ExpenseClaimsApi#list");
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
| **ownerId** | [**List&lt;Integer&gt;**](Integer.md)| Comma-separated list of user identifiers (int). | [optional] |
| **orderBy** | **String**| {fieldName},{&#39;asc&#39;||&#39;desc&#39;}. Example: &#x60;?orderby&#x3D;declaredOn,desc&#x60; | [optional] |
| **declaredOn** | **String**| Examples: &#x60;between,2022-01-01,202201-31&#x60;. | [optional] |
| **statusId** | **String**| 1: Created; 2: PartiallyApproved; 3: Approved; 4: Controlled; 5: ApprovedAndControlled; 6: PaymentInitiated; 7: Paid; 8: Refused; 9: Cancelled. Examples: &#x60;2,3&#x60; or &#x60;PartiallyApproved,Approved&#x60;. | [optional] |

### Return type

[**ExpenseClaimsListResponse**](ExpenseClaimsListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

