package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RemoteStripePaymentMethodInput {
  
  private String customerId;

  
  private String paymentMethodId;

  public RemoteStripePaymentMethodInput() {
  }

  
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  @Override
  public String toString() {
    return "RemoteStripePaymentMethodInput{customerId='" + customerId + "', paymentMethodId='" + paymentMethodId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RemoteStripePaymentMethodInput that = (RemoteStripePaymentMethodInput) o;
    return Objects.equals(customerId, that.customerId) &&
        Objects.equals(paymentMethodId, that.paymentMethodId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, paymentMethodId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String customerId;

    
    private String paymentMethodId;

    public RemoteStripePaymentMethodInput build() {
      RemoteStripePaymentMethodInput result = new RemoteStripePaymentMethodInput();
      result.customerId = this.customerId;
      result.paymentMethodId = this.paymentMethodId;
      return result;
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    
    public Builder paymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
      return this;
    }
  }
}
