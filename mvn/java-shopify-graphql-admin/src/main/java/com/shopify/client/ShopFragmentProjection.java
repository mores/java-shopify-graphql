package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CollectionSortKeys;
import com.shopify.types.CustomerSortKeys;
import com.shopify.types.DraftOrderSortKeys;
import com.shopify.types.FulfillmentOrderAssignmentStatus;
import com.shopify.types.FulfillmentOrderSortKeys;
import com.shopify.types.LocationSortKeys;
import com.shopify.types.OrderSortKeys;
import com.shopify.types.ProductImageSortKeys;
import com.shopify.types.ProductSortKeys;
import com.shopify.types.ProductVariantSortKeys;
import com.shopify.types.SearchResultType;
import com.shopify.types.ShopTagSort;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ShopFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Shop"));
  }

  public ShopFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StaffMemberProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> accountOwner() {
     StaffMemberProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("accountOwner", projection);
     return projection;
  }

  public ShopAlertProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> alerts() {
     ShopAlertProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopAlertProjection<>(this, getRoot());
     getFields().put("alerts", projection);
     return projection;
  }

  public ProductCategoryProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> allProductCategories(
      ) {
     ProductCategoryProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductCategoryProjection<>(this, getRoot());
     getFields().put("allProductCategories", projection);
     return projection;
  }

  public TaxonomyCategoryProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> allProductCategoriesList(
      ) {
     TaxonomyCategoryProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("allProductCategoriesList", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> assignedFulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("assignedFulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> assignedFulfillmentOrders(
      FulfillmentOrderAssignmentStatus assignmentStatus, List<String> locationIds, Integer first,
      String after, Integer last, String before, Boolean reverse,
      FulfillmentOrderSortKeys sortKey) {
    FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("assignedFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("assignedFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument assignmentStatusArg = new InputArgument("assignmentStatus", assignmentStatus);
    getInputArguments().get("assignedFulfillmentOrders").add(assignmentStatusArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIds);
    getInputArguments().get("assignedFulfillmentOrders").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("assignedFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("assignedFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("assignedFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("assignedFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("assignedFulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("assignedFulfillmentOrders").add(sortKeyArg);
    return projection;
  }

  public AppConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> availableChannelApps(
      ) {
     AppConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppConnectionProjection<>(this, getRoot());
     getFields().put("availableChannelApps", projection);
     return projection;
  }

  public AppConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> availableChannelApps(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AppConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppConnectionProjection<>(this, getRoot());    
    getFields().put("availableChannelApps", projection);
    getInputArguments().computeIfAbsent("availableChannelApps", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("availableChannelApps").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("availableChannelApps").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("availableChannelApps").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("availableChannelApps").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("availableChannelApps").add(reverseArg);
    return projection;
  }

  public ShopAddressProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> billingAddress() {
     ShopAddressProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public AvailableChannelDefinitionsByChannelProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> channelDefinitionsForInstalledChannels(
      ) {
     AvailableChannelDefinitionsByChannelProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new AvailableChannelDefinitionsByChannelProjection<>(this, getRoot());
     getFields().put("channelDefinitionsForInstalledChannels", projection);
     return projection;
  }

  public ChannelConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> channels() {
     ChannelConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("channels", projection);
     return projection;
  }

  public ChannelConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> channels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> collections() {
     CollectionConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query, String savedSearchId) {
    CollectionConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collections").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("collections").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("collections").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("collections").add(savedSearchIdArg);
    return projection;
  }

  public CountriesInShippingZonesProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> countriesInShippingZones(
      ) {
     CountriesInShippingZonesProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountriesInShippingZonesProjection<>(this, getRoot());
     getFields().put("countriesInShippingZones", projection);
     return projection;
  }

  public CurrencyCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public CurrencyFormatsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> currencyFormats() {
     CurrencyFormatsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyFormatsProjection<>(this, getRoot());
     getFields().put("currencyFormats", projection);
     return projection;
  }

  public CurrencySettingConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> currencySettings(
      ) {
     CurrencySettingConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingConnectionProjection<>(this, getRoot());
     getFields().put("currencySettings", projection);
     return projection;
  }

  public CurrencySettingConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> currencySettings(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CurrencySettingConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencySettingConnectionProjection<>(this, getRoot());    
    getFields().put("currencySettings", projection);
    getInputArguments().computeIfAbsent("currencySettings", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("currencySettings").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("currencySettings").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("currencySettings").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("currencySettings").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("currencySettings").add(reverseArg);
    return projection;
  }

  public ShopCustomerAccountsSettingProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> customerAccounts(
      ) {
     ShopCustomerAccountsSettingProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopCustomerAccountsSettingProjection<>(this, getRoot());
     getFields().put("customerAccounts", projection);
     return projection;
  }

  public CustomerAccountsV2Projection<ShopFragmentProjection<PARENT, ROOT>, ROOT> customerAccountsV2(
      ) {
     CustomerAccountsV2Projection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountsV2Projection<>(this, getRoot());
     getFields().put("customerAccountsV2", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> customerTags() {
     StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("customerTags", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> customerTags(
      int first) {
    StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("customerTags", projection);
    getInputArguments().computeIfAbsent("customerTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customerTags").add(firstArg);
    return projection;
  }

  public CustomerConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> customers() {
     CustomerConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());
     getFields().put("customers", projection);
     return projection;
  }

  public CustomerConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> customers(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CustomerSortKeys sortKey, String query) {
    CustomerConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());    
    getFields().put("customers", projection);
    getInputArguments().computeIfAbsent("customers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customers").add(queryArg);
    return projection;
  }

  public DomainProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> domains() {
     DomainProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("domains", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> draftOrderTags() {
     StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("draftOrderTags", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> draftOrderTags(
      int first) {
    StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrderTags", projection);
    getInputArguments().computeIfAbsent("draftOrderTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrderTags").add(firstArg);
    return projection;
  }

  public DraftOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> draftOrders() {
     DraftOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrders", projection);
    getInputArguments().computeIfAbsent("draftOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("draftOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("draftOrders").add(queryArg);
    return projection;
  }

  public CurrencyCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> enabledPresentmentCurrencies(
      ) {
     CurrencyCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("enabledPresentmentCurrencies", projection);
     return projection;
  }

  public ShopFeaturesProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> features() {
     ShopFeaturesProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopFeaturesProjection<>(this, getRoot());
     getFields().put("features", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      Boolean includeClosed, Integer first, String after, Integer last, String before,
      Boolean reverse, FulfillmentOrderSortKeys sortKey, String query) {
    FulfillmentOrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument includeClosedArg = new InputArgument("includeClosed", includeClosed);
    getInputArguments().get("fulfillmentOrders").add(includeClosedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("fulfillmentOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("fulfillmentOrders").add(queryArg);
    return projection;
  }

  public FulfillmentServiceProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentServices(
      ) {
     FulfillmentServiceProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentServices", projection);
     return projection;
  }

  public InventoryItemConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> inventoryItems(
      ) {
     InventoryItemConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemConnectionProjection<>(this, getRoot());
     getFields().put("inventoryItems", projection);
     return projection;
  }

  public InventoryItemConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> inventoryItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryItemConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemConnectionProjection<>(this, getRoot());    
    getFields().put("inventoryItems", projection);
    getInputArguments().computeIfAbsent("inventoryItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("inventoryItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("inventoryItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("inventoryItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("inventoryItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("inventoryItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("inventoryItems").add(queryArg);
    return projection;
  }

  public LimitedPendingOrderCountProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> limitedPendingOrderCount(
      ) {
     LimitedPendingOrderCountProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new LimitedPendingOrderCountProjection<>(this, getRoot());
     getFields().put("limitedPendingOrderCount", projection);
     return projection;
  }

  public LocationConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> locations() {
     LocationConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }

  public LocationConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> locations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      LocationSortKeys sortKey, String query, Boolean includeLegacy, Boolean includeInactive) {
    LocationConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locations").add(queryArg);
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacy);
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactive);
    getInputArguments().get("locations").add(includeInactiveArg);
    return projection;
  }

  public MerchantApprovalSignalsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> merchantApprovalSignals(
      ) {
     MerchantApprovalSignalsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MerchantApprovalSignalsProjection<>(this, getRoot());
     getFields().put("merchantApprovalSignals", projection);
     return projection;
  }

  public MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public NavigationItemProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> navigationSettings() {
     NavigationItemProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new NavigationItemProjection<>(this, getRoot());
     getFields().put("navigationSettings", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> orderTags() {
     StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("orderTags", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> orderTags(int first,
      ShopTagSort sort) {
    StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("orderTags", projection);
    getInputArguments().computeIfAbsent("orderTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orderTags").add(firstArg);
    InputArgument sortArg = new InputArgument("sort", sort);
    getInputArguments().get("orderTags").add(sortArg);
    return projection;
  }

  public OrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> orders(Integer first,
      String after, Integer last, String before, Boolean reverse, OrderSortKeys sortKey,
      String query) {
    OrderConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public PaymentSettingsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> paymentSettings() {
     PaymentSettingsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentSettingsProjection<>(this, getRoot());
     getFields().put("paymentSettings", projection);
     return projection;
  }

  public ShopPlanProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> plan() {
     ShopPlanProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPlanProjection<>(this, getRoot());
     getFields().put("plan", projection);
     return projection;
  }

  public DomainProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> primaryDomain() {
     DomainProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("primaryDomain", projection);
     return projection;
  }

  public ImageConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productImages() {
     ImageConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageConnectionProjection<>(this, getRoot());
     getFields().put("productImages", projection);
     return projection;
  }

  public ImageConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productImages(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageConnectionProjection<>(this, getRoot());    
    getFields().put("productImages", projection);
    getInputArguments().computeIfAbsent("productImages", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productImages").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productImages").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productImages").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productImages").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productImages").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("productImages").add(sortKeyArg);
    return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productTags() {
     StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("productTags", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productTags(
      int first) {
    StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("productTags", projection);
    getInputArguments().computeIfAbsent("productTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productTags").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productTypes() {
     StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("productTypes", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productTypes(
      int first) {
    StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("productTypes", projection);
    getInputArguments().computeIfAbsent("productTypes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productTypes").add(firstArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productVariants(
      ) {
     ProductVariantConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("productVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productVariants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey, String query) {
    ProductVariantConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productVariants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("productVariants").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productVariants").add(queryArg);
    return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productVendors() {
     StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("productVendors", projection);
     return projection;
  }

  public StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> productVendors(
      int first) {
    StringConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("productVendors", projection);
    getInputArguments().computeIfAbsent("productVendors", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVendors").add(firstArg);
    return projection;
  }

  public ProductConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductSortKeys sortKey, String query, String savedSearchId) {
    ProductConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public ShopResourceLimitsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> resourceLimits() {
     ShopResourceLimitsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopResourceLimitsProjection<>(this, getRoot());
     getFields().put("resourceLimits", projection);
     return projection;
  }

  public SearchResultConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> search() {
     SearchResultConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new SearchResultConnectionProjection<>(this, getRoot());
     getFields().put("search", projection);
     return projection;
  }

  public SearchResultConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> search(
      String query, List<SearchResultType> types, int first, String after) {
    SearchResultConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new SearchResultConnectionProjection<>(this, getRoot());    
    getFields().put("search", projection);
    getInputArguments().computeIfAbsent("search", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("search").add(queryArg);
    InputArgument typesArg = new InputArgument("types", types);
    getInputArguments().get("search").add(typesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("search").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("search").add(afterArg);
    return projection;
  }

  public SearchFilterOptionsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> searchFilters() {
     SearchFilterOptionsProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new SearchFilterOptionsProjection<>(this, getRoot());
     getFields().put("searchFilters", projection);
     return projection;
  }

  public CountryCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> shipsToCountries() {
     CountryCodeProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("shipsToCountries", projection);
     return projection;
  }

  public ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> shopPolicies() {
     ShopPolicyProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPolicyProjection<>(this, getRoot());
     getFields().put("shopPolicies", projection);
     return projection;
  }

  public StaffMemberConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> staffMembers(
      ) {
     StaffMemberConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberConnectionProjection<>(this, getRoot());
     getFields().put("staffMembers", projection);
     return projection;
  }

  public StaffMemberConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> staffMembers(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    StaffMemberConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberConnectionProjection<>(this, getRoot());    
    getFields().put("staffMembers", projection);
    getInputArguments().computeIfAbsent("staffMembers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("staffMembers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("staffMembers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("staffMembers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("staffMembers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("staffMembers").add(reverseArg);
    return projection;
  }

  public StorefrontAccessTokenConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> storefrontAccessTokens(
      ) {
     StorefrontAccessTokenConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StorefrontAccessTokenConnectionProjection<>(this, getRoot());
     getFields().put("storefrontAccessTokens", projection);
     return projection;
  }

  public StorefrontAccessTokenConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> storefrontAccessTokens(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    StorefrontAccessTokenConnectionProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new StorefrontAccessTokenConnectionProjection<>(this, getRoot());    
    getFields().put("storefrontAccessTokens", projection);
    getInputArguments().computeIfAbsent("storefrontAccessTokens", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("storefrontAccessTokens").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("storefrontAccessTokens").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("storefrontAccessTokens").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("storefrontAccessTokens").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("storefrontAccessTokens").add(reverseArg);
    return projection;
  }

  public TranslationProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public UnitSystemProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> unitSystem() {
     UnitSystemProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new UnitSystemProjection<>(this, getRoot());
     getFields().put("unitSystem", projection);
     return projection;
  }

  public WeightUnitProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> weightUnit() {
     WeightUnitProjection<ShopFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightUnitProjection<>(this, getRoot());
     getFields().put("weightUnit", projection);
     return projection;
  }

  public ShopFragmentProjection<PARENT, ROOT> analyticsToken() {
    getFields().put("analyticsToken", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> checkoutApiSupported() {
    getFields().put("checkoutApiSupported", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> contactEmail() {
    getFields().put("contactEmail", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> ianaTimezone() {
    getFields().put("ianaTimezone", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> marketingSmsConsentEnabledAtCheckout() {
    getFields().put("marketingSmsConsentEnabledAtCheckout", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> myshopifyDomain() {
    getFields().put("myshopifyDomain", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> orderNumberFormatPrefix() {
    getFields().put("orderNumberFormatPrefix", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> orderNumberFormatSuffix() {
    getFields().put("orderNumberFormatSuffix", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> richTextEditorUrl() {
    getFields().put("richTextEditorUrl", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> setupRequired() {
    getFields().put("setupRequired", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> shopOwnerName() {
    getFields().put("shopOwnerName", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> storefrontUrl() {
    getFields().put("storefrontUrl", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> taxShipping() {
    getFields().put("taxShipping", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> timezoneAbbreviation() {
    getFields().put("timezoneAbbreviation", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> timezoneOffset() {
    getFields().put("timezoneOffset", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> timezoneOffsetMinutes() {
    getFields().put("timezoneOffsetMinutes", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> transactionalSmsDisabled() {
    getFields().put("transactionalSmsDisabled", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ShopFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Shop {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
