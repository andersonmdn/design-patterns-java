package br.com.alura.store.budget;

import br.com.alura.store.DomainException;
import br.com.alura.store.budget.situation.BudgetSituation;
import br.com.alura.store.budget.situation.InAnalysis;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int countItems;
    private BudgetSituation situation;

    public Budget(BigDecimal value, int countItems) {
        this.value = value;
        this.countItems = countItems;
        this.situation = new InAnalysis();
    }

    public void applyExtraDiscount() {
        BigDecimal valueExtraDiscount = this.situation.toCalcExtraDiscount(this);

        this.value = this.value.subtract(valueExtraDiscount);
    }

    public void toApprove(Budget budget) {
        this.situation.toApprove(this);
    }

    public void toDisapprove(Budget budget) {
        this.situation.toDisapprove(this);
    }

    public void toFinish(Budget budget) {
        this.situation.toFinish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getCountItems() {
        return countItems;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public BudgetSituation getSituation() {
        return situation;
    }
}
