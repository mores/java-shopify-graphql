package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for obtaining the buyer's identity.
 */
public class BuyerInput {
  /**
   * The identifier of the company location.
   */
  private String companyLocationId;

  /**
   * The customer access token retrieved from the [Customer Accounts
   * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
   */
  private String customerAccessToken;

  public BuyerInput() {
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

  @Override
  public String toString() {
    return "BuyerInput{companyLocationId='" + companyLocationId + "', customerAccessToken='" + customerAccessToken + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BuyerInput that = (BuyerInput) o;
    return Objects.equals(companyLocationId, that.companyLocationId) &&
        Objects.equals(customerAccessToken, that.customerAccessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationId, customerAccessToken);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The identifier of the company location.
     */
    private String companyLocationId;

    /**
     * The customer access token retrieved from the [Customer Accounts
     * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
     */
    private String customerAccessToken;

    public BuyerInput build() {
      BuyerInput result = new BuyerInput();
      result.companyLocationId = this.companyLocationId;
      result.customerAccessToken = this.customerAccessToken;
      return result;
    }

    /**
     * The identifier of the company location.
     */
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }

    /**
     * The customer access token retrieved from the [Customer Accounts
     * API](https://shopify.dev/docs/api/customer#step-obtain-access-token).
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      return this;
    }
  }
}
