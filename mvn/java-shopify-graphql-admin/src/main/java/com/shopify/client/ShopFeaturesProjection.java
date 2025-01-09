package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopFeaturesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopFeaturesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopFeatures"));
  }

  public ShopFeaturesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopBrandingProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> branding() {
     ShopBrandingProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> projection = new ShopBrandingProjection<>(this, getRoot());
     getFields().put("branding", projection);
     return projection;
  }

  public BundlesFeatureProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> bundles() {
     BundlesFeatureProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> projection = new BundlesFeatureProjection<>(this, getRoot());
     getFields().put("bundles", projection);
     return projection;
  }

  public CartTransformFeatureProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> cartTransform(
      ) {
     CartTransformFeatureProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> projection = new CartTransformFeatureProjection<>(this, getRoot());
     getFields().put("cartTransform", projection);
     return projection;
  }

  public PaypalExpressSubscriptionsGatewayStatusProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> paypalExpressSubscriptionGatewayStatus(
      ) {
     PaypalExpressSubscriptionsGatewayStatusProjection<ShopFeaturesProjection<PARENT, ROOT>, ROOT> projection = new PaypalExpressSubscriptionsGatewayStatusProjection<>(this, getRoot());
     getFields().put("paypalExpressSubscriptionGatewayStatus", projection);
     return projection;
  }

  public ShopFeaturesProjection<PARENT, ROOT> avalaraAvatax() {
    getFields().put("avalaraAvatax", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> captcha() {
    getFields().put("captcha", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> captchaExternalDomains() {
    getFields().put("captchaExternalDomains", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> deliveryProfiles() {
    getFields().put("deliveryProfiles", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> dynamicRemarketing() {
    getFields().put("dynamicRemarketing", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> eligibleForSubscriptionMigration() {
    getFields().put("eligibleForSubscriptionMigration", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> eligibleForSubscriptions() {
    getFields().put("eligibleForSubscriptions", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> giftCards() {
    getFields().put("giftCards", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> harmonizedSystemCode() {
    getFields().put("harmonizedSystemCode", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> internationalDomains() {
    getFields().put("internationalDomains", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> internationalPriceOverrides() {
    getFields().put("internationalPriceOverrides", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> internationalPriceRules() {
    getFields().put("internationalPriceRules", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> legacySubscriptionGatewayEnabled() {
    getFields().put("legacySubscriptionGatewayEnabled", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> liveView() {
    getFields().put("liveView", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> onboardingVisual() {
    getFields().put("onboardingVisual", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> reports() {
    getFields().put("reports", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> sellsSubscriptions() {
    getFields().put("sellsSubscriptions", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> shopifyPlus() {
    getFields().put("shopifyPlus", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> showMetrics() {
    getFields().put("showMetrics", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> storefront() {
    getFields().put("storefront", null);
    return this;
  }

  public ShopFeaturesProjection<PARENT, ROOT> usingShopifyBalance() {
    getFields().put("usingShopifyBalance", null);
    return this;
  }
}
