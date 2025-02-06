package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the feature set available to the shop.
 * Most fields specify whether a feature is enabled for a shop, and some fields return information
 * related to specific features.
 */
public class ShopFeatures {
  /**
   * Whether a shop has access to Avalara AvaTax.
   */
  private boolean avalaraAvatax;

  /**
   * The branding of the shop, which influences its look and feel in the Shopify admin.
   */
  private ShopBranding branding;

  /**
   * Represents the Bundles feature configuration for the shop.
   */
  private BundlesFeature bundles;

  /**
   * Whether a shop's online store can have CAPTCHA protection.
   */
  private boolean captcha;

  /**
   * Whether a shop's online store can have CAPTCHA protection for domains not managed by Shopify.
   */
  private boolean captchaExternalDomains;

  /**
   * Represents the cart transform feature configuration for the shop.
   */
  private CartTransformFeature cartTransform;

  /**
   * Whether the delivery profiles functionality is enabled for this shop.
   */
  private boolean deliveryProfiles;

  /**
   * Whether a shop has access to the Google Analytics dynamic remarketing feature.
   */
  private boolean dynamicRemarketing;

  /**
   * Whether a shop can be migrated to use Shopify subscriptions.
   */
  private boolean eligibleForSubscriptionMigration;

  /**
   * Whether a shop is configured properly to sell subscriptions.
   */
  private boolean eligibleForSubscriptions;

  /**
   * Whether a shop can create gift cards.
   */
  private boolean giftCards;

  /**
   * Whether a shop displays Harmonized System codes on products. This is used for customs when shipping
   * internationally.
   */
  private boolean harmonizedSystemCode;

  /**
   * Whether a shop can enable international domains.
   */
  private boolean internationalDomains;

  /**
   * Whether a shop can enable international price overrides.
   */
  private boolean internationalPriceOverrides;

  /**
   * Whether a shop can enable international price rules.
   */
  private boolean internationalPriceRules;

  /**
   * Whether a shop has enabled a legacy subscription gateway to handle older subscriptions.
   */
  private boolean legacySubscriptionGatewayEnabled;

  /**
   * Whether to show the Live View metrics in the Shopify admin. Live view is hidden from merchants that are on a trial
   * or don't have a storefront.
   */
  private boolean liveView;

  /**
   * Whether a shop has access to the onboarding visual.
   */
  private boolean onboardingVisual;

  /**
   * Whether a shop is configured to sell subscriptions with PayPal Express.
   */
  private PaypalExpressSubscriptionsGatewayStatus paypalExpressSubscriptionGatewayStatus;

  /**
   * Whether a shop has access to all reporting features.
   */
  private boolean reports;

  /**
   * Whether a shop has ever had subscription products.
   */
  private boolean sellsSubscriptions;

  /**
   * Whether the shop has a Shopify Plus subscription.
   */
  private boolean shopifyPlus;

  /**
   * Whether to show metrics in the Shopify admin. Metrics are hidden for new merchants until they become meaningful.
   */
  private boolean showMetrics;

  /**
   * Whether a shop has an online store.
   */
  private boolean storefront;

  /**
   * Whether a shop is using Shopify Balance.
   */
  private boolean usingShopifyBalance;

  public ShopFeatures() {
  }

  /**
   * Whether a shop has access to Avalara AvaTax.
   */
  public boolean getAvalaraAvatax() {
    return avalaraAvatax;
  }

  public void setAvalaraAvatax(boolean avalaraAvatax) {
    this.avalaraAvatax = avalaraAvatax;
  }

  /**
   * The branding of the shop, which influences its look and feel in the Shopify admin.
   */
  public ShopBranding getBranding() {
    return branding;
  }

  public void setBranding(ShopBranding branding) {
    this.branding = branding;
  }

  /**
   * Represents the Bundles feature configuration for the shop.
   */
  public BundlesFeature getBundles() {
    return bundles;
  }

  public void setBundles(BundlesFeature bundles) {
    this.bundles = bundles;
  }

  /**
   * Whether a shop's online store can have CAPTCHA protection.
   */
  public boolean getCaptcha() {
    return captcha;
  }

  public void setCaptcha(boolean captcha) {
    this.captcha = captcha;
  }

  /**
   * Whether a shop's online store can have CAPTCHA protection for domains not managed by Shopify.
   */
  public boolean getCaptchaExternalDomains() {
    return captchaExternalDomains;
  }

  public void setCaptchaExternalDomains(boolean captchaExternalDomains) {
    this.captchaExternalDomains = captchaExternalDomains;
  }

  /**
   * Represents the cart transform feature configuration for the shop.
   */
  public CartTransformFeature getCartTransform() {
    return cartTransform;
  }

  public void setCartTransform(CartTransformFeature cartTransform) {
    this.cartTransform = cartTransform;
  }

  /**
   * Whether the delivery profiles functionality is enabled for this shop.
   */
  public boolean getDeliveryProfiles() {
    return deliveryProfiles;
  }

  public void setDeliveryProfiles(boolean deliveryProfiles) {
    this.deliveryProfiles = deliveryProfiles;
  }

  /**
   * Whether a shop has access to the Google Analytics dynamic remarketing feature.
   */
  public boolean getDynamicRemarketing() {
    return dynamicRemarketing;
  }

  public void setDynamicRemarketing(boolean dynamicRemarketing) {
    this.dynamicRemarketing = dynamicRemarketing;
  }

  /**
   * Whether a shop can be migrated to use Shopify subscriptions.
   */
  public boolean getEligibleForSubscriptionMigration() {
    return eligibleForSubscriptionMigration;
  }

  public void setEligibleForSubscriptionMigration(boolean eligibleForSubscriptionMigration) {
    this.eligibleForSubscriptionMigration = eligibleForSubscriptionMigration;
  }

  /**
   * Whether a shop is configured properly to sell subscriptions.
   */
  public boolean getEligibleForSubscriptions() {
    return eligibleForSubscriptions;
  }

  public void setEligibleForSubscriptions(boolean eligibleForSubscriptions) {
    this.eligibleForSubscriptions = eligibleForSubscriptions;
  }

  /**
   * Whether a shop can create gift cards.
   */
  public boolean getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(boolean giftCards) {
    this.giftCards = giftCards;
  }

  /**
   * Whether a shop displays Harmonized System codes on products. This is used for customs when shipping
   * internationally.
   */
  public boolean getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(boolean harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  /**
   * Whether a shop can enable international domains.
   */
  public boolean getInternationalDomains() {
    return internationalDomains;
  }

  public void setInternationalDomains(boolean internationalDomains) {
    this.internationalDomains = internationalDomains;
  }

  /**
   * Whether a shop can enable international price overrides.
   */
  public boolean getInternationalPriceOverrides() {
    return internationalPriceOverrides;
  }

  public void setInternationalPriceOverrides(boolean internationalPriceOverrides) {
    this.internationalPriceOverrides = internationalPriceOverrides;
  }

  /**
   * Whether a shop can enable international price rules.
   */
  public boolean getInternationalPriceRules() {
    return internationalPriceRules;
  }

  public void setInternationalPriceRules(boolean internationalPriceRules) {
    this.internationalPriceRules = internationalPriceRules;
  }

  /**
   * Whether a shop has enabled a legacy subscription gateway to handle older subscriptions.
   */
  public boolean getLegacySubscriptionGatewayEnabled() {
    return legacySubscriptionGatewayEnabled;
  }

  public void setLegacySubscriptionGatewayEnabled(boolean legacySubscriptionGatewayEnabled) {
    this.legacySubscriptionGatewayEnabled = legacySubscriptionGatewayEnabled;
  }

  /**
   * Whether to show the Live View metrics in the Shopify admin. Live view is hidden from merchants that are on a trial
   * or don't have a storefront.
   */
  public boolean getLiveView() {
    return liveView;
  }

  public void setLiveView(boolean liveView) {
    this.liveView = liveView;
  }

  /**
   * Whether a shop has access to the onboarding visual.
   */
  public boolean getOnboardingVisual() {
    return onboardingVisual;
  }

  public void setOnboardingVisual(boolean onboardingVisual) {
    this.onboardingVisual = onboardingVisual;
  }

  /**
   * Whether a shop is configured to sell subscriptions with PayPal Express.
   */
  public PaypalExpressSubscriptionsGatewayStatus getPaypalExpressSubscriptionGatewayStatus() {
    return paypalExpressSubscriptionGatewayStatus;
  }

  public void setPaypalExpressSubscriptionGatewayStatus(
      PaypalExpressSubscriptionsGatewayStatus paypalExpressSubscriptionGatewayStatus) {
    this.paypalExpressSubscriptionGatewayStatus = paypalExpressSubscriptionGatewayStatus;
  }

  /**
   * Whether a shop has access to all reporting features.
   */
  public boolean getReports() {
    return reports;
  }

  public void setReports(boolean reports) {
    this.reports = reports;
  }

  /**
   * Whether a shop has ever had subscription products.
   */
  public boolean getSellsSubscriptions() {
    return sellsSubscriptions;
  }

  public void setSellsSubscriptions(boolean sellsSubscriptions) {
    this.sellsSubscriptions = sellsSubscriptions;
  }

  /**
   * Whether the shop has a Shopify Plus subscription.
   */
  public boolean getShopifyPlus() {
    return shopifyPlus;
  }

  public void setShopifyPlus(boolean shopifyPlus) {
    this.shopifyPlus = shopifyPlus;
  }

  /**
   * Whether to show metrics in the Shopify admin. Metrics are hidden for new merchants until they become meaningful.
   */
  public boolean getShowMetrics() {
    return showMetrics;
  }

  public void setShowMetrics(boolean showMetrics) {
    this.showMetrics = showMetrics;
  }

  /**
   * Whether a shop has an online store.
   */
  public boolean getStorefront() {
    return storefront;
  }

  public void setStorefront(boolean storefront) {
    this.storefront = storefront;
  }

  /**
   * Whether a shop is using Shopify Balance.
   */
  public boolean getUsingShopifyBalance() {
    return usingShopifyBalance;
  }

  public void setUsingShopifyBalance(boolean usingShopifyBalance) {
    this.usingShopifyBalance = usingShopifyBalance;
  }

  @Override
  public String toString() {
    return "ShopFeatures{avalaraAvatax='" + avalaraAvatax + "', branding='" + branding + "', bundles='" + bundles + "', captcha='" + captcha + "', captchaExternalDomains='" + captchaExternalDomains + "', cartTransform='" + cartTransform + "', deliveryProfiles='" + deliveryProfiles + "', dynamicRemarketing='" + dynamicRemarketing + "', eligibleForSubscriptionMigration='" + eligibleForSubscriptionMigration + "', eligibleForSubscriptions='" + eligibleForSubscriptions + "', giftCards='" + giftCards + "', harmonizedSystemCode='" + harmonizedSystemCode + "', internationalDomains='" + internationalDomains + "', internationalPriceOverrides='" + internationalPriceOverrides + "', internationalPriceRules='" + internationalPriceRules + "', legacySubscriptionGatewayEnabled='" + legacySubscriptionGatewayEnabled + "', liveView='" + liveView + "', onboardingVisual='" + onboardingVisual + "', paypalExpressSubscriptionGatewayStatus='" + paypalExpressSubscriptionGatewayStatus + "', reports='" + reports + "', sellsSubscriptions='" + sellsSubscriptions + "', shopifyPlus='" + shopifyPlus + "', showMetrics='" + showMetrics + "', storefront='" + storefront + "', usingShopifyBalance='" + usingShopifyBalance + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopFeatures that = (ShopFeatures) o;
    return avalaraAvatax == that.avalaraAvatax &&
        Objects.equals(branding, that.branding) &&
        Objects.equals(bundles, that.bundles) &&
        captcha == that.captcha &&
        captchaExternalDomains == that.captchaExternalDomains &&
        Objects.equals(cartTransform, that.cartTransform) &&
        deliveryProfiles == that.deliveryProfiles &&
        dynamicRemarketing == that.dynamicRemarketing &&
        eligibleForSubscriptionMigration == that.eligibleForSubscriptionMigration &&
        eligibleForSubscriptions == that.eligibleForSubscriptions &&
        giftCards == that.giftCards &&
        harmonizedSystemCode == that.harmonizedSystemCode &&
        internationalDomains == that.internationalDomains &&
        internationalPriceOverrides == that.internationalPriceOverrides &&
        internationalPriceRules == that.internationalPriceRules &&
        legacySubscriptionGatewayEnabled == that.legacySubscriptionGatewayEnabled &&
        liveView == that.liveView &&
        onboardingVisual == that.onboardingVisual &&
        Objects.equals(paypalExpressSubscriptionGatewayStatus, that.paypalExpressSubscriptionGatewayStatus) &&
        reports == that.reports &&
        sellsSubscriptions == that.sellsSubscriptions &&
        shopifyPlus == that.shopifyPlus &&
        showMetrics == that.showMetrics &&
        storefront == that.storefront &&
        usingShopifyBalance == that.usingShopifyBalance;
  }

  @Override
  public int hashCode() {
    return Objects.hash(avalaraAvatax, branding, bundles, captcha, captchaExternalDomains, cartTransform, deliveryProfiles, dynamicRemarketing, eligibleForSubscriptionMigration, eligibleForSubscriptions, giftCards, harmonizedSystemCode, internationalDomains, internationalPriceOverrides, internationalPriceRules, legacySubscriptionGatewayEnabled, liveView, onboardingVisual, paypalExpressSubscriptionGatewayStatus, reports, sellsSubscriptions, shopifyPlus, showMetrics, storefront, usingShopifyBalance);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether a shop has access to Avalara AvaTax.
     */
    private boolean avalaraAvatax;

    /**
     * The branding of the shop, which influences its look and feel in the Shopify admin.
     */
    private ShopBranding branding;

    /**
     * Represents the Bundles feature configuration for the shop.
     */
    private BundlesFeature bundles;

    /**
     * Whether a shop's online store can have CAPTCHA protection.
     */
    private boolean captcha;

    /**
     * Whether a shop's online store can have CAPTCHA protection for domains not managed by Shopify.
     */
    private boolean captchaExternalDomains;

    /**
     * Represents the cart transform feature configuration for the shop.
     */
    private CartTransformFeature cartTransform;

    /**
     * Whether the delivery profiles functionality is enabled for this shop.
     */
    private boolean deliveryProfiles;

    /**
     * Whether a shop has access to the Google Analytics dynamic remarketing feature.
     */
    private boolean dynamicRemarketing;

    /**
     * Whether a shop can be migrated to use Shopify subscriptions.
     */
    private boolean eligibleForSubscriptionMigration;

    /**
     * Whether a shop is configured properly to sell subscriptions.
     */
    private boolean eligibleForSubscriptions;

    /**
     * Whether a shop can create gift cards.
     */
    private boolean giftCards;

    /**
     * Whether a shop displays Harmonized System codes on products. This is used for customs when shipping
     * internationally.
     */
    private boolean harmonizedSystemCode;

    /**
     * Whether a shop can enable international domains.
     */
    private boolean internationalDomains;

    /**
     * Whether a shop can enable international price overrides.
     */
    private boolean internationalPriceOverrides;

    /**
     * Whether a shop can enable international price rules.
     */
    private boolean internationalPriceRules;

    /**
     * Whether a shop has enabled a legacy subscription gateway to handle older subscriptions.
     */
    private boolean legacySubscriptionGatewayEnabled;

    /**
     * Whether to show the Live View metrics in the Shopify admin. Live view is hidden from merchants that are on a trial
     * or don't have a storefront.
     */
    private boolean liveView;

    /**
     * Whether a shop has access to the onboarding visual.
     */
    private boolean onboardingVisual;

    /**
     * Whether a shop is configured to sell subscriptions with PayPal Express.
     */
    private PaypalExpressSubscriptionsGatewayStatus paypalExpressSubscriptionGatewayStatus;

    /**
     * Whether a shop has access to all reporting features.
     */
    private boolean reports;

    /**
     * Whether a shop has ever had subscription products.
     */
    private boolean sellsSubscriptions;

    /**
     * Whether the shop has a Shopify Plus subscription.
     */
    private boolean shopifyPlus;

    /**
     * Whether to show metrics in the Shopify admin. Metrics are hidden for new merchants until they become meaningful.
     */
    private boolean showMetrics;

    /**
     * Whether a shop has an online store.
     */
    private boolean storefront;

    /**
     * Whether a shop is using Shopify Balance.
     */
    private boolean usingShopifyBalance;

    public ShopFeatures build() {
      ShopFeatures result = new ShopFeatures();
      result.avalaraAvatax = this.avalaraAvatax;
      result.branding = this.branding;
      result.bundles = this.bundles;
      result.captcha = this.captcha;
      result.captchaExternalDomains = this.captchaExternalDomains;
      result.cartTransform = this.cartTransform;
      result.deliveryProfiles = this.deliveryProfiles;
      result.dynamicRemarketing = this.dynamicRemarketing;
      result.eligibleForSubscriptionMigration = this.eligibleForSubscriptionMigration;
      result.eligibleForSubscriptions = this.eligibleForSubscriptions;
      result.giftCards = this.giftCards;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.internationalDomains = this.internationalDomains;
      result.internationalPriceOverrides = this.internationalPriceOverrides;
      result.internationalPriceRules = this.internationalPriceRules;
      result.legacySubscriptionGatewayEnabled = this.legacySubscriptionGatewayEnabled;
      result.liveView = this.liveView;
      result.onboardingVisual = this.onboardingVisual;
      result.paypalExpressSubscriptionGatewayStatus = this.paypalExpressSubscriptionGatewayStatus;
      result.reports = this.reports;
      result.sellsSubscriptions = this.sellsSubscriptions;
      result.shopifyPlus = this.shopifyPlus;
      result.showMetrics = this.showMetrics;
      result.storefront = this.storefront;
      result.usingShopifyBalance = this.usingShopifyBalance;
      return result;
    }

    /**
     * Whether a shop has access to Avalara AvaTax.
     */
    public Builder avalaraAvatax(boolean avalaraAvatax) {
      this.avalaraAvatax = avalaraAvatax;
      return this;
    }

    /**
     * The branding of the shop, which influences its look and feel in the Shopify admin.
     */
    public Builder branding(ShopBranding branding) {
      this.branding = branding;
      return this;
    }

    /**
     * Represents the Bundles feature configuration for the shop.
     */
    public Builder bundles(BundlesFeature bundles) {
      this.bundles = bundles;
      return this;
    }

    /**
     * Whether a shop's online store can have CAPTCHA protection.
     */
    public Builder captcha(boolean captcha) {
      this.captcha = captcha;
      return this;
    }

    /**
     * Whether a shop's online store can have CAPTCHA protection for domains not managed by Shopify.
     */
    public Builder captchaExternalDomains(boolean captchaExternalDomains) {
      this.captchaExternalDomains = captchaExternalDomains;
      return this;
    }

    /**
     * Represents the cart transform feature configuration for the shop.
     */
    public Builder cartTransform(CartTransformFeature cartTransform) {
      this.cartTransform = cartTransform;
      return this;
    }

    /**
     * Whether the delivery profiles functionality is enabled for this shop.
     */
    public Builder deliveryProfiles(boolean deliveryProfiles) {
      this.deliveryProfiles = deliveryProfiles;
      return this;
    }

    /**
     * Whether a shop has access to the Google Analytics dynamic remarketing feature.
     */
    public Builder dynamicRemarketing(boolean dynamicRemarketing) {
      this.dynamicRemarketing = dynamicRemarketing;
      return this;
    }

    /**
     * Whether a shop can be migrated to use Shopify subscriptions.
     */
    public Builder eligibleForSubscriptionMigration(boolean eligibleForSubscriptionMigration) {
      this.eligibleForSubscriptionMigration = eligibleForSubscriptionMigration;
      return this;
    }

    /**
     * Whether a shop is configured properly to sell subscriptions.
     */
    public Builder eligibleForSubscriptions(boolean eligibleForSubscriptions) {
      this.eligibleForSubscriptions = eligibleForSubscriptions;
      return this;
    }

    /**
     * Whether a shop can create gift cards.
     */
    public Builder giftCards(boolean giftCards) {
      this.giftCards = giftCards;
      return this;
    }

    /**
     * Whether a shop displays Harmonized System codes on products. This is used for customs when shipping
     * internationally.
     */
    public Builder harmonizedSystemCode(boolean harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    /**
     * Whether a shop can enable international domains.
     */
    public Builder internationalDomains(boolean internationalDomains) {
      this.internationalDomains = internationalDomains;
      return this;
    }

    /**
     * Whether a shop can enable international price overrides.
     */
    public Builder internationalPriceOverrides(boolean internationalPriceOverrides) {
      this.internationalPriceOverrides = internationalPriceOverrides;
      return this;
    }

    /**
     * Whether a shop can enable international price rules.
     */
    public Builder internationalPriceRules(boolean internationalPriceRules) {
      this.internationalPriceRules = internationalPriceRules;
      return this;
    }

    /**
     * Whether a shop has enabled a legacy subscription gateway to handle older subscriptions.
     */
    public Builder legacySubscriptionGatewayEnabled(boolean legacySubscriptionGatewayEnabled) {
      this.legacySubscriptionGatewayEnabled = legacySubscriptionGatewayEnabled;
      return this;
    }

    /**
     * Whether to show the Live View metrics in the Shopify admin. Live view is hidden from merchants that are on a trial
     * or don't have a storefront.
     */
    public Builder liveView(boolean liveView) {
      this.liveView = liveView;
      return this;
    }

    /**
     * Whether a shop has access to the onboarding visual.
     */
    public Builder onboardingVisual(boolean onboardingVisual) {
      this.onboardingVisual = onboardingVisual;
      return this;
    }

    /**
     * Whether a shop is configured to sell subscriptions with PayPal Express.
     */
    public Builder paypalExpressSubscriptionGatewayStatus(
        PaypalExpressSubscriptionsGatewayStatus paypalExpressSubscriptionGatewayStatus) {
      this.paypalExpressSubscriptionGatewayStatus = paypalExpressSubscriptionGatewayStatus;
      return this;
    }

    /**
     * Whether a shop has access to all reporting features.
     */
    public Builder reports(boolean reports) {
      this.reports = reports;
      return this;
    }

    /**
     * Whether a shop has ever had subscription products.
     */
    public Builder sellsSubscriptions(boolean sellsSubscriptions) {
      this.sellsSubscriptions = sellsSubscriptions;
      return this;
    }

    /**
     * Whether the shop has a Shopify Plus subscription.
     */
    public Builder shopifyPlus(boolean shopifyPlus) {
      this.shopifyPlus = shopifyPlus;
      return this;
    }

    /**
     * Whether to show metrics in the Shopify admin. Metrics are hidden for new merchants until they become meaningful.
     */
    public Builder showMetrics(boolean showMetrics) {
      this.showMetrics = showMetrics;
      return this;
    }

    /**
     * Whether a shop has an online store.
     */
    public Builder storefront(boolean storefront) {
      this.storefront = storefront;
      return this;
    }

    /**
     * Whether a shop is using Shopify Balance.
     */
    public Builder usingShopifyBalance(boolean usingShopifyBalance) {
      this.usingShopifyBalance = usingShopifyBalance;
      return this;
    }
  }
}
