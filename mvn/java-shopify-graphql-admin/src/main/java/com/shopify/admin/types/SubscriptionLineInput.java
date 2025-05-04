package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to add a new subscription line to a contract.
 */
public class SubscriptionLineInput {
  /**
   * The ID of the product variant the subscription line refers to.
   */
  private String productVariantId;

  /**
   * The quantity of the product.
   */
  private int quantity;

  /**
   * The price of the product.
   */
  private String currentPrice;

  /**
   * The custom attributes for this subscription line.
   */
  private List<AttributeInput> customAttributes;

  /**
   * The selling plan for the subscription line.
   */
  private String sellingPlanId;

  /**
   * The selling plan name for the subscription line.
   *   
   * Defaults to using the selling plan's current name when not specified.
   */
  private String sellingPlanName;

  /**
   * Describes expected price changes of the subscription line over time.
   */
  private SubscriptionPricingPolicyInput pricingPolicy;

  public SubscriptionLineInput() {
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
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
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
   *   
   * Defaults to using the selling plan's current name when not specified.
   */
  public String getSellingPlanName() {
    return sellingPlanName;
  }

  public void setSellingPlanName(String sellingPlanName) {
    this.sellingPlanName = sellingPlanName;
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
    return "SubscriptionLineInput{productVariantId='" + productVariantId + "', quantity='" + quantity + "', currentPrice='" + currentPrice + "', customAttributes='" + customAttributes + "', sellingPlanId='" + sellingPlanId + "', sellingPlanName='" + sellingPlanName + "', pricingPolicy='" + pricingPolicy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLineInput that = (SubscriptionLineInput) o;
    return Objects.equals(productVariantId, that.productVariantId) &&
        quantity == that.quantity &&
        Objects.equals(currentPrice, that.currentPrice) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(pricingPolicy, that.pricingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productVariantId, quantity, currentPrice, customAttributes, sellingPlanId, sellingPlanName, pricingPolicy);
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
    private int quantity;

    /**
     * The price of the product.
     */
    private String currentPrice;

    /**
     * The custom attributes for this subscription line.
     */
    private List<AttributeInput> customAttributes;

    /**
     * The selling plan for the subscription line.
     */
    private String sellingPlanId;

    /**
     * The selling plan name for the subscription line.
     *   
     * Defaults to using the selling plan's current name when not specified.
     */
    private String sellingPlanName;

    /**
     * Describes expected price changes of the subscription line over time.
     */
    private SubscriptionPricingPolicyInput pricingPolicy;

    public SubscriptionLineInput build() {
      SubscriptionLineInput result = new SubscriptionLineInput();
      result.productVariantId = this.productVariantId;
      result.quantity = this.quantity;
      result.currentPrice = this.currentPrice;
      result.customAttributes = this.customAttributes;
      result.sellingPlanId = this.sellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
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
    public Builder quantity(int quantity) {
      this.quantity = quantity;
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
     * The selling plan for the subscription line.
     */
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }

    /**
     * The selling plan name for the subscription line.
     *   
     * Defaults to using the selling plan's current name when not specified.
     */
    public Builder sellingPlanName(String sellingPlanName) {
      this.sellingPlanName = sellingPlanName;
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
