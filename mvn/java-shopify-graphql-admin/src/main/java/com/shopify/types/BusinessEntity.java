package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a merchant's Business Entity.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class BusinessEntity implements com.shopify.types.Node {
  /**
   * The address of the merchant's Business Entity.
   */
  private BusinessEntityAddress address;

  /**
   * The name of the company associated with the merchant's Business Entity.
   */
  private String companyName;

  /**
   * The display name of the merchant's Business Entity.
   */
  private String displayName;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether it's the merchant's primary Business Entity.
   */
  private boolean primary;

  /**
   * Shopify Payments account information, including balances and payouts.
   */
  private ShopifyPaymentsAccount shopifyPaymentsAccount;

  public BusinessEntity() {
  }

  /**
   * The address of the merchant's Business Entity.
   */
  public BusinessEntityAddress getAddress() {
    return address;
  }

  public void setAddress(BusinessEntityAddress address) {
    this.address = address;
  }

  /**
   * The name of the company associated with the merchant's Business Entity.
   */
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * The display name of the merchant's Business Entity.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether it's the merchant's primary Business Entity.
   */
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  /**
   * Shopify Payments account information, including balances and payouts.
   */
  public ShopifyPaymentsAccount getShopifyPaymentsAccount() {
    return shopifyPaymentsAccount;
  }

  public void setShopifyPaymentsAccount(ShopifyPaymentsAccount shopifyPaymentsAccount) {
    this.shopifyPaymentsAccount = shopifyPaymentsAccount;
  }

  @Override
  public String toString() {
    return "BusinessEntity{address='" + address + "', companyName='" + companyName + "', displayName='" + displayName + "', id='" + id + "', primary='" + primary + "', shopifyPaymentsAccount='" + shopifyPaymentsAccount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BusinessEntity that = (BusinessEntity) o;
    return Objects.equals(address, that.address) &&
        Objects.equals(companyName, that.companyName) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(id, that.id) &&
        primary == that.primary &&
        Objects.equals(shopifyPaymentsAccount, that.shopifyPaymentsAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, companyName, displayName, id, primary, shopifyPaymentsAccount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The address of the merchant's Business Entity.
     */
    private BusinessEntityAddress address;

    /**
     * The name of the company associated with the merchant's Business Entity.
     */
    private String companyName;

    /**
     * The display name of the merchant's Business Entity.
     */
    private String displayName;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether it's the merchant's primary Business Entity.
     */
    private boolean primary;

    /**
     * Shopify Payments account information, including balances and payouts.
     */
    private ShopifyPaymentsAccount shopifyPaymentsAccount;

    public BusinessEntity build() {
      BusinessEntity result = new BusinessEntity();
      result.address = this.address;
      result.companyName = this.companyName;
      result.displayName = this.displayName;
      result.id = this.id;
      result.primary = this.primary;
      result.shopifyPaymentsAccount = this.shopifyPaymentsAccount;
      return result;
    }

    /**
     * The address of the merchant's Business Entity.
     */
    public Builder address(BusinessEntityAddress address) {
      this.address = address;
      return this;
    }

    /**
     * The name of the company associated with the merchant's Business Entity.
     */
    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    /**
     * The display name of the merchant's Business Entity.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether it's the merchant's primary Business Entity.
     */
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    /**
     * Shopify Payments account information, including balances and payouts.
     */
    public Builder shopifyPaymentsAccount(ShopifyPaymentsAccount shopifyPaymentsAccount) {
      this.shopifyPaymentsAccount = shopifyPaymentsAccount;
      return this;
    }
  }
}
