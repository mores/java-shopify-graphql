package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Access permissions for the definition's metaobjects.
 */
public class MetaobjectAccess {
  /**
   * The access permitted on the Admin API.
   */
  private MetaobjectAdminAccess admin;

  /**
   * The access permitted on the Customer Account API.
   */
  private MetaobjectCustomerAccountAccess customerAccount;

  /**
   * The access permitted on the Storefront API.
   */
  private MetaobjectStorefrontAccess storefront;

  public MetaobjectAccess() {
  }

  /**
   * The access permitted on the Admin API.
   */
  public MetaobjectAdminAccess getAdmin() {
    return admin;
  }

  public void setAdmin(MetaobjectAdminAccess admin) {
    this.admin = admin;
  }

  /**
   * The access permitted on the Customer Account API.
   */
  public MetaobjectCustomerAccountAccess getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(MetaobjectCustomerAccountAccess customerAccount) {
    this.customerAccount = customerAccount;
  }

  /**
   * The access permitted on the Storefront API.
   */
  public MetaobjectStorefrontAccess getStorefront() {
    return storefront;
  }

  public void setStorefront(MetaobjectStorefrontAccess storefront) {
    this.storefront = storefront;
  }

  @Override
  public String toString() {
    return "MetaobjectAccess{admin='" + admin + "', customerAccount='" + customerAccount + "', storefront='" + storefront + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectAccess that = (MetaobjectAccess) o;
    return Objects.equals(admin, that.admin) &&
        Objects.equals(customerAccount, that.customerAccount) &&
        Objects.equals(storefront, that.storefront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, customerAccount, storefront);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The access permitted on the Admin API.
     */
    private MetaobjectAdminAccess admin;

    /**
     * The access permitted on the Customer Account API.
     */
    private MetaobjectCustomerAccountAccess customerAccount;

    /**
     * The access permitted on the Storefront API.
     */
    private MetaobjectStorefrontAccess storefront;

    public MetaobjectAccess build() {
      MetaobjectAccess result = new MetaobjectAccess();
      result.admin = this.admin;
      result.customerAccount = this.customerAccount;
      result.storefront = this.storefront;
      return result;
    }

    /**
     * The access permitted on the Admin API.
     */
    public Builder admin(MetaobjectAdminAccess admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The access permitted on the Customer Account API.
     */
    public Builder customerAccount(MetaobjectCustomerAccountAccess customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }

    /**
     * The access permitted on the Storefront API.
     */
    public Builder storefront(MetaobjectStorefrontAccess storefront) {
      this.storefront = storefront;
      return this;
    }
  }
}
