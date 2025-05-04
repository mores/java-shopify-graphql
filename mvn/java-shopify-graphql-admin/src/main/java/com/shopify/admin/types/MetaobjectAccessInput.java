package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that set access permissions for the definition's metaobjects.
 */
public class MetaobjectAccessInput {
  /**
   * The access permitted on the Admin API.
   */
  private MetaobjectAdminAccessInput admin;

  /**
   * The access permitted on the Storefront API.
   */
  private MetaobjectStorefrontAccess storefront;

  public MetaobjectAccessInput() {
  }

  /**
   * The access permitted on the Admin API.
   */
  public MetaobjectAdminAccessInput getAdmin() {
    return admin;
  }

  public void setAdmin(MetaobjectAdminAccessInput admin) {
    this.admin = admin;
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
    return "MetaobjectAccessInput{admin='" + admin + "', storefront='" + storefront + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectAccessInput that = (MetaobjectAccessInput) o;
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
     * The access permitted on the Admin API.
     */
    private MetaobjectAdminAccessInput admin;

    /**
     * The access permitted on the Storefront API.
     */
    private MetaobjectStorefrontAccess storefront;

    public MetaobjectAccessInput build() {
      MetaobjectAccessInput result = new MetaobjectAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      return result;
    }

    /**
     * The access permitted on the Admin API.
     */
    public Builder admin(MetaobjectAdminAccessInput admin) {
      this.admin = admin;
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
