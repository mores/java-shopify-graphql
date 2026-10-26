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

public class ProductVariantByIdentifierProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantByIdentifierProjectionRoot() {
    super(null, null, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> availablePublicationsCount(
      ) {
    CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("availablePublicationsCount", projection);
    return projection;
  }

  public ProductVariantBarcodeConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> barcodes(
      ) {
    ProductVariantBarcodeConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantBarcodeConnectionProjection<>(this, this);    
    getFields().put("barcodes", projection);
    return projection;
  }

  public ProductVariantBarcodeConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> barcodes(
      Integer first, String after, Integer last, String before) {
    ProductVariantBarcodeConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantBarcodeConnectionProjection<>(this, this);    
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

  public ProductVariantBarcodeConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> barcodesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference) {
    ProductVariantBarcodeConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantBarcodeConnectionProjection<>(this, this);    
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

  public ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricing(
      ) {
    ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricing(
      ContextualPricingContext context) {
    ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context, false, null);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricingWithVariableReferences(
      String contextReference) {
    ProductVariantContextualPricingProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());              
    InputArgument contextArg = new InputArgument("context", contextReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ContextualPricingContext")));
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public DeliveryProfileProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> deliveryProfile(
      ) {
    DeliveryProfileProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileProjection<>(this, this);    
    getFields().put("deliveryProfile", projection);
    return projection;
  }

  public EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> eventsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    EventConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ImageProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public InventoryItemProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> inventoryItem(
      ) {
    InventoryItemProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("inventoryItem", projection);
    return projection;
  }

  public ProductVariantInventoryPolicyProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> inventoryPolicy(
      ) {
    ProductVariantInventoryPolicyProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantInventoryPolicyProjection<>(this, this);    
    getFields().put("inventoryPolicy", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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

  public MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> mediaWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MediaConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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

  public MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> presentmentPrices(
      ) {
    ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
    getFields().put("presentmentPrices", projection);
    return projection;
  }

  public ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> presentmentPrices(
      List<CurrencyCode> presentmentCurrencies, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
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

  public ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> presentmentPricesWithVariableReferences(
      String presentmentCurrenciesReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ProductVariantPricePairConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantPricePairConnectionProjection<>(this, this);    
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

  public ProductProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> product(
      ) {
    ProductProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductProjection<>(this, this);    
    getFields().put("product", projection);
    return projection;
  }

  public ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productParents(
      ) {
    ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("productParents", projection);
    return projection;
  }

  public ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productParents(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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

  public ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productParentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    ProductConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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

  public ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productVariantComponents(
      ) {
    ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
    getFields().put("productVariantComponents", projection);
    return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productVariantComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
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

  public ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> productVariantComponentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductVariantComponentConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantComponentConnectionProjection<>(this, this);    
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

  public IntProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> publicationCount(
      Boolean onlyPublished) {
    IntProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public IntProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> publicationCountWithVariableReferences(
      String onlyPublishedReference) {
    IntProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> publishedOnChannel(
      String channelId) {
    BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());                      
    InputArgument channelIdArg = new InputArgument("channelId", channelId, false, null);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> publishedOnChannelWithVariableReferences(
      String channelIdReference) {
    BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());              
    InputArgument channelIdArg = new InputArgument("channelId", channelIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> publishedOnPublication(
      String publicationId) {
    BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());                      
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId, false, null);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> publishedOnPublicationWithVariableReferences(
      String publicationIdReference) {
    BooleanProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());              
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublications(
      ) {
    ResourcePublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public ResourcePublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsWithVariableReferences(
      String onlyPublishedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ResourcePublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      ) {
    CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    return projection;
  }

  public CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsCountWithVariableReferences(
      String onlyPublishedReference) {
    CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      ) {
    ResourcePublicationV2ConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
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

  public ResourcePublicationV2ConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsV2WithVariableReferences(
      String onlyPublishedReference, String catalogTypeReference, String firstReference,
      String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationV2ConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
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

  public SelectedOptionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> selectedOptions(
      ) {
    SelectedOptionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SelectedOptionProjection<>(this, this);    
    getFields().put("selectedOptions", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SellingPlanGroupConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroupsCount(
      ) {
    CountProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("sellingPlanGroupsCount", projection);
    return projection;
  }

  public TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unitPrice(
      ) {
    MoneyV2Projection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("unitPrice", projection);
    return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unitPriceMeasurement(
      ) {
    UnitPriceMeasurementProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new UnitPriceMeasurementProjection<>(this, this);    
    getFields().put("unitPriceMeasurement", projection);
    return projection;
  }

  public ChannelConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      ) {
    ChannelConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    return projection;
  }

  public ChannelConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
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

  public ChannelConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedChannelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
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

  public PublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      ) {
    PublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    return projection;
  }

  public PublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
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

  public PublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    PublicationConnectionProjection<ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>, ProductVariantByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
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

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> compareAtPrice() {
    getFields().put("compareAtPrice", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> inventoryQuantity() {
    getFields().put("inventoryQuantity", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> position() {
    getFields().put("position", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> sellableOnlineQuantity() {
    getFields().put("sellableOnlineQuantity", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> showUnitPrice() {
    getFields().put("showUnitPrice", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> taxCode() {
    getFields().put("taxCode", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantByIdentifierProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
