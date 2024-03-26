

# ExpenseTempItem

The `ExpenseTempItem`, or \"temporary expense\" is an expense that has not yet been declared (within an expense report) by its owner (the user who made the expense).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] [readonly] |
|**purchasedOn** | **OffsetDateTime** | Day the expense was made. |  |
|**originalTransaction** | [**ExpenseTempItemOriginalTransaction**](ExpenseTempItemOriginalTransaction.md) |  |  [optional] |
|**processedAmounts** | [**ExpenseTempItemProcessedAmounts**](ExpenseTempItemProcessedAmounts.md) |  |  [optional] |
|**expenseNatureId** | **Integer** | Nature of the expense: Meals, Train, Taxi, Hotels, Taxi, Mileage... List depends on the app configuration. |  |
|**mileage** | [**ExpenseTempItemMileage**](ExpenseTempItemMileage.md) |  |  [optional] |
|**quantity** | **Integer** | The quantity when the expense type is &#39;Quantity&#39;. |  [optional] |
|**effectiveQuantity** | **Integer** | Calculated quantity when the expense type is &#39;Quantity&#39; or &#39;Invitations&#39; (number of attendees). |  [optional] [readonly] |
|**attendees** | [**ExpenseTempItemAttendees**](ExpenseTempItemAttendees.md) |  |  [optional] |
|**axisSections** | **List&lt;Object&gt;** | Axis sections values. |  [optional] |
|**customFields** | [**Map&lt;String, ExpenseTempItemCustomFieldsValue&gt;**](ExpenseTempItemCustomFieldsValue.md) | Values for custom fields. |  [optional] |
|**merchant** | **Object** | Merchant of the expense. |  [optional] |
|**comment** | **Object** |  |  [optional] |
|**expenseReceipts** | [**List&lt;ExpenseReceipt&gt;**](ExpenseReceipt.md) | The original receipt (PDF file, image, ...). |  [optional] |
|**authorizedActions** | [**ExpenseTempItemAuthorizedActions**](ExpenseTempItemAuthorizedActions.md) |  |  [optional] |
|**sourceId** | [**SourceId**](SourceId.md) |  |  [optional] |
|**source** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |
|**ownerId** | **Integer** | Unique identifier of the user that made this expense. |  [optional] |
|**paymentMethodId** | **PaymentMethodId** |  |  [optional] |
|**paymentMethod** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |
|**statusId** | [**StatusId**](StatusId.md) |  |  [optional] |
|**status** | [**ModelEnum**](ModelEnum.md) |  |  [optional] |



