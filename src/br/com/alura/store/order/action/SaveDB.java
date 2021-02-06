package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class SaveDB implements ActionAfterOrder{
    public void toExecute(Order order) {
        System.out.println("Savind data!");
    }
}
