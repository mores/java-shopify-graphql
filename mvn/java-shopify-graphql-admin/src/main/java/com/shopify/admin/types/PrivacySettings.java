package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A shop's privacy settings.
 */
public class PrivacySettings {
  /**
   * Banner customizations for the 'cookie banner'.
   */
  private CookieBanner banner;

  /**
   * A shop's data sale opt out page (e.g. CCPA).
   */
  private DataSaleOptOutPage dataSaleOptOutPage;

  /**
   * A shop's privacy policy settings.
   */
  private PrivacyPolicy privacyPolicy;

  public PrivacySettings() {
  }

  /**
   * Banner customizations for the 'cookie banner'.
   */
  public CookieBanner getBanner() {
    return banner;
  }

  public void setBanner(CookieBanner banner) {
    this.banner = banner;
  }

  /**
   * A shop's data sale opt out page (e.g. CCPA).
   */
  public DataSaleOptOutPage getDataSaleOptOutPage() {
    return dataSaleOptOutPage;
  }

  public void setDataSaleOptOutPage(DataSaleOptOutPage dataSaleOptOutPage) {
    this.dataSaleOptOutPage = dataSaleOptOutPage;
  }

  /**
   * A shop's privacy policy settings.
   */
  public PrivacyPolicy getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(PrivacyPolicy privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }

  @Override
  public String toString() {
    return "PrivacySettings{banner='" + banner + "', dataSaleOptOutPage='" + dataSaleOptOutPage + "', privacyPolicy='" + privacyPolicy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivacySettings that = (PrivacySettings) o;
    return Objects.equals(banner, that.banner) &&
        Objects.equals(dataSaleOptOutPage, that.dataSaleOptOutPage) &&
        Objects.equals(privacyPolicy, that.privacyPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banner, dataSaleOptOutPage, privacyPolicy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Banner customizations for the 'cookie banner'.
     */
    private CookieBanner banner;

    /**
     * A shop's data sale opt out page (e.g. CCPA).
     */
    private DataSaleOptOutPage dataSaleOptOutPage;

    /**
     * A shop's privacy policy settings.
     */
    private PrivacyPolicy privacyPolicy;

    public PrivacySettings build() {
      PrivacySettings result = new PrivacySettings();
      result.banner = this.banner;
      result.dataSaleOptOutPage = this.dataSaleOptOutPage;
      result.privacyPolicy = this.privacyPolicy;
      return result;
    }

    /**
     * Banner customizations for the 'cookie banner'.
     */
    public Builder banner(CookieBanner banner) {
      this.banner = banner;
      return this;
    }

    /**
     * A shop's data sale opt out page (e.g. CCPA).
     */
    public Builder dataSaleOptOutPage(DataSaleOptOutPage dataSaleOptOutPage) {
      this.dataSaleOptOutPage = dataSaleOptOutPage;
      return this;
    }

    /**
     * A shop's privacy policy settings.
     */
    public Builder privacyPolicy(PrivacyPolicy privacyPolicy) {
      this.privacyPolicy = privacyPolicy;
      return this;
    }
  }
}
