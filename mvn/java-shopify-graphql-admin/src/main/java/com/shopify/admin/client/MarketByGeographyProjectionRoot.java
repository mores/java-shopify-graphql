package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class MarketByGeographyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketByGeographyProjectionRoot() {
    super(null, null, java.util.Optional.of("Market"));
  }

  public MarketByGeographyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BooleanProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> assignedCustomization(
      String customizationId) {
    BooleanProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("assignedCustomization", projection);
    getInputArguments().computeIfAbsent("assignedCustomization", k -> new ArrayList<>());                      
    InputArgument customizationIdArg = new InputArgument("customizationId", customizationId, false, null);
    getInputArguments().get("assignedCustomization").add(customizationIdArg);
    return projection;
  }

  public BooleanProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> assignedCustomizationWithVariableReferences(
      String customizationIdReference) {
    BooleanProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("assignedCustomization", projection);
    getInputArguments().computeIfAbsent("assignedCustomization", k -> new ArrayList<>());              
    InputArgument customizationIdArg = new InputArgument("customizationId", customizationIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("assignedCustomization").add(customizationIdArg);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> catalogs(
      ) {
    MarketCatalogConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    return projection;
  }

  public MarketCatalogConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
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

  public MarketCatalogConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> catalogsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketCatalogConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketCatalogConnectionProjection<>(this, this);    
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

  public CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> catalogsCount(
      ) {
    CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("catalogsCount", projection);
    return projection;
  }

  public MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> childMarkets(
      ) {
    MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("childMarkets", projection);
    return projection;
  }

  public MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> childMarkets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
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

  public MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> childMarketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
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

  public CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> childMarketsCount(
      ) {
    CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("childMarketsCount", projection);
    return projection;
  }

  public MarketConditionsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> conditions(
      ) {
    MarketConditionsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConditionsProjection<>(this, this);    
    getFields().put("conditions", projection);
    return projection;
  }

  public MarketCurrencySettingsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> currencySettings(
      ) {
    MarketCurrencySettingsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketCurrencySettingsProjection<>(this, this);    
    getFields().put("currencySettings", projection);
    return projection;
  }

  public MarketDeliveryConfigurationsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> delivery(
      ) {
    MarketDeliveryConfigurationsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketDeliveryConfigurationsProjection<>(this, this);    
    getFields().put("delivery", projection);
    return projection;
  }

  public DiscountNodeConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> discounts(
      ) {
    DiscountNodeConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeConnectionProjection<>(this, this);    
    getFields().put("discounts", projection);
    return projection;
  }

  public DiscountNodeConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountNodeConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeConnectionProjection<>(this, this);    
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

  public DiscountNodeConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> discountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    DiscountNodeConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeConnectionProjection<>(this, this);    
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

  public CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> discountsCount(
      ) {
    CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("discountsCount", projection);
    return projection;
  }

  public MetafieldProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldDefinitionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> parentMarkets(
      ) {
    MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
    getFields().put("parentMarkets", projection);
    return projection;
  }

  public MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> parentMarkets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
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

  public MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> parentMarketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketConnectionProjection<>(this, this);    
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

  public CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> parentMarketsCount(
      ) {
    CountProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("parentMarketsCount", projection);
    return projection;
  }

  public MarketPriceInclusionsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> priceInclusions(
      ) {
    MarketPriceInclusionsProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketPriceInclusionsProjection<>(this, this);    
    getFields().put("priceInclusions", projection);
    return projection;
  }

  public PriceListProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> priceList(
      ) {
    PriceListProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("priceList", projection);
    return projection;
  }

  public MarketRegionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> regions(
      ) {
    MarketRegionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
    getFields().put("regions", projection);
    return projection;
  }

  public MarketRegionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> regions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketRegionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
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

  public MarketRegionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> regionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketRegionConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketRegionConnectionProjection<>(this, this);    
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

  public ReturnPolicyProfileProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> returnPolicyProfile(
      ) {
    ReturnPolicyProfileProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new ReturnPolicyProfileProjection<>(this, this);    
    getFields().put("returnPolicyProfile", projection);
    return projection;
  }

  public MarketStatusProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> status(
      ) {
    MarketStatusProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public MarketTypeProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> type(
      ) {
    MarketTypeProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public MarketWebPresenceProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> webPresence(
      ) {
    MarketWebPresenceProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("webPresence", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> webPresences(
      ) {
    MarketWebPresenceConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
    getFields().put("webPresences", projection);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
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

  public MarketWebPresenceConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> webPresencesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketWebPresenceConnectionProjection<MarketByGeographyProjectionRoot<PARENT, ROOT>, MarketByGeographyProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceConnectionProjection<>(this, this);    
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

  public MarketByGeographyProjectionRoot<PARENT, ROOT> assignedCustomization() {
    getFields().put("assignedCustomization", null);
    return this;
  }

  public MarketByGeographyProjectionRoot<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public MarketByGeographyProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MarketByGeographyProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketByGeographyProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketByGeographyProjectionRoot<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }
}
