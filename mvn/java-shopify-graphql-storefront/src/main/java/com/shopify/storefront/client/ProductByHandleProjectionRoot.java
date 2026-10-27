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

public class ProductByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("Product"));
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> adjacentVariants(
      ) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> adjacentVariants(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    getInputArguments().computeIfAbsent("adjacentVariants", k -> new ArrayList<>());                      
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions, false, null);
    getInputArguments().get("adjacentVariants").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions, false, null);
    getInputArguments().get("adjacentVariants").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch, false, null);
    getInputArguments().get("adjacentVariants").add(caseInsensitiveMatchArg);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> adjacentVariantsWithVariableReferences(
      String selectedOptionsReference, String ignoreUnknownOptionsReference,
      String caseInsensitiveMatchReference) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("adjacentVariants", projection);
    getInputArguments().computeIfAbsent("adjacentVariants", k -> new ArrayList<>());              
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptionsReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SelectedOptionInput"))));
    getInputArguments().get("adjacentVariants").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptionsReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("adjacentVariants").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatchReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("adjacentVariants").add(caseInsensitiveMatchArg);
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
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> collectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CollectionConnectionProjection<>(this, this);    
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
    return projection;
  }

  public ProductPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> compareAtPriceRange(
      ) {
    ProductPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("compareAtPriceRange", projection);
    return projection;
  }

  public StringProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> description(
      Integer truncateAt) {
    StringProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());                      
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt, false, null);
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public StringProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> descriptionWithVariableReferences(
      String truncateAtReference) {
    StringProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new StringProjection<>(this, this);    
    getFields().put("description", projection);
    getInputArguments().computeIfAbsent("description", k -> new ArrayList<>());              
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAtReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("description").add(truncateAtArg);
    return projection;
  }

  public ImageProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> featuredImage(
      ) {
    ImageProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("featuredImage", projection);
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

  public ImageConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> imagesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    ImageConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageConnectionProjection<>(this, this);    
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

  public MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> media(
      ) {
    MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
    getFields().put("media", projection);
    return projection;
  }

  public MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> media(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductMediaSortKeys sortKey) {
    MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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
    return projection;
  }

  public MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> mediaWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    MediaConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MediaConnectionProjection<>(this, this);    
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
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductOptionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> optionsWithVariableReferences(
      String firstReference) {
    ProductOptionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductOptionProjection<>(this, this);    
    getFields().put("options", projection);
    getInputArguments().computeIfAbsent("options", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("options").add(firstArg);
    return projection;
  }

  public ProductPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> priceRange(
      ) {
    ProductPriceRangeProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductPriceRangeProjection<>(this, this);    
    getFields().put("priceRange", projection);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariant(
      ) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariant(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    getInputArguments().computeIfAbsent("selectedOrFirstAvailableVariant", k -> new ArrayList<>());                      
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions, false, null);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions, false, null);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch, false, null);
    getInputArguments().get("selectedOrFirstAvailableVariant").add(caseInsensitiveMatchArg);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> selectedOrFirstAvailableVariantWithVariableReferences(
      String selectedOptionsReference, String ignoreUnknownOptionsReference,
      String caseInsensitiveMatchReference) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("selectedOrFirstAvailableVariant", projection);
    getInputArguments().computeIfAbsent("selectedOrFirstAvailableVariant", k -> new ArrayList<>());              
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptionsReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SelectedOptionInput"))));
    getInputArguments().get("selectedOrFirstAvailableVariant").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptionsReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("selectedOrFirstAvailableVariant").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatchReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("selectedOrFirstAvailableVariant").add(caseInsensitiveMatchArg);
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

  public SellingPlanGroupConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> sellingPlanGroupsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SellingPlanGroupConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public SEOProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> seo(
      ) {
    SEOProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new SEOProjection<>(this, this);    
    getFields().put("seo", projection);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variantBySelectedOptions(
      ) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variantBySelectedOptions(
      List<SelectedOptionInput> selectedOptions, Boolean ignoreUnknownOptions,
      Boolean caseInsensitiveMatch) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    getInputArguments().computeIfAbsent("variantBySelectedOptions", k -> new ArrayList<>());                      
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptions, false, null);
    getInputArguments().get("variantBySelectedOptions").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptions, false, null);
    getInputArguments().get("variantBySelectedOptions").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatch, false, null);
    getInputArguments().get("variantBySelectedOptions").add(caseInsensitiveMatchArg);
    return projection;
  }

  public ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variantBySelectedOptionsWithVariableReferences(
      String selectedOptionsReference, String ignoreUnknownOptionsReference,
      String caseInsensitiveMatchReference) {
    ProductVariantProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variantBySelectedOptions", projection);
    getInputArguments().computeIfAbsent("variantBySelectedOptions", k -> new ArrayList<>());              
    InputArgument selectedOptionsArg = new InputArgument("selectedOptions", selectedOptionsReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SelectedOptionInput")))));
    getInputArguments().get("variantBySelectedOptions").add(selectedOptionsArg);
    InputArgument ignoreUnknownOptionsArg = new InputArgument("ignoreUnknownOptions", ignoreUnknownOptionsReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("variantBySelectedOptions").add(ignoreUnknownOptionsArg);
    InputArgument caseInsensitiveMatchArg = new InputArgument("caseInsensitiveMatch", caseInsensitiveMatchReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("variantBySelectedOptions").add(caseInsensitiveMatchArg);
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

  public ProductVariantConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variantsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    ProductVariantConnectionProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new ProductVariantConnectionProjection<>(this, this);    
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

  public CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> variantsCount(
      ) {
    CountProjection<ProductByHandleProjectionRoot<PARENT, ROOT>, ProductByHandleProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("variantsCount", projection);
    return projection;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
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

  public ProductByHandleProjectionRoot<PARENT, ROOT> encodedVariantAvailability() {
    getFields().put("encodedVariantAvailability", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> encodedVariantExistence() {
    getFields().put("encodedVariantExistence", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
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

  public ProductByHandleProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> requiresSellingPlan() {
    getFields().put("requiresSellingPlan", null);
    return this;
  }

  public ProductByHandleProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
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

  public ProductByHandleProjectionRoot<PARENT, ROOT> trackingParameters() {
    getFields().put("trackingParameters", null);
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
