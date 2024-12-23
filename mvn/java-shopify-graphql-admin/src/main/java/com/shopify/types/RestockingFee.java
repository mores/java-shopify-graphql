package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A restocking fee is a fee captured as part of a return to cover the costs of handling a return line item.
 * Typically, this would cover the costs of inspecting, repackaging, and restocking the item.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RestockingFee implements com.shopify.types.Fee {
  /**
   * The amount of the restocking fee, in shop and presentment currencies.
   */
  private MoneyBag amountSet;

  /**
   * The unique ID for the Fee.
   */
  private String id;

  /**
   * The value of the fee as a percentage.
   */
  private double percentage;

  public RestockingFee() {
  }

  /**
   * The amount of the restocking fee, in shop and presentment currencies.
   */
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The unique ID for the Fee.
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
    return "RestockingFee{amountSet='" + amountSet + "', id='" + id + "', percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestockingFee that = (RestockingFee) o;
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
     * The amount of the restocking fee, in shop and presentment currencies.
     */
    private MoneyBag amountSet;

    /**
     * The unique ID for the Fee.
     */
    private String id;

    /**
     * The value of the fee as a percentage.
     */
    private double percentage;

    public RestockingFee build() {
      RestockingFee result = new RestockingFee();
      result.amountSet = this.amountSet;
      result.id = this.id;
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The amount of the restocking fee, in shop and presentment currencies.
     */
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The unique ID for the Fee.
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
