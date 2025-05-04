package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A list of individual customers eligible for the discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCustomers implements DiscountCustomerSelection {
  /**
   * The list of individual customers eligible for the discount.
   */
  private List<Customer> customers;

  public DiscountCustomers() {
  }

  /**
   * The list of individual customers eligible for the discount.
   */
  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }

  @Override
  public String toString() {
    return "DiscountCustomers{customers='" + customers + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomers that = (DiscountCustomers) o;
    return Objects.equals(customers, that.customers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customers);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of individual customers eligible for the discount.
     */
    private List<Customer> customers;

    public DiscountCustomers build() {
      DiscountCustomers result = new DiscountCustomers();
      result.customers = this.customers;
      return result;
    }

    /**
     * The list of individual customers eligible for the discount.
     */
    public Builder customers(List<Customer> customers) {
      this.customers = customers;
      return this;
    }
  }
}
