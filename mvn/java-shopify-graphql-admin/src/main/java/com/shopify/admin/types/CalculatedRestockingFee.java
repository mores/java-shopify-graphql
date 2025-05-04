package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The calculated costs of handling a return line item.
 * Typically, this would cover the costs of inspecting, repackaging, and restocking the item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedRestockingFee implements com.shopify.admin.types.CalculatedReturnFee {
  /**
   * The calculated amount of the return fee, in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The value of the fee as a percentage.
   */
  private double percentage;

  public CalculatedRestockingFee() {
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

  /**
   * The value of the fee as a percentage.
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "CalculatedRestockingFee{amountSet='" + amountSet + "', id='" + id + "', percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedRestockingFee that = (CalculatedRestockingFee) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(id, that.id) &&
        percentage == that.percentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, id, percentage);
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

    /**
     * The value of the fee as a percentage.
     */
    private double percentage;

    public CalculatedRestockingFee build() {
      CalculatedRestockingFee result = new CalculatedRestockingFee();
      result.amountSet = this.amountSet;
      result.id = this.id;
      result.percentage = this.percentage;
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

    /**
     * The value of the fee as a percentage.
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
