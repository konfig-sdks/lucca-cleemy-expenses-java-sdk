

# ExpenseClaim

When a user wants to declare his expenses, he creates an `ExpenseClaim`.  An `ExpenseClaim` is created by regrouping one or more `ExpenseTempItems` and converting them into ExpenseClaimItems.  Once created, an `ExpenseClaim` has to be approved by his manager.  Multiple `ExpenseClaims` can be created through a single request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**name** | **String** | Name of the expense claim. If empty, it will be generated with the month and year of the last of claim item. |  [optional] |
|**declaredOn** | **OffsetDateTime** | Day the expenseClaim has been declared (Time zone Europe/Paris). |  [readonly] |
|**createdOn** | **OffsetDateTime** | Day the expenseClaim has been created (Time zone Europe/Paris). |  [readonly] |
|**modifiedOn** | **OffsetDateTime** | Day the expenseClaim has been modified (Time zone Europe/Paris). |  [readonly] |
|**paymentReceivedOn** | **OffsetDateTime** | Day the expenseClaim has been paid (Time zone Europe/Paris). |  [optional] [readonly] |
|**sourceId** | [**SourceId**](SourceId.md) |  |  [optional] |
|**source** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |
|**paymentMethodId** | **PaymentMethodId** |  |  [optional] |
|**paymentMethod** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |
|**statusId** | [**ClaimStatusId**](ClaimStatusId.md) |  |  [optional] |
|**status** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |
|**approvalStateId** | [**ApprovalStateId**](ApprovalStateId.md) |  |  [optional] |
|**approvalState** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |
|**authorizedActions** | [**ExpenseClaimAuthorizedActions**](ExpenseClaimAuthorizedActions.md) |  |  [optional] |
|**ownerId** | **Integer** | Unique identifier of the user that made this expenseClaim. |  [optional] [readonly] |
|**owner** | [**Owner**](Owner.md) |  |  [optional] |
|**authorId** | **Integer** | Unique identifier of the user that created this grouping of expense. |  [optional] |
|**author** | [**EntityBase**](EntityBase.md) |  |  [optional] |
|**legalEntityId** | **Integer** |  |  [optional] |
|**legalEntity** | [**EntityBase**](EntityBase.md) |  |  [optional] |
|**departmentId** | **Integer** |  |  [optional] |
|**department** | [**EntityBase**](EntityBase.md) |  |  [optional] |
|**currencyId** | **String** | ISO code of the currency (eg: &#39;EUR&#39;, &#39;USD&#39;, &#39;GBP&#39;, ...). |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |



