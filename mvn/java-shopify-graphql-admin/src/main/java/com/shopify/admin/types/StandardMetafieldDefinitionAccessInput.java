package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the access settings for the metafields under the standard definition.
 */
public class StandardMetafieldDefinitionAccessInput {
  /**
   * The Admin API access setting to use for the metafields under this definition.
   */
  private MetafieldAdminAccessInput admin;

  /**
   * The Storefront API access setting to use for the metafields under this definition.
   */
  private MetafieldStorefrontAccessInput storefront;

  /**
   * The Customer Account API access setting to use for the metafields under this definition.
   */
  private MetafieldCustomerAccountAccessInput customerAccount;

  public StandardMetafieldDefinitionAccessInput() {
  }

  /**
   * The Admin API access setting to use for the metafields under this definition.
   */
  public MetafieldAdminAccessInput getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccessInput admin) {
    this.admin = admin;
  }

  /**
   * The Storefront API access setting to use for the metafields under this definition.
   */
  public MetafieldStorefrontAccessInput getStorefront() {
    return storefront;
  }

  public void setStorefront(MetafieldStorefrontAccessInput storefront) {
    this.storefront = storefront;
  }

  /**
   * The Customer Account API access setting to use for the metafields under this definition.
   */
  public MetafieldCustomerAccountAccessInput getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
    this.customerAccount = customerAccount;
  }

  @Override
  public String toString() {
    return "StandardMetafieldDefinitionAccessInput{admin='" + admin + "', storefront='" + storefront + "', customerAccount='" + customerAccount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StandardMetafieldDefinitionAccessInput that = (StandardMetafieldDefinitionAccessInput) o;
    return Objects.equals(admin, that.admin) &&
        Objects.equals(storefront, that.storefront) &&
        Objects.equals(customerAccount, that.customerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, storefront, customerAccount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Admin API access setting to use for the metafields under this definition.
     */
    private MetafieldAdminAccessInput admin;

    /**
     * The Storefront API access setting to use for the metafields under this definition.
     */
    private MetafieldStorefrontAccessInput storefront;

    /**
     * The Customer Account API access setting to use for the metafields under this definition.
     */
    private MetafieldCustomerAccountAccessInput customerAccount;

    public StandardMetafieldDefinitionAccessInput build() {
      StandardMetafieldDefinitionAccessInput result = new StandardMetafieldDefinitionAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      result.customerAccount = this.customerAccount;
      return result;
    }

    /**
     * The Admin API access setting to use for the metafields under this definition.
     */
    public Builder admin(MetafieldAdminAccessInput admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The Storefront API access setting to use for the metafields under this definition.
     */
    public Builder storefront(MetafieldStorefrontAccessInput storefront) {
      this.storefront = storefront;
      return this;
    }

    /**
     * The Customer Account API access setting to use for the metafields under this definition.
     */
    public Builder customerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }
  }
}
