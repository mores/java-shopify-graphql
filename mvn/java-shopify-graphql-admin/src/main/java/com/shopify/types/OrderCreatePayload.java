package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderCreatePayload {
  
  private Order order;

  
  private List<OrderCreateUserError> userErrors;

  public OrderCreatePayload() {
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public List<OrderCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCreatePayload{order='" + order + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreatePayload that = (OrderCreatePayload) o;
    return Objects.equals(order, that.order) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Order order;

    
    private List<OrderCreateUserError> userErrors;

    public OrderCreatePayload build() {
      OrderCreatePayload result = new OrderCreatePayload();
      result.order = this.order;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder userErrors(List<OrderCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
