package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A quantity range within which the price rule is applicable.
 */
public class PriceRuleQuantityRange {
  /**
   * The lower bound of the quantity range.
   */
  private Integer greaterThan;

  /**
   * The lower bound or equal of the quantity range.
   */
  private Integer greaterThanOrEqualTo;

  /**
   * The upper bound of the quantity range.
   */
  private Integer lessThan;

  /**
   * The upper bound or equal of the quantity range.
   */
  private Integer lessThanOrEqualTo;

  public PriceRuleQuantityRange() {
  }

  /**
   * The lower bound of the quantity range.
   */
  public Integer getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(Integer greaterThan) {
    this.greaterThan = greaterThan;
  }

  /**
   * The lower bound or equal of the quantity range.
   */
  public Integer getGreaterThanOrEqualTo() {
    return greaterThanOrEqualTo;
  }

  public void setGreaterThanOrEqualTo(Integer greaterThanOrEqualTo) {
    this.greaterThanOrEqualTo = greaterThanOrEqualTo;
  }

  /**
   * The upper bound of the quantity range.
   */
  public Integer getLessThan() {
    return lessThan;
  }

  public void setLessThan(Integer lessThan) {
    this.lessThan = lessThan;
  }

  /**
   * The upper bound or equal of the quantity range.
   */
  public Integer getLessThanOrEqualTo() {
    return lessThanOrEqualTo;
  }

  public void setLessThanOrEqualTo(Integer lessThanOrEqualTo) {
    this.lessThanOrEqualTo = lessThanOrEqualTo;
  }

  @Override
  public String toString() {
    return "PriceRuleQuantityRange{greaterThan='" + greaterThan + "', greaterThanOrEqualTo='" + greaterThanOrEqualTo + "', lessThan='" + lessThan + "', lessThanOrEqualTo='" + lessThanOrEqualTo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleQuantityRange that = (PriceRuleQuantityRange) o;
    return Objects.equals(greaterThan, that.greaterThan) &&
        Objects.equals(greaterThanOrEqualTo, that.greaterThanOrEqualTo) &&
        Objects.equals(lessThan, that.lessThan) &&
        Objects.equals(lessThanOrEqualTo, that.lessThanOrEqualTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The lower bound of the quantity range.
     */
    private Integer greaterThan;

    /**
     * The lower bound or equal of the quantity range.
     */
    private Integer greaterThanOrEqualTo;

    /**
     * The upper bound of the quantity range.
     */
    private Integer lessThan;

    /**
     * The upper bound or equal of the quantity range.
     */
    private Integer lessThanOrEqualTo;

    public PriceRuleQuantityRange build() {
      PriceRuleQuantityRange result = new PriceRuleQuantityRange();
      result.greaterThan = this.greaterThan;
      result.greaterThanOrEqualTo = this.greaterThanOrEqualTo;
      result.lessThan = this.lessThan;
      result.lessThanOrEqualTo = this.lessThanOrEqualTo;
      return result;
    }

    /**
     * The lower bound of the quantity range.
     */
    public Builder greaterThan(Integer greaterThan) {
      this.greaterThan = greaterThan;
      return this;
    }

    /**
     * The lower bound or equal of the quantity range.
     */
    public Builder greaterThanOrEqualTo(Integer greaterThanOrEqualTo) {
      this.greaterThanOrEqualTo = greaterThanOrEqualTo;
      return this;
    }

    /**
     * The upper bound of the quantity range.
     */
    public Builder lessThan(Integer lessThan) {
      this.lessThan = lessThan;
      return this;
    }

    /**
     * The upper bound or equal of the quantity range.
     */
    public Builder lessThanOrEqualTo(Integer lessThanOrEqualTo) {
      this.lessThanOrEqualTo = lessThanOrEqualTo;
      return this;
    }
  }
}
