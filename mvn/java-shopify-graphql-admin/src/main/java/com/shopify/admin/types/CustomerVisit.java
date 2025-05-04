package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a customer's session visiting a shop's online store, including
 * information about the marketing activity attributed to starting the session.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerVisit implements com.shopify.admin.types.CustomerMoment, com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * URL of the first page the customer landed on for the session.
   */
  private String landingPage;

  /**
   * Landing page information with URL linked in HTML. For example, the first page
   * the customer visited was store.myshopify.com/products/1.
   */
  private String landingPageHtml;

  /**
   * Represent actions taken by an app, on behalf of a merchant,
   * to market Shopify resources such as products, collections, and discounts.
   */
  private MarketingEvent marketingEvent;

  /**
   * The date and time when the customer's session occurred.
   */
  private OffsetDateTime occurredAt;

  /**
   * Marketing referral code from the link that the customer clicked to visit the store.
   * Supports the following URL attributes: _ref_, _source_, or _r_.
   * For example, if the URL is myshopifystore.com/products/slide?ref=j2tj1tn2, then this value is j2tj1tn2.
   */
  private String referralCode;

  /**
   * Referral information with URLs linked in HTML.
   */
  private String referralInfoHtml;

  /**
   * Webpage where the customer clicked a link that sent them to the online store.
   * For example, _https://randomblog.com/page1_ or _android-app://com.google.android.gm_.
   */
  private String referrerUrl;

  /**
   * Source from which the customer visited the store, such as a platform (Facebook, Google), email, direct,
   * a website domain, QR code, or unknown.
   */
  private String source;

  /**
   * Describes the source explicitly for first or last session.
   */
  private String sourceDescription;

  /**
   * Type of marketing tactic.
   */
  private MarketingTactic sourceType;

  /**
   * A set of UTM parameters gathered from the URL parameters of the referrer.
   */
  private UTMParameters utmParameters;

  public CustomerVisit() {
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
   * URL of the first page the customer landed on for the session.
   */
  public String getLandingPage() {
    return landingPage;
  }

  public void setLandingPage(String landingPage) {
    this.landingPage = landingPage;
  }

  /**
   * Landing page information with URL linked in HTML. For example, the first page
   * the customer visited was store.myshopify.com/products/1.
   */
  public String getLandingPageHtml() {
    return landingPageHtml;
  }

  public void setLandingPageHtml(String landingPageHtml) {
    this.landingPageHtml = landingPageHtml;
  }

  /**
   * Represent actions taken by an app, on behalf of a merchant,
   * to market Shopify resources such as products, collections, and discounts.
   */
  public MarketingEvent getMarketingEvent() {
    return marketingEvent;
  }

  public void setMarketingEvent(MarketingEvent marketingEvent) {
    this.marketingEvent = marketingEvent;
  }

  /**
   * The date and time when the customer's session occurred.
   */
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  /**
   * Marketing referral code from the link that the customer clicked to visit the store.
   * Supports the following URL attributes: _ref_, _source_, or _r_.
   * For example, if the URL is myshopifystore.com/products/slide?ref=j2tj1tn2, then this value is j2tj1tn2.
   */
  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  /**
   * Referral information with URLs linked in HTML.
   */
  public String getReferralInfoHtml() {
    return referralInfoHtml;
  }

  public void setReferralInfoHtml(String referralInfoHtml) {
    this.referralInfoHtml = referralInfoHtml;
  }

  /**
   * Webpage where the customer clicked a link that sent them to the online store.
   * For example, _https://randomblog.com/page1_ or _android-app://com.google.android.gm_.
   */
  public String getReferrerUrl() {
    return referrerUrl;
  }

  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }

  /**
   * Source from which the customer visited the store, such as a platform (Facebook, Google), email, direct,
   * a website domain, QR code, or unknown.
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Describes the source explicitly for first or last session.
   */
  public String getSourceDescription() {
    return sourceDescription;
  }

  public void setSourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
  }

  /**
   * Type of marketing tactic.
   */
  public MarketingTactic getSourceType() {
    return sourceType;
  }

  public void setSourceType(MarketingTactic sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * A set of UTM parameters gathered from the URL parameters of the referrer.
   */
  public UTMParameters getUtmParameters() {
    return utmParameters;
  }

  public void setUtmParameters(UTMParameters utmParameters) {
    this.utmParameters = utmParameters;
  }

  @Override
  public String toString() {
    return "CustomerVisit{id='" + id + "', landingPage='" + landingPage + "', landingPageHtml='" + landingPageHtml + "', marketingEvent='" + marketingEvent + "', occurredAt='" + occurredAt + "', referralCode='" + referralCode + "', referralInfoHtml='" + referralInfoHtml + "', referrerUrl='" + referrerUrl + "', source='" + source + "', sourceDescription='" + sourceDescription + "', sourceType='" + sourceType + "', utmParameters='" + utmParameters + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerVisit that = (CustomerVisit) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(landingPage, that.landingPage) &&
        Objects.equals(landingPageHtml, that.landingPageHtml) &&
        Objects.equals(marketingEvent, that.marketingEvent) &&
        Objects.equals(occurredAt, that.occurredAt) &&
        Objects.equals(referralCode, that.referralCode) &&
        Objects.equals(referralInfoHtml, that.referralInfoHtml) &&
        Objects.equals(referrerUrl, that.referrerUrl) &&
        Objects.equals(source, that.source) &&
        Objects.equals(sourceDescription, that.sourceDescription) &&
        Objects.equals(sourceType, that.sourceType) &&
        Objects.equals(utmParameters, that.utmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, landingPage, landingPageHtml, marketingEvent, occurredAt, referralCode, referralInfoHtml, referrerUrl, source, sourceDescription, sourceType, utmParameters);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * URL of the first page the customer landed on for the session.
     */
    private String landingPage;

    /**
     * Landing page information with URL linked in HTML. For example, the first page
     * the customer visited was store.myshopify.com/products/1.
     */
    private String landingPageHtml;

    /**
     * Represent actions taken by an app, on behalf of a merchant,
     * to market Shopify resources such as products, collections, and discounts.
     */
    private MarketingEvent marketingEvent;

    /**
     * The date and time when the customer's session occurred.
     */
    private OffsetDateTime occurredAt;

    /**
     * Marketing referral code from the link that the customer clicked to visit the store.
     * Supports the following URL attributes: _ref_, _source_, or _r_.
     * For example, if the URL is myshopifystore.com/products/slide?ref=j2tj1tn2, then this value is j2tj1tn2.
     */
    private String referralCode;

    /**
     * Referral information with URLs linked in HTML.
     */
    private String referralInfoHtml;

    /**
     * Webpage where the customer clicked a link that sent them to the online store.
     * For example, _https://randomblog.com/page1_ or _android-app://com.google.android.gm_.
     */
    private String referrerUrl;

    /**
     * Source from which the customer visited the store, such as a platform (Facebook, Google), email, direct,
     * a website domain, QR code, or unknown.
     */
    private String source;

    /**
     * Describes the source explicitly for first or last session.
     */
    private String sourceDescription;

    /**
     * Type of marketing tactic.
     */
    private MarketingTactic sourceType;

    /**
     * A set of UTM parameters gathered from the URL parameters of the referrer.
     */
    private UTMParameters utmParameters;

    public CustomerVisit build() {
      CustomerVisit result = new CustomerVisit();
      result.id = this.id;
      result.landingPage = this.landingPage;
      result.landingPageHtml = this.landingPageHtml;
      result.marketingEvent = this.marketingEvent;
      result.occurredAt = this.occurredAt;
      result.referralCode = this.referralCode;
      result.referralInfoHtml = this.referralInfoHtml;
      result.referrerUrl = this.referrerUrl;
      result.source = this.source;
      result.sourceDescription = this.sourceDescription;
      result.sourceType = this.sourceType;
      result.utmParameters = this.utmParameters;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * URL of the first page the customer landed on for the session.
     */
    public Builder landingPage(String landingPage) {
      this.landingPage = landingPage;
      return this;
    }

    /**
     * Landing page information with URL linked in HTML. For example, the first page
     * the customer visited was store.myshopify.com/products/1.
     */
    public Builder landingPageHtml(String landingPageHtml) {
      this.landingPageHtml = landingPageHtml;
      return this;
    }

    /**
     * Represent actions taken by an app, on behalf of a merchant,
     * to market Shopify resources such as products, collections, and discounts.
     */
    public Builder marketingEvent(MarketingEvent marketingEvent) {
      this.marketingEvent = marketingEvent;
      return this;
    }

    /**
     * The date and time when the customer's session occurred.
     */
    public Builder occurredAt(OffsetDateTime occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }

    /**
     * Marketing referral code from the link that the customer clicked to visit the store.
     * Supports the following URL attributes: _ref_, _source_, or _r_.
     * For example, if the URL is myshopifystore.com/products/slide?ref=j2tj1tn2, then this value is j2tj1tn2.
     */
    public Builder referralCode(String referralCode) {
      this.referralCode = referralCode;
      return this;
    }

    /**
     * Referral information with URLs linked in HTML.
     */
    public Builder referralInfoHtml(String referralInfoHtml) {
      this.referralInfoHtml = referralInfoHtml;
      return this;
    }

    /**
     * Webpage where the customer clicked a link that sent them to the online store.
     * For example, _https://randomblog.com/page1_ or _android-app://com.google.android.gm_.
     */
    public Builder referrerUrl(String referrerUrl) {
      this.referrerUrl = referrerUrl;
      return this;
    }

    /**
     * Source from which the customer visited the store, such as a platform (Facebook, Google), email, direct,
     * a website domain, QR code, or unknown.
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Describes the source explicitly for first or last session.
     */
    public Builder sourceDescription(String sourceDescription) {
      this.sourceDescription = sourceDescription;
      return this;
    }

    /**
     * Type of marketing tactic.
     */
    public Builder sourceType(MarketingTactic sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * A set of UTM parameters gathered from the URL parameters of the referrer.
     */
    public Builder utmParameters(UTMParameters utmParameters) {
      this.utmParameters = utmParameters;
      return this;
    }
  }
}
