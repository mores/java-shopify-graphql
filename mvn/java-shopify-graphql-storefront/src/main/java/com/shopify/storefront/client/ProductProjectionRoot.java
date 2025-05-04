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

public class ProductProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductProjectionRoot() {
    super(null, null, java.util.Optional.of("Product"));
  }

  public ProductProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> adjacentVariants(
      ) {
    ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    return projection;
  }

  public ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> adjacentVariants(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    getInputArguments().computeIfAbsent("adjacentVariants", k -> new ArrayList<>());                      
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions);
    getInputArguments().get("adjacentVariants").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions);
    getInputArguments().get("adjacentVariants").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch);
    getInputArguments().get("adjacentVariants").add(caseInsensitiveMatchArg);
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
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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
    return projection;
  }

  public ProductPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> compareAtPriceRange(
      ) {
    ProductPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("compareAtPriceRange", projection);
    return projection;
  }

  public StringProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public ImageProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> featuredImage(
      ) {
    ImageProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("featuredImage", projection);
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

  public MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductMediaSortKeys sortKey) {
    MediaConnectionProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
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
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> priceRange(
      ) {
    ProductPriceRangeProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("priceRange", projection);
    return projection;
  }

  public ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariant(
      ) {
    ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    return projection;
  }

  public ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariant(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    getInputArguments().computeIfAbsent("selectedOrFirstAvailableVariant", k -> new ArrayList<>());                      
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(caseInsensitiveMatchArg);
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

  public SEOProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantBySelectedOptions(
      ) {
    ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    return projection;
  }

  public ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantBySelectedOptions(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    getInputArguments().computeIfAbsent("variantBySelectedOptions", k -> new ArrayList<>());                      
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions);
    getInputArguments().get("variantBySelectedOptions").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions);
    getInputArguments().get("variantBySelectedOptions").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch);
    getInputArguments().get("variantBySelectedOptions").add(caseInsensitiveMatchArg);
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

  public CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> variantsCount(
      ) {
    CountProjection<ProductProjectionRoot<PARENT, ROOT>, ProductProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsCount", projection);
    return projection;
  }

  public ProductProjectionRoot<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
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

  public ProductProjectionRoot<PARENT, ROOT> encodedVariantAvailability() {
    getFields().put("encodedVariantAvailability", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> encodedVariantExistence() {
    getFields().put("encodedVariantExistence", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
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

  public ProductProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
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

  public ProductProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
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
