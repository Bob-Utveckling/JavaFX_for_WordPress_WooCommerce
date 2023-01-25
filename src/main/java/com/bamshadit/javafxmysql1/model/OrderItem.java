package com.bamshadit.javafxmysql1.model;

public class OrderItem {
    public OrderItem(int order_item_id, int order_id, int product_id, int customer_id, String date_creates, int product_qty, double product_net_revenue, double product_gross_revenue) {
        this.order_item_id = order_item_id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.date_creates = date_creates;
        this.product_qty = product_qty;
        this.product_net_revenue = product_net_revenue;
        this.product_gross_revenue = product_gross_revenue;
    }

    int order_item_id;
    int order_id;
    int product_id;
    int customer_id;
    String date_creates;
    int product_qty;
    double product_net_revenue;
    double product_gross_revenue;

    public int getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(int order_item_id) {
        this.order_item_id = order_item_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getDate_creates() {
        return date_creates;
    }

    public void setDate_creates(String date_creates) {
        this.date_creates = date_creates;
    }

    public int getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }

    public double getProduct_net_revenue() {
        return product_net_revenue;
    }

    public void setProduct_net_revenue(double product_net_revenue) {
        this.product_net_revenue = product_net_revenue;
    }

    public double getProduct_gross_revenue() {
        return product_gross_revenue;
    }

    public void setProduct_gross_revenue(double product_gross_revenue) {
        this.product_gross_revenue = product_gross_revenue;
    }
}
