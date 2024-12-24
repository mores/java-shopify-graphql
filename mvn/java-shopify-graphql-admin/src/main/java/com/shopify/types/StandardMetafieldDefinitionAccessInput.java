package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class StandardMetafieldDefinitionAccessInput {
  
  private MetafieldAdminAccessInput admin;

  
  private MetafieldStorefrontAccessInput storefront;

  
  private MetafieldCustomerAccountAccessInput customerAccount;

  public StandardMetafieldDefinitionAccessInput() {
  }

  
  public MetafieldAdminAccessInput getAdmin() {
    return admin;
  }

  public void setAdmin(MetafieldAdminAccessInput admin) {
    this.admin = admin;
  }

  
  public MetafieldStorefrontAccessInput getStorefront() {
    return storefront;
  }

  public void setStorefront(MetafieldStorefrontAccessInput storefront) {
    this.storefront = storefront;
  }

  
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
    
    private MetafieldAdminAccessInput admin;

    
    private MetafieldStorefrontAccessInput storefront;

    
    private MetafieldCustomerAccountAccessInput customerAccount;

    public StandardMetafieldDefinitionAccessInput build() {
      StandardMetafieldDefinitionAccessInput result = new StandardMetafieldDefinitionAccessInput();
      result.admin = this.admin;
      result.storefront = this.storefront;
      result.customerAccount = this.customerAccount;
      return result;
    }

    
    public Builder admin(MetafieldAdminAccessInput admin) {
      this.admin = admin;
      return this;
    }

    
    public Builder storefront(MetafieldStorefrontAccessInput storefront) {
      this.storefront = storefront;
      return this;
    }

    
    public Builder customerAccount(MetafieldCustomerAccountAccessInput customerAccount) {
      this.customerAccount = customerAccount;
      return this;
    }
  }
}
