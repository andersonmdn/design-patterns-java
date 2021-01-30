package br.com.alura.store.budget.situation;

import br.com.alura.store.DomainException;
import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetSituation {
    public BigDecimal toCalcExtraDiscount(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void toApprove(Budget budget) {
        throw new DomainException("Budget cannot be approved!");
    }

    public void toDisapprove(Budget budget) {
        throw new DomainException("Budget cannot be disapproved!");
    }

    public void toFinish(Budget budget) {
        throw new DomainException("Budget cannot be finished!");
    }
}
