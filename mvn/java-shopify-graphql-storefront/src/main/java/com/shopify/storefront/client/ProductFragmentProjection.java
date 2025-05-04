package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import com.shopify.storefront.types.ProductImageSortKeys;
import com.shopify.storefront.types.ProductMediaSortKeys;
import com.shopify.storefront.types.ProductVariantSortKeys;
import com.shopify.storefront.types.SelectedOptionInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Product"));
  }

  public ProductFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> adjacentVariants(
      ) {
     ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("adjacentVariants", projection);
     return projection;
  }

  public ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> adjacentVariants(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());    
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

  public TaxonomyCategoryProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> category() {
     TaxonomyCategoryProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyCategoryProjection<>(this, getRoot());
     getFields().put("category", projection);
     return projection;
  }

  public CollectionConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> collections(
      ) {
     CollectionConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
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

  public ProductPriceRangeProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> compareAtPriceRange(
      ) {
     ProductPriceRangeProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductPriceRangeProjection<>(this, getRoot());
     getFields().put("compareAtPriceRange", projection);
     return projection;
  }

  public ImageProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> featuredImage() {
     ImageProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("featuredImage", projection);
     return projection;
  }

  public ImageConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> images() {
     ImageConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageConnectionProjection<>(this, getRoot());
     getFields().put("images", projection);
     return projection;
  }

  public ImageConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> images(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductImageSortKeys sortKey) {
    ImageConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageConnectionProjection<>(this, getRoot());    
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

  public MediaConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> media() {
     MediaConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());
     getFields().put("media", projection);
     return projection;
  }

  public MediaConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> media(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductMediaSortKeys sortKey) {
    MediaConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new MediaConnectionProjection<>(this, getRoot());    
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

  public MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public ProductOptionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> options() {
     ProductOptionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());
     getFields().put("options", projection);
     return projection;
  }

  public ProductOptionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> options(
      Integer first) {
    ProductOptionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductOptionProjection<>(this, getRoot());    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> priceRange() {
     ProductPriceRangeProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductPriceRangeProjection<>(this, getRoot());
     getFields().put("priceRange", projection);
     return projection;
  }

  public ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> selectedOrFirstAvailableVariant(
      ) {
     ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("selectedOrFirstAvailableVariant", projection);
     return projection;
  }

  public ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> selectedOrFirstAvailableVariant(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());    
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

  public SellingPlanGroupConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
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

  public SEOProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> variantBySelectedOptions(
      ) {
     ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variantBySelectedOptions", projection);
     return projection;
  }

  public ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> variantBySelectedOptions(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());    
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

  public ProductVariantConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> variants(
      ) {
     ProductVariantConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("variants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> variants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey) {
    ProductVariantConnectionProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
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

  public CountProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> variantsCount() {
     CountProjection<ProductFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("variantsCount", projection);
     return projection;
  }

  public ProductFragmentProjection<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public ProductFragmentProjection description(Integer truncateAt) {
    getFields().put("description", null);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("description").add(truncateAtArg);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> descriptionHtml() {
    getFields().put("descriptionHtml", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> encodedVariantAvailability() {
    getFields().put("encodedVariantAvailability", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> encodedVariantExistence() {
    getFields().put("encodedVariantExistence", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> productType() {
    getFields().put("productType", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> totalInventory() {
    getFields().put("totalInventory", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public ProductFragmentProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Product {");
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
