package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Shop implements MetafieldReferencer, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  
  private StaffMember accountOwner;

  
  private List<ShopAlert> alerts;

  
  private List<ProductCategory> allProductCategories;

  
  private List<TaxonomyCategory> allProductCategoriesList;

  
  private String analyticsToken;

  
  private FulfillmentOrderConnection assignedFulfillmentOrders;

  
  private AppConnection availableChannelApps;

  
  private ShopAddress billingAddress;

  
  private List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels;

  
  private ChannelConnection channels;

  
  private boolean checkoutApiSupported;

  
  private Collection collectionByHandle;

  
  private SavedSearchConnection collectionSavedSearches;

  
  private CollectionConnection collections;

  
  private String contactEmail;

  
  private CountriesInShippingZones countriesInShippingZones;

  
  private OffsetDateTime createdAt;

  
  private CurrencyCode currencyCode;

  
  private CurrencyFormats currencyFormats;

  
  private CurrencySettingConnection currencySettings;

  
  private ShopCustomerAccountsSetting customerAccounts;

  
  private CustomerAccountsV2 customerAccountsV2;

  
  private SavedSearchConnection customerSavedSearches;

  
  private StringConnection customerTags;

  
  private CustomerConnection customers;

  
  private String description;

  
  private List<Domain> domains;

  
  private SavedSearchConnection draftOrderSavedSearches;

  
  private StringConnection draftOrderTags;

  
  private DraftOrderConnection draftOrders;

  
  private String email;

  
  private List<CurrencyCode> enabledPresentmentCurrencies;

  
  private ShopFeatures features;

  
  private FulfillmentOrderConnection fulfillmentOrders;

  
  private List<FulfillmentService> fulfillmentServices;

  
  private String ianaTimezone;

  
  private String id;

  
  private InventoryItemConnection inventoryItems;

  
  private LimitedPendingOrderCount limitedPendingOrderCount;

  
  private LocationConnection locations;

  
  private MarketingEventConnection marketingEvents;

  
  private boolean marketingSmsConsentEnabledAtCheckout;

  
  private MerchantApprovalSignals merchantApprovalSignals;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private String myshopifyDomain;

  
  private String name;

  
  private List<NavigationItem> navigationSettings;

  
  private String orderNumberFormatPrefix;

  
  private String orderNumberFormatSuffix;

  
  private SavedSearchConnection orderSavedSearches;

  
  private StringConnection orderTags;

  
  private OrderConnection orders;

  
  private PaymentSettings paymentSettings;

  
  private ShopPlan plan;

  
  private Domain primaryDomain;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private Product productByHandle;

  
  private ImageConnection productImages;

  
  private SavedSearchConnection productSavedSearches;

  
  private StringConnection productTags;

  
  private StringConnection productTypes;

  
  private ProductVariantConnection productVariants;

  
  private StringConnection productVendors;

  
  private ProductConnection products;

  
  private int publicationCount;

  
  private ShopResourceLimits resourceLimits;

  
  private String richTextEditorUrl;

  
  private SearchResultConnection search;

  
  private SearchFilterOptions searchFilters;

  
  private boolean setupRequired;

  
  private List<CountryCode> shipsToCountries;

  
  private String shopOwnerName;

  
  private List<ShopPolicy> shopPolicies;

  
  private StaffMemberConnection staffMembers;

  
  private StorefrontAccessTokenConnection storefrontAccessTokens;

  
  private String storefrontUrl;

  
  private boolean taxShipping;

  
  private boolean taxesIncluded;

  
  private String timezoneAbbreviation;

  
  private String timezoneOffset;

  
  private int timezoneOffsetMinutes;

  
  private boolean transactionalSmsDisabled;

  
  private List<Translation> translations;

  
  private UnitSystem unitSystem;

  
  private OffsetDateTime updatedAt;

  
  private List<Image> uploadedImagesByIds;

  
  private String url;

  
  private WeightUnit weightUnit;

  public Shop() {
  }

  
  public StaffMember getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(StaffMember accountOwner) {
    this.accountOwner = accountOwner;
  }

  
  public List<ShopAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ShopAlert> alerts) {
    this.alerts = alerts;
  }

  
  public List<ProductCategory> getAllProductCategories() {
    return allProductCategories;
  }

  public void setAllProductCategories(List<ProductCategory> allProductCategories) {
    this.allProductCategories = allProductCategories;
  }

  
  public List<TaxonomyCategory> getAllProductCategoriesList() {
    return allProductCategoriesList;
  }

  public void setAllProductCategoriesList(List<TaxonomyCategory> allProductCategoriesList) {
    this.allProductCategoriesList = allProductCategoriesList;
  }

  
  public String getAnalyticsToken() {
    return analyticsToken;
  }

  public void setAnalyticsToken(String analyticsToken) {
    this.analyticsToken = analyticsToken;
  }

  
  public FulfillmentOrderConnection getAssignedFulfillmentOrders() {
    return assignedFulfillmentOrders;
  }

  public void setAssignedFulfillmentOrders(FulfillmentOrderConnection assignedFulfillmentOrders) {
    this.assignedFulfillmentOrders = assignedFulfillmentOrders;
  }

  
  public AppConnection getAvailableChannelApps() {
    return availableChannelApps;
  }

  public void setAvailableChannelApps(AppConnection availableChannelApps) {
    this.availableChannelApps = availableChannelApps;
  }

  
  public ShopAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(ShopAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public List<AvailableChannelDefinitionsByChannel> getChannelDefinitionsForInstalledChannels() {
    return channelDefinitionsForInstalledChannels;
  }

  public void setChannelDefinitionsForInstalledChannels(
      List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels) {
    this.channelDefinitionsForInstalledChannels = channelDefinitionsForInstalledChannels;
  }

  
  public ChannelConnection getChannels() {
    return channels;
  }

  public void setChannels(ChannelConnection channels) {
    this.channels = channels;
  }

  
  public boolean getCheckoutApiSupported() {
    return checkoutApiSupported;
  }

  public void setCheckoutApiSupported(boolean checkoutApiSupported) {
    this.checkoutApiSupported = checkoutApiSupported;
  }

  
  public Collection getCollectionByHandle() {
    return collectionByHandle;
  }

  public void setCollectionByHandle(Collection collectionByHandle) {
    this.collectionByHandle = collectionByHandle;
  }

  
  public SavedSearchConnection getCollectionSavedSearches() {
    return collectionSavedSearches;
  }

  public void setCollectionSavedSearches(SavedSearchConnection collectionSavedSearches) {
    this.collectionSavedSearches = collectionSavedSearches;
  }

  
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  
  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  
  public CountriesInShippingZones getCountriesInShippingZones() {
    return countriesInShippingZones;
  }

  public void setCountriesInShippingZones(CountriesInShippingZones countriesInShippingZones) {
    this.countriesInShippingZones = countriesInShippingZones;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public CurrencyFormats getCurrencyFormats() {
    return currencyFormats;
  }

  public void setCurrencyFormats(CurrencyFormats currencyFormats) {
    this.currencyFormats = currencyFormats;
  }

  
  public CurrencySettingConnection getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(CurrencySettingConnection currencySettings) {
    this.currencySettings = currencySettings;
  }

  
  public ShopCustomerAccountsSetting getCustomerAccounts() {
    return customerAccounts;
  }

  public void setCustomerAccounts(ShopCustomerAccountsSetting customerAccounts) {
    this.customerAccounts = customerAccounts;
  }

  
  public CustomerAccountsV2 getCustomerAccountsV2() {
    return customerAccountsV2;
  }

  public void setCustomerAccountsV2(CustomerAccountsV2 customerAccountsV2) {
    this.customerAccountsV2 = customerAccountsV2;
  }

  
  public SavedSearchConnection getCustomerSavedSearches() {
    return customerSavedSearches;
  }

  public void setCustomerSavedSearches(SavedSearchConnection customerSavedSearches) {
    this.customerSavedSearches = customerSavedSearches;
  }

  
  public StringConnection getCustomerTags() {
    return customerTags;
  }

  public void setCustomerTags(StringConnection customerTags) {
    this.customerTags = customerTags;
  }

  
  public CustomerConnection getCustomers() {
    return customers;
  }

  public void setCustomers(CustomerConnection customers) {
    this.customers = customers;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public List<Domain> getDomains() {
    return domains;
  }

  public void setDomains(List<Domain> domains) {
    this.domains = domains;
  }

  
  public SavedSearchConnection getDraftOrderSavedSearches() {
    return draftOrderSavedSearches;
  }

  public void setDraftOrderSavedSearches(SavedSearchConnection draftOrderSavedSearches) {
    this.draftOrderSavedSearches = draftOrderSavedSearches;
  }

  
  public StringConnection getDraftOrderTags() {
    return draftOrderTags;
  }

  public void setDraftOrderTags(StringConnection draftOrderTags) {
    this.draftOrderTags = draftOrderTags;
  }

  
  public DraftOrderConnection getDraftOrders() {
    return draftOrders;
  }

  public void setDraftOrders(DraftOrderConnection draftOrders) {
    this.draftOrders = draftOrders;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public List<CurrencyCode> getEnabledPresentmentCurrencies() {
    return enabledPresentmentCurrencies;
  }

  public void setEnabledPresentmentCurrencies(List<CurrencyCode> enabledPresentmentCurrencies) {
    this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
  }

  
  public ShopFeatures getFeatures() {
    return features;
  }

  public void setFeatures(ShopFeatures features) {
    this.features = features;
  }

  
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  
  public List<FulfillmentService> getFulfillmentServices() {
    return fulfillmentServices;
  }

  public void setFulfillmentServices(List<FulfillmentService> fulfillmentServices) {
    this.fulfillmentServices = fulfillmentServices;
  }

  
  public String getIanaTimezone() {
    return ianaTimezone;
  }

  public void setIanaTimezone(String ianaTimezone) {
    this.ianaTimezone = ianaTimezone;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public InventoryItemConnection getInventoryItems() {
    return inventoryItems;
  }

  public void setInventoryItems(InventoryItemConnection inventoryItems) {
    this.inventoryItems = inventoryItems;
  }

  
  public LimitedPendingOrderCount getLimitedPendingOrderCount() {
    return limitedPendingOrderCount;
  }

  public void setLimitedPendingOrderCount(LimitedPendingOrderCount limitedPendingOrderCount) {
    this.limitedPendingOrderCount = limitedPendingOrderCount;
  }

  
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  
  public MarketingEventConnection getMarketingEvents() {
    return marketingEvents;
  }

  public void setMarketingEvents(MarketingEventConnection marketingEvents) {
    this.marketingEvents = marketingEvents;
  }

  
  public boolean getMarketingSmsConsentEnabledAtCheckout() {
    return marketingSmsConsentEnabledAtCheckout;
  }

  public void setMarketingSmsConsentEnabledAtCheckout(
      boolean marketingSmsConsentEnabledAtCheckout) {
    this.marketingSmsConsentEnabledAtCheckout = marketingSmsConsentEnabledAtCheckout;
  }

  
  public MerchantApprovalSignals getMerchantApprovalSignals() {
    return merchantApprovalSignals;
  }

  public void setMerchantApprovalSignals(MerchantApprovalSignals merchantApprovalSignals) {
    this.merchantApprovalSignals = merchantApprovalSignals;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getMyshopifyDomain() {
    return myshopifyDomain;
  }

  public void setMyshopifyDomain(String myshopifyDomain) {
    this.myshopifyDomain = myshopifyDomain;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<NavigationItem> getNavigationSettings() {
    return navigationSettings;
  }

  public void setNavigationSettings(List<NavigationItem> navigationSettings) {
    this.navigationSettings = navigationSettings;
  }

  
  public String getOrderNumberFormatPrefix() {
    return orderNumberFormatPrefix;
  }

  public void setOrderNumberFormatPrefix(String orderNumberFormatPrefix) {
    this.orderNumberFormatPrefix = orderNumberFormatPrefix;
  }

  
  public String getOrderNumberFormatSuffix() {
    return orderNumberFormatSuffix;
  }

  public void setOrderNumberFormatSuffix(String orderNumberFormatSuffix) {
    this.orderNumberFormatSuffix = orderNumberFormatSuffix;
  }

  
  public SavedSearchConnection getOrderSavedSearches() {
    return orderSavedSearches;
  }

  public void setOrderSavedSearches(SavedSearchConnection orderSavedSearches) {
    this.orderSavedSearches = orderSavedSearches;
  }

  
  public StringConnection getOrderTags() {
    return orderTags;
  }

  public void setOrderTags(StringConnection orderTags) {
    this.orderTags = orderTags;
  }

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public PaymentSettings getPaymentSettings() {
    return paymentSettings;
  }

  public void setPaymentSettings(PaymentSettings paymentSettings) {
    this.paymentSettings = paymentSettings;
  }

  
  public ShopPlan getPlan() {
    return plan;
  }

  public void setPlan(ShopPlan plan) {
    this.plan = plan;
  }

  
  public Domain getPrimaryDomain() {
    return primaryDomain;
  }

  public void setPrimaryDomain(Domain primaryDomain) {
    this.primaryDomain = primaryDomain;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public Product getProductByHandle() {
    return productByHandle;
  }

  public void setProductByHandle(Product productByHandle) {
    this.productByHandle = productByHandle;
  }

  
  public ImageConnection getProductImages() {
    return productImages;
  }

  public void setProductImages(ImageConnection productImages) {
    this.productImages = productImages;
  }

  
  public SavedSearchConnection getProductSavedSearches() {
    return productSavedSearches;
  }

  public void setProductSavedSearches(SavedSearchConnection productSavedSearches) {
    this.productSavedSearches = productSavedSearches;
  }

  
  public StringConnection getProductTags() {
    return productTags;
  }

  public void setProductTags(StringConnection productTags) {
    this.productTags = productTags;
  }

  
  public StringConnection getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(StringConnection productTypes) {
    this.productTypes = productTypes;
  }

  
  public ProductVariantConnection getProductVariants() {
    return productVariants;
  }

  public void setProductVariants(ProductVariantConnection productVariants) {
    this.productVariants = productVariants;
  }

  
  public StringConnection getProductVendors() {
    return productVendors;
  }

  public void setProductVendors(StringConnection productVendors) {
    this.productVendors = productVendors;
  }

  
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  
  public int getPublicationCount() {
    return publicationCount;
  }

  public void setPublicationCount(int publicationCount) {
    this.publicationCount = publicationCount;
  }

  
  public ShopResourceLimits getResourceLimits() {
    return resourceLimits;
  }

  public void setResourceLimits(ShopResourceLimits resourceLimits) {
    this.resourceLimits = resourceLimits;
  }

  
  public String getRichTextEditorUrl() {
    return richTextEditorUrl;
  }

  public void setRichTextEditorUrl(String richTextEditorUrl) {
    this.richTextEditorUrl = richTextEditorUrl;
  }

  
  public SearchResultConnection getSearch() {
    return search;
  }

  public void setSearch(SearchResultConnection search) {
    this.search = search;
  }

  
  public SearchFilterOptions getSearchFilters() {
    return searchFilters;
  }

  public void setSearchFilters(SearchFilterOptions searchFilters) {
    this.searchFilters = searchFilters;
  }

  
  public boolean getSetupRequired() {
    return setupRequired;
  }

  public void setSetupRequired(boolean setupRequired) {
    this.setupRequired = setupRequired;
  }

  
  public List<CountryCode> getShipsToCountries() {
    return shipsToCountries;
  }

  public void setShipsToCountries(List<CountryCode> shipsToCountries) {
    this.shipsToCountries = shipsToCountries;
  }

  
  public String getShopOwnerName() {
    return shopOwnerName;
  }

  public void setShopOwnerName(String shopOwnerName) {
    this.shopOwnerName = shopOwnerName;
  }

  
  public List<ShopPolicy> getShopPolicies() {
    return shopPolicies;
  }

  public void setShopPolicies(List<ShopPolicy> shopPolicies) {
    this.shopPolicies = shopPolicies;
  }

  
  public StaffMemberConnection getStaffMembers() {
    return staffMembers;
  }

  public void setStaffMembers(StaffMemberConnection staffMembers) {
    this.staffMembers = staffMembers;
  }

  
  public StorefrontAccessTokenConnection getStorefrontAccessTokens() {
    return storefrontAccessTokens;
  }

  public void setStorefrontAccessTokens(StorefrontAccessTokenConnection storefrontAccessTokens) {
    this.storefrontAccessTokens = storefrontAccessTokens;
  }

  
  public String getStorefrontUrl() {
    return storefrontUrl;
  }

  public void setStorefrontUrl(String storefrontUrl) {
    this.storefrontUrl = storefrontUrl;
  }

  
  public boolean getTaxShipping() {
    return taxShipping;
  }

  public void setTaxShipping(boolean taxShipping) {
    this.taxShipping = taxShipping;
  }

  
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  
  public String getTimezoneAbbreviation() {
    return timezoneAbbreviation;
  }

  public void setTimezoneAbbreviation(String timezoneAbbreviation) {
    this.timezoneAbbreviation = timezoneAbbreviation;
  }

  
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  
  public int getTimezoneOffsetMinutes() {
    return timezoneOffsetMinutes;
  }

  public void setTimezoneOffsetMinutes(int timezoneOffsetMinutes) {
    this.timezoneOffsetMinutes = timezoneOffsetMinutes;
  }

  
  public boolean getTransactionalSmsDisabled() {
    return transactionalSmsDisabled;
  }

  public void setTransactionalSmsDisabled(boolean transactionalSmsDisabled) {
    this.transactionalSmsDisabled = transactionalSmsDisabled;
  }

  
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  
  public UnitSystem getUnitSystem() {
    return unitSystem;
  }

  public void setUnitSystem(UnitSystem unitSystem) {
    this.unitSystem = unitSystem;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public List<Image> getUploadedImagesByIds() {
    return uploadedImagesByIds;
  }

  public void setUploadedImagesByIds(List<Image> uploadedImagesByIds) {
    this.uploadedImagesByIds = uploadedImagesByIds;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  
  public WeightUnit getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(WeightUnit weightUnit) {
    this.weightUnit = weightUnit;
  }

  @Override
  public String toString() {
    return "Shop{accountOwner='" + accountOwner + "', alerts='" + alerts + "', allProductCategories='" + allProductCategories + "', allProductCategoriesList='" + allProductCategoriesList + "', analyticsToken='" + analyticsToken + "', assignedFulfillmentOrders='" + assignedFulfillmentOrders + "', availableChannelApps='" + availableChannelApps + "', billingAddress='" + billingAddress + "', channelDefinitionsForInstalledChannels='" + channelDefinitionsForInstalledChannels + "', channels='" + channels + "', checkoutApiSupported='" + checkoutApiSupported + "', collectionByHandle='" + collectionByHandle + "', collectionSavedSearches='" + collectionSavedSearches + "', collections='" + collections + "', contactEmail='" + contactEmail + "', countriesInShippingZones='" + countriesInShippingZones + "', createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', currencyFormats='" + currencyFormats + "', currencySettings='" + currencySettings + "', customerAccounts='" + customerAccounts + "', customerAccountsV2='" + customerAccountsV2 + "', customerSavedSearches='" + customerSavedSearches + "', customerTags='" + customerTags + "', customers='" + customers + "', description='" + description + "', domains='" + domains + "', draftOrderSavedSearches='" + draftOrderSavedSearches + "', draftOrderTags='" + draftOrderTags + "', draftOrders='" + draftOrders + "', email='" + email + "', enabledPresentmentCurrencies='" + enabledPresentmentCurrencies + "', features='" + features + "', fulfillmentOrders='" + fulfillmentOrders + "', fulfillmentServices='" + fulfillmentServices + "', ianaTimezone='" + ianaTimezone + "', id='" + id + "', inventoryItems='" + inventoryItems + "', limitedPendingOrderCount='" + limitedPendingOrderCount + "', locations='" + locations + "', marketingEvents='" + marketingEvents + "', marketingSmsConsentEnabledAtCheckout='" + marketingSmsConsentEnabledAtCheckout + "', merchantApprovalSignals='" + merchantApprovalSignals + "', metafield='" + metafield + "', metafields='" + metafields + "', myshopifyDomain='" + myshopifyDomain + "', name='" + name + "', navigationSettings='" + navigationSettings + "', orderNumberFormatPrefix='" + orderNumberFormatPrefix + "', orderNumberFormatSuffix='" + orderNumberFormatSuffix + "', orderSavedSearches='" + orderSavedSearches + "', orderTags='" + orderTags + "', orders='" + orders + "', paymentSettings='" + paymentSettings + "', plan='" + plan + "', primaryDomain='" + primaryDomain + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', productByHandle='" + productByHandle + "', productImages='" + productImages + "', productSavedSearches='" + productSavedSearches + "', productTags='" + productTags + "', productTypes='" + productTypes + "', productVariants='" + productVariants + "', productVendors='" + productVendors + "', products='" + products + "', publicationCount='" + publicationCount + "', resourceLimits='" + resourceLimits + "', richTextEditorUrl='" + richTextEditorUrl + "', search='" + search + "', searchFilters='" + searchFilters + "', setupRequired='" + setupRequired + "', shipsToCountries='" + shipsToCountries + "', shopOwnerName='" + shopOwnerName + "', shopPolicies='" + shopPolicies + "', staffMembers='" + staffMembers + "', storefrontAccessTokens='" + storefrontAccessTokens + "', storefrontUrl='" + storefrontUrl + "', taxShipping='" + taxShipping + "', taxesIncluded='" + taxesIncluded + "', timezoneAbbreviation='" + timezoneAbbreviation + "', timezoneOffset='" + timezoneOffset + "', timezoneOffsetMinutes='" + timezoneOffsetMinutes + "', transactionalSmsDisabled='" + transactionalSmsDisabled + "', translations='" + translations + "', unitSystem='" + unitSystem + "', updatedAt='" + updatedAt + "', uploadedImagesByIds='" + uploadedImagesByIds + "', url='" + url + "', weightUnit='" + weightUnit + "'}";
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
        Objects.equals(collectionByHandle, that.collectionByHandle) &&
        Objects.equals(collectionSavedSearches, that.collectionSavedSearches) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(contactEmail, that.contactEmail) &&
        Objects.equals(countriesInShippingZones, that.countriesInShippingZones) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(currencyFormats, that.currencyFormats) &&
        Objects.equals(currencySettings, that.currencySettings) &&
        Objects.equals(customerAccounts, that.customerAccounts) &&
        Objects.equals(customerAccountsV2, that.customerAccountsV2) &&
        Objects.equals(customerSavedSearches, that.customerSavedSearches) &&
        Objects.equals(customerTags, that.customerTags) &&
        Objects.equals(customers, that.customers) &&
        Objects.equals(description, that.description) &&
        Objects.equals(domains, that.domains) &&
        Objects.equals(draftOrderSavedSearches, that.draftOrderSavedSearches) &&
        Objects.equals(draftOrderTags, that.draftOrderTags) &&
        Objects.equals(draftOrders, that.draftOrders) &&
        Objects.equals(email, that.email) &&
        Objects.equals(enabledPresentmentCurrencies, that.enabledPresentmentCurrencies) &&
        Objects.equals(features, that.features) &&
        Objects.equals(fulfillmentOrders, that.fulfillmentOrders) &&
        Objects.equals(fulfillmentServices, that.fulfillmentServices) &&
        Objects.equals(ianaTimezone, that.ianaTimezone) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryItems, that.inventoryItems) &&
        Objects.equals(limitedPendingOrderCount, that.limitedPendingOrderCount) &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(marketingEvents, that.marketingEvents) &&
        marketingSmsConsentEnabledAtCheckout == that.marketingSmsConsentEnabledAtCheckout &&
        Objects.equals(merchantApprovalSignals, that.merchantApprovalSignals) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(myshopifyDomain, that.myshopifyDomain) &&
        Objects.equals(name, that.name) &&
        Objects.equals(navigationSettings, that.navigationSettings) &&
        Objects.equals(orderNumberFormatPrefix, that.orderNumberFormatPrefix) &&
        Objects.equals(orderNumberFormatSuffix, that.orderNumberFormatSuffix) &&
        Objects.equals(orderSavedSearches, that.orderSavedSearches) &&
        Objects.equals(orderTags, that.orderTags) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(paymentSettings, that.paymentSettings) &&
        Objects.equals(plan, that.plan) &&
        Objects.equals(primaryDomain, that.primaryDomain) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(productByHandle, that.productByHandle) &&
        Objects.equals(productImages, that.productImages) &&
        Objects.equals(productSavedSearches, that.productSavedSearches) &&
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
        Objects.equals(uploadedImagesByIds, that.uploadedImagesByIds) &&
        Objects.equals(url, that.url) &&
        Objects.equals(weightUnit, that.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountOwner, alerts, allProductCategories, allProductCategoriesList, analyticsToken, assignedFulfillmentOrders, availableChannelApps, billingAddress, channelDefinitionsForInstalledChannels, channels, checkoutApiSupported, collectionByHandle, collectionSavedSearches, collections, contactEmail, countriesInShippingZones, createdAt, currencyCode, currencyFormats, currencySettings, customerAccounts, customerAccountsV2, customerSavedSearches, customerTags, customers, description, domains, draftOrderSavedSearches, draftOrderTags, draftOrders, email, enabledPresentmentCurrencies, features, fulfillmentOrders, fulfillmentServices, ianaTimezone, id, inventoryItems, limitedPendingOrderCount, locations, marketingEvents, marketingSmsConsentEnabledAtCheckout, merchantApprovalSignals, metafield, metafields, myshopifyDomain, name, navigationSettings, orderNumberFormatPrefix, orderNumberFormatSuffix, orderSavedSearches, orderTags, orders, paymentSettings, plan, primaryDomain, privateMetafield, privateMetafields, productByHandle, productImages, productSavedSearches, productTags, productTypes, productVariants, productVendors, products, publicationCount, resourceLimits, richTextEditorUrl, search, searchFilters, setupRequired, shipsToCountries, shopOwnerName, shopPolicies, staffMembers, storefrontAccessTokens, storefrontUrl, taxShipping, taxesIncluded, timezoneAbbreviation, timezoneOffset, timezoneOffsetMinutes, transactionalSmsDisabled, translations, unitSystem, updatedAt, uploadedImagesByIds, url, weightUnit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private StaffMember accountOwner;

    
    private List<ShopAlert> alerts;

    
    private List<ProductCategory> allProductCategories;

    
    private List<TaxonomyCategory> allProductCategoriesList;

    
    private String analyticsToken;

    
    private FulfillmentOrderConnection assignedFulfillmentOrders;

    
    private AppConnection availableChannelApps;

    
    private ShopAddress billingAddress;

    
    private List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels;

    
    private ChannelConnection channels;

    
    private boolean checkoutApiSupported;

    
    private Collection collectionByHandle;

    
    private SavedSearchConnection collectionSavedSearches;

    
    private CollectionConnection collections;

    
    private String contactEmail;

    
    private CountriesInShippingZones countriesInShippingZones;

    
    private OffsetDateTime createdAt;

    
    private CurrencyCode currencyCode;

    
    private CurrencyFormats currencyFormats;

    
    private CurrencySettingConnection currencySettings;

    
    private ShopCustomerAccountsSetting customerAccounts;

    
    private CustomerAccountsV2 customerAccountsV2;

    
    private SavedSearchConnection customerSavedSearches;

    
    private StringConnection customerTags;

    
    private CustomerConnection customers;

    
    private String description;

    
    private List<Domain> domains;

    
    private SavedSearchConnection draftOrderSavedSearches;

    
    private StringConnection draftOrderTags;

    
    private DraftOrderConnection draftOrders;

    
    private String email;

    
    private List<CurrencyCode> enabledPresentmentCurrencies;

    
    private ShopFeatures features;

    
    private FulfillmentOrderConnection fulfillmentOrders;

    
    private List<FulfillmentService> fulfillmentServices;

    
    private String ianaTimezone;

    
    private String id;

    
    private InventoryItemConnection inventoryItems;

    
    private LimitedPendingOrderCount limitedPendingOrderCount;

    
    private LocationConnection locations;

    
    private MarketingEventConnection marketingEvents;

    
    private boolean marketingSmsConsentEnabledAtCheckout;

    
    private MerchantApprovalSignals merchantApprovalSignals;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private String myshopifyDomain;

    
    private String name;

    
    private List<NavigationItem> navigationSettings;

    
    private String orderNumberFormatPrefix;

    
    private String orderNumberFormatSuffix;

    
    private SavedSearchConnection orderSavedSearches;

    
    private StringConnection orderTags;

    
    private OrderConnection orders;

    
    private PaymentSettings paymentSettings;

    
    private ShopPlan plan;

    
    private Domain primaryDomain;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private Product productByHandle;

    
    private ImageConnection productImages;

    
    private SavedSearchConnection productSavedSearches;

    
    private StringConnection productTags;

    
    private StringConnection productTypes;

    
    private ProductVariantConnection productVariants;

    
    private StringConnection productVendors;

    
    private ProductConnection products;

    
    private int publicationCount;

    
    private ShopResourceLimits resourceLimits;

    
    private String richTextEditorUrl;

    
    private SearchResultConnection search;

    
    private SearchFilterOptions searchFilters;

    
    private boolean setupRequired;

    
    private List<CountryCode> shipsToCountries;

    
    private String shopOwnerName;

    
    private List<ShopPolicy> shopPolicies;

    
    private StaffMemberConnection staffMembers;

    
    private StorefrontAccessTokenConnection storefrontAccessTokens;

    
    private String storefrontUrl;

    
    private boolean taxShipping;

    
    private boolean taxesIncluded;

    
    private String timezoneAbbreviation;

    
    private String timezoneOffset;

    
    private int timezoneOffsetMinutes;

    
    private boolean transactionalSmsDisabled;

    
    private List<Translation> translations;

    
    private UnitSystem unitSystem;

    
    private OffsetDateTime updatedAt;

    
    private List<Image> uploadedImagesByIds;

    
    private String url;

    
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
      result.collectionByHandle = this.collectionByHandle;
      result.collectionSavedSearches = this.collectionSavedSearches;
      result.collections = this.collections;
      result.contactEmail = this.contactEmail;
      result.countriesInShippingZones = this.countriesInShippingZones;
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.currencyFormats = this.currencyFormats;
      result.currencySettings = this.currencySettings;
      result.customerAccounts = this.customerAccounts;
      result.customerAccountsV2 = this.customerAccountsV2;
      result.customerSavedSearches = this.customerSavedSearches;
      result.customerTags = this.customerTags;
      result.customers = this.customers;
      result.description = this.description;
      result.domains = this.domains;
      result.draftOrderSavedSearches = this.draftOrderSavedSearches;
      result.draftOrderTags = this.draftOrderTags;
      result.draftOrders = this.draftOrders;
      result.email = this.email;
      result.enabledPresentmentCurrencies = this.enabledPresentmentCurrencies;
      result.features = this.features;
      result.fulfillmentOrders = this.fulfillmentOrders;
      result.fulfillmentServices = this.fulfillmentServices;
      result.ianaTimezone = this.ianaTimezone;
      result.id = this.id;
      result.inventoryItems = this.inventoryItems;
      result.limitedPendingOrderCount = this.limitedPendingOrderCount;
      result.locations = this.locations;
      result.marketingEvents = this.marketingEvents;
      result.marketingSmsConsentEnabledAtCheckout = this.marketingSmsConsentEnabledAtCheckout;
      result.merchantApprovalSignals = this.merchantApprovalSignals;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.myshopifyDomain = this.myshopifyDomain;
      result.name = this.name;
      result.navigationSettings = this.navigationSettings;
      result.orderNumberFormatPrefix = this.orderNumberFormatPrefix;
      result.orderNumberFormatSuffix = this.orderNumberFormatSuffix;
      result.orderSavedSearches = this.orderSavedSearches;
      result.orderTags = this.orderTags;
      result.orders = this.orders;
      result.paymentSettings = this.paymentSettings;
      result.plan = this.plan;
      result.primaryDomain = this.primaryDomain;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.productByHandle = this.productByHandle;
      result.productImages = this.productImages;
      result.productSavedSearches = this.productSavedSearches;
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
      result.uploadedImagesByIds = this.uploadedImagesByIds;
      result.url = this.url;
      result.weightUnit = this.weightUnit;
      return result;
    }

    
    public Builder accountOwner(StaffMember accountOwner) {
      this.accountOwner = accountOwner;
      return this;
    }

    
    public Builder alerts(List<ShopAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    
    public Builder allProductCategories(List<ProductCategory> allProductCategories) {
      this.allProductCategories = allProductCategories;
      return this;
    }

    
    public Builder allProductCategoriesList(List<TaxonomyCategory> allProductCategoriesList) {
      this.allProductCategoriesList = allProductCategoriesList;
      return this;
    }

    
    public Builder analyticsToken(String analyticsToken) {
      this.analyticsToken = analyticsToken;
      return this;
    }

    
    public Builder assignedFulfillmentOrders(FulfillmentOrderConnection assignedFulfillmentOrders) {
      this.assignedFulfillmentOrders = assignedFulfillmentOrders;
      return this;
    }

    
    public Builder availableChannelApps(AppConnection availableChannelApps) {
      this.availableChannelApps = availableChannelApps;
      return this;
    }

    
    public Builder billingAddress(ShopAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder channelDefinitionsForInstalledChannels(
        List<AvailableChannelDefinitionsByChannel> channelDefinitionsForInstalledChannels) {
      this.channelDefinitionsForInstalledChannels = channelDefinitionsForInstalledChannels;
      return this;
    }

    
    public Builder channels(ChannelConnection channels) {
      this.channels = channels;
      return this;
    }

    
    public Builder checkoutApiSupported(boolean checkoutApiSupported) {
      this.checkoutApiSupported = checkoutApiSupported;
      return this;
    }

    
    public Builder collectionByHandle(Collection collectionByHandle) {
      this.collectionByHandle = collectionByHandle;
      return this;
    }

    
    public Builder collectionSavedSearches(SavedSearchConnection collectionSavedSearches) {
      this.collectionSavedSearches = collectionSavedSearches;
      return this;
    }

    
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    
    public Builder contactEmail(String contactEmail) {
      this.contactEmail = contactEmail;
      return this;
    }

    
    public Builder countriesInShippingZones(CountriesInShippingZones countriesInShippingZones) {
      this.countriesInShippingZones = countriesInShippingZones;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    
    public Builder currencyFormats(CurrencyFormats currencyFormats) {
      this.currencyFormats = currencyFormats;
      return this;
    }

    
    public Builder currencySettings(CurrencySettingConnection currencySettings) {
      this.currencySettings = currencySettings;
      return this;
    }

    
    public Builder customerAccounts(ShopCustomerAccountsSetting customerAccounts) {
      this.customerAccounts = customerAccounts;
      return this;
    }

    
    public Builder customerAccountsV2(CustomerAccountsV2 customerAccountsV2) {
      this.customerAccountsV2 = customerAccountsV2;
      return this;
    }

    
    public Builder customerSavedSearches(SavedSearchConnection customerSavedSearches) {
      this.customerSavedSearches = customerSavedSearches;
      return this;
    }

    
    public Builder customerTags(StringConnection customerTags) {
      this.customerTags = customerTags;
      return this;
    }

    
    public Builder customers(CustomerConnection customers) {
      this.customers = customers;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder domains(List<Domain> domains) {
      this.domains = domains;
      return this;
    }

    
    public Builder draftOrderSavedSearches(SavedSearchConnection draftOrderSavedSearches) {
      this.draftOrderSavedSearches = draftOrderSavedSearches;
      return this;
    }

    
    public Builder draftOrderTags(StringConnection draftOrderTags) {
      this.draftOrderTags = draftOrderTags;
      return this;
    }

    
    public Builder draftOrders(DraftOrderConnection draftOrders) {
      this.draftOrders = draftOrders;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder enabledPresentmentCurrencies(List<CurrencyCode> enabledPresentmentCurrencies) {
      this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
      return this;
    }

    
    public Builder features(ShopFeatures features) {
      this.features = features;
      return this;
    }

    
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    
    public Builder fulfillmentServices(List<FulfillmentService> fulfillmentServices) {
      this.fulfillmentServices = fulfillmentServices;
      return this;
    }

    
    public Builder ianaTimezone(String ianaTimezone) {
      this.ianaTimezone = ianaTimezone;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inventoryItems(InventoryItemConnection inventoryItems) {
      this.inventoryItems = inventoryItems;
      return this;
    }

    
    public Builder limitedPendingOrderCount(LimitedPendingOrderCount limitedPendingOrderCount) {
      this.limitedPendingOrderCount = limitedPendingOrderCount;
      return this;
    }

    
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }

    
    public Builder marketingEvents(MarketingEventConnection marketingEvents) {
      this.marketingEvents = marketingEvents;
      return this;
    }

    
    public Builder marketingSmsConsentEnabledAtCheckout(
        boolean marketingSmsConsentEnabledAtCheckout) {
      this.marketingSmsConsentEnabledAtCheckout = marketingSmsConsentEnabledAtCheckout;
      return this;
    }

    
    public Builder merchantApprovalSignals(MerchantApprovalSignals merchantApprovalSignals) {
      this.merchantApprovalSignals = merchantApprovalSignals;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder myshopifyDomain(String myshopifyDomain) {
      this.myshopifyDomain = myshopifyDomain;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder navigationSettings(List<NavigationItem> navigationSettings) {
      this.navigationSettings = navigationSettings;
      return this;
    }

    
    public Builder orderNumberFormatPrefix(String orderNumberFormatPrefix) {
      this.orderNumberFormatPrefix = orderNumberFormatPrefix;
      return this;
    }

    
    public Builder orderNumberFormatSuffix(String orderNumberFormatSuffix) {
      this.orderNumberFormatSuffix = orderNumberFormatSuffix;
      return this;
    }

    
    public Builder orderSavedSearches(SavedSearchConnection orderSavedSearches) {
      this.orderSavedSearches = orderSavedSearches;
      return this;
    }

    
    public Builder orderTags(StringConnection orderTags) {
      this.orderTags = orderTags;
      return this;
    }

    
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder paymentSettings(PaymentSettings paymentSettings) {
      this.paymentSettings = paymentSettings;
      return this;
    }

    
    public Builder plan(ShopPlan plan) {
      this.plan = plan;
      return this;
    }

    
    public Builder primaryDomain(Domain primaryDomain) {
      this.primaryDomain = primaryDomain;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder productByHandle(Product productByHandle) {
      this.productByHandle = productByHandle;
      return this;
    }

    
    public Builder productImages(ImageConnection productImages) {
      this.productImages = productImages;
      return this;
    }

    
    public Builder productSavedSearches(SavedSearchConnection productSavedSearches) {
      this.productSavedSearches = productSavedSearches;
      return this;
    }

    
    public Builder productTags(StringConnection productTags) {
      this.productTags = productTags;
      return this;
    }

    
    public Builder productTypes(StringConnection productTypes) {
      this.productTypes = productTypes;
      return this;
    }

    
    public Builder productVariants(ProductVariantConnection productVariants) {
      this.productVariants = productVariants;
      return this;
    }

    
    public Builder productVendors(StringConnection productVendors) {
      this.productVendors = productVendors;
      return this;
    }

    
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    
    public Builder publicationCount(int publicationCount) {
      this.publicationCount = publicationCount;
      return this;
    }

    
    public Builder resourceLimits(ShopResourceLimits resourceLimits) {
      this.resourceLimits = resourceLimits;
      return this;
    }

    
    public Builder richTextEditorUrl(String richTextEditorUrl) {
      this.richTextEditorUrl = richTextEditorUrl;
      return this;
    }

    
    public Builder search(SearchResultConnection search) {
      this.search = search;
      return this;
    }

    
    public Builder searchFilters(SearchFilterOptions searchFilters) {
      this.searchFilters = searchFilters;
      return this;
    }

    
    public Builder setupRequired(boolean setupRequired) {
      this.setupRequired = setupRequired;
      return this;
    }

    
    public Builder shipsToCountries(List<CountryCode> shipsToCountries) {
      this.shipsToCountries = shipsToCountries;
      return this;
    }

    
    public Builder shopOwnerName(String shopOwnerName) {
      this.shopOwnerName = shopOwnerName;
      return this;
    }

    
    public Builder shopPolicies(List<ShopPolicy> shopPolicies) {
      this.shopPolicies = shopPolicies;
      return this;
    }

    
    public Builder staffMembers(StaffMemberConnection staffMembers) {
      this.staffMembers = staffMembers;
      return this;
    }

    
    public Builder storefrontAccessTokens(StorefrontAccessTokenConnection storefrontAccessTokens) {
      this.storefrontAccessTokens = storefrontAccessTokens;
      return this;
    }

    
    public Builder storefrontUrl(String storefrontUrl) {
      this.storefrontUrl = storefrontUrl;
      return this;
    }

    
    public Builder taxShipping(boolean taxShipping) {
      this.taxShipping = taxShipping;
      return this;
    }

    
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    
    public Builder timezoneAbbreviation(String timezoneAbbreviation) {
      this.timezoneAbbreviation = timezoneAbbreviation;
      return this;
    }

    
    public Builder timezoneOffset(String timezoneOffset) {
      this.timezoneOffset = timezoneOffset;
      return this;
    }

    
    public Builder timezoneOffsetMinutes(int timezoneOffsetMinutes) {
      this.timezoneOffsetMinutes = timezoneOffsetMinutes;
      return this;
    }

    
    public Builder transactionalSmsDisabled(boolean transactionalSmsDisabled) {
      this.transactionalSmsDisabled = transactionalSmsDisabled;
      return this;
    }

    
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }

    
    public Builder unitSystem(UnitSystem unitSystem) {
      this.unitSystem = unitSystem;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder uploadedImagesByIds(List<Image> uploadedImagesByIds) {
      this.uploadedImagesByIds = uploadedImagesByIds;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    
    public Builder weightUnit(WeightUnit weightUnit) {
      this.weightUnit = weightUnit;
      return this;
    }
  }
}
