package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The discount applied to an item that was added during the current order edit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class OrderStagedChangeAddLineItemDiscount implements OrderStagedChange {
  /**
   * The description of the discount.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The pricing value of the discount.
   */
  private PricingValue value;

  public OrderStagedChangeAddLineItemDiscount() {
  }

  /**
   * The description of the discount.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The pricing value of the discount.
   */
  public PricingValue getValue() {
    return value;
  }

  public void setValue(PricingValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "OrderStagedChangeAddLineItemDiscount{description='" + description + "', id='" + id + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderStagedChangeAddLineItemDiscount that = (OrderStagedChangeAddLineItemDiscount) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the discount.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The pricing value of the discount.
     */
    private PricingValue value;

    public OrderStagedChangeAddLineItemDiscount build() {
      OrderStagedChangeAddLineItemDiscount result = new OrderStagedChangeAddLineItemDiscount();
      result.description = this.description;
      result.id = this.id;
      result.value = this.value;
      return result;
    }

    /**
     * The description of the discount.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The pricing value of the discount.
     */
    public Builder value(PricingValue value) {
      this.value = value;
      return this;
    }
  }
}
