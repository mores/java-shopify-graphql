package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class MarketProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketProjectionRoot() {
    super(null, null, java.util.Optional.of("Market"));
  }

  public MarketProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BooleanProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> assignedCustomization(
      String customizationId) {
    BooleanProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("assignedCustomization", projection);
    getInputArguments().computeIfAbsent("assignedCustomization", k -> new ArrayList<>());                      
    InputArgument customizationIdArg = new InputArgument("customizationId", customizationId, false, null);
    getInputArguments().get("assignedCustomization").add(customizationIdArg);
    return projection;
  }

  public BooleanProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> assignedCustomizationWithVariableReferences(
      String customizationIdReference) {
    BooleanProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("assignedCustomization", projection);
    getInputArguments().computeIfAbsent("assignedCustomization", k -> new ArrayList<>());              
    InputArgument customizationIdArg = new InputArgument("customizationId", customizationIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("assignedCustomization").add(customizationIdArg);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> catalogs(
      ) {
    MarketCatalogConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("catalogs").add(reverseArg);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> catalogsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketCatalogConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("catalogs").add(reverseArg);
    return projection;
  }

  public CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> catalogsCount(
      ) {
    CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("catalogsCount", projection);
    return projection;
  }

  public MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> childMarkets(
      ) {
    MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("childMarkets", projection);
    return projection;
  }

  public MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> childMarkets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("childMarkets", projection);
    getInputArguments().computeIfAbsent("childMarkets", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("childMarkets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("childMarkets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("childMarkets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("childMarkets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("childMarkets").add(reverseArg);
    return projection;
  }

  public MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> childMarketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("childMarkets", projection);
    getInputArguments().computeIfAbsent("childMarkets", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("childMarkets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("childMarkets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("childMarkets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("childMarkets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("childMarkets").add(reverseArg);
    return projection;
  }

  public CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> childMarketsCount(
      ) {
    CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("childMarketsCount", projection);
    return projection;
  }

  public MarketConditionsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> conditions(
      ) {
    MarketConditionsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConditionsProjection<>(this, this);    
    getFields().put("conditions", projection);
    return projection;
  }

  public MarketCurrencySettingsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> currencySettings(
      ) {
    MarketCurrencySettingsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketCurrencySettingsProjection<>(this, this);    
    getFields().put("currencySettings", projection);
    return projection;
  }

  public MarketDeliveryConfigurationsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> delivery(
      ) {
    MarketDeliveryConfigurationsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketDeliveryConfigurationsProjection<>(this, this);    
    getFields().put("delivery", projection);
    return projection;
  }

  public DiscountNodeConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> discounts(
      ) {
    DiscountNodeConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    return projection;
  }

  public DiscountNodeConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountNodeConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    getInputArguments().computeIfAbsent("discounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("discounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("discounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("discounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("discounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("discounts").add(reverseArg);
    return projection;
  }

  public DiscountNodeConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> discountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    DiscountNodeConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    getInputArguments().computeIfAbsent("discounts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("discounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("discounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("discounts").add(reverseArg);
    return projection;
  }

  public CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> discountsCount(
      ) {
    CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("discountsCount", projection);
    return projection;
  }

  public MetafieldProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldDefinitionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> parentMarkets(
      ) {
    MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("parentMarkets", projection);
    return projection;
  }

  public MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> parentMarkets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("parentMarkets", projection);
    getInputArguments().computeIfAbsent("parentMarkets", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("parentMarkets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("parentMarkets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("parentMarkets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("parentMarkets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("parentMarkets").add(reverseArg);
    return projection;
  }

  public MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> parentMarketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("parentMarkets", projection);
    getInputArguments().computeIfAbsent("parentMarkets", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("parentMarkets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("parentMarkets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("parentMarkets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("parentMarkets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("parentMarkets").add(reverseArg);
    return projection;
  }

  public CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> parentMarketsCount(
      ) {
    CountProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("parentMarketsCount", projection);
    return projection;
  }

  public MarketPriceInclusionsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> priceInclusions(
      ) {
    MarketPriceInclusionsProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketPriceInclusionsProjection<>(this, this);    
    getFields().put("priceInclusions", projection);
    return projection;
  }

  public PriceListProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public MarketRegionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> regions(
      ) {
    MarketRegionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
    getFields().put("regions", projection);
    return projection;
  }

  public MarketRegionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> regions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketRegionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
    getFields().put("regions", projection);
    getInputArguments().computeIfAbsent("regions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("regions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("regions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("regions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("regions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("regions").add(reverseArg);
    return projection;
  }

  public MarketRegionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> regionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketRegionConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
    getFields().put("regions", projection);
    getInputArguments().computeIfAbsent("regions", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("regions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("regions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("regions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("regions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("regions").add(reverseArg);
    return projection;
  }

  public ReturnPolicyProfileProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> returnPolicyProfile(
      ) {
    ReturnPolicyProfileProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new ReturnPolicyProfileProjection<>(this, this);    
    getFields().put("returnPolicyProfile", projection);
    return projection;
  }

  public MarketStatusProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> status(
      ) {
    MarketStatusProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public MarketTypeProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> type(
      ) {
    MarketTypeProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public MarketWebPresenceProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> webPresence(
      ) {
    MarketWebPresenceProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("webPresence", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> webPresences(
      ) {
    MarketWebPresenceConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    getInputArguments().computeIfAbsent("webPresences", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("webPresences").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("webPresences").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("webPresences").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("webPresences").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("webPresences").add(reverseArg);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> webPresencesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketWebPresenceConnectionProjection<MarketProjectionRoot<PARENT, ROOT>, MarketProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    getInputArguments().computeIfAbsent("webPresences", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("webPresences").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("webPresences").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("webPresences").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("webPresences").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("webPresences").add(reverseArg);
    return projection;
  }

  public MarketProjectionRoot<PARENT, ROOT> assignedCustomization() {
    getFields().put("assignedCustomization", null);
    return this;
  }

  public MarketProjectionRoot<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public MarketProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MarketProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketProjectionRoot<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }
}
