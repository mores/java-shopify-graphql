package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides metaobject definition's access configuration.
 */
public class MetaobjectAccess {
  /**
   * Access configuration for Admin API surface areas, including the GraphQL Admin API.
   */
  private MetaobjectAdminAccess admin;

  /**
   * Access configuration for Storefront surface areas, including the GraphQL Storefront API and Liquid.
   */
  private MetaobjectStorefrontAccess storefront;

  public MetaobjectAccess() {
  }

  /**
   * Access configuration for Admin API surface areas, including the GraphQL Admin API.
   */
  public MetaobjectAdminAccess getAdmin() {
    return admin;
  }

  public void setAdmin(MetaobjectAdminAccess admin) {
    this.admin = admin;
  }

  /**
   * Access configuration for Storefront surface areas, including the GraphQL Storefront API and Liquid.
   */
  public MetaobjectStorefrontAccess getStorefront() {
    return storefront;
  }

  public void setStorefront(MetaobjectStorefrontAccess storefront) {
    this.storefront = storefront;
  }

  @Override
  public String toString() {
    return "MetaobjectAccess{admin='" + admin + "', storefront='" + storefront + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectAccess that = (MetaobjectAccess) o;
    return Objects.equals(admin, that.admin) &&
        Objects.equals(storefront, that.storefront);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, storefront);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Access configuration for Admin API surface areas, including the GraphQL Admin API.
     */
    private MetaobjectAdminAccess admin;

    /**
     * Access configuration for Storefront surface areas, including the GraphQL Storefront API and Liquid.
     */
    private MetaobjectStorefrontAccess storefront;

    public MetaobjectAccess build() {
      MetaobjectAccess result = new MetaobjectAccess();
      result.admin = this.admin;
      result.storefront = this.storefront;
      return result;
    }

    /**
     * Access configuration for Admin API surface areas, including the GraphQL Admin API.
     */
    public Builder admin(MetaobjectAdminAccess admin) {
      this.admin = admin;
      return this;
    }

    /**
     * Access configuration for Storefront surface areas, including the GraphQL Storefront API and Liquid.
     */
    public Builder storefront(MetaobjectStorefrontAccess storefront) {
      this.storefront = storefront;
      return this;
    }
  }
}
