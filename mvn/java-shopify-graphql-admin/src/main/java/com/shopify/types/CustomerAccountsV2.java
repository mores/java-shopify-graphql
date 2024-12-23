package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Information about the shop's customer accounts.
 */
public class CustomerAccountsV2 {
  /**
   * Indicates which version of customer accounts the merchant is using in online store and checkout.
   */
  private CustomerAccountsVersion customerAccountsVersion;

  /**
   * Login links are shown in online store and checkout.
   */
  private boolean loginLinksVisibleOnStorefrontAndCheckout;

  /**
   * Customers are required to log in to their account before checkout.
   */
  private boolean loginRequiredAtCheckout;

  /**
   * The root url for the customer accounts pages.
   */
  private String url;

  public CustomerAccountsV2() {
  }

  /**
   * Indicates which version of customer accounts the merchant is using in online store and checkout.
   */
  public CustomerAccountsVersion getCustomerAccountsVersion() {
    return customerAccountsVersion;
  }

  public void setCustomerAccountsVersion(CustomerAccountsVersion customerAccountsVersion) {
    this.customerAccountsVersion = customerAccountsVersion;
  }

  /**
   * Login links are shown in online store and checkout.
   */
  public boolean getLoginLinksVisibleOnStorefrontAndCheckout() {
    return loginLinksVisibleOnStorefrontAndCheckout;
  }

  public void setLoginLinksVisibleOnStorefrontAndCheckout(
      boolean loginLinksVisibleOnStorefrontAndCheckout) {
    this.loginLinksVisibleOnStorefrontAndCheckout = loginLinksVisibleOnStorefrontAndCheckout;
  }

  /**
   * Customers are required to log in to their account before checkout.
   */
  public boolean getLoginRequiredAtCheckout() {
    return loginRequiredAtCheckout;
  }

  public void setLoginRequiredAtCheckout(boolean loginRequiredAtCheckout) {
    this.loginRequiredAtCheckout = loginRequiredAtCheckout;
  }

  /**
   * The root url for the customer accounts pages.
   */
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
    /**
     * Indicates which version of customer accounts the merchant is using in online store and checkout.
     */
    private CustomerAccountsVersion customerAccountsVersion;

    /**
     * Login links are shown in online store and checkout.
     */
    private boolean loginLinksVisibleOnStorefrontAndCheckout;

    /**
     * Customers are required to log in to their account before checkout.
     */
    private boolean loginRequiredAtCheckout;

    /**
     * The root url for the customer accounts pages.
     */
    private String url;

    public CustomerAccountsV2 build() {
      CustomerAccountsV2 result = new CustomerAccountsV2();
      result.customerAccountsVersion = this.customerAccountsVersion;
      result.loginLinksVisibleOnStorefrontAndCheckout = this.loginLinksVisibleOnStorefrontAndCheckout;
      result.loginRequiredAtCheckout = this.loginRequiredAtCheckout;
      result.url = this.url;
      return result;
    }

    /**
     * Indicates which version of customer accounts the merchant is using in online store and checkout.
     */
    public Builder customerAccountsVersion(CustomerAccountsVersion customerAccountsVersion) {
      this.customerAccountsVersion = customerAccountsVersion;
      return this;
    }

    /**
     * Login links are shown in online store and checkout.
     */
    public Builder loginLinksVisibleOnStorefrontAndCheckout(
        boolean loginLinksVisibleOnStorefrontAndCheckout) {
      this.loginLinksVisibleOnStorefrontAndCheckout = loginLinksVisibleOnStorefrontAndCheckout;
      return this;
    }

    /**
     * Customers are required to log in to their account before checkout.
     */
    public Builder loginRequiredAtCheckout(boolean loginRequiredAtCheckout) {
      this.loginRequiredAtCheckout = loginRequiredAtCheckout;
      return this;
    }

    /**
     * The root url for the customer accounts pages.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
