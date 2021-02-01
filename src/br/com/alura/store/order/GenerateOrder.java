package br.com.alura.store.order;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GenerateOrder {
    private String client;
    private BigDecimal budgetValue;
    private int QuantityItems;

    public GenerateOrder(String client, BigDecimal budgetValue, int quantityItems) {
        this.client = client;
        this.budgetValue = budgetValue;
        QuantityItems = quantityItems;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getQuantityItems() {
        return QuantityItems;
    }
}
