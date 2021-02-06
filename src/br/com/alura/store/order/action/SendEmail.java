package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class SendEmail implements ActionAfterOrder{
    public void toExecute(Order order) {
        System.out.println("Sending email with the order data!");
    }
}
