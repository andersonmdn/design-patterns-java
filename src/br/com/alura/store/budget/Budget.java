package br.com.alura.store.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int countItems;

    public Budget(BigDecimal value, int countItems) {
        this.value = value;
        this.countItems = countItems;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getCountItems() {
        return countItems;
    }
}
