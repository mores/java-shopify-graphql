package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A money range within which the price rule is applicable.
 */
public class PriceRuleMoneyRange {
  /**
   * The lower bound of the money range.
   */
  private String greaterThan;

  /**
   * The lower bound or equal of the money range.
   */
  private String greaterThanOrEqualTo;

  /**
   * The upper bound of the money range.
   */
  private String lessThan;

  /**
   * The upper bound or equal of the money range.
   */
  private String lessThanOrEqualTo;

  public PriceRuleMoneyRange() {
  }

  /**
   * The lower bound of the money range.
   */
  public String getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(String greaterThan) {
    this.greaterThan = greaterThan;
  }

  /**
   * The lower bound or equal of the money range.
   */
  public String getGreaterThanOrEqualTo() {
    return greaterThanOrEqualTo;
  }

  public void setGreaterThanOrEqualTo(String greaterThanOrEqualTo) {
    this.greaterThanOrEqualTo = greaterThanOrEqualTo;
  }

  /**
   * The upper bound of the money range.
   */
  public String getLessThan() {
    return lessThan;
  }

  public void setLessThan(String lessThan) {
    this.lessThan = lessThan;
  }

  /**
   * The upper bound or equal of the money range.
   */
  public String getLessThanOrEqualTo() {
    return lessThanOrEqualTo;
  }

  public void setLessThanOrEqualTo(String lessThanOrEqualTo) {
    this.lessThanOrEqualTo = lessThanOrEqualTo;
  }

  @Override
  public String toString() {
    return "PriceRuleMoneyRange{greaterThan='" + greaterThan + "', greaterThanOrEqualTo='" + greaterThanOrEqualTo + "', lessThan='" + lessThan + "', lessThanOrEqualTo='" + lessThanOrEqualTo + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleMoneyRange that = (PriceRuleMoneyRange) o;
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
     * The lower bound of the money range.
     */
    private String greaterThan;

    /**
     * The lower bound or equal of the money range.
     */
    private String greaterThanOrEqualTo;

    /**
     * The upper bound of the money range.
     */
    private String lessThan;

    /**
     * The upper bound or equal of the money range.
     */
    private String lessThanOrEqualTo;

    public PriceRuleMoneyRange build() {
      PriceRuleMoneyRange result = new PriceRuleMoneyRange();
      result.greaterThan = this.greaterThan;
      result.greaterThanOrEqualTo = this.greaterThanOrEqualTo;
      result.lessThan = this.lessThan;
      result.lessThanOrEqualTo = this.lessThanOrEqualTo;
      return result;
    }

    /**
     * The lower bound of the money range.
     */
    public Builder greaterThan(String greaterThan) {
      this.greaterThan = greaterThan;
      return this;
    }

    /**
     * The lower bound or equal of the money range.
     */
    public Builder greaterThanOrEqualTo(String greaterThanOrEqualTo) {
      this.greaterThanOrEqualTo = greaterThanOrEqualTo;
      return this;
    }

    /**
     * The upper bound of the money range.
     */
    public Builder lessThan(String lessThan) {
      this.lessThan = lessThan;
      return this;
    }

    /**
     * The upper bound or equal of the money range.
     */
    public Builder lessThanOrEqualTo(String lessThanOrEqualTo) {
      this.lessThanOrEqualTo = lessThanOrEqualTo;
      return this;
    }
  }
}
