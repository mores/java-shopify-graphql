package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the buyers who can use this discount.
 */
public class DiscountContextInput {
  /**
   * All buyers are eligible for this discount.
   */
  private DiscountBuyerSelection all;

  /**
   * The list of customer IDs to add or remove from the list of customers.
   */
  private DiscountCustomersInput customers;

  /**
   * The list of customer segment IDs to add or remove from the list of customer segments.
   */
  private DiscountCustomerSegmentsInput customerSegments;

  /**
   * The list of market IDs to add or remove from the list of markets.
   */
  private DiscountMarketsInput markets;

  public DiscountContextInput() {
  }

  /**
   * All buyers are eligible for this discount.
   */
  public DiscountBuyerSelection getAll() {
    return all;
  }

  public void setAll(DiscountBuyerSelection all) {
    this.all = all;
  }

  /**
   * The list of customer IDs to add or remove from the list of customers.
   */
  public DiscountCustomersInput getCustomers() {
    return customers;
  }

  public void setCustomers(DiscountCustomersInput customers) {
    this.customers = customers;
  }

  /**
   * The list of customer segment IDs to add or remove from the list of customer segments.
   */
  public DiscountCustomerSegmentsInput getCustomerSegments() {
    return customerSegments;
  }

  public void setCustomerSegments(DiscountCustomerSegmentsInput customerSegments) {
    this.customerSegments = customerSegments;
  }

  /**
   * The list of market IDs to add or remove from the list of markets.
   */
  public DiscountMarketsInput getMarkets() {
    return markets;
  }

  public void setMarkets(DiscountMarketsInput markets) {
    this.markets = markets;
  }

  @Override
  public String toString() {
    return "DiscountContextInput{all='" + all + "', customers='" + customers + "', customerSegments='" + customerSegments + "', markets='" + markets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountContextInput that = (DiscountContextInput) o;
    return Objects.equals(all, that.all) &&
        Objects.equals(customers, that.customers) &&
        Objects.equals(customerSegments, that.customerSegments) &&
        Objects.equals(markets, that.markets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, customers, customerSegments, markets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * All buyers are eligible for this discount.
     */
    private DiscountBuyerSelection all;

    /**
     * The list of customer IDs to add or remove from the list of customers.
     */
    private DiscountCustomersInput customers;

    /**
     * The list of customer segment IDs to add or remove from the list of customer segments.
     */
    private DiscountCustomerSegmentsInput customerSegments;

    /**
     * The list of market IDs to add or remove from the list of markets.
     */
    private DiscountMarketsInput markets;

    public DiscountContextInput build() {
      DiscountContextInput result = new DiscountContextInput();
      result.all = this.all;
      result.customers = this.customers;
      result.customerSegments = this.customerSegments;
      result.markets = this.markets;
      return result;
    }

    /**
     * All buyers are eligible for this discount.
     */
    public Builder all(DiscountBuyerSelection all) {
      this.all = all;
      return this;
    }

    /**
     * The list of customer IDs to add or remove from the list of customers.
     */
    public Builder customers(DiscountCustomersInput customers) {
      this.customers = customers;
      return this;
    }

    /**
     * The list of customer segment IDs to add or remove from the list of customer segments.
     */
    public Builder customerSegments(DiscountCustomerSegmentsInput customerSegments) {
      this.customerSegments = customerSegments;
      return this;
    }

    /**
     * The list of market IDs to add or remove from the list of markets.
     */
    public Builder markets(DiscountMarketsInput markets) {
      this.markets = markets;
      return this;
    }
  }
}
