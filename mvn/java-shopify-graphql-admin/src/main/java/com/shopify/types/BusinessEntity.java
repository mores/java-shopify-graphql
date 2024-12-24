package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class BusinessEntity implements com.shopify.types.Node {
  
  private BusinessEntityAddress address;

  
  private String companyName;

  
  private String displayName;

  
  private String id;

  
  private boolean primary;

  
  private ShopifyPaymentsAccount shopifyPaymentsAccount;

  public BusinessEntity() {
  }

  
  public BusinessEntityAddress getAddress() {
    return address;
  }

  public void setAddress(BusinessEntityAddress address) {
    this.address = address;
  }

  
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  
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
    
    private BusinessEntityAddress address;

    
    private String companyName;

    
    private String displayName;

    
    private String id;

    
    private boolean primary;

    
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

    
    public Builder address(BusinessEntityAddress address) {
      this.address = address;
      return this;
    }

    
    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    
    public Builder shopifyPaymentsAccount(ShopifyPaymentsAccount shopifyPaymentsAccount) {
      this.shopifyPaymentsAccount = shopifyPaymentsAccount;
      return this;
    }
  }
}
