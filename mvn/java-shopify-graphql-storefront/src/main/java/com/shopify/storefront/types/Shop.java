package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The central hub for store-wide settings and information accessible through the
 * Storefront API. Provides the shop's name, description, and branding
 * configuration including logos and colors through the
 * [`Brand`](https://shopify.dev/docs/api/storefront/current/objects/Brand) object.
 *
 * Access store policies such as privacy, refund, shipping, and terms of service via [`ShopPolicy`](https://shopify.dev/docs/api/storefront/current/objects/ShopPolicy),
 * and the subscription policy via [`ShopPolicyWithDefault`](https://shopify.dev/docs/api/storefront/current/objects/ShopPolicyWithDefault). [`PaymentSettings`](https://shopify.dev/docs/api/storefront/current/objects/PaymentSettings)
 * expose accepted card brands, supported digital wallets, and enabled presentment
 * currencies. The object also includes the primary
 * [`Domain`](https://shopify.dev/docs/api/storefront/current/objects/Domain),
 * countries the shop ships to, [`ShopPayInstallmentsPricing`](https://shopify.dev/docs/api/storefront/current/objects/ShopPayInstallmentsPricing), and [`SocialLoginProvider`](https://shopify.dev/docs/api/storefront/current/objects/SocialLoginProvider)
 * options for customer accounts.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Shop implements MetafieldParentResource, com.shopify.storefront.types.HasMetafields, com.shopify.storefront.types.Node {
  /**
   * The shop's branding configuration.
   */
  private Brand brand;

  /**
   * The shop's contact information.
   */
  private ShopPolicy contactInformation;

  /**
   * Translations for customer accounts.
   */
  private List<Translation> customerAccountTranslations;

  /**
   * The URL for the customer account (only present if shop has a customer account vanity domain).
   */
  private String customerAccountUrl;

  /**
   * A description of the shop.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The shop's legal notice.
   */
  private ShopPolicy legalNotice;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * A string representing the way currency is formatted when the currency isn’t specified.
   */
  private String moneyFormat;

  /**
   * The shop’s name.
   */
  private String name;

  /**
   * Settings related to payments.
   */
  private PaymentSettings paymentSettings;

  /**
   * The primary domain of the shop’s Online Store.
   */
  private Domain primaryDomain;

  /**
   * The shop’s privacy policy.
   */
  private ShopPolicy privacyPolicy;

  /**
   * The shop’s refund policy.
   */
  private ShopPolicy refundPolicy;

  /**
   * The shop’s shipping policy.
   */
  private ShopPolicy shippingPolicy;

  /**
   * Countries that the shop ships to.
   */
  private List<CountryCode> shipsToCountries;

  /**
   * The Shop Pay Installments pricing information for the shop.
   */
  private ShopPayInstallmentsPricing shopPayInstallmentsPricing;

  /**
   * The social login providers for customer accounts.
   */
  private List<SocialLoginProvider> socialLoginProviders;

  /**
   * The shop’s subscription policy.
   */
  private ShopPolicyWithDefault subscriptionPolicy;

  /**
   * The shop's terms of sale.
   */
  private ShopPolicy termsOfSale;

  /**
   * The shop’s terms of service.
   */
  private ShopPolicy termsOfService;

  public Shop() {
  }

  /**
   * The shop's branding configuration.
   */
  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  /**
   * The shop's contact information.
   */
  public ShopPolicy getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(ShopPolicy contactInformation) {
    this.contactInformation = contactInformation;
  }

  /**
   * Translations for customer accounts.
   */
  public List<Translation> getCustomerAccountTranslations() {
    return customerAccountTranslations;
  }

  public void setCustomerAccountTranslations(List<Translation> customerAccountTranslations) {
    this.customerAccountTranslations = customerAccountTranslations;
  }

  /**
   * The URL for the customer account (only present if shop has a customer account vanity domain).
   */
  public String getCustomerAccountUrl() {
    return customerAccountUrl;
  }

  public void setCustomerAccountUrl(String customerAccountUrl) {
    this.customerAccountUrl = customerAccountUrl;
  }

  /**
   * A description of the shop.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * The shop's legal notice.
   */
  public ShopPolicy getLegalNotice() {
    return legalNotice;
  }

  public void setLegalNotice(ShopPolicy legalNotice) {
    this.legalNotice = legalNotice;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * A string representing the way currency is formatted when the currency isn’t specified.
   */
  public String getMoneyFormat() {
    return moneyFormat;
  }

  public void setMoneyFormat(String moneyFormat) {
    this.moneyFormat = moneyFormat;
  }

  /**
   * The shop’s name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Settings related to payments.
   */
  public PaymentSettings getPaymentSettings() {
    return paymentSettings;
  }

  public void setPaymentSettings(PaymentSettings paymentSettings) {
    this.paymentSettings = paymentSettings;
  }

  /**
   * The primary domain of the shop’s Online Store.
   */
  public Domain getPrimaryDomain() {
    return primaryDomain;
  }

  public void setPrimaryDomain(Domain primaryDomain) {
    this.primaryDomain = primaryDomain;
  }

  /**
   * The shop’s privacy policy.
   */
  public ShopPolicy getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(ShopPolicy privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }

  /**
   * The shop’s refund policy.
   */
  public ShopPolicy getRefundPolicy() {
    return refundPolicy;
  }

  public void setRefundPolicy(ShopPolicy refundPolicy) {
    this.refundPolicy = refundPolicy;
  }

  /**
   * The shop’s shipping policy.
   */
  public ShopPolicy getShippingPolicy() {
    return shippingPolicy;
  }

  public void setShippingPolicy(ShopPolicy shippingPolicy) {
    this.shippingPolicy = shippingPolicy;
  }

  /**
   * Countries that the shop ships to.
   */
  public List<CountryCode> getShipsToCountries() {
    return shipsToCountries;
  }

  public void setShipsToCountries(List<CountryCode> shipsToCountries) {
    this.shipsToCountries = shipsToCountries;
  }

  /**
   * The Shop Pay Installments pricing information for the shop.
   */
  public ShopPayInstallmentsPricing getShopPayInstallmentsPricing() {
    return shopPayInstallmentsPricing;
  }

  public void setShopPayInstallmentsPricing(ShopPayInstallmentsPricing shopPayInstallmentsPricing) {
    this.shopPayInstallmentsPricing = shopPayInstallmentsPricing;
  }

  /**
   * The social login providers for customer accounts.
   */
  public List<SocialLoginProvider> getSocialLoginProviders() {
    return socialLoginProviders;
  }

  public void setSocialLoginProviders(List<SocialLoginProvider> socialLoginProviders) {
    this.socialLoginProviders = socialLoginProviders;
  }

  /**
   * The shop’s subscription policy.
   */
  public ShopPolicyWithDefault getSubscriptionPolicy() {
    return subscriptionPolicy;
  }

  public void setSubscriptionPolicy(ShopPolicyWithDefault subscriptionPolicy) {
    this.subscriptionPolicy = subscriptionPolicy;
  }

  /**
   * The shop's terms of sale.
   */
  public ShopPolicy getTermsOfSale() {
    return termsOfSale;
  }

  public void setTermsOfSale(ShopPolicy termsOfSale) {
    this.termsOfSale = termsOfSale;
  }

  /**
   * The shop’s terms of service.
   */
  public ShopPolicy getTermsOfService() {
    return termsOfService;
  }

  public void setTermsOfService(ShopPolicy termsOfService) {
    this.termsOfService = termsOfService;
  }

  @Override
  public String toString() {
    return "Shop{brand='" + brand + "', contactInformation='" + contactInformation + "', customerAccountTranslations='" + customerAccountTranslations + "', customerAccountUrl='" + customerAccountUrl + "', description='" + description + "', id='" + id + "', legalNotice='" + legalNotice + "', metafield='" + metafield + "', metafields='" + metafields + "', moneyFormat='" + moneyFormat + "', name='" + name + "', paymentSettings='" + paymentSettings + "', primaryDomain='" + primaryDomain + "', privacyPolicy='" + privacyPolicy + "', refundPolicy='" + refundPolicy + "', shippingPolicy='" + shippingPolicy + "', shipsToCountries='" + shipsToCountries + "', shopPayInstallmentsPricing='" + shopPayInstallmentsPricing + "', socialLoginProviders='" + socialLoginProviders + "', subscriptionPolicy='" + subscriptionPolicy + "', termsOfSale='" + termsOfSale + "', termsOfService='" + termsOfService + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shop that = (Shop) o;
    return Objects.equals(brand, that.brand) &&
        Objects.equals(contactInformation, that.contactInformation) &&
        Objects.equals(customerAccountTranslations, that.customerAccountTranslations) &&
        Objects.equals(customerAccountUrl, that.customerAccountUrl) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(legalNotice, that.legalNotice) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(moneyFormat, that.moneyFormat) &&
        Objects.equals(name, that.name) &&
        Objects.equals(paymentSettings, that.paymentSettings) &&
        Objects.equals(primaryDomain, that.primaryDomain) &&
        Objects.equals(privacyPolicy, that.privacyPolicy) &&
        Objects.equals(refundPolicy, that.refundPolicy) &&
        Objects.equals(shippingPolicy, that.shippingPolicy) &&
        Objects.equals(shipsToCountries, that.shipsToCountries) &&
        Objects.equals(shopPayInstallmentsPricing, that.shopPayInstallmentsPricing) &&
        Objects.equals(socialLoginProviders, that.socialLoginProviders) &&
        Objects.equals(subscriptionPolicy, that.subscriptionPolicy) &&
        Objects.equals(termsOfSale, that.termsOfSale) &&
        Objects.equals(termsOfService, that.termsOfService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, contactInformation, customerAccountTranslations, customerAccountUrl, description, id, legalNotice, metafield, metafields, moneyFormat, name, paymentSettings, primaryDomain, privacyPolicy, refundPolicy, shippingPolicy, shipsToCountries, shopPayInstallmentsPricing, socialLoginProviders, subscriptionPolicy, termsOfSale, termsOfService);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shop's branding configuration.
     */
    private Brand brand;

    /**
     * The shop's contact information.
     */
    private ShopPolicy contactInformation;

    /**
     * Translations for customer accounts.
     */
    private List<Translation> customerAccountTranslations;

    /**
     * The URL for the customer account (only present if shop has a customer account vanity domain).
     */
    private String customerAccountUrl;

    /**
     * A description of the shop.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The shop's legal notice.
     */
    private ShopPolicy legalNotice;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * A string representing the way currency is formatted when the currency isn’t specified.
     */
    private String moneyFormat;

    /**
     * The shop’s name.
     */
    private String name;

    /**
     * Settings related to payments.
     */
    private PaymentSettings paymentSettings;

    /**
     * The primary domain of the shop’s Online Store.
     */
    private Domain primaryDomain;

    /**
     * The shop’s privacy policy.
     */
    private ShopPolicy privacyPolicy;

    /**
     * The shop’s refund policy.
     */
    private ShopPolicy refundPolicy;

    /**
     * The shop’s shipping policy.
     */
    private ShopPolicy shippingPolicy;

    /**
     * Countries that the shop ships to.
     */
    private List<CountryCode> shipsToCountries;

    /**
     * The Shop Pay Installments pricing information for the shop.
     */
    private ShopPayInstallmentsPricing shopPayInstallmentsPricing;

    /**
     * The social login providers for customer accounts.
     */
    private List<SocialLoginProvider> socialLoginProviders;

    /**
     * The shop’s subscription policy.
     */
    private ShopPolicyWithDefault subscriptionPolicy;

    /**
     * The shop's terms of sale.
     */
    private ShopPolicy termsOfSale;

    /**
     * The shop’s terms of service.
     */
    private ShopPolicy termsOfService;

    public Shop build() {
      Shop result = new Shop();
      result.brand = this.brand;
      result.contactInformation = this.contactInformation;
      result.customerAccountTranslations = this.customerAccountTranslations;
      result.customerAccountUrl = this.customerAccountUrl;
      result.description = this.description;
      result.id = this.id;
      result.legalNotice = this.legalNotice;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.moneyFormat = this.moneyFormat;
      result.name = this.name;
      result.paymentSettings = this.paymentSettings;
      result.primaryDomain = this.primaryDomain;
      result.privacyPolicy = this.privacyPolicy;
      result.refundPolicy = this.refundPolicy;
      result.shippingPolicy = this.shippingPolicy;
      result.shipsToCountries = this.shipsToCountries;
      result.shopPayInstallmentsPricing = this.shopPayInstallmentsPricing;
      result.socialLoginProviders = this.socialLoginProviders;
      result.subscriptionPolicy = this.subscriptionPolicy;
      result.termsOfSale = this.termsOfSale;
      result.termsOfService = this.termsOfService;
      return result;
    }

    /**
     * The shop's branding configuration.
     */
    public Builder brand(Brand brand) {
      this.brand = brand;
      return this;
    }

    /**
     * The shop's contact information.
     */
    public Builder contactInformation(ShopPolicy contactInformation) {
      this.contactInformation = contactInformation;
      return this;
    }

    /**
     * Translations for customer accounts.
     */
    public Builder customerAccountTranslations(List<Translation> customerAccountTranslations) {
      this.customerAccountTranslations = customerAccountTranslations;
      return this;
    }

    /**
     * The URL for the customer account (only present if shop has a customer account vanity domain).
     */
    public Builder customerAccountUrl(String customerAccountUrl) {
      this.customerAccountUrl = customerAccountUrl;
      return this;
    }

    /**
     * A description of the shop.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The shop's legal notice.
     */
    public Builder legalNotice(ShopPolicy legalNotice) {
      this.legalNotice = legalNotice;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A string representing the way currency is formatted when the currency isn’t specified.
     */
    public Builder moneyFormat(String moneyFormat) {
      this.moneyFormat = moneyFormat;
      return this;
    }

    /**
     * The shop’s name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Settings related to payments.
     */
    public Builder paymentSettings(PaymentSettings paymentSettings) {
      this.paymentSettings = paymentSettings;
      return this;
    }

    /**
     * The primary domain of the shop’s Online Store.
     */
    public Builder primaryDomain(Domain primaryDomain) {
      this.primaryDomain = primaryDomain;
      return this;
    }

    /**
     * The shop’s privacy policy.
     */
    public Builder privacyPolicy(ShopPolicy privacyPolicy) {
      this.privacyPolicy = privacyPolicy;
      return this;
    }

    /**
     * The shop’s refund policy.
     */
    public Builder refundPolicy(ShopPolicy refundPolicy) {
      this.refundPolicy = refundPolicy;
      return this;
    }

    /**
     * The shop’s shipping policy.
     */
    public Builder shippingPolicy(ShopPolicy shippingPolicy) {
      this.shippingPolicy = shippingPolicy;
      return this;
    }

    /**
     * Countries that the shop ships to.
     */
    public Builder shipsToCountries(List<CountryCode> shipsToCountries) {
      this.shipsToCountries = shipsToCountries;
      return this;
    }

    /**
     * The Shop Pay Installments pricing information for the shop.
     */
    public Builder shopPayInstallmentsPricing(
        ShopPayInstallmentsPricing shopPayInstallmentsPricing) {
      this.shopPayInstallmentsPricing = shopPayInstallmentsPricing;
      return this;
    }

    /**
     * The social login providers for customer accounts.
     */
    public Builder socialLoginProviders(List<SocialLoginProvider> socialLoginProviders) {
      this.socialLoginProviders = socialLoginProviders;
      return this;
    }

    /**
     * The shop’s subscription policy.
     */
    public Builder subscriptionPolicy(ShopPolicyWithDefault subscriptionPolicy) {
      this.subscriptionPolicy = subscriptionPolicy;
      return this;
    }

    /**
     * The shop's terms of sale.
     */
    public Builder termsOfSale(ShopPolicy termsOfSale) {
      this.termsOfSale = termsOfSale;
      return this;
    }

    /**
     * The shop’s terms of service.
     */
    public Builder termsOfService(ShopPolicy termsOfService) {
      this.termsOfService = termsOfService;
      return this;
    }
  }
}
