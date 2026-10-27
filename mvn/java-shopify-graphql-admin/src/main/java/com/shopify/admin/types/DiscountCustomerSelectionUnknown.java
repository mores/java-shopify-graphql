package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An unrecognized customer selection type. Use the `context` field on the parent discount type instead.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCustomerSelectionUnknown implements DiscountCustomerSelection {
  /**
   * The underlying customer selection type.
   */
  private String customerSelectionType;

  public DiscountCustomerSelectionUnknown() {
  }

  /**
   * The underlying customer selection type.
   */
  public String getCustomerSelectionType() {
    return customerSelectionType;
  }

  public void setCustomerSelectionType(String customerSelectionType) {
    this.customerSelectionType = customerSelectionType;
  }

  @Override
  public String toString() {
    return "DiscountCustomerSelectionUnknown{customerSelectionType='" + customerSelectionType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerSelectionUnknown that = (DiscountCustomerSelectionUnknown) o;
    return Objects.equals(customerSelectionType, that.customerSelectionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerSelectionType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The underlying customer selection type.
     */
    private String customerSelectionType;

    public DiscountCustomerSelectionUnknown build() {
      DiscountCustomerSelectionUnknown result = new DiscountCustomerSelectionUnknown();
      result.customerSelectionType = this.customerSelectionType;
      return result;
    }

    /**
     * The underlying customer selection type.
     */
    public Builder customerSelectionType(String customerSelectionType) {
      this.customerSelectionType = customerSelectionType;
      return this;
    }
  }
}
