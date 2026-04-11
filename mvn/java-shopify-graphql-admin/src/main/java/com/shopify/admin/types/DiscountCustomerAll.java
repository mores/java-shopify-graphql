package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Creates the broadest possible discount reach by targeting all customers,
 * regardless of their purchase history or segment membership. This gives merchants
 * maximum flexibility to run store-wide promotions without worrying about customer
 * eligibility restrictions.
 *
 * For example, a flash sale or grand opening promotion would target all customers
 * to maximize participation and store visibility.
 *
 * Learn more about [customer targeting](https://help.shopify.com/manual/discounts/).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCustomerAll implements DiscountCustomerSelection {
  /**
   * Whether the discount can be applied by all customers. This value is always `true`.
   */
  private boolean allCustomers;

  public DiscountCustomerAll() {
  }

  /**
   * Whether the discount can be applied by all customers. This value is always `true`.
   */
  public boolean getAllCustomers() {
    return allCustomers;
  }

  public void setAllCustomers(boolean allCustomers) {
    this.allCustomers = allCustomers;
  }

  @Override
  public String toString() {
    return "DiscountCustomerAll{allCustomers='" + allCustomers + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerAll that = (DiscountCustomerAll) o;
    return allCustomers == that.allCustomers;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCustomers);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the discount can be applied by all customers. This value is always `true`.
     */
    private boolean allCustomers;

    public DiscountCustomerAll build() {
      DiscountCustomerAll result = new DiscountCustomerAll();
      result.allCustomers = this.allCustomers;
      return result;
    }

    /**
     * Whether the discount can be applied by all customers. This value is always `true`.
     */
    public Builder allCustomers(boolean allCustomers) {
      this.allCustomers = allCustomers;
      return this;
    }
  }
}
