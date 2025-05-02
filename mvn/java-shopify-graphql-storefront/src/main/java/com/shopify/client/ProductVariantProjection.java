package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.GeoCoordinateInput;
import com.shopify.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ProductVariantProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductVariantProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductVariant"));
  }

  public ProductVariantProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> compareAtPrice() {
     MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> compareAtPriceV2() {
     MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("compareAtPriceV2", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> components(
      ) {
     ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }

  public ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> components(
      String after, String before, Integer first, Integer last) {
    ProductVariantComponentConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantComponentConnectionProjection<>(this, getRoot());    
    getFields().put("components", projection);
    getInputArguments().computeIfAbsent("components", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("components").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("components").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("components").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("components").add(lastArg);
    return projection;
  }

  public ProductVariantConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> groupedBy(
      ) {
     ProductVariantConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("groupedBy", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> groupedBy(
      String after, String before, Integer first, Integer last) {
    ProductVariantConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("groupedBy", projection);
    getInputArguments().computeIfAbsent("groupedBy", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("groupedBy").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("groupedBy").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("groupedBy").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("groupedBy").add(lastArg);
    return projection;
  }

  public ImageProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafield(String key,
      String namespace) {
    MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> priceV2() {
     MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("priceV2", projection);
     return projection;
  }

  public ProductProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      ) {
     QuantityPriceBreakConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());
     getFields().put("quantityPriceBreaks", projection);
     return projection;
  }

  public QuantityPriceBreakConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> quantityPriceBreaks(
      String after, String before, Integer first, Integer last) {
    QuantityPriceBreakConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakConnectionProjection<>(this, getRoot());    
    getFields().put("quantityPriceBreaks", projection);
    getInputArguments().computeIfAbsent("quantityPriceBreaks", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("quantityPriceBreaks").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("quantityPriceBreaks").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("quantityPriceBreaks").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("quantityPriceBreaks").add(lastArg);
    return projection;
  }

  public QuantityRuleProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> quantityRule() {
     QuantityRuleProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new QuantityRuleProjection<>(this, getRoot());
     getFields().put("quantityRule", projection);
     return projection;
  }

  public SelectedOptionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> selectedOptions() {
     SelectedOptionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SelectedOptionProjection<>(this, getRoot());
     getFields().put("selectedOptions", projection);
     return projection;
  }

  public SellingPlanAllocationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanAllocations(
      ) {
     SellingPlanAllocationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanAllocations", projection);
     return projection;
  }

  public SellingPlanAllocationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> sellingPlanAllocations(
      String after, String before, Integer first, Integer last, Boolean reverse) {
    SellingPlanAllocationConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAllocationConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanAllocations", projection);
    getInputArguments().computeIfAbsent("sellingPlanAllocations", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanAllocations").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanAllocations").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanAllocations").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanAllocations").add(lastArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanAllocations").add(reverseArg);
    return projection;
  }

  public ShopPayInstallmentsProductVariantPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> shopPayInstallmentsPricing(
      ) {
     ShopPayInstallmentsProductVariantPricingProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new ShopPayInstallmentsProductVariantPricingProjection<>(this, getRoot());
     getFields().put("shopPayInstallmentsPricing", projection);
     return projection;
  }

  public StoreAvailabilityConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> storeAvailability(
      ) {
     StoreAvailabilityConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityConnectionProjection<>(this, getRoot());
     getFields().put("storeAvailability", projection);
     return projection;
  }

  public StoreAvailabilityConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> storeAvailability(
      String after, String before, Integer first, Integer last, GeoCoordinateInput near,
      Boolean reverse) {
    StoreAvailabilityConnectionProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new StoreAvailabilityConnectionProjection<>(this, getRoot());    
    getFields().put("storeAvailability", projection);
    getInputArguments().computeIfAbsent("storeAvailability", k -> new ArrayList<>());                      
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("storeAvailability").add(afterArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("storeAvailability").add(beforeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("storeAvailability").add(firstArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("storeAvailability").add(lastArg);
    InputArgument nearArg = new InputArgument("near", near);
    getInputArguments().get("storeAvailability").add(nearArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("storeAvailability").add(reverseArg);
    return projection;
  }

  public MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> unitPrice() {
     MoneyV2Projection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitPrice", projection);
     return projection;
  }

  public UnitPriceMeasurementProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> unitPriceMeasurement(
      ) {
     UnitPriceMeasurementProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementProjection<>(this, getRoot());
     getFields().put("unitPriceMeasurement", projection);
     return projection;
  }

  public WeightUnitProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> weightUnit() {
     WeightUnitProjection<ProductVariantProjection<PARENT, ROOT>, ROOT> projection = new WeightUnitProjection<>(this, getRoot());
     getFields().put("weightUnit", projection);
     return projection;
  }

  public ProductVariantProjection<PARENT, ROOT> availableForSale() {
    getFields().put("availableForSale", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> barcode() {
    getFields().put("barcode", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> currentlyNotInStock() {
    getFields().put("currentlyNotInStock", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> quantityAvailable() {
    getFields().put("quantityAvailable", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> requiresComponents() {
    getFields().put("requiresComponents", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ProductVariantProjection<PARENT, ROOT> weight() {
    getFields().put("weight", null);
    return this;
  }
}
