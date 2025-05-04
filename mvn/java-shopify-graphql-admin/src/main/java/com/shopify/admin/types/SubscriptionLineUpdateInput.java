package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to update a subscription line on a contract.
 */
public class SubscriptionLineUpdateInput {
  /**
   * The ID of the product variant the subscription line refers to.
   */
  private String productVariantId;

  /**
   * The quantity of the product.
   */
  private Integer quantity;

  /**
   * The selling plan for the subscription line.
   */
  private String sellingPlanId;

  /**
   * The selling plan name for the subscription line.
   */
  private String sellingPlanName;

  /**
   * The price of the product.
   */
  private String currentPrice;

  /**
   * The custom attributes for this subscription line.
   */
  private List<AttributeInput> customAttributes;

  /**
   * Describes expected price changes of the subscription line over time.
   */
  private SubscriptionPricingPolicyInput pricingPolicy;

  public SubscriptionLineUpdateInput() {
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
   * The quantity of the product.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The selling plan for the subscription line.
   */
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  /**
   * The selling plan name for the subscription line.
   */
  public String getSellingPlanName() {
    return sellingPlanName;
  }

  public void setSellingPlanName(String sellingPlanName) {
    this.sellingPlanName = sellingPlanName;
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

  /**
   * The custom attributes for this subscription line.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * Describes expected price changes of the subscription line over time.
   */
  public SubscriptionPricingPolicyInput getPricingPolicy() {
    return pricingPolicy;
  }

  public void setPricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
    this.pricingPolicy = pricingPolicy;
  }

  @Override
  public String toString() {
    return "SubscriptionLineUpdateInput{productVariantId='" + productVariantId + "', quantity='" + quantity + "', sellingPlanId='" + sellingPlanId + "', sellingPlanName='" + sellingPlanName + "', currentPrice='" + currentPrice + "', customAttributes='" + customAttributes + "', pricingPolicy='" + pricingPolicy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLineUpdateInput that = (SubscriptionLineUpdateInput) o;
    return Objects.equals(productVariantId, that.productVariantId) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(currentPrice, that.currentPrice) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(pricingPolicy, that.pricingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, quantity, sellingPlanId, sellingPlanName, currentPrice, customAttributes, pricingPolicy);
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
     * The quantity of the product.
     */
    private Integer quantity;

    /**
     * The selling plan for the subscription line.
     */
    private String sellingPlanId;

    /**
     * The selling plan name for the subscription line.
     */
    private String sellingPlanName;

    /**
     * The price of the product.
     */
    private String currentPrice;

    /**
     * The custom attributes for this subscription line.
     */
    private List<AttributeInput> customAttributes;

    /**
     * Describes expected price changes of the subscription line over time.
     */
    private SubscriptionPricingPolicyInput pricingPolicy;

    public SubscriptionLineUpdateInput build() {
      SubscriptionLineUpdateInput result = new SubscriptionLineUpdateInput();
      result.productVariantId = this.productVariantId;
      result.quantity = this.quantity;
      result.sellingPlanId = this.sellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
      result.currentPrice = this.currentPrice;
      result.customAttributes = this.customAttributes;
      result.pricingPolicy = this.pricingPolicy;
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
     * The quantity of the product.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The selling plan for the subscription line.
     */
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }

    /**
     * The selling plan name for the subscription line.
     */
    public Builder sellingPlanName(String sellingPlanName) {
      this.sellingPlanName = sellingPlanName;
      return this;
    }

    /**
     * The price of the product.
     */
    public Builder currentPrice(String currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }

    /**
     * The custom attributes for this subscription line.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * Describes expected price changes of the subscription line over time.
     */
    public Builder pricingPolicy(SubscriptionPricingPolicyInput pricingPolicy) {
      this.pricingPolicy = pricingPolicy;
      return this;
    }
  }
}
