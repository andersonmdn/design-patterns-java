package br.com.alura.store.order;

import br.com.alura.store.budget.Budget;

import java.time.LocalDateTime;

public class GenerateOrderHandler {
    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getBudgetValue(), data.getQuantityItems());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);
    }
}
