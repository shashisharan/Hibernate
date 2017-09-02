package com.cg.pojo;

public class Order {
	
	
	private double orderAmount;
	
	private Integer orderId;
	
	
	public Order() {
		super();
	}

	public Order(Integer orderId, double orderAmount) {
		super();
		this.orderId = orderId;
		this.orderAmount = orderAmount;
	}
	
	
	
	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	

}
