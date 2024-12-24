package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderPaymentCollectionDetails {
  
  private String additionalPaymentCollectionUrl;

  
  private List<PaymentMandate> vaultedPaymentMethods;

  public OrderPaymentCollectionDetails() {
  }

  
  public String getAdditionalPaymentCollectionUrl() {
    return additionalPaymentCollectionUrl;
  }

  public void setAdditionalPaymentCollectionUrl(String additionalPaymentCollectionUrl) {
    this.additionalPaymentCollectionUrl = additionalPaymentCollectionUrl;
  }

  
  public List<PaymentMandate> getVaultedPaymentMethods() {
    return vaultedPaymentMethods;
  }

  public void setVaultedPaymentMethods(List<PaymentMandate> vaultedPaymentMethods) {
    this.vaultedPaymentMethods = vaultedPaymentMethods;
  }

  @Override
  public String toString() {
    return "OrderPaymentCollectionDetails{additionalPaymentCollectionUrl='" + additionalPaymentCollectionUrl + "', vaultedPaymentMethods='" + vaultedPaymentMethods + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderPaymentCollectionDetails that = (OrderPaymentCollectionDetails) o;
    return Objects.equals(additionalPaymentCollectionUrl, that.additionalPaymentCollectionUrl) &&
        Objects.equals(vaultedPaymentMethods, that.vaultedPaymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPaymentCollectionUrl, vaultedPaymentMethods);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String additionalPaymentCollectionUrl;

    
    private List<PaymentMandate> vaultedPaymentMethods;

    public OrderPaymentCollectionDetails build() {
      OrderPaymentCollectionDetails result = new OrderPaymentCollectionDetails();
      result.additionalPaymentCollectionUrl = this.additionalPaymentCollectionUrl;
      result.vaultedPaymentMethods = this.vaultedPaymentMethods;
      return result;
    }

    
    public Builder additionalPaymentCollectionUrl(String additionalPaymentCollectionUrl) {
      this.additionalPaymentCollectionUrl = additionalPaymentCollectionUrl;
      return this;
    }

    
    public Builder vaultedPaymentMethods(List<PaymentMandate> vaultedPaymentMethods) {
      this.vaultedPaymentMethods = vaultedPaymentMethods;
      return this;
    }
  }
}
