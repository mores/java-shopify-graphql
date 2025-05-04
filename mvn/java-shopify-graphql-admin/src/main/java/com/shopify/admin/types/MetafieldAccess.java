package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Access permissions for the definition's metafields.
 */
public class MetafieldAccess {
  /**
   * The access permitted on the Admin API.
   */
  private MetafieldAdminAccess admin;

  /**
   * The access permitted on the Customer Account API.
   */
  private MetafieldCustomerAccountAccess customerAccount;

  /**
   * The explicit grants for this metafield definition, superseding the default admin access
   * for the specified grantees.
   */
  private List<MetafieldAccessGrant> grants;

  /**
   * The access permitted on the Storefront API.
   */
  private MetafieldStorefrontAccess storefront;

  public MetafieldAccess() {
  }

  /**
   * The access permitted on the Admin API.
   */
  public MetafieldAdminAccess getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccess admin) {
    this.admin = admin;
  }

  /**
   * The access permitted on the Customer Account API.
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
   * The access permitted on the Storefront API.
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
     * The access permitted on the Admin API.
     */
    private MetafieldAdminAccess admin;

    /**
     * The access permitted on the Customer Account API.
     */
    private MetafieldCustomerAccountAccess customerAccount;

    /**
     * The explicit grants for this metafield definition, superseding the default admin access
     * for the specified grantees.
     */
    private List<MetafieldAccessGrant> grants;

    /**
     * The access permitted on the Storefront API.
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
     * The access permitted on the Admin API.
     */
    public Builder admin(MetafieldAdminAccess admin) {
      this.admin = admin;
      return this;
    }

    /**
     * The access permitted on the Customer Account API.
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
     * The access permitted on the Storefront API.
     */
    public Builder storefront(MetafieldStorefrontAccess storefront) {
      this.storefront = storefront;
      return this;
    }
  }
}
