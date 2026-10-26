package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CatalogType;
import com.shopify.admin.types.CollectionSortKeys;
import com.shopify.admin.types.ContextualPricingContext;
import com.shopify.admin.types.ContextualPublicationContext;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.ProductImageSortKeys;
import com.shopify.admin.types.ProductMediaSortKeys;
import com.shopify.admin.types.ProductVariantSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductProjectionRoot() {
    super(null, null, java.util.Optional.of("Product"));
  }

  public ProductProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> availablePublicationsCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("availablePublicationsCount", projection);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> bundleComponents(
      ) {
    ProductBundleComponentConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
    getFields().put("bundleComponents", projection);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> bundleComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductBundleComponentConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
    getFields().put("bundleComponents", projection);
    getInputArguments().computeIfAbsent("bundleComponents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("bundleComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("bundleComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("bundleComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("bundleComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("bundleComponents").add(reverseArg);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> bundleComponentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductBundleComponentConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
    getFields().put("bundleComponents", projection);
    getInputArguments().computeIfAbsent("bundleComponents", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("bundleComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("bundleComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("bundleComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("bundleComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("bundleComponents").add(reverseArg);
    return projection;
  }

  public ComponentizedProductsBundleConsolidatedOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> bundleConsolidatedOptions(
      ) {
    ComponentizedProductsBundleConsolidatedOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ComponentizedProductsBundleConsolidatedOptionProjection<>(this, this);    
    getFields().put("bundleConsolidatedOptions", projection);
    return projection;
  }

  public TaxonomyCategoryProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> category(
      ) {
    TaxonomyCategoryProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new TaxonomyCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query) {
    CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> collectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CombinedListingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> combinedListing(
      ) {
    CombinedListingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CombinedListingProjection<>(this, this);    
    getFields().put("combinedListing", projection);
    return projection;
  }

  public CombinedListingsRoleProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> combinedListingRole(
      ) {
    CombinedListingsRoleProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CombinedListingsRoleProjection<>(this, this);    
    getFields().put("combinedListingRole", projection);
    return projection;
  }

  public ProductCompareAtPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> compareAtPriceRange(
      ) {
    ProductCompareAtPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductCompareAtPriceRangeProjection<>(this, this);    
    getFields().put("compareAtPriceRange", projection);
    return projection;
  }

  public ProductContextualPricingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> contextualPricing(
      ) {
    ProductContextualPricingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    return projection;
  }

  public ProductContextualPricingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> contextualPricing(
      ContextualPricingContext context) {
    ProductContextualPricingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context, false, null);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public ProductContextualPricingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> contextualPricingWithVariableReferences(
      String contextReference) {
    ProductContextualPricingProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());              
    InputArgument contextArg = new InputArgument("context", contextReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ContextualPricingContext")));
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public StringProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public StringProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> descriptionWithVariableReferences(
      String truncateAtReference) {
    StringProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());              
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAtReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public EventConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public EventConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> eventsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    EventConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ImageProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> featuredImage(
      ) {
    ImageProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("featuredImage", projection);
    return projection;
  }

  public MediaProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> featuredMedia(
      ) {
    MediaProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MediaProjection<>(this, this);    
    getFields().put("featuredMedia", projection);
    return projection;
  }

  public ResourceFeedbackProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    ResourceFeedbackProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourceFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public GiftCardProductSettingsProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> giftCardSettings(
      ) {
    GiftCardProductSettingsProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new GiftCardProductSettingsProjection<>(this, this);    
    getFields().put("giftCardSettings", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> images(
      ) {
    ImageConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> images(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    getInputArguments().computeIfAbsent("images", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("images").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("images").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("images").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("images").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("images").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("images").add(sortKeyArg);
    return projection;
  }

  public ImageConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> imagesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    ImageConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    getInputArguments().computeIfAbsent("images", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("images").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("images").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("images").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("images").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("images").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductImageSortKeys"));
    getInputArguments().get("images").add(sortKeyArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> inCollection(
      String id) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("inCollection", projection);
    getInputArguments().computeIfAbsent("inCollection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id, false, null);
    getInputArguments().get("inCollection").add(idArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> inCollectionWithVariableReferences(
      String idReference) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("inCollection", projection);
    getInputArguments().computeIfAbsent("inCollection", k -> new ArrayList<>());              
    InputArgument idArg = new InputArgument("id", idReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("inCollection").add(idArg);
    return projection;
  }

  public MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductMediaSortKeys sortKey, String query) {
    MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("media").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("media").add(queryArg);
    return projection;
  }

  public MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> mediaWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductMediaSortKeys"));
    getInputArguments().get("media").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("media").add(queryArg);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> mediaCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("mediaCount", projection);
    return projection;
  }

  public MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldDefinitionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ProductOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> options(
      ) {
    ProductOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    return projection;
  }

  public ProductOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> options(
      Integer first) {
    ProductOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> optionsWithVariableReferences(
      String firstReference) {
    ProductOptionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> priceRange(
      ) {
    ProductPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("priceRange", projection);
    return projection;
  }

  public ProductPriceRangeV2Projection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> priceRangeV2(
      ) {
    ProductPriceRangeV2Projection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeV2Projection<>(this, this);    
    getFields().put("priceRangeV2", projection);
    return projection;
  }

  public ProductCategoryProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productCategory(
      ) {
    ProductCategoryProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductCategoryProjection<>(this, this);    
    getFields().put("productCategory", projection);
    return projection;
  }

  public ProductComponentTypeConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productComponents(
      ) {
    ProductComponentTypeConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductComponentTypeConnectionProjection<>(this, this);    
    getFields().put("productComponents", projection);
    return projection;
  }

  public ProductComponentTypeConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductComponentTypeConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductComponentTypeConnectionProjection<>(this, this);    
    getFields().put("productComponents", projection);
    getInputArguments().computeIfAbsent("productComponents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productComponents").add(reverseArg);
    return projection;
  }

  public ProductComponentTypeConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productComponentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductComponentTypeConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductComponentTypeConnectionProjection<>(this, this);    
    getFields().put("productComponents", projection);
    getInputArguments().computeIfAbsent("productComponents", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productComponents").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productComponentsCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productComponentsCount", projection);
    return projection;
  }

  public ProductConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productParents(
      ) {
    ProductConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
    getFields().put("productParents", projection);
    return projection;
  }

  public ProductConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productParents(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ProductConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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

  public ProductConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productParentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    ProductConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductConnectionProjection<>(this, this);    
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

  public ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productPublications(
      ) {
    ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    getInputArguments().computeIfAbsent("productPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("productPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("productPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("productPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("productPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("productPublications").add(reverseArg);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> productPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    getInputArguments().computeIfAbsent("productPublications", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("productPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("productPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("productPublications").add(reverseArg);
    return projection;
  }

  public IntProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publicationCount(
      Boolean onlyPublished) {
    IntProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public IntProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publicationCountWithVariableReferences(
      String onlyPublishedReference) {
    IntProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publications(
      ) {
    ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("publications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publicationsWithVariableReferences(
      String onlyPublishedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ProductPublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publishedInContext(
      ContextualPublicationContext context) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedInContext", projection);
    getInputArguments().computeIfAbsent("publishedInContext", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context, false, null);
    getInputArguments().get("publishedInContext").add(contextArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publishedInContextWithVariableReferences(
      String contextReference) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedInContext", projection);
    getInputArguments().computeIfAbsent("publishedInContext", k -> new ArrayList<>());              
    InputArgument contextArg = new InputArgument("context", contextReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ContextualPublicationContext")));
    getInputArguments().get("publishedInContext").add(contextArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publishedOnChannel(
      String channelId) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());                      
    InputArgument channelIdArg = new InputArgument("channelId", channelId, false, null);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publishedOnChannelWithVariableReferences(
      String channelIdReference) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());              
    InputArgument channelIdArg = new InputArgument("channelId", channelIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publishedOnPublication(
      String publicationId) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());                      
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId, false, null);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> publishedOnPublicationWithVariableReferences(
      String publicationIdReference) {
    BooleanProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());              
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public ResourcePublicationV2Projection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationOnCurrentPublication(
      ) {
    ResourcePublicationV2Projection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2Projection<>(this, this);    
    getFields().put("resourcePublicationOnCurrentPublication", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublications(
      ) {
    ResourcePublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public ResourcePublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsWithVariableReferences(
      String onlyPublishedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ResourcePublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished, false, null);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsCountWithVariableReferences(
      String onlyPublishedReference) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());              
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublishedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      ) {
    ResourcePublicationV2ConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
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

  public ResourcePublicationV2ConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> resourcePublicationsV2WithVariableReferences(
      String onlyPublishedReference, String catalogTypeReference, String firstReference,
      String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ResourcePublicationV2ConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
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

  public RestrictedForResourceProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> restrictedForResource(
      ) {
    RestrictedForResourceProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    return projection;
  }

  public RestrictedForResourceProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> restrictedForResource(
      String calculatedOrderId) {
    RestrictedForResourceProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    getInputArguments().computeIfAbsent("restrictedForResource", k -> new ArrayList<>());                      
    InputArgument calculatedOrderIdArg = new InputArgument("calculatedOrderId", calculatedOrderId, false, null);
    getInputArguments().get("restrictedForResource").add(calculatedOrderIdArg);
    return projection;
  }

  public RestrictedForResourceProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> restrictedForResourceWithVariableReferences(
      String calculatedOrderIdReference) {
    RestrictedForResourceProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    getInputArguments().computeIfAbsent("restrictedForResource", k -> new ArrayList<>());              
    InputArgument calculatedOrderIdArg = new InputArgument("calculatedOrderId", calculatedOrderIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("restrictedForResource").add(calculatedOrderIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public SellingPlanGroupConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> sellingPlanGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SellingPlanGroupConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> sellingPlanGroupsCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("sellingPlanGroupsCount", projection);
    return projection;
  }

  public SEOProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public StandardizedProductTypeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> standardizedProductType(
      ) {
    StandardizedProductTypeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new StandardizedProductTypeProjection<>(this, this);    
    getFields().put("standardizedProductType", projection);
    return projection;
  }

  public ProductStatusProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> status(
      ) {
    ProductStatusProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public TranslationProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale, false, null);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId, false, null);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public TranslationProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> translationsWithVariableReferences(
      String localeReference, String marketIdReference) {
    TranslationProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());              
    InputArgument localeArg = new InputArgument("locale", localeReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ChannelConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      ) {
    ChannelConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    return projection;
  }

  public ChannelConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
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

  public ChannelConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> unpublishedChannelsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ChannelConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
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

  public PublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      ) {
    PublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    return projection;
  }

  public PublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
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

  public PublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> unpublishedPublicationsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    PublicationConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
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

  public ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variants(
      ) {
    ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey) {
    ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    getInputArguments().computeIfAbsent("variants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("variants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("variants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("variants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("variants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("variants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("variants").add(sortKeyArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    getInputArguments().computeIfAbsent("variants", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("variants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("variants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("variants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("variants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("variants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ProductVariantSortKeys"));
    getInputArguments().get("variants").add(sortKeyArg);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsCount", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsInCollection(
      ) {
    ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variantsInCollection", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsInCollection(
      String collectionId, Integer first, String after, Integer last, String before) {
    ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variantsInCollection", projection);
    getInputArguments().computeIfAbsent("variantsInCollection", k -> new ArrayList<>());                      
    InputArgument collectionIdArg = new InputArgument("collectionId", collectionId, false, null);
    getInputArguments().get("variantsInCollection").add(collectionIdArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("variantsInCollection").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("variantsInCollection").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("variantsInCollection").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("variantsInCollection").add(beforeArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsInCollectionWithVariableReferences(
      String collectionIdReference, String firstReference, String afterReference,
      String lastReference, String beforeReference) {
    ProductVariantConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variantsInCollection", projection);
    getInputArguments().computeIfAbsent("variantsInCollection", k -> new ArrayList<>());              
    InputArgument collectionIdArg = new InputArgument("collectionId", collectionIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("variantsInCollection").add(collectionIdArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("variantsInCollection").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("variantsInCollection").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("variantsInCollection").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("variantsInCollection").add(beforeArg);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsInCollectionCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsInCollectionCount", projection);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsInCollectionCount(
      String collectionId) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsInCollectionCount", projection);
    getInputArguments().computeIfAbsent("variantsInCollectionCount", k -> new ArrayList<>());                      
    InputArgument collectionIdArg = new InputArgument("collectionId", collectionId, false, null);
    getInputArguments().get("variantsInCollectionCount").add(collectionIdArg);
    return projection;
  }

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsInCollectionCountWithVariableReferences(
      String collectionIdReference) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsInCollectionCount", projection);
    getInputArguments().computeIfAbsent("variantsInCollectionCount", k -> new ArrayList<>());              
    InputArgument collectionIdArg = new InputArgument("collectionId", collectionIdReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("ID")));
    getInputArguments().get("variantsInCollectionCount").add(collectionIdArg);
    return projection;
  }

  public ProductProjectionRoot<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> customProductType() {
    getFields().put("customProductType", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> descriptionPlainSummary() {
    getFields().put("descriptionPlainSummary", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> giftCardTemplateSuffix() {
    getFields().put("giftCardTemplateSuffix", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> hasOnlyDefaultVariant() {
    getFields().put("hasOnlyDefaultVariant", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> hasOutOfStockVariants() {
    getFields().put("hasOutOfStockVariants", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> hasVariantsThatRequiresComponents() {
    getFields().put("hasVariantsThatRequiresComponents", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> inCollection() {
    getFields().put("inCollection", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> onlineStorePreviewUrl() {
    getFields().put("onlineStorePreviewUrl", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> productType() {
    getFields().put("productType", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publishedInContext() {
    getFields().put("publishedInContext", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> totalInventory() {
    getFields().put("totalInventory", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> totalVariants() {
    getFields().put("totalVariants", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> tracksInventory() {
    getFields().put("tracksInventory", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
