package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class LocalPaymentMethodsPaymentDetails implements PaymentDetails, com.shopify.types.BasePaymentDetails {
  
  private String paymentDescriptor;

  
  private String paymentMethodName;

  public LocalPaymentMethodsPaymentDetails() {
  }

  
  public String getPaymentDescriptor() {
    return paymentDescriptor;
  }

  public void setPaymentDescriptor(String paymentDescriptor) {
    this.paymentDescriptor = paymentDescriptor;
  }

  
  public String getPaymentMethodName() {
    return paymentMethodName;
  }

  public void setPaymentMethodName(String paymentMethodName) {
    this.paymentMethodName = paymentMethodName;
  }

  @Override
  public String toString() {
    return "LocalPaymentMethodsPaymentDetails{paymentDescriptor='" + paymentDescriptor + "', paymentMethodName='" + paymentMethodName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocalPaymentMethodsPaymentDetails that = (LocalPaymentMethodsPaymentDetails) o;
    return Objects.equals(paymentDescriptor, that.paymentDescriptor) &&
        Objects.equals(paymentMethodName, that.paymentMethodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentDescriptor, paymentMethodName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String paymentDescriptor;

    
    private String paymentMethodName;

    public LocalPaymentMethodsPaymentDetails build() {
      LocalPaymentMethodsPaymentDetails result = new LocalPaymentMethodsPaymentDetails();
      result.paymentDescriptor = this.paymentDescriptor;
      result.paymentMethodName = this.paymentMethodName;
      return result;
    }

    
    public Builder paymentDescriptor(String paymentDescriptor) {
      this.paymentDescriptor = paymentDescriptor;
      return this;
    }

    
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      return this;
    }
  }
}
