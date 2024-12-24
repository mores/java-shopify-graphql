package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetaobjectAccessInput {
  
  private MetaobjectAdminAccess admin;

  
  private MetaobjectStorefrontAccess storefront;

  public MetaobjectAccessInput() {
  }

  
  public MetaobjectAdminAccess getAdmin() {
    return admin;
  }

  public void setAdmin(MetaobjectAdminAccess admin) {
    this.admin = admin;
  }

  
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
    
    private MetaobjectAdminAccess admin;

    
    private MetaobjectStorefrontAccess storefront;

    public MetaobjectAccessInput build() {
      MetaobjectAccessInput result = new MetaobjectAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      return result;
    }

    
    public Builder admin(MetaobjectAdminAccess admin) {
      this.admin = admin;
      return this;
    }

    
    public Builder storefront(MetaobjectStorefrontAccess storefront) {
      this.storefront = storefront;
      return this;
    }
  }
}
