package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for obtaining the buyer's identity.
 */
public class BuyerInput {
  /**
   * The customer access token retrieved from the [Customer Accounts
   * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
   */
  private String customerAccessToken;

  /**
   * The identifier of the company location.
   */
  private String companyLocationId;

  public BuyerInput() {
  }

  /**
   * The customer access token retrieved from the [Customer Accounts
   * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
   */
  public String getCustomerAccessToken() {
    return customerAccessToken;
  }

  public void setCustomerAccessToken(String customerAccessToken) {
    this.customerAccessToken = customerAccessToken;
  }

  /**
   * The identifier of the company location.
   */
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  @Override
  public String toString() {
    return "BuyerInput{customerAccessToken='" + customerAccessToken + "', companyLocationId='" + companyLocationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BuyerInput that = (BuyerInput) o;
    return Objects.equals(customerAccessToken, that.customerAccessToken) &&
        Objects.equals(companyLocationId, that.companyLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerAccessToken, companyLocationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer access token retrieved from the [Customer Accounts
     * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
     */
    private String customerAccessToken;

    /**
     * The identifier of the company location.
     */
    private String companyLocationId;

    public BuyerInput build() {
      BuyerInput result = new BuyerInput();
      result.customerAccessToken = this.customerAccessToken;
      result.companyLocationId = this.companyLocationId;
      return result;
    }

    /**
     * The customer access token retrieved from the [Customer Accounts
     * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      return this;
    }

    /**
     * The identifier of the company location.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }
  }
}
