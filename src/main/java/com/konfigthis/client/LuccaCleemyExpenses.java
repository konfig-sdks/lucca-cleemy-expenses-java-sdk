package com.konfigthis.client;

import com.konfigthis.client.api.ExpenseClaimsApi;
import com.konfigthis.client.api.ExpensesApi;

public class LuccaCleemyExpenses {
    private ApiClient apiClient;
    public final ExpenseClaimsApi expenseClaims;
    public final ExpensesApi expenses;

    public LuccaCleemyExpenses() {
        this(null);
    }

    public LuccaCleemyExpenses(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.expenseClaims = new ExpenseClaimsApi(this.apiClient);
        this.expenses = new ExpensesApi(this.apiClient);
    }

}
