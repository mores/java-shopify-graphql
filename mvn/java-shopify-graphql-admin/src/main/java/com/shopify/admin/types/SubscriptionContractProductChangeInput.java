package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a Subscription Contract.
 */
public class SubscriptionContractProductChangeInput {
  /**
   * The ID of the product variant the subscription line refers to.
   */
  private String productVariantId;

  /**
   * The price of the product.
   */
  private String currentPrice;

  public SubscriptionContractProductChangeInput() {
  }

  /**
   * The ID of the product variant the subscription line refers to.
   */
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  /**
   * The price of the product.
   */
  public String getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(String currentPrice) {
    this.currentPrice = currentPrice;
  }

  @Override
  public String toString() {
    return "SubscriptionContractProductChangeInput{productVariantId='" + productVariantId + "', currentPrice='" + currentPrice + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractProductChangeInput that = (SubscriptionContractProductChangeInput) o;
    return Objects.equals(productVariantId, that.productVariantId) &&
        Objects.equals(currentPrice, that.currentPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, currentPrice);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the product variant the subscription line refers to.
     */
    private String productVariantId;

    /**
     * The price of the product.
     */
    private String currentPrice;

    public SubscriptionContractProductChangeInput build() {
      SubscriptionContractProductChangeInput result = new SubscriptionContractProductChangeInput();
      result.productVariantId = this.productVariantId;
      result.currentPrice = this.currentPrice;
      return result;
    }

    /**
     * The ID of the product variant the subscription line refers to.
     */
    public Builder productVariantId(String productVariantId) {
      this.productVariantId = productVariantId;
      return this;
    }

    /**
     * The price of the product.
     */
    public Builder currentPrice(String currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }
  }
}
