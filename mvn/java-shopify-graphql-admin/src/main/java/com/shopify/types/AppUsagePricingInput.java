package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to issue arbitrary charges for app usage associated with a subscription.
 */
public class AppUsagePricingInput {
  /**
   * The maximum amount of usage charges that can be incurred within a subscription billing interval.
   */
  private MoneyInput cappedAmount;

  /**
   * The terms and conditions for app usage. These terms stipulate the pricing model for the charges that an app creates.
   */
  private String terms;

  public AppUsagePricingInput() {
  }

  /**
   * The maximum amount of usage charges that can be incurred within a subscription billing interval.
   */
  public MoneyInput getCappedAmount() {
    return cappedAmount;
  }

  public void setCappedAmount(MoneyInput cappedAmount) {
    this.cappedAmount = cappedAmount;
  }

  /**
   * The terms and conditions for app usage. These terms stipulate the pricing model for the charges that an app creates.
   */
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  @Override
  public String toString() {
    return "AppUsagePricingInput{cappedAmount='" + cappedAmount + "', terms='" + terms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsagePricingInput that = (AppUsagePricingInput) o;
    return Objects.equals(cappedAmount, that.cappedAmount) &&
        Objects.equals(terms, that.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cappedAmount, terms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The maximum amount of usage charges that can be incurred within a subscription billing interval.
     */
    private MoneyInput cappedAmount;

    /**
     * The terms and conditions for app usage. These terms stipulate the pricing model for the charges that an app creates.
     */
    private String terms;

    public AppUsagePricingInput build() {
      AppUsagePricingInput result = new AppUsagePricingInput();
      result.cappedAmount = this.cappedAmount;
      result.terms = this.terms;
      return result;
    }

    /**
     * The maximum amount of usage charges that can be incurred within a subscription billing interval.
     */
    public Builder cappedAmount(MoneyInput cappedAmount) {
      this.cappedAmount = cappedAmount;
      return this;
    }

    /**
     * The terms and conditions for app usage. These terms stipulate the pricing model for the charges that an app creates.
     */
    public Builder terms(String terms) {
      this.terms = terms;
      return this;
    }
  }
}
