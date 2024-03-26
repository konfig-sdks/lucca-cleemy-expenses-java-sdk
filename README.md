<div align="left">

[![Visit Lucca](./header.png)](https://lucca-hr.com)

# [Lucca](https://lucca-hr.com)

Welcome on the documentation for the CleemyExpenses API.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lucca&serviceName=Cleemy%20Expenses&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lucca-cleemy-expenses-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lucca-cleemy-expenses-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lucca-cleemy-expenses-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://example.ilucca.net*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ExpenseClaimsApi* | [**createNewExpenseClaim**](docs/ExpenseClaimsApi.md#createNewExpenseClaim) | **POST** /api/v3/expenseClaims/creation | Create a new ExpenseClaim
*ExpenseClaimsApi* | [**list**](docs/ExpenseClaimsApi.md#list) | **GET** /api/v3/expenseClaims | List ExpenseClaims
*ExpensesApi* | [**createNewTemporaryExpense**](docs/ExpensesApi.md#createNewTemporaryExpense) | **POST** /api/v3/expenseTempItems | Create a new temporary expense
*ExpensesApi* | [**getById**](docs/ExpensesApi.md#getById) | **GET** /api/v3/expenseTempItems/{expenseTempItemId} | Get an ExpenseTempItem by id
*ExpensesApi* | [**listTempItems**](docs/ExpensesApi.md#listTempItems) | **GET** /api/v3/expenseTempItems | List ExpenseTempItems (temporary expense)
*ExpensesApi* | [**updateExpenseTempItem**](docs/ExpensesApi.md#updateExpenseTempItem) | **PUT** /api/v3/expenseTempItems/{expenseTempItemId} | Update an ExpenseTempItem by id


## Documentation for Models

 - [ApprovalStateId](docs/ApprovalStateId.md)
 - [ClaimStatusId](docs/ClaimStatusId.md)
 - [Currency](docs/Currency.md)
 - [EntityBase](docs/EntityBase.md)
 - [ExpenseClaim](docs/ExpenseClaim.md)
 - [ExpenseClaimAuthorizedActions](docs/ExpenseClaimAuthorizedActions.md)
 - [ExpenseClaimsCreateNewExpenseClaimRequestInner](docs/ExpenseClaimsCreateNewExpenseClaimRequestInner.md)
 - [ExpenseClaimsCreateNewExpenseClaimRequestInnerExpenseTempItemsInner](docs/ExpenseClaimsCreateNewExpenseClaimRequestInnerExpenseTempItemsInner.md)
 - [ExpenseClaimsCreateNewExpenseClaimResponse](docs/ExpenseClaimsCreateNewExpenseClaimResponse.md)
 - [ExpenseClaimsCreateNewExpenseClaimResponseDataInner](docs/ExpenseClaimsCreateNewExpenseClaimResponseDataInner.md)
 - [ExpenseClaimsCreateNewExpenseClaimResponseDataInnerCreatedExpenseClaim](docs/ExpenseClaimsCreateNewExpenseClaimResponseDataInnerCreatedExpenseClaim.md)
 - [ExpenseClaimsCreateNewExpenseClaimResponseDataInnerCreatedExpenseClaimNextApprover](docs/ExpenseClaimsCreateNewExpenseClaimResponseDataInnerCreatedExpenseClaimNextApprover.md)
 - [ExpenseClaimsListResponse](docs/ExpenseClaimsListResponse.md)
 - [ExpenseClaimsListResponseData](docs/ExpenseClaimsListResponseData.md)
 - [ExpenseReceipt](docs/ExpenseReceipt.md)
 - [ExpenseTempItem](docs/ExpenseTempItem.md)
 - [ExpenseTempItemAttendees](docs/ExpenseTempItemAttendees.md)
 - [ExpenseTempItemAttendeesExternalInner](docs/ExpenseTempItemAttendeesExternalInner.md)
 - [ExpenseTempItemAuthorizedActions](docs/ExpenseTempItemAuthorizedActions.md)
 - [ExpenseTempItemCustomFieldsValue](docs/ExpenseTempItemCustomFieldsValue.md)
 - [ExpenseTempItemMileage](docs/ExpenseTempItemMileage.md)
 - [ExpenseTempItemOriginalTransaction](docs/ExpenseTempItemOriginalTransaction.md)
 - [ExpenseTempItemProcessedAmounts](docs/ExpenseTempItemProcessedAmounts.md)
 - [ExpenseTempItemProcessedAmountsVatBasesInner](docs/ExpenseTempItemProcessedAmountsVatBasesInner.md)
 - [ExpenseTempItemProcessedAmountsVatBasesInnerCountryVatRate](docs/ExpenseTempItemProcessedAmountsVatBasesInnerCountryVatRate.md)
 - [ExpensesCreateNewTemporaryExpenseResponse](docs/ExpensesCreateNewTemporaryExpenseResponse.md)
 - [ExpensesGetByIdResponse](docs/ExpensesGetByIdResponse.md)
 - [ExpensesListTempItemsResponse](docs/ExpensesListTempItemsResponse.md)
 - [ExpensesListTempItemsResponseData](docs/ExpensesListTempItemsResponseData.md)
 - [ExpensesUpdateExpenseTempItemResponse](docs/ExpensesUpdateExpenseTempItemResponse.md)
 - [ModelEnum](docs/ModelEnum.md)
 - [Owner](docs/Owner.md)
 - [PaymentMethodId](docs/PaymentMethodId.md)
 - [SourceId](docs/SourceId.md)
 - [StatusId](docs/StatusId.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
