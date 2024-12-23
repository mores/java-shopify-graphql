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

public class ProductProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Product"));
  }

  public ProductProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<ProductProjection<PARENT, ROOT>, ROOT> availablePublicationsCount() {
     CountProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("availablePublicationsCount", projection);
     return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> bundleComponents(
      ) {
     ProductBundleComponentConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentConnectionProjection<>(this, getRoot());
     getFields().put("bundleComponents", projection);
     return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> bundleComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductBundleComponentConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductBundleComponentConnectionProjection<>(this, getRoot());    
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

  public TaxonomyCategoryProjection<ProductProjection<PARENT, ROOT>, ROOT> category() {
     TaxonomyCategoryProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public CollectionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> collections() {
     CollectionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query) {
    CollectionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public CombinedListingProjection<ProductProjection<PARENT, ROOT>, ROOT> combinedListing() {
     CombinedListingProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingProjection<>(this, getRoot());
     getFields().put("combinedListing", projection);
     return projection;
  }

  public CombinedListingsRoleProjection<ProductProjection<PARENT, ROOT>, ROOT> combinedListingRole(
      ) {
     CombinedListingsRoleProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CombinedListingsRoleProjection<>(this, getRoot());
     getFields().put("combinedListingRole", projection);
     return projection;
  }

  public ProductCompareAtPriceRangeProjection<ProductProjection<PARENT, ROOT>, ROOT> compareAtPriceRange(
      ) {
     ProductCompareAtPriceRangeProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductCompareAtPriceRangeProjection<>(this, getRoot());
     getFields().put("compareAtPriceRange", projection);
     return projection;
  }

  public ProductContextualPricingProjection<ProductProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ) {
     ProductContextualPricingProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductContextualPricingProjection<>(this, getRoot());
     getFields().put("contextualPricing", projection);
     return projection;
  }

  public ProductContextualPricingProjection<ProductProjection<PARENT, ROOT>, ROOT> contextualPricing(
      ContextualPricingContext context) {
    ProductContextualPricingProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductContextualPricingProjection<>(this, getRoot());    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public EventConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public ImageProjection<ProductProjection<PARENT, ROOT>, ROOT> featuredImage() {
     ImageProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("featuredImage", projection);
     return projection;
  }

  public MediaProjection<ProductProjection<PARENT, ROOT>, ROOT> featuredMedia() {
     MediaProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MediaProjection<>(this, getRoot());
     getFields().put("featuredMedia", projection);
     return projection;
  }

  public ResourceFeedbackProjection<ProductProjection<PARENT, ROOT>, ROOT> feedback() {
     ResourceFeedbackProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ResourceFeedbackProjection<>(this, getRoot());
     getFields().put("feedback", projection);
     return projection;
  }

  public ImageConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> images() {
     ImageConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ImageConnectionProjection<>(this, getRoot());
     getFields().put("images", projection);
     return projection;
  }

  public ImageConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> images(Integer first,
      String after, Integer last, String before, Boolean reverse, ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ImageConnectionProjection<>(this, getRoot());    
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

  public MediaConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> media() {
     MediaConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());
     getFields().put("media", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> media(Integer first,
      String after, Integer last, String before, Boolean reverse, ProductMediaSortKeys sortKey,
      String query) {
    MediaConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductProjection<PARENT, ROOT>, ROOT> mediaCount() {
     CountProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("mediaCount", projection);
     return projection;
  }

  public MetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public ProductOptionProjection<ProductProjection<PARENT, ROOT>, ROOT> options() {
     ProductOptionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());
     getFields().put("options", projection);
     return projection;
  }

  public ProductOptionProjection<ProductProjection<PARENT, ROOT>, ROOT> options(Integer first) {
    ProductOptionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductProjection<PARENT, ROOT>, ROOT> priceRange() {
     ProductPriceRangeProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductPriceRangeProjection<>(this, getRoot());
     getFields().put("priceRange", projection);
     return projection;
  }

  public ProductPriceRangeV2Projection<ProductProjection<PARENT, ROOT>, ROOT> priceRangeV2() {
     ProductPriceRangeV2Projection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductPriceRangeV2Projection<>(this, getRoot());
     getFields().put("priceRangeV2", projection);
     return projection;
  }

  public PrivateMetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> privateMetafield() {
     PrivateMetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public ProductCategoryProjection<ProductProjection<PARENT, ROOT>, ROOT> productCategory() {
     ProductCategoryProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductCategoryProjection<>(this, getRoot());
     getFields().put("productCategory", projection);
     return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> productPublications(
      ) {
     ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());
     getFields().put("productPublications", projection);
     return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());    
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

  public ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> publications(
      ) {
     ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());
     getFields().put("publications", projection);
     return projection;
  }

  public ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> publications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ProductPublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductPublicationConnectionProjection<>(this, getRoot());    
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

  public ResourcePublicationV2Projection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublicationOnCurrentPublication(
      ) {
     ResourcePublicationV2Projection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2Projection<>(this, getRoot());
     getFields().put("resourcePublicationOnCurrentPublication", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublications(
      ) {
     ResourcePublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublications", projection);
     return projection;
  }

  public ResourcePublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount() {
     CountProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("resourcePublicationsCount", projection);
     return projection;
  }

  public CountProjection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      ) {
     ResourcePublicationV2ConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());
     getFields().put("resourcePublicationsV2", projection);
     return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2ConnectionProjection<>(this, getRoot());    
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

  public RestrictedForResourceProjection<ProductProjection<PARENT, ROOT>, ROOT> restrictedForResource(
      ) {
     RestrictedForResourceProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new RestrictedForResourceProjection<>(this, getRoot());
     getFields().put("restrictedForResource", projection);
     return projection;
  }

  public RestrictedForResourceProjection<ProductProjection<PARENT, ROOT>, ROOT> restrictedForResource(
      String calculatedOrderId) {
    RestrictedForResourceProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new RestrictedForResourceProjection<>(this, getRoot());    
    getFields().put("restrictedForResource", projection);
    getInputArguments().computeIfAbsent("restrictedForResource", k -> new ArrayList<>());                      
    InputArgument calculatedOrderIdArg = new InputArgument("calculatedOrderId", calculatedOrderId);
    getInputArguments().get("restrictedForResource").add(calculatedOrderIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductProjection<PARENT, ROOT>, ROOT> sellingPlanGroupsCount() {
     CountProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("sellingPlanGroupsCount", projection);
     return projection;
  }

  public SEOProjection<ProductProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public StandardizedProductTypeProjection<ProductProjection<PARENT, ROOT>, ROOT> standardizedProductType(
      ) {
     StandardizedProductTypeProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new StandardizedProductTypeProjection<>(this, getRoot());
     getFields().put("standardizedProductType", projection);
     return projection;
  }

  public ProductStatusProjection<ProductProjection<PARENT, ROOT>, ROOT> status() {
     ProductStatusProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public TranslationProjection<ProductProjection<PARENT, ROOT>, ROOT> translations() {
     TranslationProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());
     getFields().put("translations", projection);
     return projection;
  }

  public TranslationProjection<ProductProjection<PARENT, ROOT>, ROOT> translations(String locale,
      String marketId) {
    TranslationProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new TranslationProjection<>(this, getRoot());    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ChannelConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> unpublishedChannels() {
     ChannelConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedChannels", projection);
     return projection;
  }

  public ChannelConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
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

  public PublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      ) {
     PublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());
     getFields().put("unpublishedPublications", projection);
     return projection;
  }

  public PublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
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

  public ProductVariantConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> variants() {
     ProductVariantConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("variants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> variants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey) {
    ProductVariantConnectionProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductProjection<PARENT, ROOT>, ROOT> variantsCount() {
     CountProjection<ProductProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("variantsCount", projection);
     return projection;
  }

  public ProductProjection<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> customProductType() {
    getFields().put("customProductType", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ProductProjection description(Integer truncateAt) {
    getFields().put("description", null);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return this;
  }

  public ProductProjection<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> descriptionPlainSummary() {
    getFields().put("descriptionPlainSummary", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> giftCardTemplateSuffix() {
    getFields().put("giftCardTemplateSuffix", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> hasOnlyDefaultVariant() {
    getFields().put("hasOnlyDefaultVariant", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> hasOutOfStockVariants() {
    getFields().put("hasOutOfStockVariants", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> hasVariantsThatRequiresComponents() {
    getFields().put("hasVariantsThatRequiresComponents", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> inCollection() {
    getFields().put("inCollection", null);
    return this;
  }

  public ProductProjection inCollection(String id) {
    getFields().put("inCollection", null);
    getInputArguments().computeIfAbsent("inCollection", k -> new ArrayList<>());
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inCollection").add(idArg);
    return this;
  }

  public ProductProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> onlineStorePreviewUrl() {
    getFields().put("onlineStorePreviewUrl", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> productType() {
    getFields().put("productType", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ProductProjection publicationCount(Boolean onlyPublished) {
    getFields().put("publicationCount", null);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publishedInContext() {
    getFields().put("publishedInContext", null);
    return this;
  }

  public ProductProjection publishedInContext(ContextualPublicationContext context) {
    getFields().put("publishedInContext", null);
    getInputArguments().computeIfAbsent("publishedInContext", k -> new ArrayList<>());
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("publishedInContext").add(contextArg);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public ProductProjection publishedOnChannel(String channelId) {
    getFields().put("publishedOnChannel", null);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());
    InputArgument channelIdArg = new InputArgument("channelId", channelId);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public ProductProjection publishedOnPublication(String publicationId) {
    getFields().put("publishedOnPublication", null);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return this;
  }

  public ProductProjection<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> totalInventory() {
    getFields().put("totalInventory", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> totalVariants() {
    getFields().put("totalVariants", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> tracksInventory() {
    getFields().put("tracksInventory", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ProductProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
