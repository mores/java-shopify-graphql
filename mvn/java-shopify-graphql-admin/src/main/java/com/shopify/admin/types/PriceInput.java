package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating the price of a parent product variant.
 */
public class PriceInput {
  /**
   * The specific type of calculation done to determine the price of the parent variant.
   * The price is calculated during Bundle creation. Updating a component variant won't recalculate the price.
   */
  private PriceCalculationType calculation;

  /**
   * The price of the parent product variant. This will be be used if calcualtion is set to 'FIXED'.
   */
  private String price;

  public PriceInput() {
  }

  /**
   * The specific type of calculation done to determine the price of the parent variant.
   * The price is calculated during Bundle creation. Updating a component variant won't recalculate the price.
   */
  public PriceCalculationType getCalculation() {
    return calculation;
  }

  public void setCalculation(PriceCalculationType calculation) {
    this.calculation = calculation;
  }

  /**
   * The price of the parent product variant. This will be be used if calcualtion is set to 'FIXED'.
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "PriceInput{calculation='" + calculation + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceInput that = (PriceInput) o;
    return Objects.equals(calculation, that.calculation) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculation, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The specific type of calculation done to determine the price of the parent variant.
     * The price is calculated during Bundle creation. Updating a component variant won't recalculate the price.
     */
    private PriceCalculationType calculation;

    /**
     * The price of the parent product variant. This will be be used if calcualtion is set to 'FIXED'.
     */
    private String price;

    public PriceInput build() {
      PriceInput result = new PriceInput();
      result.calculation = this.calculation;
      result.price = this.price;
      return result;
    }

    /**
     * The specific type of calculation done to determine the price of the parent variant.
     * The price is calculated during Bundle creation. Updating a component variant won't recalculate the price.
     */
    public Builder calculation(PriceCalculationType calculation) {
      this.calculation = calculation;
      return this;
    }

    /**
     * The price of the parent product variant. This will be be used if calcualtion is set to 'FIXED'.
     */
    public Builder price(String price) {
      this.price = price;
      return this;
    }
  }
}
