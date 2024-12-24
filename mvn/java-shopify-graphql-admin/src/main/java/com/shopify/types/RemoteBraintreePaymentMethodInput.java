package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RemoteBraintreePaymentMethodInput {
  
  private String customerId;

  
  private String paymentMethodToken;

  public RemoteBraintreePaymentMethodInput() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public String getPaymentMethodToken() {
    return paymentMethodToken;
  }

  public void setPaymentMethodToken(String paymentMethodToken) {
    this.paymentMethodToken = paymentMethodToken;
  }

  @Override
  public String toString() {
    return "RemoteBraintreePaymentMethodInput{customerId='" + customerId + "', paymentMethodToken='" + paymentMethodToken + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoteBraintreePaymentMethodInput that = (RemoteBraintreePaymentMethodInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(paymentMethodToken, that.paymentMethodToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, paymentMethodToken);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private String paymentMethodToken;

    public RemoteBraintreePaymentMethodInput build() {
      RemoteBraintreePaymentMethodInput result = new RemoteBraintreePaymentMethodInput();
      result.customerId = this.customerId;
      result.paymentMethodToken = this.paymentMethodToken;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder paymentMethodToken(String paymentMethodToken) {
      this.paymentMethodToken = paymentMethodToken;
      return this;
    }
  }
}
