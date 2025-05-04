package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the customers who can use this discount.
 */
public class DiscountCustomerSelectionInput {
  /**
   * Whether all customers can use this discount.
   */
  private Boolean all;

  /**
   * The list of customer IDs to add or remove from the list of customers.
   */
  private DiscountCustomersInput customers;

  /**
   * The list of customer segment IDs to add or remove from the list of customer segments.
   */
  private DiscountCustomerSegmentsInput customerSegments;

  public DiscountCustomerSelectionInput() {
  }

  /**
   * Whether all customers can use this discount.
   */
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
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

  @Override
  public String toString() {
    return "DiscountCustomerSelectionInput{all='" + all + "', customers='" + customers + "', customerSegments='" + customerSegments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerSelectionInput that = (DiscountCustomerSelectionInput) o;
    return Objects.equals(all, that.all) &&
        Objects.equals(customers, that.customers) &&
        Objects.equals(customerSegments, that.customerSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, customers, customerSegments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether all customers can use this discount.
     */
    private Boolean all;

    /**
     * The list of customer IDs to add or remove from the list of customers.
     */
    private DiscountCustomersInput customers;

    /**
     * The list of customer segment IDs to add or remove from the list of customer segments.
     */
    private DiscountCustomerSegmentsInput customerSegments;

    public DiscountCustomerSelectionInput build() {
      DiscountCustomerSelectionInput result = new DiscountCustomerSelectionInput();
      result.all = this.all;
      result.customers = this.customers;
      result.customerSegments = this.customerSegments;
      return result;
    }

    /**
     * Whether all customers can use this discount.
     */
    public Builder all(Boolean all) {
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
  }
}
