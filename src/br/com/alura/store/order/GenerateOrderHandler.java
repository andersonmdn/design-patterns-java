package br.com.alura.store.order;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.action.ActionAfterOrder;

import java.time.LocalDateTime;
import java.util.List;

public class GenerateOrderHandler {
    private List<ActionAfterOrder> actions;

    public GenerateOrderHandler(List<ActionAfterOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getBudgetValue(), data.getQuantityItems());
        Order order = new Order(data.getClient(), LocalDateTime.now(), budget);

        actions.forEach(a -> a.toExecute(order));
    }
}
