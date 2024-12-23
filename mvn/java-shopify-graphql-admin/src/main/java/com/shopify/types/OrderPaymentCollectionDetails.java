package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The payment collection details for an order that requires additional payment following an edit to the order.
 */
public class OrderPaymentCollectionDetails {
  /**
   * The URL to use for collecting an additional payment on the order.
   */
  private String additionalPaymentCollectionUrl;

  /**
   * The list of vaulted payment methods for the order with their permissions.
   */
  private List<PaymentMandate> vaultedPaymentMethods;

  public OrderPaymentCollectionDetails() {
  }

  /**
   * The URL to use for collecting an additional payment on the order.
   */
  public String getAdditionalPaymentCollectionUrl() {
    return additionalPaymentCollectionUrl;
  }

  public void setAdditionalPaymentCollectionUrl(String additionalPaymentCollectionUrl) {
    this.additionalPaymentCollectionUrl = additionalPaymentCollectionUrl;
  }

  /**
   * The list of vaulted payment methods for the order with their permissions.
   */
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
    /**
     * The URL to use for collecting an additional payment on the order.
     */
    private String additionalPaymentCollectionUrl;

    /**
     * The list of vaulted payment methods for the order with their permissions.
     */
    private List<PaymentMandate> vaultedPaymentMethods;

    public OrderPaymentCollectionDetails build() {
      OrderPaymentCollectionDetails result = new OrderPaymentCollectionDetails();
      result.additionalPaymentCollectionUrl = this.additionalPaymentCollectionUrl;
      result.vaultedPaymentMethods = this.vaultedPaymentMethods;
      return result;
    }

    /**
     * The URL to use for collecting an additional payment on the order.
     */
    public Builder additionalPaymentCollectionUrl(String additionalPaymentCollectionUrl) {
      this.additionalPaymentCollectionUrl = additionalPaymentCollectionUrl;
      return this;
    }

    /**
     * The list of vaulted payment methods for the order with their permissions.
     */
    public Builder vaultedPaymentMethods(List<PaymentMandate> vaultedPaymentMethods) {
      this.vaultedPaymentMethods = vaultedPaymentMethods;
      return this;
    }
  }
}
