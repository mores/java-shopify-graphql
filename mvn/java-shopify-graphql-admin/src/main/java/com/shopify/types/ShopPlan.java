package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The billing plan of the shop.
 */
public class ShopPlan {
  /**
   * The name of the shop's billing plan.
   */
  private String displayName;

  /**
   * Whether the shop is a partner development shop for testing purposes.
   */
  private boolean partnerDevelopment;

  /**
   * Whether the shop has a Shopify Plus subscription.
   */
  private boolean shopifyPlus;

  public ShopPlan() {
  }

  /**
   * The name of the shop's billing plan.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Whether the shop is a partner development shop for testing purposes.
   */
  public boolean getPartnerDevelopment() {
    return partnerDevelopment;
  }

  public void setPartnerDevelopment(boolean partnerDevelopment) {
    this.partnerDevelopment = partnerDevelopment;
  }

  /**
   * Whether the shop has a Shopify Plus subscription.
   */
  public boolean getShopifyPlus() {
    return shopifyPlus;
  }

  public void setShopifyPlus(boolean shopifyPlus) {
    this.shopifyPlus = shopifyPlus;
  }

  @Override
  public String toString() {
    return "ShopPlan{displayName='" + displayName + "', partnerDevelopment='" + partnerDevelopment + "', shopifyPlus='" + shopifyPlus + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPlan that = (ShopPlan) o;
    return Objects.equals(displayName, that.displayName) &&
        partnerDevelopment == that.partnerDevelopment &&
        shopifyPlus == that.shopifyPlus;
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, partnerDevelopment, shopifyPlus);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the shop's billing plan.
     */
    private String displayName;

    /**
     * Whether the shop is a partner development shop for testing purposes.
     */
    private boolean partnerDevelopment;

    /**
     * Whether the shop has a Shopify Plus subscription.
     */
    private boolean shopifyPlus;

    public ShopPlan build() {
      ShopPlan result = new ShopPlan();
      result.displayName = this.displayName;
      result.partnerDevelopment = this.partnerDevelopment;
      result.shopifyPlus = this.shopifyPlus;
      return result;
    }

    /**
     * The name of the shop's billing plan.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Whether the shop is a partner development shop for testing purposes.
     */
    public Builder partnerDevelopment(boolean partnerDevelopment) {
      this.partnerDevelopment = partnerDevelopment;
      return this;
    }

    /**
     * Whether the shop has a Shopify Plus subscription.
     */
    public Builder shopifyPlus(boolean shopifyPlus) {
      this.shopifyPlus = shopifyPlus;
      return this;
    }
  }
}
