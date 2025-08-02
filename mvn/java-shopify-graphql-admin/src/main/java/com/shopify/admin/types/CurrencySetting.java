package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A setting for a presentment currency.
 */
public class CurrencySetting {
  /**
   * The currency's ISO code.
   */
  private CurrencyCode currencyCode;

  /**
   * The full name of the currency.
   */
  private String currencyName;

  /**
   * Whether the currency is enabled or not. An enabled currency setting is visible
   * to buyers and allows orders to be generated with that currency as presentment.
   */
  private boolean enabled;

  /**
   * The manual rate, if enabled, that applies to this currency when converting
   * from shop currency. This rate is specific to the associated market's currency setting.
   */
  private String manualRate;

  /**
   * The date and time when the active exchange rate for the currency was last
   * modified. It can be the automatic rate's creation date, or the manual rate's
   * last updated at date if active.
   */
  private OffsetDateTime rateUpdatedAt;

  public CurrencySetting() {
  }

  /**
   * The currency's ISO code.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The full name of the currency.
   */
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  /**
   * Whether the currency is enabled or not. An enabled currency setting is visible
   * to buyers and allows orders to be generated with that currency as presentment.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * The manual rate, if enabled, that applies to this currency when converting
   * from shop currency. This rate is specific to the associated market's currency setting.
   */
  public String getManualRate() {
    return manualRate;
  }

  public void setManualRate(String manualRate) {
    this.manualRate = manualRate;
  }

  /**
   * The date and time when the active exchange rate for the currency was last
   * modified. It can be the automatic rate's creation date, or the manual rate's
   * last updated at date if active.
   */
  public OffsetDateTime getRateUpdatedAt() {
    return rateUpdatedAt;
  }

  public void setRateUpdatedAt(OffsetDateTime rateUpdatedAt) {
    this.rateUpdatedAt = rateUpdatedAt;
  }

  @Override
  public String toString() {
    return "CurrencySetting{currencyCode='" + currencyCode + "', currencyName='" + currencyName + "', enabled='" + enabled + "', manualRate='" + manualRate + "', rateUpdatedAt='" + rateUpdatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrencySetting that = (CurrencySetting) o;
    return Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(currencyName, that.currencyName) &&
        enabled == that.enabled &&
        Objects.equals(manualRate, that.manualRate) &&
        Objects.equals(rateUpdatedAt, that.rateUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencyName, enabled, manualRate, rateUpdatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The currency's ISO code.
     */
    private CurrencyCode currencyCode;

    /**
     * The full name of the currency.
     */
    private String currencyName;

    /**
     * Whether the currency is enabled or not. An enabled currency setting is visible
     * to buyers and allows orders to be generated with that currency as presentment.
     */
    private boolean enabled;

    /**
     * The manual rate, if enabled, that applies to this currency when converting
     * from shop currency. This rate is specific to the associated market's currency setting.
     */
    private String manualRate;

    /**
     * The date and time when the active exchange rate for the currency was last
     * modified. It can be the automatic rate's creation date, or the manual rate's
     * last updated at date if active.
     */
    private OffsetDateTime rateUpdatedAt;

    public CurrencySetting build() {
      CurrencySetting result = new CurrencySetting();
      result.currencyCode = this.currencyCode;
      result.currencyName = this.currencyName;
      result.enabled = this.enabled;
      result.manualRate = this.manualRate;
      result.rateUpdatedAt = this.rateUpdatedAt;
      return result;
    }

    /**
     * The currency's ISO code.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The full name of the currency.
     */
    public Builder currencyName(String currencyName) {
      this.currencyName = currencyName;
      return this;
    }

    /**
     * Whether the currency is enabled or not. An enabled currency setting is visible
     * to buyers and allows orders to be generated with that currency as presentment.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The manual rate, if enabled, that applies to this currency when converting
     * from shop currency. This rate is specific to the associated market's currency setting.
     */
    public Builder manualRate(String manualRate) {
      this.manualRate = manualRate;
      return this;
    }

    /**
     * The date and time when the active exchange rate for the currency was last
     * modified. It can be the automatic rate's creation date, or the manual rate's
     * last updated at date if active.
     */
    public Builder rateUpdatedAt(OffsetDateTime rateUpdatedAt) {
      this.rateUpdatedAt = rateUpdatedAt;
      return this;
    }
  }
}
