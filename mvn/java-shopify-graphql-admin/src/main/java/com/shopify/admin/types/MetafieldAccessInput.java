package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that set access permissions for the definition's metafields.
 */
public class MetafieldAccessInput {
  /**
   * The access permitted on the Admin API.
   */
  private MetafieldAdminAccessInput admin;

  /**
   * The access permitted on the Storefront API.
   */
  private MetafieldStorefrontAccessInput storefront;

  /**
   * The access permitted on the Customer Account API.
   */
  private MetafieldCustomerAccountAccessInput customerAccount;

  public MetafieldAccessInput() {
  }

  /**
   * The access permitted on the Admin API.
   */
  public MetafieldAdminAccessInput getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccessInput admin) {
    this.admin = admin;
  }

  /**
   * The access permitted on the Storefront API.
   */
  public MetafieldStorefrontAccessInput getStorefront() {
    return storefront;
  }

  public void setStorefront(MetafieldStorefrontAccessInput storefront) {
    this.storefront = storefront;
  }

  /**
   * The access permitted on the Customer Account API.
   */
  public MetafieldCustomerAccountAccessInput getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
    this.customerAccount = customerAccount;
  }

  @Override
  public String toString() {
    return "MetafieldAccessInput{admin='" + admin + "', storefront='" + storefront + "', customerAccount='" + customerAccount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccessInput that = (MetafieldAccessInput) o;
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
     * The access permitted on the Admin API.
     */
    private MetafieldAdminAccessInput admin;

    /**
     * The access permitted on the Storefront API.
     */
    private MetafieldStorefrontAccessInput storefront;

    /**
     * The access permitted on the Customer Account API.
     */
    private MetafieldCustomerAccountAccessInput customerAccount;

    public MetafieldAccessInput build() {
      MetafieldAccessInput result = new MetafieldAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      result.customerAccount = this.customerAccount;
      return result;
    }

    /**
     * The access permitted on the Admin API.
     */
    public Builder admin(MetafieldAdminAccessInput admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The access permitted on the Storefront API.
     */
    public Builder storefront(MetafieldStorefrontAccessInput storefront) {
      this.storefront = storefront;
      return this;
    }

    /**
     * The access permitted on the Customer Account API.
     */
    public Builder customerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }
  }
}
