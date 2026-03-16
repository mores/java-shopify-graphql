package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Defines customer targeting for discounts through specific individual customers.
 * This object allows merchants to create exclusive discounts that are only
 * available to explicitly selected customers.
 *
 * For example, a VIP customer appreciation discount might target specific
 * high-value customers by individually selecting them, or a beta program discount
 * could be offered to selected early adopters.
 *
 * Use `DiscountCustomers` to:
 * - Target specific individual customers for exclusive promotions
 * - Create personalized discount experiences for selected customers
 * - Offer special discounts to VIP or loyal customers
 * - Provide exclusive access to promotions for specific individuals
 *
 * This targeting method requires you to add each customer who should be eligible
 * for the discount. For broader targeting based on customer attributes or segments, use [`DiscountCustomerSegments`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCustomerSegments) instead.
 *
 * Learn more about creating customer-specific discounts using [`discountCodeBasicCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeBasicCreate) and [`discountCodeBasicUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeBasicUpdate).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCustomers implements DiscountContext, DiscountCustomerSelection {
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
