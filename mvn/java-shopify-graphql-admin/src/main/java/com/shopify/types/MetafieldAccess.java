package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The access settings for this metafield definition.
 */
public class MetafieldAccess {
  /**
   * The default admin access setting used for the metafields under this definition.
   */
  private MetafieldAdminAccess admin;

  /**
   * The customer account access setting used for the metafields under this definition.
   */
  private MetafieldCustomerAccountAccess customerAccount;

  /**
   * The explicit grants for this metafield definition, superseding the default admin access
   * for the specified grantees.
   */
  private List<MetafieldAccessGrant> grants;

  /**
   * The storefront access setting used for the metafields under this definition.
   */
  private MetafieldStorefrontAccess storefront;

  public MetafieldAccess() {
  }

  /**
   * The default admin access setting used for the metafields under this definition.
   */
  public MetafieldAdminAccess getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccess admin) {
    this.admin = admin;
  }

  /**
   * The customer account access setting used for the metafields under this definition.
   */
  public MetafieldCustomerAccountAccess getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(MetafieldCustomerAccountAccess customerAccount) {
    this.customerAccount = customerAccount;
  }

  /**
   * The explicit grants for this metafield definition, superseding the default admin access
   * for the specified grantees.
   */
  public List<MetafieldAccessGrant> getGrants() {
    return grants;
  }

  public void setGrants(List<MetafieldAccessGrant> grants) {
    this.grants = grants;
  }

  /**
   * The storefront access setting used for the metafields under this definition.
   */
  public MetafieldStorefrontAccess getStorefront() {
    return storefront;
  }

  public void setStorefront(MetafieldStorefrontAccess storefront) {
    this.storefront = storefront;
  }

  @Override
  public String toString() {
    return "MetafieldAccess{admin='" + admin + "', customerAccount='" + customerAccount + "', grants='" + grants + "', storefront='" + storefront + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldAccess that = (MetafieldAccess) o;
    return Objects.equals(admin, that.admin) &&
        Objects.equals(customerAccount, that.customerAccount) &&
        Objects.equals(grants, that.grants) &&
        Objects.equals(storefront, that.storefront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, customerAccount, grants, storefront);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The default admin access setting used for the metafields under this definition.
     */
    private MetafieldAdminAccess admin;

    /**
     * The customer account access setting used for the metafields under this definition.
     */
    private MetafieldCustomerAccountAccess customerAccount;

    /**
     * The explicit grants for this metafield definition, superseding the default admin access
     * for the specified grantees.
     */
    private List<MetafieldAccessGrant> grants;

    /**
     * The storefront access setting used for the metafields under this definition.
     */
    private MetafieldStorefrontAccess storefront;

    public MetafieldAccess build() {
      MetafieldAccess result = new MetafieldAccess();
      result.admin = this.admin;
      result.customerAccount = this.customerAccount;
      result.grants = this.grants;
      result.storefront = this.storefront;
      return result;
    }

    /**
     * The default admin access setting used for the metafields under this definition.
     */
    public Builder admin(MetafieldAdminAccess admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The customer account access setting used for the metafields under this definition.
     */
    public Builder customerAccount(MetafieldCustomerAccountAccess customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }

    /**
     * The explicit grants for this metafield definition, superseding the default admin access
     * for the specified grantees.
     */
    public Builder grants(List<MetafieldAccessGrant> grants) {
      this.grants = grants;
      return this;
    }

    /**
     * The storefront access setting used for the metafields under this definition.
     */
    public Builder storefront(MetafieldStorefrontAccess storefront) {
      this.storefront = storefront;
      return this;
    }
  }
}
