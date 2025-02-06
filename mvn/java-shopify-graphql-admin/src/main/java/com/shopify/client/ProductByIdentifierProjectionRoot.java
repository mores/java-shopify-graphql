package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CatalogType;
import com.shopify.types.CollectionSortKeys;
import com.shopify.types.ContextualPricingContext;
import com.shopify.types.ContextualPublicationContext;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.ProductImageSortKeys;
import com.shopify.types.ProductMediaSortKeys;
import com.shopify.types.ProductVariantSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductByIdentifierProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductByIdentifierProjectionRoot() {
    super(null, null, java.util.Optional.of("Product"));
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> availablePublicationsCount(
      ) {
    CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("availablePublicationsCount", projection);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> bundleComponents(
      ) {
    ProductBundleComponentConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
    getFields().put("bundleComponents", projection);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> bundleComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductBundleComponentConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
    getFields().put("bundleComponents", projection);
    getInputArguments().computeIfAbsent("bundleComponents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("bundleComponents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("bundleComponents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("bundleComponents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("bundleComponents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("bundleComponents").add(reverseArg);
    return projection;
  }

  public TaxonomyCategoryProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> category(
      ) {
    TaxonomyCategoryProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TaxonomyCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query) {
    CollectionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CombinedListingProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> combinedListing(
      ) {
    CombinedListingProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CombinedListingProjection<>(this, this);    
    getFields().put("combinedListing", projection);
    return projection;
  }

  public CombinedListingsRoleProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> combinedListingRole(
      ) {
    CombinedListingsRoleProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CombinedListingsRoleProjection<>(this, this);    
    getFields().put("combinedListingRole", projection);
    return projection;
  }

  public ProductCompareAtPriceRangeProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> compareAtPriceRange(
      ) {
    ProductCompareAtPriceRangeProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductCompareAtPriceRangeProjection<>(this, this);    
    getFields().put("compareAtPriceRange", projection);
    return projection;
  }

  public ProductContextualPricingProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricing(
      ) {
    ProductContextualPricingProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    return projection;
  }

  public ProductContextualPricingProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> contextualPricing(
      ContextualPricingContext context) {
    ProductContextualPricingProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public StringProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public EventConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ImageProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> featuredImage(
      ) {
    ImageProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("featuredImage", projection);
    return projection;
  }

  public MediaProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> featuredMedia(
      ) {
    MediaProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaProjection<>(this, this);    
    getFields().put("featuredMedia", projection);
    return projection;
  }

  public ResourceFeedbackProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    ResourceFeedbackProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourceFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> images(
      ) {
    ImageConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> images(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    getInputArguments().computeIfAbsent("images", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("images").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("images").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("images").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("images").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("images").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("images").add(sortKeyArg);
    return projection;
  }

  public BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> inCollection(
      String id) {
    BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("inCollection", projection);
    getInputArguments().computeIfAbsent("inCollection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inCollection").add(idArg);
    return projection;
  }

  public MediaConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductMediaSortKeys sortKey, String query) {
    MediaConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    getInputArguments().computeIfAbsent("media", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("media").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("media").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("media").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("media").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("media").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("media").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("media").add(queryArg);
    return projection;
  }

  public CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> mediaCount(
      ) {
    CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("mediaCount", projection);
    return projection;
  }

  public MetafieldProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ProductOptionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> options(
      ) {
    ProductOptionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    return projection;
  }

  public ProductOptionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> options(
      Integer first) {
    ProductOptionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> priceRange(
      ) {
    ProductPriceRangeProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("priceRange", projection);
    return projection;
  }

  public ProductPriceRangeV2Projection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> priceRangeV2(
      ) {
    ProductPriceRangeV2Projection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeV2Projection<>(this, this);    
    getFields().put("priceRangeV2", projection);
    return projection;
  }

  public ProductCategoryProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> productCategory(
      ) {
    ProductCategoryProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductCategoryProjection<>(this, this);    
    getFields().put("productCategory", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> productPublications(
      ) {
    ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    getInputArguments().computeIfAbsent("productPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productPublications").add(reverseArg);
    return projection;
  }

  public IntProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> publicationCount(
      Boolean onlyPublished) {
    IntProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> publications(
      ) {
    ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> publications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ProductPublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> publishedInContext(
      ContextualPublicationContext context) {
    BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedInContext", projection);
    getInputArguments().computeIfAbsent("publishedInContext", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("publishedInContext").add(contextArg);
    return projection;
  }

  public BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> publishedOnChannel(
      String channelId) {
    BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());                      
    InputArgument channelIdArg = new InputArgument("channelId", channelId);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> publishedOnPublication(
      String publicationId) {
    BooleanProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());                      
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public ResourcePublicationV2Projection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationOnCurrentPublication(
      ) {
    ResourcePublicationV2Projection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2Projection<>(this, this);    
    getFields().put("resourcePublicationOnCurrentPublication", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublications(
      ) {
    ResourcePublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    getInputArguments().computeIfAbsent("resourcePublications", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublications").add(onlyPublishedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("resourcePublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("resourcePublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("resourcePublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("resourcePublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("resourcePublications").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      ) {
    CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    return projection;
  }

  public CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      ) {
    ResourcePublicationV2ConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsV2", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsV2").add(onlyPublishedArg);
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType);
    getInputArguments().get("resourcePublicationsV2").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("resourcePublicationsV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("resourcePublicationsV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("resourcePublicationsV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("resourcePublicationsV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("resourcePublicationsV2").add(reverseArg);
    return projection;
  }

  public RestrictedForResourceProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> restrictedForResource(
      ) {
    RestrictedForResourceProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    return projection;
  }

  public RestrictedForResourceProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> restrictedForResource(
      String calculatedOrderId) {
    RestrictedForResourceProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    getInputArguments().computeIfAbsent("restrictedForResource", k -> new ArrayList<>());                      
    InputArgument calculatedOrderIdArg = new InputArgument("calculatedOrderId", calculatedOrderId);
    getInputArguments().get("restrictedForResource").add(calculatedOrderIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    return projection;
  }

  public CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> sellingPlanGroupsCount(
      ) {
    CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("sellingPlanGroupsCount", projection);
    return projection;
  }

  public SEOProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public StandardizedProductTypeProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> standardizedProductType(
      ) {
    StandardizedProductTypeProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new StandardizedProductTypeProjection<>(this, this);    
    getFields().put("standardizedProductType", projection);
    return projection;
  }

  public ProductStatusProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> status(
      ) {
    ProductStatusProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public TranslationProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ChannelConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      ) {
    ChannelConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    return projection;
  }

  public ChannelConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    getInputArguments().computeIfAbsent("unpublishedChannels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("unpublishedChannels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("unpublishedChannels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("unpublishedChannels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("unpublishedChannels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("unpublishedChannels").add(reverseArg);
    return projection;
  }

  public PublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      ) {
    PublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    return projection;
  }

  public PublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    getInputArguments().computeIfAbsent("unpublishedPublications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("unpublishedPublications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("unpublishedPublications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("unpublishedPublications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("unpublishedPublications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("unpublishedPublications").add(reverseArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> variants(
      ) {
    ProductVariantConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> variants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey) {
    ProductVariantConnectionProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    getInputArguments().computeIfAbsent("variants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("variants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("variants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("variants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("variants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("variants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("variants").add(sortKeyArg);
    return projection;
  }

  public CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> variantsCount(
      ) {
    CountProjection<ProductByIdentifierProjectionRoot<PARENT, ROOT>, ProductByIdentifierProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsCount", projection);
    return projection;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> customProductType() {
    getFields().put("customProductType", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> descriptionPlainSummary() {
    getFields().put("descriptionPlainSummary", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> giftCardTemplateSuffix() {
    getFields().put("giftCardTemplateSuffix", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> hasOnlyDefaultVariant() {
    getFields().put("hasOnlyDefaultVariant", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> hasOutOfStockVariants() {
    getFields().put("hasOutOfStockVariants", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> hasVariantsThatRequiresComponents() {
    getFields().put("hasVariantsThatRequiresComponents", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> inCollection() {
    getFields().put("inCollection", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> onlineStorePreviewUrl() {
    getFields().put("onlineStorePreviewUrl", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> productType() {
    getFields().put("productType", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publishedInContext() {
    getFields().put("publishedInContext", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> totalInventory() {
    getFields().put("totalInventory", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> totalVariants() {
    getFields().put("totalVariants", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> tracksInventory() {
    getFields().put("tracksInventory", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ProductByIdentifierProjectionRoot<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
