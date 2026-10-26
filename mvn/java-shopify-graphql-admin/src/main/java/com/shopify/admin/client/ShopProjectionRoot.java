package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AnalyticsAnnotationSortKeys;
import com.shopify.admin.types.CollectionSortKeys;
import com.shopify.admin.types.CustomerSortKeys;
import com.shopify.admin.types.FulfillmentOrderAssignmentStatus;
import com.shopify.admin.types.FulfillmentOrderSortKeys;
import com.shopify.admin.types.LocationSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.OrderSortKeys;
import com.shopify.admin.types.ProductImageSortKeys;
import com.shopify.admin.types.ProductSortKeys;
import com.shopify.admin.types.ProductVariantSortKeys;
import com.shopify.admin.types.SearchResultType;
import com.shopify.admin.types.ShopTagSort;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ShopProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopProjectionRoot() {
    super(null, null, java.util.Optional.of("Shop"));
  }

  public ShopProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StaffMemberProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> accountOwner(
      ) {
    StaffMemberProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("accountOwner", projection);
    return projection;
  }

  public ShopAlertProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> alerts(
      ) {
    ShopAlertProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopAlertProjection<>(this, this);    
    getFields().put("alerts", projection);
    return projection;
  }

  public ProductCategoryProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> allProductCategories(
      ) {
    ProductCategoryProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductCategoryProjection<>(this, this);    
    getFields().put("allProductCategories", projection);
    return projection;
  }

  public TaxonomyCategoryProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> allProductCategoriesList(
      ) {
    TaxonomyCategoryProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new TaxonomyCategoryProjection<>(this, this);    
    getFields().put("allProductCategoriesList", projection);
    return projection;
  }

  public AnalyticsAnnotationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> analyticsAnnotations(
      ) {
    AnalyticsAnnotationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationConnectionProjection<>(this, this);    
    getFields().put("analyticsAnnotations", projection);
    return projection;
  }

  public AnalyticsAnnotationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> analyticsAnnotations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AnalyticsAnnotationSortKeys sortKey, String query) {
    AnalyticsAnnotationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationConnectionProjection<>(this, this);    
    getFields().put("analyticsAnnotations", projection);
    getInputArguments().computeIfAbsent("analyticsAnnotations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("analyticsAnnotations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("analyticsAnnotations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("analyticsAnnotations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("analyticsAnnotations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("analyticsAnnotations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("analyticsAnnotations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("analyticsAnnotations").add(queryArg);
    return projection;
  }

  public AnalyticsAnnotationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> analyticsAnnotationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    AnalyticsAnnotationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AnalyticsAnnotationConnectionProjection<>(this, this);    
    getFields().put("analyticsAnnotations", projection);
    getInputArguments().computeIfAbsent("analyticsAnnotations", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("analyticsAnnotations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("analyticsAnnotations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("analyticsAnnotations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("analyticsAnnotations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("analyticsAnnotations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("AnalyticsAnnotationSortKeys"));
    getInputArguments().get("analyticsAnnotations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("analyticsAnnotations").add(queryArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> assignedFulfillmentOrders(
      ) {
    FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("assignedFulfillmentOrders", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> assignedFulfillmentOrders(
      FulfillmentOrderAssignmentStatus assignmentStatus, List<String> locationIds, Integer first,
      String after, Integer last, String before, Boolean reverse,
      FulfillmentOrderSortKeys sortKey) {
    FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("assignedFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("assignedFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument assignmentStatusArg = new InputArgument("assignmentStatus", assignmentStatus, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(assignmentStatusArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIds, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("assignedFulfillmentOrders").add(sortKeyArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> assignedFulfillmentOrdersWithVariableReferences(
      String assignmentStatusReference, String locationIdsReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference) {
    FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("assignedFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("assignedFulfillmentOrders", k -> new ArrayList<>());              
    InputArgument assignmentStatusArg = new InputArgument("assignmentStatus", assignmentStatusReference, true, new graphql.language.TypeName("FulfillmentOrderAssignmentStatus"));
    getInputArguments().get("assignedFulfillmentOrders").add(assignmentStatusArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIdsReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))));
    getInputArguments().get("assignedFulfillmentOrders").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("assignedFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("assignedFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("assignedFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("assignedFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("assignedFulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("FulfillmentOrderSortKeys"));
    getInputArguments().get("assignedFulfillmentOrders").add(sortKeyArg);
    return projection;
  }

  public AppConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> availableChannelApps(
      ) {
    AppConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AppConnectionProjection<>(this, this);    
    getFields().put("availableChannelApps", projection);
    return projection;
  }

  public AppConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> availableChannelApps(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AppConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AppConnectionProjection<>(this, this);    
    getFields().put("availableChannelApps", projection);
    getInputArguments().computeIfAbsent("availableChannelApps", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("availableChannelApps").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("availableChannelApps").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("availableChannelApps").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("availableChannelApps").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("availableChannelApps").add(reverseArg);
    return projection;
  }

  public AppConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> availableChannelAppsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    AppConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AppConnectionProjection<>(this, this);    
    getFields().put("availableChannelApps", projection);
    getInputArguments().computeIfAbsent("availableChannelApps", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("availableChannelApps").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("availableChannelApps").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("availableChannelApps").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("availableChannelApps").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("availableChannelApps").add(reverseArg);
    return projection;
  }

  public ShopAddressProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> billingAddress(
      ) {
    ShopAddressProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopAddressProjection<>(this, this);    
    getFields().put("billingAddress", projection);
    return projection;
  }

  public AvailableChannelDefinitionsByChannelProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> channelDefinitionsForInstalledChannels(
      ) {
    AvailableChannelDefinitionsByChannelProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new AvailableChannelDefinitionsByChannelProjection<>(this, this);    
    getFields().put("channelDefinitionsForInstalledChannels", projection);
    return projection;
  }

  public ChannelConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> channels(
      ) {
    ChannelConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("channels", projection);
    return projection;
  }

  public ChannelConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> channels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public ChannelConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> channelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query, String savedSearchId) {
    CollectionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("collections").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("collections").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("collections").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("collections").add(savedSearchIdArg);
    return projection;
  }

  public CollectionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> collectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference,
      String savedSearchIdReference) {
    CollectionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("collections").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("CollectionSortKeys"));
    getInputArguments().get("collections").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("collections").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("collections").add(savedSearchIdArg);
    return projection;
  }

  public CountriesInShippingZonesProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> countriesInShippingZones(
      ) {
    CountriesInShippingZonesProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CountriesInShippingZonesProjection<>(this, this);    
    getFields().put("countriesInShippingZones", projection);
    return projection;
  }

  public CurrencyCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> currencyCode(
      ) {
    CurrencyCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currencyCode", projection);
    return projection;
  }

  public CurrencyFormatsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> currencyFormats(
      ) {
    CurrencyFormatsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CurrencyFormatsProjection<>(this, this);    
    getFields().put("currencyFormats", projection);
    return projection;
  }

  public CurrencySettingConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> currencySettings(
      ) {
    CurrencySettingConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CurrencySettingConnectionProjection<>(this, this);    
    getFields().put("currencySettings", projection);
    return projection;
  }

  public CurrencySettingConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> currencySettings(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CurrencySettingConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CurrencySettingConnectionProjection<>(this, this);    
    getFields().put("currencySettings", projection);
    getInputArguments().computeIfAbsent("currencySettings", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("currencySettings").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("currencySettings").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("currencySettings").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("currencySettings").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("currencySettings").add(reverseArg);
    return projection;
  }

  public CurrencySettingConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> currencySettingsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CurrencySettingConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CurrencySettingConnectionProjection<>(this, this);    
    getFields().put("currencySettings", projection);
    getInputArguments().computeIfAbsent("currencySettings", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("currencySettings").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("currencySettings").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("currencySettings").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("currencySettings").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("currencySettings").add(reverseArg);
    return projection;
  }

  public ShopCustomerAccountsSettingProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customerAccounts(
      ) {
    ShopCustomerAccountsSettingProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopCustomerAccountsSettingProjection<>(this, this);    
    getFields().put("customerAccounts", projection);
    return projection;
  }

  public CustomerAccountsV2Projection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customerAccountsV2(
      ) {
    CustomerAccountsV2Projection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CustomerAccountsV2Projection<>(this, this);    
    getFields().put("customerAccountsV2", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customerTags(
      ) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("customerTags", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customerTags(
      int first) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("customerTags", projection);
    getInputArguments().computeIfAbsent("customerTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("customerTags").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customerTagsWithVariableReferences(
      String firstReference) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("customerTags", projection);
    getInputArguments().computeIfAbsent("customerTags", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("customerTags").add(firstArg);
    return projection;
  }

  public CustomerConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customers(
      ) {
    CustomerConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CustomerConnectionProjection<>(this, this);    
    getFields().put("customers", projection);
    return projection;
  }

  public CustomerConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customers(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CustomerSortKeys sortKey, String query) {
    CustomerConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CustomerConnectionProjection<>(this, this);    
    getFields().put("customers", projection);
    getInputArguments().computeIfAbsent("customers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("customers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("customers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("customers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("customers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("customers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("customers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("customers").add(queryArg);
    return projection;
  }

  public CustomerConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> customersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    CustomerConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CustomerConnectionProjection<>(this, this);    
    getFields().put("customers", projection);
    getInputArguments().computeIfAbsent("customers", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("customers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("customers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("customers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("customers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("customers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("CustomerSortKeys"));
    getInputArguments().get("customers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("customers").add(queryArg);
    return projection;
  }

  public DomainProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> domains(
      ) {
    DomainProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new DomainProjection<>(this, this);    
    getFields().put("domains", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> draftOrderTags(
      ) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("draftOrderTags", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> draftOrderTags(
      int first) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("draftOrderTags", projection);
    getInputArguments().computeIfAbsent("draftOrderTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("draftOrderTags").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> draftOrderTagsWithVariableReferences(
      String firstReference) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("draftOrderTags", projection);
    getInputArguments().computeIfAbsent("draftOrderTags", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("draftOrderTags").add(firstArg);
    return projection;
  }

  public CurrencyCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> enabledPresentmentCurrencies(
      ) {
    CurrencyCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("enabledPresentmentCurrencies", projection);
    return projection;
  }

  public EntitlementsTypeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> entitlements(
      ) {
    EntitlementsTypeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new EntitlementsTypeProjection<>(this, this);    
    getFields().put("entitlements", projection);
    return projection;
  }

  public ShopFeaturesProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> features(
      ) {
    ShopFeaturesProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopFeaturesProjection<>(this, this);    
    getFields().put("features", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> fulfillmentOrders(
      ) {
    FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrders", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> fulfillmentOrders(
      Boolean includeClosed, Integer first, String after, Integer last, String before,
      Boolean reverse, FulfillmentOrderSortKeys sortKey, String query) {
    FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument includeClosedArg = new InputArgument("includeClosed", includeClosed, false, null);
    getInputArguments().get("fulfillmentOrders").add(includeClosedArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("fulfillmentOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("fulfillmentOrders").add(queryArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> fulfillmentOrdersWithVariableReferences(
      String includeClosedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    FulfillmentOrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());              
    InputArgument includeClosedArg = new InputArgument("includeClosed", includeClosedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("fulfillmentOrders").add(includeClosedArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("FulfillmentOrderSortKeys"));
    getInputArguments().get("fulfillmentOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentOrders").add(queryArg);
    return projection;
  }

  public FulfillmentServiceProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> fulfillmentServices(
      ) {
    FulfillmentServiceProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new FulfillmentServiceProjection<>(this, this);    
    getFields().put("fulfillmentServices", projection);
    return projection;
  }

  public InventoryItemConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> inventoryItems(
      ) {
    InventoryItemConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new InventoryItemConnectionProjection<>(this, this);    
    getFields().put("inventoryItems", projection);
    return projection;
  }

  public InventoryItemConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> inventoryItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryItemConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new InventoryItemConnectionProjection<>(this, this);    
    getFields().put("inventoryItems", projection);
    getInputArguments().computeIfAbsent("inventoryItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("inventoryItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("inventoryItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("inventoryItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("inventoryItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("inventoryItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("inventoryItems").add(queryArg);
    return projection;
  }

  public InventoryItemConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> inventoryItemsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    InventoryItemConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new InventoryItemConnectionProjection<>(this, this);    
    getFields().put("inventoryItems", projection);
    getInputArguments().computeIfAbsent("inventoryItems", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("inventoryItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("inventoryItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("inventoryItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("inventoryItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("inventoryItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("inventoryItems").add(queryArg);
    return projection;
  }

  public LimitedPendingOrderCountProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> limitedPendingOrderCount(
      ) {
    LimitedPendingOrderCountProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new LimitedPendingOrderCountProjection<>(this, this);    
    getFields().put("limitedPendingOrderCount", projection);
    return projection;
  }

  public LocationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> locations(
      ) {
    LocationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new LocationConnectionProjection<>(this, this);    
    getFields().put("locations", projection);
    return projection;
  }

  public LocationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> locations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      LocationSortKeys sortKey, String query, Boolean includeLegacy, Boolean includeInactive) {
    LocationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new LocationConnectionProjection<>(this, this);    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("locations").add(queryArg);
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacy, false, null);
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactive, false, null);
    getInputArguments().get("locations").add(includeInactiveArg);
    return projection;
  }

  public LocationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> locationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference,
      String includeLegacyReference, String includeInactiveReference) {
    LocationConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new LocationConnectionProjection<>(this, this);    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("LocationSortKeys"));
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locations").add(queryArg);
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacyReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactiveReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locations").add(includeInactiveArg);
    return projection;
  }

  public MerchantApprovalSignalsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> merchantApprovalSignals(
      ) {
    MerchantApprovalSignalsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MerchantApprovalSignalsProjection<>(this, this);    
    getFields().put("merchantApprovalSignals", projection);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus, false, null);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatusReference, true, new graphql.language.TypeName("MetafieldDefinitionPinnedStatus"));
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("MetafieldDefinitionSortKeys"));
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys, false, null);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public MetafieldConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keysReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))));
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public NavigationItemProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> navigationSettings(
      ) {
    NavigationItemProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new NavigationItemProjection<>(this, this);    
    getFields().put("navigationSettings", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> orderTags(
      ) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("orderTags", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> orderTags(
      int first, ShopTagSort sort) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("orderTags", projection);
    getInputArguments().computeIfAbsent("orderTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("orderTags").add(firstArg);
    InputArgument sortArg = new InputArgument("sort", sort, false, null);
    getInputArguments().get("orderTags").add(sortArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> orderTagsWithVariableReferences(
      String firstReference, String sortReference) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("orderTags", projection);
    getInputArguments().computeIfAbsent("orderTags", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("orderTags").add(firstArg);
    InputArgument sortArg = new InputArgument("sort", sortReference, true, new graphql.language.TypeName("ShopTagSort"));
    getInputArguments().get("orderTags").add(sortArg);
    return projection;
  }

  public OrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey, String query) {
    OrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public OrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> ordersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    OrderConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("OrderSortKeys"));
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public PaymentSettingsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> paymentSettings(
      ) {
    PaymentSettingsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new PaymentSettingsProjection<>(this, this);    
    getFields().put("paymentSettings", projection);
    return projection;
  }

  public ShopPlanProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> plan(
      ) {
    ShopPlanProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPlanProjection<>(this, this);    
    getFields().put("plan", projection);
    return projection;
  }

  public DomainProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> primaryDomain(
      ) {
    DomainProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new DomainProjection<>(this, this);    
    getFields().put("primaryDomain", projection);
    return projection;
  }

  public ImageConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productImages(
      ) {
    ImageConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("productImages", projection);
    return projection;
  }

  public ImageConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productImages(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("productImages", projection);
    getInputArguments().computeIfAbsent("productImages", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productImages").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productImages").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productImages").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productImages").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productImages").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("productImages").add(sortKeyArg);
    return projection;
  }

  public ImageConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productImagesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    ImageConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("productImages", projection);
    getInputArguments().computeIfAbsent("productImages", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productImages").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productImages").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productImages").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productImages").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productImages").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductImageSortKeys"));
    getInputArguments().get("productImages").add(sortKeyArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productTags(
      ) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productTags", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productTags(
      int first) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productTags", projection);
    getInputArguments().computeIfAbsent("productTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productTags").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productTagsWithVariableReferences(
      String firstReference) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productTags", projection);
    getInputArguments().computeIfAbsent("productTags", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("productTags").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productTypes(
      ) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productTypes", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productTypes(
      int first) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productTypes", projection);
    getInputArguments().computeIfAbsent("productTypes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productTypes").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productTypesWithVariableReferences(
      String firstReference) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productTypes", projection);
    getInputArguments().computeIfAbsent("productTypes", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("productTypes").add(firstArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productVariants(
      ) {
    ProductVariantConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("productVariants", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productVariants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey, String query) {
    ProductVariantConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productVariants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("productVariants").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("productVariants").add(queryArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productVariantsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    ProductVariantConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productVariants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductVariantSortKeys"));
    getInputArguments().get("productVariants").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariants").add(queryArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productVendors(
      ) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productVendors", projection);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productVendors(
      int first) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productVendors", projection);
    getInputArguments().computeIfAbsent("productVendors", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productVendors").add(firstArg);
    return projection;
  }

  public StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productVendorsWithVariableReferences(
      String firstReference) {
    StringConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StringConnectionProjection<>(this, this);    
    getFields().put("productVendors", projection);
    getInputArguments().computeIfAbsent("productVendors", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("productVendors").add(firstArg);
    return projection;
  }

  public ProductConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> products(
      ) {
    ProductConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    return projection;
  }

  public ProductConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> products(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductSortKeys sortKey, String query, String savedSearchId) {
    ProductConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId, false, null);
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public ProductConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> productsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference,
      String savedSearchIdReference) {
    ProductConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductSortKeys"));
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public ShopResourceLimitsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> resourceLimits(
      ) {
    ShopResourceLimitsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopResourceLimitsProjection<>(this, this);    
    getFields().put("resourceLimits", projection);
    return projection;
  }

  public SearchResultConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> search(
      ) {
    SearchResultConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new SearchResultConnectionProjection<>(this, this);    
    getFields().put("search", projection);
    return projection;
  }

  public SearchResultConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> search(
      String query, List<SearchResultType> types, int first, String after) {
    SearchResultConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new SearchResultConnectionProjection<>(this, this);    
    getFields().put("search", projection);
    getInputArguments().computeIfAbsent("search", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("search").add(queryArg);
    InputArgument typesArg = new InputArgument("types", types, false, null);
    getInputArguments().get("search").add(typesArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("search").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("search").add(afterArg);
    return projection;
  }

  public SearchResultConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> searchWithVariableReferences(
      String queryReference, String typesReference, String firstReference, String afterReference) {
    SearchResultConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new SearchResultConnectionProjection<>(this, this);    
    getFields().put("search", projection);
    getInputArguments().computeIfAbsent("search", k -> new ArrayList<>());              
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("search").add(queryArg);
    InputArgument typesArg = new InputArgument("types", typesReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SearchResultType"))));
    getInputArguments().get("search").add(typesArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("Int")));
    getInputArguments().get("search").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("search").add(afterArg);
    return projection;
  }

  public SearchFilterOptionsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> searchFilters(
      ) {
    SearchFilterOptionsProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new SearchFilterOptionsProjection<>(this, this);    
    getFields().put("searchFilters", projection);
    return projection;
  }

  public CountryCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> shipsToCountries(
      ) {
    CountryCodeProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("shipsToCountries", projection);
    return projection;
  }

  public ShopAddressProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> shopAddress(
      ) {
    ShopAddressProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopAddressProjection<>(this, this);    
    getFields().put("shopAddress", projection);
    return projection;
  }

  public ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> shopPolicies(
      ) {
    ShopPolicyProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new ShopPolicyProjection<>(this, this);    
    getFields().put("shopPolicies", projection);
    return projection;
  }

  public StaffMemberConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> staffMembers(
      ) {
    StaffMemberConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StaffMemberConnectionProjection<>(this, this);    
    getFields().put("staffMembers", projection);
    return projection;
  }

  public StaffMemberConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> staffMembers(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    StaffMemberConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StaffMemberConnectionProjection<>(this, this);    
    getFields().put("staffMembers", projection);
    getInputArguments().computeIfAbsent("staffMembers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("staffMembers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("staffMembers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("staffMembers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("staffMembers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("staffMembers").add(reverseArg);
    return projection;
  }

  public StaffMemberConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> staffMembersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    StaffMemberConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StaffMemberConnectionProjection<>(this, this);    
    getFields().put("staffMembers", projection);
    getInputArguments().computeIfAbsent("staffMembers", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("staffMembers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("staffMembers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("staffMembers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("staffMembers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("staffMembers").add(reverseArg);
    return projection;
  }

  public StorefrontAccessTokenConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> storefrontAccessTokens(
      ) {
    StorefrontAccessTokenConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StorefrontAccessTokenConnectionProjection<>(this, this);    
    getFields().put("storefrontAccessTokens", projection);
    return projection;
  }

  public StorefrontAccessTokenConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> storefrontAccessTokens(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    StorefrontAccessTokenConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StorefrontAccessTokenConnectionProjection<>(this, this);    
    getFields().put("storefrontAccessTokens", projection);
    getInputArguments().computeIfAbsent("storefrontAccessTokens", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("storefrontAccessTokens").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("storefrontAccessTokens").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("storefrontAccessTokens").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("storefrontAccessTokens").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("storefrontAccessTokens").add(reverseArg);
    return projection;
  }

  public StorefrontAccessTokenConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> storefrontAccessTokensWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    StorefrontAccessTokenConnectionProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new StorefrontAccessTokenConnectionProjection<>(this, this);    
    getFields().put("storefrontAccessTokens", projection);
    getInputArguments().computeIfAbsent("storefrontAccessTokens", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("storefrontAccessTokens").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("storefrontAccessTokens").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("storefrontAccessTokens").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("storefrontAccessTokens").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("storefrontAccessTokens").add(reverseArg);
    return projection;
  }

  public TranslationProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public UnitSystemProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> unitSystem(
      ) {
    UnitSystemProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new UnitSystemProjection<>(this, this);    
    getFields().put("unitSystem", projection);
    return projection;
  }

  public WeightUnitProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> weightUnit(
      ) {
    WeightUnitProjection<ShopProjectionRoot<PARENT, ROOT>, ShopProjectionRoot<PARENT, ROOT>> projection = new WeightUnitProjection<>(this, this);    
    getFields().put("weightUnit", projection);
    return projection;
  }

  public ShopProjectionRoot<PARENT, ROOT> analyticsToken() {
    getFields().put("analyticsToken", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> checkoutApiSupported() {
    getFields().put("checkoutApiSupported", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> contactEmail() {
    getFields().put("contactEmail", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> ianaTimezone() {
    getFields().put("ianaTimezone", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> marketingSmsConsentEnabledAtCheckout() {
    getFields().put("marketingSmsConsentEnabledAtCheckout", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> myshopifyDomain() {
    getFields().put("myshopifyDomain", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> orderNumberFormatPrefix() {
    getFields().put("orderNumberFormatPrefix", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> orderNumberFormatSuffix() {
    getFields().put("orderNumberFormatSuffix", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> richTextEditorUrl() {
    getFields().put("richTextEditorUrl", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> setupRequired() {
    getFields().put("setupRequired", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> shopOwnerName() {
    getFields().put("shopOwnerName", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> storefrontUrl() {
    getFields().put("storefrontUrl", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> taxShipping() {
    getFields().put("taxShipping", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> timezoneAbbreviation() {
    getFields().put("timezoneAbbreviation", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> timezoneOffset() {
    getFields().put("timezoneOffset", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> timezoneOffsetMinutes() {
    getFields().put("timezoneOffsetMinutes", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> transactionalSmsDisabled() {
    getFields().put("transactionalSmsDisabled", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ShopProjectionRoot<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
