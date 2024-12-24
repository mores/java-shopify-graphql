package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CustomerAccountsV2 {
  
  private CustomerAccountsVersion customerAccountsVersion;

  
  private boolean loginLinksVisibleOnStorefrontAndCheckout;

  
  private boolean loginRequiredAtCheckout;

  
  private String url;

  public CustomerAccountsV2() {
  }

  
  public CustomerAccountsVersion getCustomerAccountsVersion() {
    return customerAccountsVersion;
  }

  public void setCustomerAccountsVersion(CustomerAccountsVersion customerAccountsVersion) {
    this.customerAccountsVersion = customerAccountsVersion;
  }

  
  public boolean getLoginLinksVisibleOnStorefrontAndCheckout() {
    return loginLinksVisibleOnStorefrontAndCheckout;
  }

  public void setLoginLinksVisibleOnStorefrontAndCheckout(
      boolean loginLinksVisibleOnStorefrontAndCheckout) {
    this.loginLinksVisibleOnStorefrontAndCheckout = loginLinksVisibleOnStorefrontAndCheckout;
  }

  
  public boolean getLoginRequiredAtCheckout() {
    return loginRequiredAtCheckout;
  }

  public void setLoginRequiredAtCheckout(boolean loginRequiredAtCheckout) {
    this.loginRequiredAtCheckout = loginRequiredAtCheckout;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "CustomerAccountsV2{customerAccountsVersion='" + customerAccountsVersion + "', loginLinksVisibleOnStorefrontAndCheckout='" + loginLinksVisibleOnStorefrontAndCheckout + "', loginRequiredAtCheckout='" + loginRequiredAtCheckout + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccountsV2 that = (CustomerAccountsV2) o;
    return Objects.equals(customerAccountsVersion, that.customerAccountsVersion) &&
        loginLinksVisibleOnStorefrontAndCheckout == that.loginLinksVisibleOnStorefrontAndCheckout &&
        loginRequiredAtCheckout == that.loginRequiredAtCheckout &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAccountsVersion, loginLinksVisibleOnStorefrontAndCheckout, loginRequiredAtCheckout, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CustomerAccountsVersion customerAccountsVersion;

    
    private boolean loginLinksVisibleOnStorefrontAndCheckout;

    
    private boolean loginRequiredAtCheckout;

    
    private String url;

    public CustomerAccountsV2 build() {
      CustomerAccountsV2 result = new CustomerAccountsV2();
      result.customerAccountsVersion = this.customerAccountsVersion;
      result.loginLinksVisibleOnStorefrontAndCheckout = this.loginLinksVisibleOnStorefrontAndCheckout;
      result.loginRequiredAtCheckout = this.loginRequiredAtCheckout;
      result.url = this.url;
      return result;
    }

    
    public Builder customerAccountsVersion(CustomerAccountsVersion customerAccountsVersion) {
      this.customerAccountsVersion = customerAccountsVersion;
      return this;
    }

    
    public Builder loginLinksVisibleOnStorefrontAndCheckout(
        boolean loginLinksVisibleOnStorefrontAndCheckout) {
      this.loginLinksVisibleOnStorefrontAndCheckout = loginLinksVisibleOnStorefrontAndCheckout;
      return this;
    }

    
    public Builder loginRequiredAtCheckout(boolean loginRequiredAtCheckout) {
      this.loginRequiredAtCheckout = loginRequiredAtCheckout;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
