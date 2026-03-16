package com.shopify.storefront.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The visitor's consent to data processing purposes for the shop. true means
 * accepting the purposes, false means declining them, and null means that the
 * visitor didn't express a preference.
 */
public class VisitorConsent {
  /**
   * The visitor accepts or rejects the preferences data processing purpose.
   */
  private Boolean preferences;

  /**
   * The visitor accepts or rejects the analytics data processing purpose.
   */
  private Boolean analytics;

  /**
   * The visitor accepts or rejects the first and third party marketing data processing purposes.
   */
  private Boolean marketing;

  /**
   * The visitor accepts or rejects the sale or sharing of their data with third parties.
   */
  private Boolean saleOfData;

  public VisitorConsent() {
  }

  /**
   * The visitor accepts or rejects the preferences data processing purpose.
   */
  public Boolean getPreferences() {
    return preferences;
  }

  public void setPreferences(Boolean preferences) {
    this.preferences = preferences;
  }

  /**
   * The visitor accepts or rejects the analytics data processing purpose.
   */
  public Boolean getAnalytics() {
    return analytics;
  }

  public void setAnalytics(Boolean analytics) {
    this.analytics = analytics;
  }

  /**
   * The visitor accepts or rejects the first and third party marketing data processing purposes.
   */
  public Boolean getMarketing() {
    return marketing;
  }

  public void setMarketing(Boolean marketing) {
    this.marketing = marketing;
  }

  /**
   * The visitor accepts or rejects the sale or sharing of their data with third parties.
   */
  public Boolean getSaleOfData() {
    return saleOfData;
  }

  public void setSaleOfData(Boolean saleOfData) {
    this.saleOfData = saleOfData;
  }

  @Override
  public String toString() {
    return "VisitorConsent{preferences='" + preferences + "', analytics='" + analytics + "', marketing='" + marketing + "', saleOfData='" + saleOfData + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VisitorConsent that = (VisitorConsent) o;
    return Objects.equals(preferences, that.preferences) &&
        Objects.equals(analytics, that.analytics) &&
        Objects.equals(marketing, that.marketing) &&
        Objects.equals(saleOfData, that.saleOfData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, analytics, marketing, saleOfData);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The visitor accepts or rejects the preferences data processing purpose.
     */
    private Boolean preferences;

    /**
     * The visitor accepts or rejects the analytics data processing purpose.
     */
    private Boolean analytics;

    /**
     * The visitor accepts or rejects the first and third party marketing data processing purposes.
     */
    private Boolean marketing;

    /**
     * The visitor accepts or rejects the sale or sharing of their data with third parties.
     */
    private Boolean saleOfData;

    public VisitorConsent build() {
      VisitorConsent result = new VisitorConsent();
      result.preferences = this.preferences;
      result.analytics = this.analytics;
      result.marketing = this.marketing;
      result.saleOfData = this.saleOfData;
      return result;
    }

    /**
     * The visitor accepts or rejects the preferences data processing purpose.
     */
    public Builder preferences(Boolean preferences) {
      this.preferences = preferences;
      return this;
    }

    /**
     * The visitor accepts or rejects the analytics data processing purpose.
     */
    public Builder analytics(Boolean analytics) {
      this.analytics = analytics;
      return this;
    }

    /**
     * The visitor accepts or rejects the first and third party marketing data processing purposes.
     */
    public Builder marketing(Boolean marketing) {
      this.marketing = marketing;
      return this;
    }

    /**
     * The visitor accepts or rejects the sale or sharing of their data with third parties.
     */
    public Builder saleOfData(Boolean saleOfData) {
      this.saleOfData = saleOfData;
      return this;
    }
  }
}
