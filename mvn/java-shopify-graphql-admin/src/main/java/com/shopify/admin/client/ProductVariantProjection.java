package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CatalogType;
import com.shopify.admin.types.ContextualPricingContext;
import com.shopify.admin.types.CurrencyCode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductVariantProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> availablePublicationsCount(
      ) {
     CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("availablePublicationsCount", projection);
     return projection;
  }

  public ProductVariantBarcodeConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> barcodes(
      ) {
     ProductVariantBarcodeConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantBarcodeConnectionProjection<>(this, getRoot());
     getFields().put("barcodes", projection);
     return projection;
  }

  public ProductVariantBarcodeConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> barcodes(
      Integer first, String after, Integer last, String before) {
    ProductVariantBarcodeConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantBarcodeConnectionProjection<>(this, getRoot());    
    getFields().put("barcodes", projection);
    getInputArguments().computeIfAbsent("barcodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("barcodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("barcodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("barcodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("barcodes").add(beforeArg);
    return projection;
  }

  public ProductVariantBarcodeConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> barcodesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference) {
    ProductVariantBarcodeConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantBarcodeConnectionProjection<>(this, getRoot());    
    getFields().put("barcodes", projection);
    getInputArguments().computeIfAbsent("barcodes", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("barcodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("barcodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("barcodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("barcodes").add(beforeArg);
    return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ) {
     ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());
     getFields().put("contextualPricing", projection);
     return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ContextualPricingContext context) {
    ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context, false, null);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> contextualPricingWithVariableReferences(
      String contextReference) {
    ProductVariantContextualPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantContextualPricingProjection<>(this, getRoot());    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());              
    InputArgument contextArg = new InputArgument("context", contextReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ContextualPricingContext")));
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public DeliveryProfileProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> deliveryProfile() {
     DeliveryProfileProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());
     getFields().put("deliveryProfile", projection);
     return projection;
  }

  public EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> eventsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    EventConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("EventSortKeys"));
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ImageProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public InventoryItemProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> inventoryItem() {
     InventoryItemProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public ProductVariantInventoryPolicyProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> inventoryPolicy(
      ) {
     ProductVariantInventoryPolicyProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantInventoryPolicyProjection<>(this, getRoot());
     getFields().put("inventoryPolicy", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> media() {
     MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());
     getFields().put("media", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> media(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());    
    getFields().put("media", projection);
    getInputArguments().computeIfAbsent("media", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("media").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("media").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("media").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("media").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("media").add(reverseArg);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> mediaWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MediaConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());    
    getFields().put("media", projection);
    getInputArguments().computeIfAbsent("media", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("media").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("media").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("media").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("media").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("media").add(reverseArg);
    return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> presentmentPrices(
      ) {
     ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());
     getFields().put("presentmentPrices", projection);
     return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> presentmentPrices(
      List<CurrencyCode> presentmentCurrencies, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());    
    getFields().put("presentmentPrices", projection);
    getInputArguments().computeIfAbsent("presentmentPrices", k -> new ArrayList<>());                      
    InputArgument presentmentCurrenciesArg = new InputArgument("presentmentCurrencies", presentmentCurrencies, false, null);
    getInputArguments().get("presentmentPrices").add(presentmentCurrenciesArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("presentmentPrices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("presentmentPrices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("presentmentPrices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("presentmentPrices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("presentmentPrices").add(reverseArg);
    return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> presentmentPricesWithVariableReferences(
      String presentmentCurrenciesReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ProductVariantPricePairConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantPricePairConnectionProjection<>(this, getRoot());    
    getFields().put("presentmentPrices", projection);
    getInputArguments().computeIfAbsent("presentmentPrices", k -> new ArrayList<>());              
    InputArgument presentmentCurrenciesArg = new InputArgument("presentmentCurrencies", presentmentCurrenciesReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CurrencyCode"))));
    getInputArguments().get("presentmentPrices").add(presentmentCurrenciesArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("presentmentPrices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("presentmentPrices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("presentmentPrices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("presentmentPrices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("presentmentPrices").add(reverseArg);
    return projection;
  }

  public ProductProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productParents(
      ) {
     ProductConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("productParents", projection);
     return projection;
  }

  public ProductConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productParents(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ProductConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("productParents", projection);
    getInputArguments().computeIfAbsent("productParents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productParents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productParents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productParents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productParents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productParents").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("productParents").add(queryArg);
    return projection;
  }

  public ProductConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productParentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    ProductConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("productParents", projection);
    getInputArguments().computeIfAbsent("productParents", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productParents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productParents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productParents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productParents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productParents").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productParents").add(queryArg);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productVariantComponents(
      ) {
     ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());
     getFields().put("productVariantComponents", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productVariantComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());    
    getFields().put("productVariantComponents", projection);
    getInputArguments().computeIfAbsent("productVariantComponents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productVariantComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productVariantComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productVariantComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productVariantComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productVariantComponents").add(reverseArg);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> productVariantComponentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());    
    getFields().put("productVariantComponents", projection);
    getInputArguments().computeIfAbsent("productVariantComponents", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productVariantComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariantComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productVariantComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productVariantComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productVariantComponents").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublications(
      ) {
     ResourcePublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublications", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("resourcePublications", projection);
    getInputArguments().computeIfAbsent("resourcePublications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("resourcePublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("resourcePublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("resourcePublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("resourcePublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("resourcePublications").add(reverseArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsWithVariableReferences(
      String onlyPublishedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ResourcePublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
    getFields().put("resourcePublications", projection);
    getInputArguments().computeIfAbsent("resourcePublications", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublications").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount() {
     CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("resourcePublicationsCount", projection);
     return projection;
  }

  public CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsCountWithVariableReferences(
      String onlyPublishedReference) {
    CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      ) {
     ResourcePublicationV2ConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublicationsV2", projection);
     return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsV2", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsV2", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublicationsV2").add(onlyPublishedArg);
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType, false, null);
    getInputArguments().get("resourcePublicationsV2").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("resourcePublicationsV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("resourcePublicationsV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("resourcePublicationsV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("resourcePublicationsV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("resourcePublicationsV2").add(reverseArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2WithVariableReferences(
      String onlyPublishedReference, String catalogTypeReference, String firstReference,
      String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationV2ConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsV2", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsV2", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsV2").add(onlyPublishedArg);
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogTypeReference, true, new graphql.language.TypeName("CatalogType"));
    getInputArguments().get("resourcePublicationsV2").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublicationsV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublicationsV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("resourcePublicationsV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("resourcePublicationsV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsV2").add(reverseArg);
    return projection;
  }

  public SelectedOptionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> selectedOptions() {
     SelectedOptionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SelectedOptionProjection<>(this, getRoot());
     getFields().put("selectedOptions", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SellingPlanGroupConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanGroupsCount() {
     CountProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("sellingPlanGroupsCount", projection);
     return projection;
  }

  public TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> translations(
      String locale, String marketId) {
    TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> unitPrice() {
     MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitPrice", projection);
     return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unitPriceMeasurement(
      ) {
     UnitPriceMeasurementProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementProjection<>(this, getRoot());
     getFields().put("unitPriceMeasurement", projection);
     return projection;
  }

  public ChannelConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      ) {
     ChannelConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedChannels", projection);
     return projection;
  }

  public ChannelConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("unpublishedChannels", projection);
    getInputArguments().computeIfAbsent("unpublishedChannels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("unpublishedChannels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("unpublishedChannels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("unpublishedChannels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("unpublishedChannels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("unpublishedChannels").add(reverseArg);
    return projection;
  }

  public ChannelConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unpublishedChannelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("unpublishedChannels", projection);
    getInputArguments().computeIfAbsent("unpublishedChannels", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedChannels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedChannels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedChannels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedChannels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("unpublishedChannels").add(reverseArg);
    return projection;
  }

  public PublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      ) {
     PublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedPublications", projection);
     return projection;
  }

  public PublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
    getFields().put("unpublishedPublications", projection);
    getInputArguments().computeIfAbsent("unpublishedPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("unpublishedPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("unpublishedPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("unpublishedPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("unpublishedPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("unpublishedPublications").add(reverseArg);
    return projection;
  }

  public PublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unpublishedPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    PublicationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
    getFields().put("unpublishedPublications", projection);
    getInputArguments().computeIfAbsent("unpublishedPublications", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("unpublishedPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("unpublishedPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("unpublishedPublications").add(reverseArg);
    return projection;
  }

  public ProductVariantProjection<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> compareAtPrice() {
    getFields().put("compareAtPrice", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> inventoryQuantity() {
    getFields().put("inventoryQuantity", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ProductVariantProjection publicationCount(Boolean onlyPublished) {
    getFields().put("publicationCount", null);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public ProductVariantProjection publishedOnChannel(String channelId) {
    getFields().put("publishedOnChannel", null);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());
    InputArgument channelIdArg = new InputArgument("channelId", channelId, false, null);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public ProductVariantProjection publishedOnPublication(String publicationId) {
    getFields().put("publishedOnPublication", null);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId, false, null);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sellableOnlineQuantity() {
    getFields().put("sellableOnlineQuantity", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> showUnitPrice() {
    getFields().put("showUnitPrice", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> taxCode() {
    getFields().put("taxCode", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
