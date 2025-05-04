package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a collection of general settings and information about the shop.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Shop implements MetafieldReferencer, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.HasPublishedTranslations, com.shopify.admin.types.Node {
  /**
   * Account owner information.
   */
  private StaffMember accountOwner;

  /**
   * A list of the shop's active alert messages that appear in the Shopify admin.
   */
  private List<ShopAlert> alerts;

  /**
   * A list of the shop's product categories. Limit: 1000 product categories.
   */
  private List<ProductCategory> allProductCategories;

  /**
   * A list of the shop's product categories. Limit: 1000 product categories.
   */
  private List<TaxonomyCategory> allProductCategoriesList;

  /**
   * The token required to query the shop's reports or dashboards.
   */
  private String analyticsToken;

  /**
   * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
   *   
   * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
   * managed by
   * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
   * that are registered by the app.
   * One app (api_client) can host multiple fulfillment services on a shop.
   * Each fulfillment service manages a dedicated location on a shop.
   * Assigned fulfillment orders can have associated
   * [fulfillment requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
   * or might currently not be requested to be fulfilled.
   *   
   * The app must have `read_assigned_fulfillment_orders`
   * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
   * to be able to retrieve fulfillment orders assigned to its locations.
   *   
   * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
   * Perform filtering with the `assignmentStatus` argument
   * to receive only fulfillment orders that have been requested to be fulfilled.
   */
  private FulfillmentOrderConnection assignedFulfillmentOrders;

  /**
   * The list of sales channels not currently installed on the shop.
   */
  private AppConnection availableChannelApps;

  /**
   * The shop's billing address information.
   */
  private ShopAddress billingAddress;

  /**
   * List of all channel definitions associated with a shop.
   */
  private List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels;

  /**
   * List of the shop's active sales channels.
   */
  private ChannelConnection channels;

  /**
   * Specifies whether the shop supports checkouts via Checkout API.
   */
  private boolean checkoutApiSupported;

  /**
   * List of the shop's collections.
   */
  private CollectionConnection collections;

  /**
   * The public-facing contact email address for the shop.
   * Customers will use this email to communicate with the shop owner.
   */
  private String contactEmail;

  /**
   * Countries that have been defined in shipping zones for the shop.
   */
  private CountriesInShippingZones countriesInShippingZones;

  /**
   * The date and time when the shop was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The three letter code for the currency that the shop sells in.
   */
  private CurrencyCode currencyCode;

  /**
   * How currencies are displayed on your store.
   */
  private CurrencyFormats currencyFormats;

  /**
   * The presentment currency settings for the shop excluding the shop's own currency.
   */
  private CurrencySettingConnection currencySettings;

  /**
   * Whether customer accounts are required, optional, or disabled for the shop.
   */
  private ShopCustomerAccountsSetting customerAccounts;

  /**
   * Information about the shop's customer accounts.
   */
  private CustomerAccountsV2 customerAccountsV2;

  /**
   * A list of tags that have been added to customer accounts.
   */
  private StringConnection customerTags;

  /**
   * Customer accounts associated to the shop.
   */
  private CustomerConnection customers;

  /**
   * The shop's meta description used in search engine results.
   */
  private String description;

  /**
   * The domains configured for the shop.
   */
  private List<Domain> domains;

  /**
   * A list of tags that have been added to draft orders.
   */
  private StringConnection draftOrderTags;

  /**
   * List of saved draft orders on the shop.
   */
  private DraftOrderConnection draftOrders;

  /**
   * The shop owner's email address.
   * Shopify will use this email address to communicate with the shop owner.
   */
  private String email;

  /**
   * The presentment currencies enabled for the shop.
   */
  private List<CurrencyCode> enabledPresentmentCurrencies;

  /**
   * The entitlements for a shop.
   */
  private EntitlementsType entitlements;

  /**
   * The set of features enabled for the shop.
   */
  private ShopFeatures features;

  /**
   * The paginated list of merchant-managed and third-party fulfillment orders.
   */
  private FulfillmentOrderConnection fulfillmentOrders;

  /**
   * List of the shop's installed fulfillment services.
   */
  private List<FulfillmentService> fulfillmentServices;

  /**
   * The shop's time zone as defined by the IANA.
   */
  private String ianaTimezone;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * List of the shop's inventory items.
   */
  private InventoryItemConnection inventoryItems;

  /**
   * The number of pendings orders on the shop.
   * Limited to a maximum of 10000.
   */
  private LimitedPendingOrderCount limitedPendingOrderCount;

  /**
   * List of active locations of the shop.
   */
  private LocationConnection locations;

  /**
   * Whether SMS marketing has been enabled on the shop's checkout configuration settings.
   */
  private boolean marketingSmsConsentEnabledAtCheckout;

  /**
   * The approval signals for a shop to support onboarding to channel apps.
   */
  private MerchantApprovalSignals merchantApprovalSignals;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The shop's .myshopify.com domain name.
   */
  private String myshopifyDomain;

  /**
   * The shop's name.
   */
  private String name;

  /**
   * The shop's settings related to navigation.
   */
  private List<NavigationItem> navigationSettings;

  /**
   * The prefix that appears before order numbers.
   */
  private String orderNumberFormatPrefix;

  /**
   * The suffix that appears after order numbers.
   */
  private String orderNumberFormatSuffix;

  /**
   * A list of tags that have been added to orders.
   */
  private StringConnection orderTags;

  /**
   * A list of the shop's orders.
   */
  private OrderConnection orders;

  /**
   * The shop's settings related to payments.
   */
  private PaymentSettings paymentSettings;

  /**
   * The shop's billing plan.
   */
  private ShopPlan plan;

  /**
   * The primary domain of the shop's online store.
   */
  private Domain primaryDomain;

  /**
   * The list of all images of all products for the shop.
   */
  private ImageConnection productImages;

  /**
   * A list of tags that have been added to products.
   */
  private StringConnection productTags;

  /**
   * The list of types added to products.
   */
  private StringConnection productTypes;

  /**
   * List of the shop's product variants.
   */
  private ProductVariantConnection productVariants;

  /**
   * The list of vendors added to products.
   */
  private StringConnection productVendors;

  /**
   * List of the shop's products.
   */
  private ProductConnection products;

  /**
   * The number of publications for the shop.
   */
  private int publicationCount;

  /**
   * The shop's limits for specific resources. For example, the maximum number
   * ofvariants allowed per product, or the maximum number of locations allowed.
   */
  private ShopResourceLimits resourceLimits;

  /**
   * The URL of the rich text editor that can be used for mobile devices.
   */
  private String richTextEditorUrl;

  /**
   * Fetches a list of admin search results by a specified query.
   */
  private SearchResultConnection search;

  /**
   * The list of search filter options for the shop. These can be used to filter productvisibility for the shop.
   */
  private SearchFilterOptions searchFilters;

  /**
   * Whether the shop has outstanding setup steps.
   */
  private boolean setupRequired;

  /**
   * The list of countries that the shop ships to.
   */
  private List<CountryCode> shipsToCountries;

  /**
   * The name of the shop owner.
   */
  private String shopOwnerName;

  /**
   * The list of all legal policies associated with a shop.
   */
  private List<ShopPolicy> shopPolicies;

  /**
   * The paginated list of the shop's staff members.
   */
  private StaffMemberConnection staffMembers;

  /**
   * The storefront access token of a private application. These are scoped per-application.
   */
  private StorefrontAccessTokenConnection storefrontAccessTokens;

  /**
   * The URL of the shop's storefront.
   */
  private String storefrontUrl;

  /**
   * Whether the shop charges taxes for shipping.
   */
  private boolean taxShipping;

  /**
   * Whether applicable taxes are included in the shop's product prices.
   */
  private boolean taxesIncluded;

  /**
   * The shop's time zone abbreviation.
   */
  private String timezoneAbbreviation;

  /**
   * The shop's time zone offset.
   */
  private String timezoneOffset;

  /**
   * The shop's time zone offset expressed as a number of minutes.
   */
  private int timezoneOffsetMinutes;

  /**
   * Whether transactional SMS sent by Shopify have been disabled for a shop.
   */
  private boolean transactionalSmsDisabled;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  /**
   * The shop's unit system for weights and measures.
   */
  private UnitSystem unitSystem;

  /**
   * The date and time when the shop was last updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The URL of the shop's online store.
   */
  private String url;

  /**
   * The shop's primary unit of weight for products and shipping.
   */
  private WeightUnit weightUnit;

  public Shop() {
  }

  /**
   * Account owner information.
   */
  public StaffMember getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(StaffMember accountOwner) {
    this.accountOwner = accountOwner;
  }

  /**
   * A list of the shop's active alert messages that appear in the Shopify admin.
   */
  public List<ShopAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ShopAlert> alerts) {
    this.alerts = alerts;
  }

  /**
   * A list of the shop's product categories. Limit: 1000 product categories.
   */
  public List<ProductCategory> getAllProductCategories() {
    return allProductCategories;
  }

  public void setAllProductCategories(List<ProductCategory> allProductCategories) {
    this.allProductCategories = allProductCategories;
  }

  /**
   * A list of the shop's product categories. Limit: 1000 product categories.
   */
  public List<TaxonomyCategory> getAllProductCategoriesList() {
    return allProductCategoriesList;
  }

  public void setAllProductCategoriesList(List<TaxonomyCategory> allProductCategoriesList) {
    this.allProductCategoriesList = allProductCategoriesList;
  }

  /**
   * The token required to query the shop's reports or dashboards.
   */
  public String getAnalyticsToken() {
    return analyticsToken;
  }

  public void setAnalyticsToken(String analyticsToken) {
    this.analyticsToken = analyticsToken;
  }

  /**
   * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
   *   
   * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
   * managed by
   * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
   * that are registered by the app.
   * One app (api_client) can host multiple fulfillment services on a shop.
   * Each fulfillment service manages a dedicated location on a shop.
   * Assigned fulfillment orders can have associated
   * [fulfillment requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
   * or might currently not be requested to be fulfilled.
   *   
   * The app must have `read_assigned_fulfillment_orders`
   * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
   * to be able to retrieve fulfillment orders assigned to its locations.
   *   
   * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
   * Perform filtering with the `assignmentStatus` argument
   * to receive only fulfillment orders that have been requested to be fulfilled.
   */
  public FulfillmentOrderConnection getAssignedFulfillmentOrders() {
    return assignedFulfillmentOrders;
  }

  public void setAssignedFulfillmentOrders(FulfillmentOrderConnection assignedFulfillmentOrders) {
    this.assignedFulfillmentOrders = assignedFulfillmentOrders;
  }

  /**
   * The list of sales channels not currently installed on the shop.
   */
  public AppConnection getAvailableChannelApps() {
    return availableChannelApps;
  }

  public void setAvailableChannelApps(AppConnection availableChannelApps) {
    this.availableChannelApps = availableChannelApps;
  }

  /**
   * The shop's billing address information.
   */
  public ShopAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(ShopAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * List of all channel definitions associated with a shop.
   */
  public List<AvailableChannelDefinitionsByChannel> getChannelDefinitionsForInstalledChannels() {
    return channelDefinitionsForInstalledChannels;
  }

  public void setChannelDefinitionsForInstalledChannels(
      List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels) {
    this.channelDefinitionsForInstalledChannels = channelDefinitionsForInstalledChannels;
  }

  /**
   * List of the shop's active sales channels.
   */
  public ChannelConnection getChannels() {
    return channels;
  }

  public void setChannels(ChannelConnection channels) {
    this.channels = channels;
  }

  /**
   * Specifies whether the shop supports checkouts via Checkout API.
   */
  public boolean getCheckoutApiSupported() {
    return checkoutApiSupported;
  }

  public void setCheckoutApiSupported(boolean checkoutApiSupported) {
    this.checkoutApiSupported = checkoutApiSupported;
  }

  /**
   * List of the shop's collections.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * The public-facing contact email address for the shop.
   * Customers will use this email to communicate with the shop owner.
   */
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  /**
   * Countries that have been defined in shipping zones for the shop.
   */
  public CountriesInShippingZones getCountriesInShippingZones() {
    return countriesInShippingZones;
  }

  public void setCountriesInShippingZones(CountriesInShippingZones countriesInShippingZones) {
    this.countriesInShippingZones = countriesInShippingZones;
  }

  /**
   * The date and time when the shop was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The three letter code for the currency that the shop sells in.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * How currencies are displayed on your store.
   */
  public CurrencyFormats getCurrencyFormats() {
    return currencyFormats;
  }

  public void setCurrencyFormats(CurrencyFormats currencyFormats) {
    this.currencyFormats = currencyFormats;
  }

  /**
   * The presentment currency settings for the shop excluding the shop's own currency.
   */
  public CurrencySettingConnection getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(CurrencySettingConnection currencySettings) {
    this.currencySettings = currencySettings;
  }

  /**
   * Whether customer accounts are required, optional, or disabled for the shop.
   */
  public ShopCustomerAccountsSetting getCustomerAccounts() {
    return customerAccounts;
  }

  public void setCustomerAccounts(ShopCustomerAccountsSetting customerAccounts) {
    this.customerAccounts = customerAccounts;
  }

  /**
   * Information about the shop's customer accounts.
   */
  public CustomerAccountsV2 getCustomerAccountsV2() {
    return customerAccountsV2;
  }

  public void setCustomerAccountsV2(CustomerAccountsV2 customerAccountsV2) {
    this.customerAccountsV2 = customerAccountsV2;
  }

  /**
   * A list of tags that have been added to customer accounts.
   */
  public StringConnection getCustomerTags() {
    return customerTags;
  }

  public void setCustomerTags(StringConnection customerTags) {
    this.customerTags = customerTags;
  }

  /**
   * Customer accounts associated to the shop.
   */
  public CustomerConnection getCustomers() {
    return customers;
  }

  public void setCustomers(CustomerConnection customers) {
    this.customers = customers;
  }

  /**
   * The shop's meta description used in search engine results.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The domains configured for the shop.
   */
  public List<Domain> getDomains() {
    return domains;
  }

  public void setDomains(List<Domain> domains) {
    this.domains = domains;
  }

  /**
   * A list of tags that have been added to draft orders.
   */
  public StringConnection getDraftOrderTags() {
    return draftOrderTags;
  }

  public void setDraftOrderTags(StringConnection draftOrderTags) {
    this.draftOrderTags = draftOrderTags;
  }

  /**
   * List of saved draft orders on the shop.
   */
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  /**
   * The shop owner's email address.
   * Shopify will use this email address to communicate with the shop owner.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The presentment currencies enabled for the shop.
   */
  public List<CurrencyCode> getEnabledPresentmentCurrencies() {
    return enabledPresentmentCurrencies;
  }

  public void setEnabledPresentmentCurrencies(List<CurrencyCode> enabledPresentmentCurrencies) {
    this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
  }

  /**
   * The entitlements for a shop.
   */
  public EntitlementsType getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(EntitlementsType entitlements) {
    this.entitlements = entitlements;
  }

  /**
   * The set of features enabled for the shop.
   */
  public ShopFeatures getFeatures() {
    return features;
  }

  public void setFeatures(ShopFeatures features) {
    this.features = features;
  }

  /**
   * The paginated list of merchant-managed and third-party fulfillment orders.
   */
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  /**
   * List of the shop's installed fulfillment services.
   */
  public List<FulfillmentService> getFulfillmentServices() {
    return fulfillmentServices;
  }

  public void setFulfillmentServices(List<FulfillmentService> fulfillmentServices) {
    this.fulfillmentServices = fulfillmentServices;
  }

  /**
   * The shop's time zone as defined by the IANA.
   */
  public String getIanaTimezone() {
    return ianaTimezone;
  }

  public void setIanaTimezone(String ianaTimezone) {
    this.ianaTimezone = ianaTimezone;
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
   * List of the shop's inventory items.
   */
  public InventoryItemConnection getInventoryItems() {
    return inventoryItems;
  }

  public void setInventoryItems(InventoryItemConnection inventoryItems) {
    this.inventoryItems = inventoryItems;
  }

  /**
   * The number of pendings orders on the shop.
   * Limited to a maximum of 10000.
   */
  public LimitedPendingOrderCount getLimitedPendingOrderCount() {
    return limitedPendingOrderCount;
  }

  public void setLimitedPendingOrderCount(LimitedPendingOrderCount limitedPendingOrderCount) {
    this.limitedPendingOrderCount = limitedPendingOrderCount;
  }

  /**
   * List of active locations of the shop.
   */
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  /**
   * Whether SMS marketing has been enabled on the shop's checkout configuration settings.
   */
  public boolean getMarketingSmsConsentEnabledAtCheckout() {
    return marketingSmsConsentEnabledAtCheckout;
  }

  public void setMarketingSmsConsentEnabledAtCheckout(
      boolean marketingSmsConsentEnabledAtCheckout) {
    this.marketingSmsConsentEnabledAtCheckout = marketingSmsConsentEnabledAtCheckout;
  }

  /**
   * The approval signals for a shop to support onboarding to channel apps.
   */
  public MerchantApprovalSignals getMerchantApprovalSignals() {
    return merchantApprovalSignals;
  }

  public void setMerchantApprovalSignals(MerchantApprovalSignals merchantApprovalSignals) {
    this.merchantApprovalSignals = merchantApprovalSignals;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The shop's .myshopify.com domain name.
   */
  public String getMyshopifyDomain() {
    return myshopifyDomain;
  }

  public void setMyshopifyDomain(String myshopifyDomain) {
    this.myshopifyDomain = myshopifyDomain;
  }

  /**
   * The shop's name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The shop's settings related to navigation.
   */
  public List<NavigationItem> getNavigationSettings() {
    return navigationSettings;
  }

  public void setNavigationSettings(List<NavigationItem> navigationSettings) {
    this.navigationSettings = navigationSettings;
  }

  /**
   * The prefix that appears before order numbers.
   */
  public String getOrderNumberFormatPrefix() {
    return orderNumberFormatPrefix;
  }

  public void setOrderNumberFormatPrefix(String orderNumberFormatPrefix) {
    this.orderNumberFormatPrefix = orderNumberFormatPrefix;
  }

  /**
   * The suffix that appears after order numbers.
   */
  public String getOrderNumberFormatSuffix() {
    return orderNumberFormatSuffix;
  }

  public void setOrderNumberFormatSuffix(String orderNumberFormatSuffix) {
    this.orderNumberFormatSuffix = orderNumberFormatSuffix;
  }

  /**
   * A list of tags that have been added to orders.
   */
  public StringConnection getOrderTags() {
    return orderTags;
  }

  public void setOrderTags(StringConnection orderTags) {
    this.orderTags = orderTags;
  }

  /**
   * A list of the shop's orders.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * The shop's settings related to payments.
   */
  public PaymentSettings getPaymentSettings() {
    return paymentSettings;
  }

  public void setPaymentSettings(PaymentSettings paymentSettings) {
    this.paymentSettings = paymentSettings;
  }

  /**
   * The shop's billing plan.
   */
  public ShopPlan getPlan() {
    return plan;
  }

  public void setPlan(ShopPlan plan) {
    this.plan = plan;
  }

  /**
   * The primary domain of the shop's online store.
   */
  public Domain getPrimaryDomain() {
    return primaryDomain;
  }

  public void setPrimaryDomain(Domain primaryDomain) {
    this.primaryDomain = primaryDomain;
  }

  /**
   * The list of all images of all products for the shop.
   */
  public ImageConnection getProductImages() {
    return productImages;
  }

  public void setProductImages(ImageConnection productImages) {
    this.productImages = productImages;
  }

  /**
   * A list of tags that have been added to products.
   */
  public StringConnection getProductTags() {
    return productTags;
  }

  public void setProductTags(StringConnection productTags) {
    this.productTags = productTags;
  }

  /**
   * The list of types added to products.
   */
  public StringConnection getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(StringConnection productTypes) {
    this.productTypes = productTypes;
  }

  /**
   * List of the shop's product variants.
   */
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  /**
   * The list of vendors added to products.
   */
  public StringConnection getProductVendors() {
    return productVendors;
  }

  public void setProductVendors(StringConnection productVendors) {
    this.productVendors = productVendors;
  }

  /**
   * List of the shop's products.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * The number of publications for the shop.
   */
  public int getPublicationCount() {
    return publicationCount;
  }

  public void setPublicationCount(int publicationCount) {
    this.publicationCount = publicationCount;
  }

  /**
   * The shop's limits for specific resources. For example, the maximum number
   * ofvariants allowed per product, or the maximum number of locations allowed.
   */
  public ShopResourceLimits getResourceLimits() {
    return resourceLimits;
  }

  public void setResourceLimits(ShopResourceLimits resourceLimits) {
    this.resourceLimits = resourceLimits;
  }

  /**
   * The URL of the rich text editor that can be used for mobile devices.
   */
  public String getRichTextEditorUrl() {
    return richTextEditorUrl;
  }

  public void setRichTextEditorUrl(String richTextEditorUrl) {
    this.richTextEditorUrl = richTextEditorUrl;
  }

  /**
   * Fetches a list of admin search results by a specified query.
   */
  public SearchResultConnection getSearch() {
    return search;
  }

  public void setSearch(SearchResultConnection search) {
    this.search = search;
  }

  /**
   * The list of search filter options for the shop. These can be used to filter productvisibility for the shop.
   */
  public SearchFilterOptions getSearchFilters() {
    return searchFilters;
  }

  public void setSearchFilters(SearchFilterOptions searchFilters) {
    this.searchFilters = searchFilters;
  }

  /**
   * Whether the shop has outstanding setup steps.
   */
  public boolean getSetupRequired() {
    return setupRequired;
  }

  public void setSetupRequired(boolean setupRequired) {
    this.setupRequired = setupRequired;
  }

  /**
   * The list of countries that the shop ships to.
   */
  public List<CountryCode> getShipsToCountries() {
    return shipsToCountries;
  }

  public void setShipsToCountries(List<CountryCode> shipsToCountries) {
    this.shipsToCountries = shipsToCountries;
  }

  /**
   * The name of the shop owner.
   */
  public String getShopOwnerName() {
    return shopOwnerName;
  }

  public void setShopOwnerName(String shopOwnerName) {
    this.shopOwnerName = shopOwnerName;
  }

  /**
   * The list of all legal policies associated with a shop.
   */
  public List<ShopPolicy> getShopPolicies() {
    return shopPolicies;
  }

  public void setShopPolicies(List<ShopPolicy> shopPolicies) {
    this.shopPolicies = shopPolicies;
  }

  /**
   * The paginated list of the shop's staff members.
   */
  public StaffMemberConnection getStaffMembers() {
    return staffMembers;
  }

  public void setStaffMembers(StaffMemberConnection staffMembers) {
    this.staffMembers = staffMembers;
  }

  /**
   * The storefront access token of a private application. These are scoped per-application.
   */
  public StorefrontAccessTokenConnection getStorefrontAccessTokens() {
    return storefrontAccessTokens;
  }

  public void setStorefrontAccessTokens(StorefrontAccessTokenConnection storefrontAccessTokens) {
    this.storefrontAccessTokens = storefrontAccessTokens;
  }

  /**
   * The URL of the shop's storefront.
   */
  public String getStorefrontUrl() {
    return storefrontUrl;
  }

  public void setStorefrontUrl(String storefrontUrl) {
    this.storefrontUrl = storefrontUrl;
  }

  /**
   * Whether the shop charges taxes for shipping.
   */
  public boolean getTaxShipping() {
    return taxShipping;
  }

  public void setTaxShipping(boolean taxShipping) {
    this.taxShipping = taxShipping;
  }

  /**
   * Whether applicable taxes are included in the shop's product prices.
   */
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  /**
   * The shop's time zone abbreviation.
   */
  public String getTimezoneAbbreviation() {
    return timezoneAbbreviation;
  }

  public void setTimezoneAbbreviation(String timezoneAbbreviation) {
    this.timezoneAbbreviation = timezoneAbbreviation;
  }

  /**
   * The shop's time zone offset.
   */
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  /**
   * The shop's time zone offset expressed as a number of minutes.
   */
  public int getTimezoneOffsetMinutes() {
    return timezoneOffsetMinutes;
  }

  public void setTimezoneOffsetMinutes(int timezoneOffsetMinutes) {
    this.timezoneOffsetMinutes = timezoneOffsetMinutes;
  }

  /**
   * Whether transactional SMS sent by Shopify have been disabled for a shop.
   */
  public boolean getTransactionalSmsDisabled() {
    return transactionalSmsDisabled;
  }

  public void setTransactionalSmsDisabled(boolean transactionalSmsDisabled) {
    this.transactionalSmsDisabled = transactionalSmsDisabled;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  /**
   * The shop's unit system for weights and measures.
   */
  public UnitSystem getUnitSystem() {
    return unitSystem;
  }

  public void setUnitSystem(UnitSystem unitSystem) {
    this.unitSystem = unitSystem;
  }

  /**
   * The date and time when the shop was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The URL of the shop's online store.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The shop's primary unit of weight for products and shipping.
   */
  public WeightUnit getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(WeightUnit weightUnit) {
    this.weightUnit = weightUnit;
  }

  @Override
  public String toString() {
    return "Shop{accountOwner='" + accountOwner + "', alerts='" + alerts + "', allProductCategories='" + allProductCategories + "', allProductCategoriesList='" + allProductCategoriesList + "', analyticsToken='" + analyticsToken + "', assignedFulfillmentOrders='" + assignedFulfillmentOrders + "', availableChannelApps='" + availableChannelApps + "', billingAddress='" + billingAddress + "', channelDefinitionsForInstalledChannels='" + channelDefinitionsForInstalledChannels + "', channels='" + channels + "', checkoutApiSupported='" + checkoutApiSupported + "', collections='" + collections + "', contactEmail='" + contactEmail + "', countriesInShippingZones='" + countriesInShippingZones + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', currencyFormats='" + currencyFormats + "', currencySettings='" + currencySettings + "', customerAccounts='" + customerAccounts + "', customerAccountsV2='" + customerAccountsV2 + "', customerTags='" + customerTags + "', customers='" + customers + "', description='" + description + "', domains='" + domains + "', draftOrderTags='" + draftOrderTags + "', draftOrders='" + draftOrders + "', email='" + email + "', enabledPresentmentCurrencies='" + enabledPresentmentCurrencies + "', entitlements='" + entitlements + "', features='" + features + "', fulfillmentOrders='" + fulfillmentOrders + "', fulfillmentServices='" + fulfillmentServices + "', ianaTimezone='" + ianaTimezone + "', id='" + id + "', inventoryItems='" + inventoryItems + "', limitedPendingOrderCount='" + limitedPendingOrderCount + "', locations='" + locations + "', marketingSmsConsentEnabledAtCheckout='" + marketingSmsConsentEnabledAtCheckout + "', merchantApprovalSignals='" + merchantApprovalSignals + "', metafield='" + metafield + "', metafields='" + metafields + "', myshopifyDomain='" + myshopifyDomain + "', name='" + name + "', navigationSettings='" + navigationSettings + "', orderNumberFormatPrefix='" + orderNumberFormatPrefix + "', orderNumberFormatSuffix='" + orderNumberFormatSuffix + "', orderTags='" + orderTags + "', orders='" + orders + "', paymentSettings='" + paymentSettings + "', plan='" + plan + "', primaryDomain='" + primaryDomain + "', productImages='" + productImages + "', productTags='" + productTags + "', productTypes='" + productTypes + "', productVariants='" + productVariants + "', productVendors='" + productVendors + "', products='" + products + "', publicationCount='" + publicationCount + "', resourceLimits='" + resourceLimits + "', richTextEditorUrl='" + richTextEditorUrl + "', search='" + search + "', searchFilters='" + searchFilters + "', setupRequired='" + setupRequired + "', shipsToCountries='" + shipsToCountries + "', shopOwnerName='" + shopOwnerName + "', shopPolicies='" + shopPolicies + "', staffMembers='" + staffMembers + "', storefrontAccessTokens='" + storefrontAccessTokens + "', storefrontUrl='" + storefrontUrl + "', taxShipping='" + taxShipping + "', taxesIncluded='" + taxesIncluded + "', timezoneAbbreviation='" + timezoneAbbreviation + "', timezoneOffset='" + timezoneOffset + "', timezoneOffsetMinutes='" + timezoneOffsetMinutes + "', transactionalSmsDisabled='" + transactionalSmsDisabled + "', translations='" + translations + "', unitSystem='" + unitSystem + "', updatedAt='" + updatedAt + "', url='" + url + "', weightUnit='" + weightUnit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Shop that = (Shop) o;
    return Objects.equals(accountOwner, that.accountOwner) &&
        Objects.equals(alerts, that.alerts) &&
        Objects.equals(allProductCategories, that.allProductCategories) &&
        Objects.equals(allProductCategoriesList, that.allProductCategoriesList) &&
        Objects.equals(analyticsToken, that.analyticsToken) &&
        Objects.equals(assignedFulfillmentOrders, that.assignedFulfillmentOrders) &&
        Objects.equals(availableChannelApps, that.availableChannelApps) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(channelDefinitionsForInstalledChannels, that.channelDefinitionsForInstalledChannels) &&
        Objects.equals(channels, that.channels) &&
        checkoutApiSupported == that.checkoutApiSupported &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(contactEmail, that.contactEmail) &&
        Objects.equals(countriesInShippingZones, that.countriesInShippingZones) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(currencyFormats, that.currencyFormats) &&
        Objects.equals(currencySettings, that.currencySettings) &&
        Objects.equals(customerAccounts, that.customerAccounts) &&
        Objects.equals(customerAccountsV2, that.customerAccountsV2) &&
        Objects.equals(customerTags, that.customerTags) &&
        Objects.equals(customers, that.customers) &&
        Objects.equals(description, that.description) &&
        Objects.equals(domains, that.domains) &&
        Objects.equals(draftOrderTags, that.draftOrderTags) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(email, that.email) &&
        Objects.equals(enabledPresentmentCurrencies, that.enabledPresentmentCurrencies) &&
        Objects.equals(entitlements, that.entitlements) &&
        Objects.equals(features, that.features) &&
        Objects.equals(fulfillmentOrders, that.fulfillmentOrders) &&
        Objects.equals(fulfillmentServices, that.fulfillmentServices) &&
        Objects.equals(ianaTimezone, that.ianaTimezone) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryItems, that.inventoryItems) &&
        Objects.equals(limitedPendingOrderCount, that.limitedPendingOrderCount) &&
        Objects.equals(locations, that.locations) &&
        marketingSmsConsentEnabledAtCheckout == that.marketingSmsConsentEnabledAtCheckout &&
        Objects.equals(merchantApprovalSignals, that.merchantApprovalSignals) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(myshopifyDomain, that.myshopifyDomain) &&
        Objects.equals(name, that.name) &&
        Objects.equals(navigationSettings, that.navigationSettings) &&
        Objects.equals(orderNumberFormatPrefix, that.orderNumberFormatPrefix) &&
        Objects.equals(orderNumberFormatSuffix, that.orderNumberFormatSuffix) &&
        Objects.equals(orderTags, that.orderTags) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(paymentSettings, that.paymentSettings) &&
        Objects.equals(plan, that.plan) &&
        Objects.equals(primaryDomain, that.primaryDomain) &&
        Objects.equals(productImages, that.productImages) &&
        Objects.equals(productTags, that.productTags) &&
        Objects.equals(productTypes, that.productTypes) &&
        Objects.equals(productVariants, that.productVariants) &&
        Objects.equals(productVendors, that.productVendors) &&
        Objects.equals(products, that.products) &&
        publicationCount == that.publicationCount &&
        Objects.equals(resourceLimits, that.resourceLimits) &&
        Objects.equals(richTextEditorUrl, that.richTextEditorUrl) &&
        Objects.equals(search, that.search) &&
        Objects.equals(searchFilters, that.searchFilters) &&
        setupRequired == that.setupRequired &&
        Objects.equals(shipsToCountries, that.shipsToCountries) &&
        Objects.equals(shopOwnerName, that.shopOwnerName) &&
        Objects.equals(shopPolicies, that.shopPolicies) &&
        Objects.equals(staffMembers, that.staffMembers) &&
        Objects.equals(storefrontAccessTokens, that.storefrontAccessTokens) &&
        Objects.equals(storefrontUrl, that.storefrontUrl) &&
        taxShipping == that.taxShipping &&
        taxesIncluded == that.taxesIncluded &&
        Objects.equals(timezoneAbbreviation, that.timezoneAbbreviation) &&
        Objects.equals(timezoneOffset, that.timezoneOffset) &&
        timezoneOffsetMinutes == that.timezoneOffsetMinutes &&
        transactionalSmsDisabled == that.transactionalSmsDisabled &&
        Objects.equals(translations, that.translations) &&
        Objects.equals(unitSystem, that.unitSystem) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url) &&
        Objects.equals(weightUnit, that.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountOwner, alerts, allProductCategories, allProductCategoriesList, analyticsToken, assignedFulfillmentOrders, availableChannelApps, billingAddress, channelDefinitionsForInstalledChannels, channels, checkoutApiSupported, collections, contactEmail, countriesInShippingZones, createdAt, currencyCode, currencyFormats, currencySettings, customerAccounts, customerAccountsV2, customerTags, customers, description, domains, draftOrderTags, draftOrders, email, enabledPresentmentCurrencies, entitlements, features, fulfillmentOrders, fulfillmentServices, ianaTimezone, id, inventoryItems, limitedPendingOrderCount, locations, marketingSmsConsentEnabledAtCheckout, merchantApprovalSignals, metafield, metafields, myshopifyDomain, name, navigationSettings, orderNumberFormatPrefix, orderNumberFormatSuffix, orderTags, orders, paymentSettings, plan, primaryDomain, productImages, productTags, productTypes, productVariants, productVendors, products, publicationCount, resourceLimits, richTextEditorUrl, search, searchFilters, setupRequired, shipsToCountries, shopOwnerName, shopPolicies, staffMembers, storefrontAccessTokens, storefrontUrl, taxShipping, taxesIncluded, timezoneAbbreviation, timezoneOffset, timezoneOffsetMinutes, transactionalSmsDisabled, translations, unitSystem, updatedAt, url, weightUnit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Account owner information.
     */
    private StaffMember accountOwner;

    /**
     * A list of the shop's active alert messages that appear in the Shopify admin.
     */
    private List<ShopAlert> alerts;

    /**
     * A list of the shop's product categories. Limit: 1000 product categories.
     */
    private List<ProductCategory> allProductCategories;

    /**
     * A list of the shop's product categories. Limit: 1000 product categories.
     */
    private List<TaxonomyCategory> allProductCategoriesList;

    /**
     * The token required to query the shop's reports or dashboards.
     */
    private String analyticsToken;

    /**
     * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
     *   
     * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
     * managed by
     * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
     * that are registered by the app.
     * One app (api_client) can host multiple fulfillment services on a shop.
     * Each fulfillment service manages a dedicated location on a shop.
     * Assigned fulfillment orders can have associated
     * [fulfillment requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
     * or might currently not be requested to be fulfilled.
     *   
     * The app must have `read_assigned_fulfillment_orders`
     * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
     * to be able to retrieve fulfillment orders assigned to its locations.
     *   
     * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
     * Perform filtering with the `assignmentStatus` argument
     * to receive only fulfillment orders that have been requested to be fulfilled.
     */
    private FulfillmentOrderConnection assignedFulfillmentOrders;

    /**
     * The list of sales channels not currently installed on the shop.
     */
    private AppConnection availableChannelApps;

    /**
     * The shop's billing address information.
     */
    private ShopAddress billingAddress;

    /**
     * List of all channel definitions associated with a shop.
     */
    private List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels;

    /**
     * List of the shop's active sales channels.
     */
    private ChannelConnection channels;

    /**
     * Specifies whether the shop supports checkouts via Checkout API.
     */
    private boolean checkoutApiSupported;

    /**
     * List of the shop's collections.
     */
    private CollectionConnection collections;

    /**
     * The public-facing contact email address for the shop.
     * Customers will use this email to communicate with the shop owner.
     */
    private String contactEmail;

    /**
     * Countries that have been defined in shipping zones for the shop.
     */
    private CountriesInShippingZones countriesInShippingZones;

    /**
     * The date and time when the shop was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The three letter code for the currency that the shop sells in.
     */
    private CurrencyCode currencyCode;

    /**
     * How currencies are displayed on your store.
     */
    private CurrencyFormats currencyFormats;

    /**
     * The presentment currency settings for the shop excluding the shop's own currency.
     */
    private CurrencySettingConnection currencySettings;

    /**
     * Whether customer accounts are required, optional, or disabled for the shop.
     */
    private ShopCustomerAccountsSetting customerAccounts;

    /**
     * Information about the shop's customer accounts.
     */
    private CustomerAccountsV2 customerAccountsV2;

    /**
     * A list of tags that have been added to customer accounts.
     */
    private StringConnection customerTags;

    /**
     * Customer accounts associated to the shop.
     */
    private CustomerConnection customers;

    /**
     * The shop's meta description used in search engine results.
     */
    private String description;

    /**
     * The domains configured for the shop.
     */
    private List<Domain> domains;

    /**
     * A list of tags that have been added to draft orders.
     */
    private StringConnection draftOrderTags;

    /**
     * List of saved draft orders on the shop.
     */
    private DraftOrderConnection draftOrders;

    /**
     * The shop owner's email address.
     * Shopify will use this email address to communicate with the shop owner.
     */
    private String email;

    /**
     * The presentment currencies enabled for the shop.
     */
    private List<CurrencyCode> enabledPresentmentCurrencies;

    /**
     * The entitlements for a shop.
     */
    private EntitlementsType entitlements;

    /**
     * The set of features enabled for the shop.
     */
    private ShopFeatures features;

    /**
     * The paginated list of merchant-managed and third-party fulfillment orders.
     */
    private FulfillmentOrderConnection fulfillmentOrders;

    /**
     * List of the shop's installed fulfillment services.
     */
    private List<FulfillmentService> fulfillmentServices;

    /**
     * The shop's time zone as defined by the IANA.
     */
    private String ianaTimezone;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * List of the shop's inventory items.
     */
    private InventoryItemConnection inventoryItems;

    /**
     * The number of pendings orders on the shop.
     * Limited to a maximum of 10000.
     */
    private LimitedPendingOrderCount limitedPendingOrderCount;

    /**
     * List of active locations of the shop.
     */
    private LocationConnection locations;

    /**
     * Whether SMS marketing has been enabled on the shop's checkout configuration settings.
     */
    private boolean marketingSmsConsentEnabledAtCheckout;

    /**
     * The approval signals for a shop to support onboarding to channel apps.
     */
    private MerchantApprovalSignals merchantApprovalSignals;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The shop's .myshopify.com domain name.
     */
    private String myshopifyDomain;

    /**
     * The shop's name.
     */
    private String name;

    /**
     * The shop's settings related to navigation.
     */
    private List<NavigationItem> navigationSettings;

    /**
     * The prefix that appears before order numbers.
     */
    private String orderNumberFormatPrefix;

    /**
     * The suffix that appears after order numbers.
     */
    private String orderNumberFormatSuffix;

    /**
     * A list of tags that have been added to orders.
     */
    private StringConnection orderTags;

    /**
     * A list of the shop's orders.
     */
    private OrderConnection orders;

    /**
     * The shop's settings related to payments.
     */
    private PaymentSettings paymentSettings;

    /**
     * The shop's billing plan.
     */
    private ShopPlan plan;

    /**
     * The primary domain of the shop's online store.
     */
    private Domain primaryDomain;

    /**
     * The list of all images of all products for the shop.
     */
    private ImageConnection productImages;

    /**
     * A list of tags that have been added to products.
     */
    private StringConnection productTags;

    /**
     * The list of types added to products.
     */
    private StringConnection productTypes;

    /**
     * List of the shop's product variants.
     */
    private ProductVariantConnection productVariants;

    /**
     * The list of vendors added to products.
     */
    private StringConnection productVendors;

    /**
     * List of the shop's products.
     */
    private ProductConnection products;

    /**
     * The number of publications for the shop.
     */
    private int publicationCount;

    /**
     * The shop's limits for specific resources. For example, the maximum number
     * ofvariants allowed per product, or the maximum number of locations allowed.
     */
    private ShopResourceLimits resourceLimits;

    /**
     * The URL of the rich text editor that can be used for mobile devices.
     */
    private String richTextEditorUrl;

    /**
     * Fetches a list of admin search results by a specified query.
     */
    private SearchResultConnection search;

    /**
     * The list of search filter options for the shop. These can be used to filter productvisibility for the shop.
     */
    private SearchFilterOptions searchFilters;

    /**
     * Whether the shop has outstanding setup steps.
     */
    private boolean setupRequired;

    /**
     * The list of countries that the shop ships to.
     */
    private List<CountryCode> shipsToCountries;

    /**
     * The name of the shop owner.
     */
    private String shopOwnerName;

    /**
     * The list of all legal policies associated with a shop.
     */
    private List<ShopPolicy> shopPolicies;

    /**
     * The paginated list of the shop's staff members.
     */
    private StaffMemberConnection staffMembers;

    /**
     * The storefront access token of a private application. These are scoped per-application.
     */
    private StorefrontAccessTokenConnection storefrontAccessTokens;

    /**
     * The URL of the shop's storefront.
     */
    private String storefrontUrl;

    /**
     * Whether the shop charges taxes for shipping.
     */
    private boolean taxShipping;

    /**
     * Whether applicable taxes are included in the shop's product prices.
     */
    private boolean taxesIncluded;

    /**
     * The shop's time zone abbreviation.
     */
    private String timezoneAbbreviation;

    /**
     * The shop's time zone offset.
     */
    private String timezoneOffset;

    /**
     * The shop's time zone offset expressed as a number of minutes.
     */
    private int timezoneOffsetMinutes;

    /**
     * Whether transactional SMS sent by Shopify have been disabled for a shop.
     */
    private boolean transactionalSmsDisabled;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    /**
     * The shop's unit system for weights and measures.
     */
    private UnitSystem unitSystem;

    /**
     * The date and time when the shop was last updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The URL of the shop's online store.
     */
    private String url;

    /**
     * The shop's primary unit of weight for products and shipping.
     */
    private WeightUnit weightUnit;

    public Shop build() {
      Shop result = new Shop();
      result.accountOwner = this.accountOwner;
      result.alerts = this.alerts;
      result.allProductCategories = this.allProductCategories;
      result.allProductCategoriesList = this.allProductCategoriesList;
      result.analyticsToken = this.analyticsToken;
      result.assignedFulfillmentOrders = this.assignedFulfillmentOrders;
      result.availableChannelApps = this.availableChannelApps;
      result.billingAddress = this.billingAddress;
      result.channelDefinitionsForInstalledChannels = this.channelDefinitionsForInstalledChannels;
      result.channels = this.channels;
      result.checkoutApiSupported = this.checkoutApiSupported;
      result.collections = this.collections;
      result.contactEmail = this.contactEmail;
      result.countriesInShippingZones = this.countriesInShippingZones;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.currencyFormats = this.currencyFormats;
      result.currencySettings = this.currencySettings;
      result.customerAccounts = this.customerAccounts;
      result.customerAccountsV2 = this.customerAccountsV2;
      result.customerTags = this.customerTags;
      result.customers = this.customers;
      result.description = this.description;
      result.domains = this.domains;
      result.draftOrderTags = this.draftOrderTags;
      result.draftOrders = this.draftOrders;
      result.email = this.email;
      result.enabledPresentmentCurrencies = this.enabledPresentmentCurrencies;
      result.entitlements = this.entitlements;
      result.features = this.features;
      result.fulfillmentOrders = this.fulfillmentOrders;
      result.fulfillmentServices = this.fulfillmentServices;
      result.ianaTimezone = this.ianaTimezone;
      result.id = this.id;
      result.inventoryItems = this.inventoryItems;
      result.limitedPendingOrderCount = this.limitedPendingOrderCount;
      result.locations = this.locations;
      result.marketingSmsConsentEnabledAtCheckout = this.marketingSmsConsentEnabledAtCheckout;
      result.merchantApprovalSignals = this.merchantApprovalSignals;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.myshopifyDomain = this.myshopifyDomain;
      result.name = this.name;
      result.navigationSettings = this.navigationSettings;
      result.orderNumberFormatPrefix = this.orderNumberFormatPrefix;
      result.orderNumberFormatSuffix = this.orderNumberFormatSuffix;
      result.orderTags = this.orderTags;
      result.orders = this.orders;
      result.paymentSettings = this.paymentSettings;
      result.plan = this.plan;
      result.primaryDomain = this.primaryDomain;
      result.productImages = this.productImages;
      result.productTags = this.productTags;
      result.productTypes = this.productTypes;
      result.productVariants = this.productVariants;
      result.productVendors = this.productVendors;
      result.products = this.products;
      result.publicationCount = this.publicationCount;
      result.resourceLimits = this.resourceLimits;
      result.richTextEditorUrl = this.richTextEditorUrl;
      result.search = this.search;
      result.searchFilters = this.searchFilters;
      result.setupRequired = this.setupRequired;
      result.shipsToCountries = this.shipsToCountries;
      result.shopOwnerName = this.shopOwnerName;
      result.shopPolicies = this.shopPolicies;
      result.staffMembers = this.staffMembers;
      result.storefrontAccessTokens = this.storefrontAccessTokens;
      result.storefrontUrl = this.storefrontUrl;
      result.taxShipping = this.taxShipping;
      result.taxesIncluded = this.taxesIncluded;
      result.timezoneAbbreviation = this.timezoneAbbreviation;
      result.timezoneOffset = this.timezoneOffset;
      result.timezoneOffsetMinutes = this.timezoneOffsetMinutes;
      result.transactionalSmsDisabled = this.transactionalSmsDisabled;
      result.translations = this.translations;
      result.unitSystem = this.unitSystem;
      result.updatedAt = this.updatedAt;
      result.url = this.url;
      result.weightUnit = this.weightUnit;
      return result;
    }

    /**
     * Account owner information.
     */
    public Builder accountOwner(StaffMember accountOwner) {
      this.accountOwner = accountOwner;
      return this;
    }

    /**
     * A list of the shop's active alert messages that appear in the Shopify admin.
     */
    public Builder alerts(List<ShopAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    /**
     * A list of the shop's product categories. Limit: 1000 product categories.
     */
    public Builder allProductCategories(List<ProductCategory> allProductCategories) {
      this.allProductCategories = allProductCategories;
      return this;
    }

    /**
     * A list of the shop's product categories. Limit: 1000 product categories.
     */
    public Builder allProductCategoriesList(List<TaxonomyCategory> allProductCategoriesList) {
      this.allProductCategoriesList = allProductCategoriesList;
      return this;
    }

    /**
     * The token required to query the shop's reports or dashboards.
     */
    public Builder analyticsToken(String analyticsToken) {
      this.analyticsToken = analyticsToken;
      return this;
    }

    /**
     * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
     *   
     * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
     * managed by
     * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
     * that are registered by the app.
     * One app (api_client) can host multiple fulfillment services on a shop.
     * Each fulfillment service manages a dedicated location on a shop.
     * Assigned fulfillment orders can have associated
     * [fulfillment requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
     * or might currently not be requested to be fulfilled.
     *   
     * The app must have `read_assigned_fulfillment_orders`
     * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
     * to be able to retrieve fulfillment orders assigned to its locations.
     *   
     * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
     * Perform filtering with the `assignmentStatus` argument
     * to receive only fulfillment orders that have been requested to be fulfilled.
     */
    public Builder assignedFulfillmentOrders(FulfillmentOrderConnection assignedFulfillmentOrders) {
      this.assignedFulfillmentOrders = assignedFulfillmentOrders;
      return this;
    }

    /**
     * The list of sales channels not currently installed on the shop.
     */
    public Builder availableChannelApps(AppConnection availableChannelApps) {
      this.availableChannelApps = availableChannelApps;
      return this;
    }

    /**
     * The shop's billing address information.
     */
    public Builder billingAddress(ShopAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * List of all channel definitions associated with a shop.
     */
    public Builder channelDefinitionsForInstalledChannels(
        List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels) {
      this.channelDefinitionsForInstalledChannels = channelDefinitionsForInstalledChannels;
      return this;
    }

    /**
     * List of the shop's active sales channels.
     */
    public Builder channels(ChannelConnection channels) {
      this.channels = channels;
      return this;
    }

    /**
     * Specifies whether the shop supports checkouts via Checkout API.
     */
    public Builder checkoutApiSupported(boolean checkoutApiSupported) {
      this.checkoutApiSupported = checkoutApiSupported;
      return this;
    }

    /**
     * List of the shop's collections.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The public-facing contact email address for the shop.
     * Customers will use this email to communicate with the shop owner.
     */
    public Builder contactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    /**
     * Countries that have been defined in shipping zones for the shop.
     */
    public Builder countriesInShippingZones(CountriesInShippingZones countriesInShippingZones) {
      this.countriesInShippingZones = countriesInShippingZones;
      return this;
    }

    /**
     * The date and time when the shop was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The three letter code for the currency that the shop sells in.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * How currencies are displayed on your store.
     */
    public Builder currencyFormats(CurrencyFormats currencyFormats) {
      this.currencyFormats = currencyFormats;
      return this;
    }

    /**
     * The presentment currency settings for the shop excluding the shop's own currency.
     */
    public Builder currencySettings(CurrencySettingConnection currencySettings) {
      this.currencySettings = currencySettings;
      return this;
    }

    /**
     * Whether customer accounts are required, optional, or disabled for the shop.
     */
    public Builder customerAccounts(ShopCustomerAccountsSetting customerAccounts) {
      this.customerAccounts = customerAccounts;
      return this;
    }

    /**
     * Information about the shop's customer accounts.
     */
    public Builder customerAccountsV2(CustomerAccountsV2 customerAccountsV2) {
      this.customerAccountsV2 = customerAccountsV2;
      return this;
    }

    /**
     * A list of tags that have been added to customer accounts.
     */
    public Builder customerTags(StringConnection customerTags) {
      this.customerTags = customerTags;
      return this;
    }

    /**
     * Customer accounts associated to the shop.
     */
    public Builder customers(CustomerConnection customers) {
      this.customers = customers;
      return this;
    }

    /**
     * The shop's meta description used in search engine results.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The domains configured for the shop.
     */
    public Builder domains(List<Domain> domains) {
      this.domains = domains;
      return this;
    }

    /**
     * A list of tags that have been added to draft orders.
     */
    public Builder draftOrderTags(StringConnection draftOrderTags) {
      this.draftOrderTags = draftOrderTags;
      return this;
    }

    /**
     * List of saved draft orders on the shop.
     */
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    /**
     * The shop owner's email address.
     * Shopify will use this email address to communicate with the shop owner.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The presentment currencies enabled for the shop.
     */
    public Builder enabledPresentmentCurrencies(List<CurrencyCode> enabledPresentmentCurrencies) {
      this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
      return this;
    }

    /**
     * The entitlements for a shop.
     */
    public Builder entitlements(EntitlementsType entitlements) {
      this.entitlements = entitlements;
      return this;
    }

    /**
     * The set of features enabled for the shop.
     */
    public Builder features(ShopFeatures features) {
      this.features = features;
      return this;
    }

    /**
     * The paginated list of merchant-managed and third-party fulfillment orders.
     */
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    /**
     * List of the shop's installed fulfillment services.
     */
    public Builder fulfillmentServices(List<FulfillmentService> fulfillmentServices) {
      this.fulfillmentServices = fulfillmentServices;
      return this;
    }

    /**
     * The shop's time zone as defined by the IANA.
     */
    public Builder ianaTimezone(String ianaTimezone) {
      this.ianaTimezone = ianaTimezone;
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
     * List of the shop's inventory items.
     */
    public Builder inventoryItems(InventoryItemConnection inventoryItems) {
      this.inventoryItems = inventoryItems;
      return this;
    }

    /**
     * The number of pendings orders on the shop.
     * Limited to a maximum of 10000.
     */
    public Builder limitedPendingOrderCount(LimitedPendingOrderCount limitedPendingOrderCount) {
      this.limitedPendingOrderCount = limitedPendingOrderCount;
      return this;
    }

    /**
     * List of active locations of the shop.
     */
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Whether SMS marketing has been enabled on the shop's checkout configuration settings.
     */
    public Builder marketingSmsConsentEnabledAtCheckout(
        boolean marketingSmsConsentEnabledAtCheckout) {
      this.marketingSmsConsentEnabledAtCheckout = marketingSmsConsentEnabledAtCheckout;
      return this;
    }

    /**
     * The approval signals for a shop to support onboarding to channel apps.
     */
    public Builder merchantApprovalSignals(MerchantApprovalSignals merchantApprovalSignals) {
      this.merchantApprovalSignals = merchantApprovalSignals;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The shop's .myshopify.com domain name.
     */
    public Builder myshopifyDomain(String myshopifyDomain) {
      this.myshopifyDomain = myshopifyDomain;
      return this;
    }

    /**
     * The shop's name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The shop's settings related to navigation.
     */
    public Builder navigationSettings(List<NavigationItem> navigationSettings) {
      this.navigationSettings = navigationSettings;
      return this;
    }

    /**
     * The prefix that appears before order numbers.
     */
    public Builder orderNumberFormatPrefix(String orderNumberFormatPrefix) {
      this.orderNumberFormatPrefix = orderNumberFormatPrefix;
      return this;
    }

    /**
     * The suffix that appears after order numbers.
     */
    public Builder orderNumberFormatSuffix(String orderNumberFormatSuffix) {
      this.orderNumberFormatSuffix = orderNumberFormatSuffix;
      return this;
    }

    /**
     * A list of tags that have been added to orders.
     */
    public Builder orderTags(StringConnection orderTags) {
      this.orderTags = orderTags;
      return this;
    }

    /**
     * A list of the shop's orders.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * The shop's settings related to payments.
     */
    public Builder paymentSettings(PaymentSettings paymentSettings) {
      this.paymentSettings = paymentSettings;
      return this;
    }

    /**
     * The shop's billing plan.
     */
    public Builder plan(ShopPlan plan) {
      this.plan = plan;
      return this;
    }

    /**
     * The primary domain of the shop's online store.
     */
    public Builder primaryDomain(Domain primaryDomain) {
      this.primaryDomain = primaryDomain;
      return this;
    }

    /**
     * The list of all images of all products for the shop.
     */
    public Builder productImages(ImageConnection productImages) {
      this.productImages = productImages;
      return this;
    }

    /**
     * A list of tags that have been added to products.
     */
    public Builder productTags(StringConnection productTags) {
      this.productTags = productTags;
      return this;
    }

    /**
     * The list of types added to products.
     */
    public Builder productTypes(StringConnection productTypes) {
      this.productTypes = productTypes;
      return this;
    }

    /**
     * List of the shop's product variants.
     */
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    /**
     * The list of vendors added to products.
     */
    public Builder productVendors(StringConnection productVendors) {
      this.productVendors = productVendors;
      return this;
    }

    /**
     * List of the shop's products.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * The number of publications for the shop.
     */
    public Builder publicationCount(int publicationCount) {
      this.publicationCount = publicationCount;
      return this;
    }

    /**
     * The shop's limits for specific resources. For example, the maximum number
     * ofvariants allowed per product, or the maximum number of locations allowed.
     */
    public Builder resourceLimits(ShopResourceLimits resourceLimits) {
      this.resourceLimits = resourceLimits;
      return this;
    }

    /**
     * The URL of the rich text editor that can be used for mobile devices.
     */
    public Builder richTextEditorUrl(String richTextEditorUrl) {
      this.richTextEditorUrl = richTextEditorUrl;
      return this;
    }

    /**
     * Fetches a list of admin search results by a specified query.
     */
    public Builder search(SearchResultConnection search) {
      this.search = search;
      return this;
    }

    /**
     * The list of search filter options for the shop. These can be used to filter productvisibility for the shop.
     */
    public Builder searchFilters(SearchFilterOptions searchFilters) {
      this.searchFilters = searchFilters;
      return this;
    }

    /**
     * Whether the shop has outstanding setup steps.
     */
    public Builder setupRequired(boolean setupRequired) {
      this.setupRequired = setupRequired;
      return this;
    }

    /**
     * The list of countries that the shop ships to.
     */
    public Builder shipsToCountries(List<CountryCode> shipsToCountries) {
      this.shipsToCountries = shipsToCountries;
      return this;
    }

    /**
     * The name of the shop owner.
     */
    public Builder shopOwnerName(String shopOwnerName) {
      this.shopOwnerName = shopOwnerName;
      return this;
    }

    /**
     * The list of all legal policies associated with a shop.
     */
    public Builder shopPolicies(List<ShopPolicy> shopPolicies) {
      this.shopPolicies = shopPolicies;
      return this;
    }

    /**
     * The paginated list of the shop's staff members.
     */
    public Builder staffMembers(StaffMemberConnection staffMembers) {
      this.staffMembers = staffMembers;
      return this;
    }

    /**
     * The storefront access token of a private application. These are scoped per-application.
     */
    public Builder storefrontAccessTokens(StorefrontAccessTokenConnection storefrontAccessTokens) {
      this.storefrontAccessTokens = storefrontAccessTokens;
      return this;
    }

    /**
     * The URL of the shop's storefront.
     */
    public Builder storefrontUrl(String storefrontUrl) {
      this.storefrontUrl = storefrontUrl;
      return this;
    }

    /**
     * Whether the shop charges taxes for shipping.
     */
    public Builder taxShipping(boolean taxShipping) {
      this.taxShipping = taxShipping;
      return this;
    }

    /**
     * Whether applicable taxes are included in the shop's product prices.
     */
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    /**
     * The shop's time zone abbreviation.
     */
    public Builder timezoneAbbreviation(String timezoneAbbreviation) {
      this.timezoneAbbreviation = timezoneAbbreviation;
      return this;
    }

    /**
     * The shop's time zone offset.
     */
    public Builder timezoneOffset(String timezoneOffset) {
      this.timezoneOffset = timezoneOffset;
      return this;
    }

    /**
     * The shop's time zone offset expressed as a number of minutes.
     */
    public Builder timezoneOffsetMinutes(int timezoneOffsetMinutes) {
      this.timezoneOffsetMinutes = timezoneOffsetMinutes;
      return this;
    }

    /**
     * Whether transactional SMS sent by Shopify have been disabled for a shop.
     */
    public Builder transactionalSmsDisabled(boolean transactionalSmsDisabled) {
      this.transactionalSmsDisabled = transactionalSmsDisabled;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    /**
     * The shop's unit system for weights and measures.
     */
    public Builder unitSystem(UnitSystem unitSystem) {
      this.unitSystem = unitSystem;
      return this;
    }

    /**
     * The date and time when the shop was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The URL of the shop's online store.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The shop's primary unit of weight for products and shipping.
     */
    public Builder weightUnit(WeightUnit weightUnit) {
      this.weightUnit = weightUnit;
      return this;
    }
  }
}
