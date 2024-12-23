package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Defines a usage pricing model for the app subscription.
 * These charges are variable based on how much the merchant uses the app.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppUsagePricing implements AppPricingDetails {
  /**
   * The total usage records for interval.
   */
  private MoneyV2 balanceUsed;

  /**
   * The capped amount prevents the merchant from being charged for any usage over that amount during a billing period.
   * This prevents billing from exceeding a maximum threshold over the duration of the billing period.
   * For the merchant to continue using the app after exceeding a capped amount,
   * they would need to agree to a new usage charge.
   */
  private MoneyV2 cappedAmount;

  /**
   * The frequency with which the app usage records are billed.
   */
  private AppPricingInterval interval;

  /**
   * The terms and conditions for app usage pricing.
   * Must be present in order to create usage charges.
   * The terms are presented to the merchant when they approve an app's usage charges.
   */
  private String terms;

  public AppUsagePricing() {
  }

  /**
   * The total usage records for interval.
   */
  public MoneyV2 getBalanceUsed() {
    return balanceUsed;
  }

  public void setBalanceUsed(MoneyV2 balanceUsed) {
    this.balanceUsed = balanceUsed;
  }

  /**
   * The capped amount prevents the merchant from being charged for any usage over that amount during a billing period.
   * This prevents billing from exceeding a maximum threshold over the duration of the billing period.
   * For the merchant to continue using the app after exceeding a capped amount,
   * they would need to agree to a new usage charge.
   */
  public MoneyV2 getCappedAmount() {
    return cappedAmount;
  }

  public void setCappedAmount(MoneyV2 cappedAmount) {
    this.cappedAmount = cappedAmount;
  }

  /**
   * The frequency with which the app usage records are billed.
   */
  public AppPricingInterval getInterval() {
    return interval;
  }

  public void setInterval(AppPricingInterval interval) {
    this.interval = interval;
  }

  /**
   * The terms and conditions for app usage pricing.
   * Must be present in order to create usage charges.
   * The terms are presented to the merchant when they approve an app's usage charges.
   */
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  @Override
  public String toString() {
    return "AppUsagePricing{balanceUsed='" + balanceUsed + "', cappedAmount='" + cappedAmount + "', interval='" + interval + "', terms='" + terms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsagePricing that = (AppUsagePricing) o;
    return Objects.equals(balanceUsed, that.balanceUsed) &&
        Objects.equals(cappedAmount, that.cappedAmount) &&
        Objects.equals(interval, that.interval) &&
        Objects.equals(terms, that.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceUsed, cappedAmount, interval, terms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total usage records for interval.
     */
    private MoneyV2 balanceUsed;

    /**
     * The capped amount prevents the merchant from being charged for any usage over that amount during a billing period.
     * This prevents billing from exceeding a maximum threshold over the duration of the billing period.
     * For the merchant to continue using the app after exceeding a capped amount,
     * they would need to agree to a new usage charge.
     */
    private MoneyV2 cappedAmount;

    /**
     * The frequency with which the app usage records are billed.
     */
    private AppPricingInterval interval;

    /**
     * The terms and conditions for app usage pricing.
     * Must be present in order to create usage charges.
     * The terms are presented to the merchant when they approve an app's usage charges.
     */
    private String terms;

    public AppUsagePricing build() {
      AppUsagePricing result = new AppUsagePricing();
      result.balanceUsed = this.balanceUsed;
      result.cappedAmount = this.cappedAmount;
      result.interval = this.interval;
      result.terms = this.terms;
      return result;
    }

    /**
     * The total usage records for interval.
     */
    public Builder balanceUsed(MoneyV2 balanceUsed) {
      this.balanceUsed = balanceUsed;
      return this;
    }

    /**
     * The capped amount prevents the merchant from being charged for any usage over that amount during a billing period.
     * This prevents billing from exceeding a maximum threshold over the duration of the billing period.
     * For the merchant to continue using the app after exceeding a capped amount,
     * they would need to agree to a new usage charge.
     */
    public Builder cappedAmount(MoneyV2 cappedAmount) {
      this.cappedAmount = cappedAmount;
      return this;
    }

    /**
     * The frequency with which the app usage records are billed.
     */
    public Builder interval(AppPricingInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The terms and conditions for app usage pricing.
     * Must be present in order to create usage charges.
     * The terms are presented to the merchant when they approve an app's usage charges.
     */
    public Builder terms(String terms) {
      this.terms = terms;
      return this;
    }
  }
}
