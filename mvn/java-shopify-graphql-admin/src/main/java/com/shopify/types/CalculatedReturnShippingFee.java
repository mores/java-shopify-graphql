package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The calculated cost of the return shipping.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedReturnShippingFee implements com.shopify.types.CalculatedReturnFee {
  /**
   * The calculated amount of the return fee, in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  public CalculatedReturnShippingFee() {
  }

  /**
   * The calculated amount of the return fee, in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
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

  @Override
  public String toString() {
    return "CalculatedReturnShippingFee{amountSet='" + amountSet + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturnShippingFee that = (CalculatedReturnShippingFee) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The calculated amount of the return fee, in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    public CalculatedReturnShippingFee build() {
      CalculatedReturnShippingFee result = new CalculatedReturnShippingFee();
      result.amountSet = this.amountSet;
      result.id = this.id;
      return result;
    }

    /**
     * The calculated amount of the return fee, in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
