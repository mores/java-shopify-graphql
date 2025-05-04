package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.GeoCoordinateInput;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductVariantFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductVariantFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> compareAtPrice() {
     MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> compareAtPriceV2(
      ) {
     MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPriceV2", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> components(
      ) {
     ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> components(
      Integer first, String after, Integer last, String before) {
    ProductVariantComponentConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());    
    getFields().put("components", projection);
    getInputArguments().computeIfAbsent("components", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("components").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("components").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("components").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("components").add(beforeArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> groupedBy(
      ) {
     ProductVariantConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("groupedBy", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> groupedBy(
      Integer first, String after, Integer last, String before) {
    ProductVariantConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("groupedBy", projection);
    getInputArguments().computeIfAbsent("groupedBy", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("groupedBy").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("groupedBy").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("groupedBy").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("groupedBy").add(beforeArg);
    return projection;
  }

  public ImageProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> priceV2() {
     MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("priceV2", projection);
     return projection;
  }

  public ProductProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      ) {
     QuantityPriceBreakConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());
     getFields().put("quantityPriceBreaks", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      Integer first, String after, Integer last, String before) {
    QuantityPriceBreakConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());    
    getFields().put("quantityPriceBreaks", projection);
    getInputArguments().computeIfAbsent("quantityPriceBreaks", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("quantityPriceBreaks").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("quantityPriceBreaks").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("quantityPriceBreaks").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("quantityPriceBreaks").add(beforeArg);
    return projection;
  }

  public QuantityRuleProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> quantityRule(
      ) {
     QuantityRuleProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleProjection<>(this, getRoot());
     getFields().put("quantityRule", projection);
     return projection;
  }

  public SelectedOptionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> selectedOptions(
      ) {
     SelectedOptionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new SelectedOptionProjection<>(this, getRoot());
     getFields().put("selectedOptions", projection);
     return projection;
  }

  public SellingPlanAllocationConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanAllocations(
      ) {
     SellingPlanAllocationConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanAllocations", projection);
     return projection;
  }

  public SellingPlanAllocationConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanAllocations(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanAllocationConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanAllocations", projection);
    getInputArguments().computeIfAbsent("sellingPlanAllocations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanAllocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanAllocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanAllocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanAllocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanAllocations").add(reverseArg);
    return projection;
  }

  public ShopPayInstallmentsProductVariantPricingProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> shopPayInstallmentsPricing(
      ) {
     ShopPayInstallmentsProductVariantPricingProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsProductVariantPricingProjection<>(this, getRoot());
     getFields().put("shopPayInstallmentsPricing", projection);
     return projection;
  }

  public StoreAvailabilityConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> storeAvailability(
      ) {
     StoreAvailabilityConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityConnectionProjection<>(this, getRoot());
     getFields().put("storeAvailability", projection);
     return projection;
  }

  public StoreAvailabilityConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> storeAvailability(
      GeoCoordinateInput near, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    StoreAvailabilityConnectionProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityConnectionProjection<>(this, getRoot());    
    getFields().put("storeAvailability", projection);
    getInputArguments().computeIfAbsent("storeAvailability", k -> new ArrayList<>());                      
    InputArgument nearArg = new InputArgument("near", near);
    getInputArguments().get("storeAvailability").add(nearArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("storeAvailability").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("storeAvailability").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("storeAvailability").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("storeAvailability").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("storeAvailability").add(reverseArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> unitPrice() {
     MoneyV2Projection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitPrice", projection);
     return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> unitPriceMeasurement(
      ) {
     UnitPriceMeasurementProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementProjection<>(this, getRoot());
     getFields().put("unitPriceMeasurement", projection);
     return projection;
  }

  public WeightUnitProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> weightUnit() {
     WeightUnitProjection<ProductVariantFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightUnitProjection<>(this, getRoot());
     getFields().put("weightUnit", projection);
     return projection;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> currentlyNotInStock() {
    getFields().put("currentlyNotInStock", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> quantityAvailable() {
    getFields().put("quantityAvailable", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantFragmentProjection<PARENT, ROOT> weight() {
    getFields().put("weight", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductVariant {");
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
