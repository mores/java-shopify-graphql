package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderCancelPayload {
  
  private Job job;

  
  private List<OrderCancelUserError> orderCancelUserErrors;

  
  private List<UserError> userErrors;

  public OrderCancelPayload() {
  }

  
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  
  public List<OrderCancelUserError> getOrderCancelUserErrors() {
    return orderCancelUserErrors;
  }

  public void setOrderCancelUserErrors(List<OrderCancelUserError> orderCancelUserErrors) {
    this.orderCancelUserErrors = orderCancelUserErrors;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderCancelPayload{job='" + job + "', orderCancelUserErrors='" + orderCancelUserErrors + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCancelPayload that = (OrderCancelPayload) o;
    return Objects.equals(job, that.job) &&
        Objects.equals(orderCancelUserErrors, that.orderCancelUserErrors) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, orderCancelUserErrors, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Job job;

    
    private List<OrderCancelUserError> orderCancelUserErrors;

    
    private List<UserError> userErrors;

    public OrderCancelPayload build() {
      OrderCancelPayload result = new OrderCancelPayload();
      result.job = this.job;
      result.orderCancelUserErrors = this.orderCancelUserErrors;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder job(Job job) {
      this.job = job;
      return this;
    }

    
    public Builder orderCancelUserErrors(List<OrderCancelUserError> orderCancelUserErrors) {
      this.orderCancelUserErrors = orderCancelUserErrors;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
