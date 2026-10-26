package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class MarketFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Market"));
  }

  public MarketFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogs(
      ) {
     MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());    
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

  public MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketCatalogConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCatalogConnectionProjection<>(this, getRoot());    
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

  public CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> catalogsCount() {
     CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("catalogsCount", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> childMarkets() {
     MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("childMarkets", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> childMarkets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> childMarketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> childMarketsCount() {
     CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("childMarketsCount", projection);
     return projection;
  }

  public MarketConditionsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> conditions() {
     MarketConditionsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConditionsProjection<>(this, getRoot());
     getFields().put("conditions", projection);
     return projection;
  }

  public MarketCurrencySettingsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> currencySettings(
      ) {
     MarketCurrencySettingsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketCurrencySettingsProjection<>(this, getRoot());
     getFields().put("currencySettings", projection);
     return projection;
  }

  public MarketDeliveryConfigurationsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> delivery(
      ) {
     MarketDeliveryConfigurationsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketDeliveryConfigurationsProjection<>(this, getRoot());
     getFields().put("delivery", projection);
     return projection;
  }

  public DiscountNodeConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      ) {
     DiscountNodeConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());
     getFields().put("discounts", projection);
     return projection;
  }

  public DiscountNodeConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> discounts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DiscountNodeConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());    
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

  public DiscountNodeConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> discountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    DiscountNodeConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());    
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

  public CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> discountsCount() {
     CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("discountsCount", projection);
     return projection;
  }

  public MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> parentMarkets() {
     MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("parentMarkets", projection);
     return projection;
  }

  public MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> parentMarkets(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> parentMarketsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
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

  public CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> parentMarketsCount() {
     CountProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("parentMarketsCount", projection);
     return projection;
  }

  public MarketPriceInclusionsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> priceInclusions(
      ) {
     MarketPriceInclusionsProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketPriceInclusionsProjection<>(this, getRoot());
     getFields().put("priceInclusions", projection);
     return projection;
  }

  public PriceListProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> regions() {
     MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());
     getFields().put("regions", projection);
     return projection;
  }

  public MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> regions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());    
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

  public MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> regionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketRegionConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionConnectionProjection<>(this, getRoot());    
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

  public ReturnPolicyProfileProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> returnPolicyProfile(
      ) {
     ReturnPolicyProfileProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnPolicyProfileProjection<>(this, getRoot());
     getFields().put("returnPolicyProfile", projection);
     return projection;
  }

  public MarketStatusProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> status() {
     MarketStatusProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MarketTypeProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> type() {
     MarketTypeProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MarketWebPresenceProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresence() {
     MarketWebPresenceProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("webPresence", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresences(
      ) {
     MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());
     getFields().put("webPresences", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());    
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

  public MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> webPresencesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MarketWebPresenceConnectionProjection<MarketFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());    
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

  public MarketFragmentProjection<PARENT, ROOT> assignedCustomization() {
    getFields().put("assignedCustomization", null);
    return this;
  }

  public MarketFragmentProjection assignedCustomization(String customizationId) {
    getFields().put("assignedCustomization", null);
    getInputArguments().computeIfAbsent("assignedCustomization", k -> new ArrayList<>());
    InputArgument customizationIdArg = new InputArgument("customizationId", customizationId, false, null);
    getInputArguments().get("assignedCustomization").add(customizationIdArg);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MarketFragmentProjection<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Market {");
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
