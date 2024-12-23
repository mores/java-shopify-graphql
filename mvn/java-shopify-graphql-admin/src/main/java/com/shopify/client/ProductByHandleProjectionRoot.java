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

public class ProductByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Product"));
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> availablePublicationsCount(
      ) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("availablePublicationsCount", projection);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> bundleComponents(
      ) {
    ProductBundleComponentConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
    getFields().put("bundleComponents", projection);
    return projection;
  }

  public ProductBundleComponentConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> bundleComponents(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductBundleComponentConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductBundleComponentConnectionProjection<>(this, this);    
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

  public TaxonomyCategoryProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> category(
      ) {
    TaxonomyCategoryProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new TaxonomyCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query) {
    CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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

  public CombinedListingProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> combinedListing(
      ) {
    CombinedListingProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CombinedListingProjection<>(this, this);    
    getFields().put("combinedListing", projection);
    return projection;
  }

  public CombinedListingsRoleProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> combinedListingRole(
      ) {
    CombinedListingsRoleProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CombinedListingsRoleProjection<>(this, this);    
    getFields().put("combinedListingRole", projection);
    return projection;
  }

  public ProductCompareAtPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> compareAtPriceRange(
      ) {
    ProductCompareAtPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductCompareAtPriceRangeProjection<>(this, this);    
    getFields().put("compareAtPriceRange", projection);
    return projection;
  }

  public ProductContextualPricingProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> contextualPricing(
      ) {
    ProductContextualPricingProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    return projection;
  }

  public ProductContextualPricingProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> contextualPricing(
      ContextualPricingContext context) {
    ProductContextualPricingProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductContextualPricingProjection<>(this, this);    
    getFields().put("contextualPricing", projection);
    getInputArguments().computeIfAbsent("contextualPricing", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("contextualPricing").add(contextArg);
    return projection;
  }

  public StringProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public EventConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public ImageProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> featuredImage(
      ) {
    ImageProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("featuredImage", projection);
    return projection;
  }

  public MediaProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> featuredMedia(
      ) {
    MediaProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MediaProjection<>(this, this);    
    getFields().put("featuredMedia", projection);
    return projection;
  }

  public ResourceFeedbackProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    ResourceFeedbackProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourceFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> images(
      ) {
    ImageConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> images(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
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

  public BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> inCollection(
      String id) {
    BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("inCollection", projection);
    getInputArguments().computeIfAbsent("inCollection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inCollection").add(idArg);
    return projection;
  }

  public MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductMediaSortKeys sortKey, String query) {
    MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> mediaCount(
      ) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("mediaCount", projection);
    return projection;
  }

  public MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public ProductOptionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> options(
      ) {
    ProductOptionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    return projection;
  }

  public ProductOptionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> options(
      Integer first) {
    ProductOptionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> priceRange(
      ) {
    ProductPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("priceRange", projection);
    return projection;
  }

  public ProductPriceRangeV2Projection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> priceRangeV2(
      ) {
    ProductPriceRangeV2Projection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeV2Projection<>(this, this);    
    getFields().put("priceRangeV2", projection);
    return projection;
  }

  public PrivateMetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
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

  public ProductCategoryProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> productCategory(
      ) {
    ProductCategoryProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductCategoryProjection<>(this, this);    
    getFields().put("productCategory", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> productPublications(
      ) {
    ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("productPublications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> productPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
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

  public IntProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> publicationCount(
      Boolean onlyPublished) {
    IntProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("publicationCount", projection);
    getInputArguments().computeIfAbsent("publicationCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("publicationCount").add(onlyPublishedArg);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> publications(
      ) {
    ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
    getFields().put("publications", projection);
    return projection;
  }

  public ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> publications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ProductPublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPublicationConnectionProjection<>(this, this);    
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

  public BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> publishedInContext(
      ContextualPublicationContext context) {
    BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedInContext", projection);
    getInputArguments().computeIfAbsent("publishedInContext", k -> new ArrayList<>());                      
    InputArgument contextArg = new InputArgument("context", context);
    getInputArguments().get("publishedInContext").add(contextArg);
    return projection;
  }

  public BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> publishedOnChannel(
      String channelId) {
    BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnChannel", projection);
    getInputArguments().computeIfAbsent("publishedOnChannel", k -> new ArrayList<>());                      
    InputArgument channelIdArg = new InputArgument("channelId", channelId);
    getInputArguments().get("publishedOnChannel").add(channelIdArg);
    return projection;
  }

  public BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> publishedOnPublication(
      String publicationId) {
    BooleanProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("publishedOnPublication", projection);
    getInputArguments().computeIfAbsent("publishedOnPublication", k -> new ArrayList<>());                      
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId);
    getInputArguments().get("publishedOnPublication").add(publicationIdArg);
    return projection;
  }

  public ResourcePublicationV2Projection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationOnCurrentPublication(
      ) {
    ResourcePublicationV2Projection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2Projection<>(this, this);    
    getFields().put("resourcePublicationOnCurrentPublication", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublications(
      ) {
    ResourcePublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
    getFields().put("resourcePublications", projection);
    return projection;
  }

  public ResourcePublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublications(
      Boolean onlyPublished, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ResourcePublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationConnectionProjection<>(this, this);    
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

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      ) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    return projection;
  }

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsCount(
      Boolean onlyPublished) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("resourcePublicationsCount", projection);
    getInputArguments().computeIfAbsent("resourcePublicationsCount", k -> new ArrayList<>());                      
    InputArgument onlyPublishedArg = new InputArgument("onlyPublished", onlyPublished);
    getInputArguments().get("resourcePublicationsCount").add(onlyPublishedArg);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      ) {
    ResourcePublicationV2ConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
    getFields().put("resourcePublicationsV2", projection);
    return projection;
  }

  public ResourcePublicationV2ConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> resourcePublicationsV2(
      Boolean onlyPublished, CatalogType catalogType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ResourcePublicationV2ConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ResourcePublicationV2ConnectionProjection<>(this, this);    
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

  public RestrictedForResourceProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> restrictedForResource(
      ) {
    RestrictedForResourceProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    return projection;
  }

  public RestrictedForResourceProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> restrictedForResource(
      String calculatedOrderId) {
    RestrictedForResourceProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new RestrictedForResourceProjection<>(this, this);    
    getFields().put("restrictedForResource", projection);
    getInputArguments().computeIfAbsent("restrictedForResource", k -> new ArrayList<>());                      
    InputArgument calculatedOrderIdArg = new InputArgument("calculatedOrderId", calculatedOrderId);
    getInputArguments().get("restrictedForResource").add(calculatedOrderIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> sellingPlanGroupsCount(
      ) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("sellingPlanGroupsCount", projection);
    return projection;
  }

  public SEOProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public StandardizedProductTypeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> standardizedProductType(
      ) {
    StandardizedProductTypeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new StandardizedProductTypeProjection<>(this, this);    
    getFields().put("standardizedProductType", projection);
    return projection;
  }

  public ProductStatusProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> status(
      ) {
    ProductStatusProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public TranslationProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> translations(
      ) {
    TranslationProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    return projection;
  }

  public TranslationProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> translations(
      String locale, String marketId) {
    TranslationProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new TranslationProjection<>(this, this);    
    getFields().put("translations", projection);
    getInputArguments().computeIfAbsent("translations", k -> new ArrayList<>());                      
    InputArgument localeArg = new InputArgument("locale", locale);
    getInputArguments().get("translations").add(localeArg);
    InputArgument marketIdArg = new InputArgument("marketId", marketId);
    getInputArguments().get("translations").add(marketIdArg);
    return projection;
  }

  public ChannelConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      ) {
    ChannelConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
    getFields().put("unpublishedChannels", projection);
    return projection;
  }

  public ChannelConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> unpublishedChannels(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ChannelConnectionProjection<>(this, this);    
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

  public PublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      ) {
    PublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
    getFields().put("unpublishedPublications", projection);
    return projection;
  }

  public PublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> unpublishedPublications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PublicationConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new PublicationConnectionProjection<>(this, this);    
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

  public ProductVariantConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variants(
      ) {
    ProductVariantConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey) {
    ProductVariantConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
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

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variantsCount(
      ) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsCount", projection);
    return projection;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> customProductType() {
    getFields().put("customProductType", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> descriptionPlainSummary() {
    getFields().put("descriptionPlainSummary", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> giftCardTemplateSuffix() {
    getFields().put("giftCardTemplateSuffix", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> hasOnlyDefaultVariant() {
    getFields().put("hasOnlyDefaultVariant", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> hasOutOfStockVariants() {
    getFields().put("hasOutOfStockVariants", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> hasVariantsThatRequiresComponents() {
    getFields().put("hasVariantsThatRequiresComponents", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> inCollection() {
    getFields().put("inCollection", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> onlineStorePreviewUrl() {
    getFields().put("onlineStorePreviewUrl", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> productType() {
    getFields().put("productType", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publicationCount() {
    getFields().put("publicationCount", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedInContext() {
    getFields().put("publishedInContext", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedOnChannel() {
    getFields().put("publishedOnChannel", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedOnCurrentChannel() {
    getFields().put("publishedOnCurrentChannel", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedOnCurrentPublication() {
    getFields().put("publishedOnCurrentPublication", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedOnPublication() {
    getFields().put("publishedOnPublication", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> sellingPlanGroupCount() {
    getFields().put("sellingPlanGroupCount", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> storefrontId() {
    getFields().put("storefrontId", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> totalInventory() {
    getFields().put("totalInventory", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> totalVariants() {
    getFields().put("totalVariants", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> tracksInventory() {
    getFields().put("tracksInventory", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
