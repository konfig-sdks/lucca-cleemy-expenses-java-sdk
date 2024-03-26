

# ExpenseTempItemProcessedAmounts

Various amounts in the establishment's currency.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**grossAmount** | **Double** | Original transaction amount converted into the establishment&#39;s currency. |  [optional] |
|**currencyId** | **String** | ISO code of the currency (eg: &#39;EUR&#39;, &#39;USD&#39;, &#39;GBP&#39;, ...). |  [optional] |
|**currency** | [**Currency**](Currency.md) |  |  [optional] |
|**netAmount** | **Double** | The converted amount after the expense policy has been applied. |  [optional] |
|**vatBases** | [**List&lt;ExpenseTempItemProcessedAmountsVatBasesInner&gt;**](ExpenseTempItemProcessedAmountsVatBasesInner.md) |  |  [optional] |



