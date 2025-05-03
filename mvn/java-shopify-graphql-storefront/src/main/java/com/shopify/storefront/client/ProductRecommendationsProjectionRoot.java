package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import com.shopify.storefront.types.ProductImageSortKeys;
import com.shopify.storefront.types.ProductMediaSortKeys;
import com.shopify.storefront.types.ProductVariantSortKeys;
import com.shopify.storefront.types.SelectedOptionInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductRecommendationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductRecommendationsProjectionRoot() {
    super(null, null, java.util.Optional.of("Product"));
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> adjacentVariants(
      ) {
    ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    return projection;
  }

  public ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> adjacentVariants(
      Boolean caseInsensitiveMatch, Boolean ignoreUnknownOptions,
      List<SelectedOptionInput> selectedOptions) {
    ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    getInputArguments().computeIfAbsent("adjacentVariants", k -> new ArrayList<>());                      
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch);
    getInputArguments().get("adjacentVariants").add(caseInsensitiveMatchArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions);
    getInputArguments().get("adjacentVariants").add(ignoreUnknownOptionsArg);
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions);
    getInputArguments().get("adjacentVariants").add(selectedOptionsArg);
    return projection;
  }

  public TaxonomyCategoryProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> category(
      ) {
    TaxonomyCategoryProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new TaxonomyCategoryProjection<>(this, this);    
    getFields().put("category", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> collections(
      ) {
    CollectionConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    return projection;
  }

  public CollectionConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> collections(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    CollectionConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collections").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collections").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collections").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collections").add(reverseArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> compareAtPriceRange(
      ) {
    ProductPriceRangeProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("compareAtPriceRange", projection);
    return projection;
  }

  public StringProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public ImageProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> featuredImage(
      ) {
    ImageProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("featuredImage", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> images(
      ) {
    ImageConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    return projection;
  }

  public ImageConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> images(
      String after, String before, Integer first, Integer last, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
    getFields().put("images", projection);
    getInputArguments().computeIfAbsent("images", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("images").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("images").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("images").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("images").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("images").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("images").add(sortKeyArg);
    return projection;
  }

  public MediaConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> media(
      String after, String before, Integer first, Integer last, Boolean reverse,
      ProductMediaSortKeys sortKey) {
    MediaConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    getInputArguments().computeIfAbsent("media", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("media").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("media").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("media").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("media").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("media").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("media").add(sortKeyArg);
    return projection;
  }

  public MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> metafield(
      String key, String namespace) {
    MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public ProductOptionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> options(
      ) {
    ProductOptionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    return projection;
  }

  public ProductOptionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> options(
      Integer first) {
    ProductOptionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> priceRange(
      ) {
    ProductPriceRangeProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("priceRange", projection);
    return projection;
  }

  public ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariant(
      ) {
    ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    return projection;
  }

  public ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariant(
      Boolean caseInsensitiveMatch, Boolean ignoreUnknownOptions,
      List<SelectedOptionInput> selectedOptions) {
    ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    getInputArguments().computeIfAbsent("selectedOrFirstAvailableVariant", k -> new ArrayList<>());                      
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(caseInsensitiveMatchArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(ignoreUnknownOptionsArg);
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(selectedOptionsArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    return projection;
  }

  public SEOProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> variantBySelectedOptions(
      ) {
    ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    return projection;
  }

  public ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> variantBySelectedOptions(
      Boolean caseInsensitiveMatch, Boolean ignoreUnknownOptions,
      List<SelectedOptionInput> selectedOptions) {
    ProductVariantProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    getInputArguments().computeIfAbsent("variantBySelectedOptions", k -> new ArrayList<>());                      
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch);
    getInputArguments().get("variantBySelectedOptions").add(caseInsensitiveMatchArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions);
    getInputArguments().get("variantBySelectedOptions").add(ignoreUnknownOptionsArg);
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions);
    getInputArguments().get("variantBySelectedOptions").add(selectedOptionsArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> variants(
      ) {
    ProductVariantConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> variants(
      String after, String before, Integer first, Integer last, Boolean reverse,
      ProductVariantSortKeys sortKey) {
    ProductVariantConnectionProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
    getFields().put("variants", projection);
    getInputArguments().computeIfAbsent("variants", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("variants").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("variants").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("variants").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("variants").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("variants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("variants").add(sortKeyArg);
    return projection;
  }

  public CountProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> variantsCount(
      ) {
    CountProjection<ProductRecommendationsProjectionRoot<PARENT, ROOT>, ProductRecommendationsProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsCount", projection);
    return projection;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> encodedVariantAvailability() {
    getFields().put("encodedVariantAvailability", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> encodedVariantExistence() {
    getFields().put("encodedVariantExistence", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> productType() {
    getFields().put("productType", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> totalInventory() {
    getFields().put("totalInventory", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ProductRecommendationsProjectionRoot<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
