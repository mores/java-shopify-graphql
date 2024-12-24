package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPayInstallmentsPaymentDetails implements PaymentDetails, com.shopify.types.BasePaymentDetails {
  
  private String paymentMethodName;

  public ShopPayInstallmentsPaymentDetails() {
  }

  
  public String getPaymentMethodName() {
    return paymentMethodName;
  }

  public void setPaymentMethodName(String paymentMethodName) {
    this.paymentMethodName = paymentMethodName;
  }

  @Override
  public String toString() {
    return "ShopPayInstallmentsPaymentDetails{paymentMethodName='" + paymentMethodName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayInstallmentsPaymentDetails that = (ShopPayInstallmentsPaymentDetails) o;
    return Objects.equals(paymentMethodName, that.paymentMethodName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String paymentMethodName;

    public ShopPayInstallmentsPaymentDetails build() {
      ShopPayInstallmentsPaymentDetails result = new ShopPayInstallmentsPaymentDetails();
      result.paymentMethodName = this.paymentMethodName;
      return result;
    }

    
    public Builder paymentMethodName(String paymentMethodName) {
      this.paymentMethodName = paymentMethodName;
      return this;
    }
  }
}
