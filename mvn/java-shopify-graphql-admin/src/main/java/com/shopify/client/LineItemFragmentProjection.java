package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class LineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public LineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItem"));
  }

  public LineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> contract() {
     SubscriptionContractProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("contract", projection);
     return projection;
  }

  public AttributeProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalSet() {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      Boolean withCodeDiscounts) {
    MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());    
    getFields().put("discountedTotalSet", projection);
    getInputArguments().computeIfAbsent("discountedTotalSet", k -> new ArrayList<>());                      
    InputArgument withCodeDiscountsArg = new InputArgument("withCodeDiscounts", withCodeDiscounts);
    getInputArguments().get("discountedTotalSet").add(withCodeDiscountsArg);
    return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceAfterAllDiscountsSet(
      ) {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceAfterAllDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public DutyProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> duties() {
     DutyProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DutyProjection<>(this, getRoot());
     getFields().put("duties", projection);
     return projection;
  }

  public FulfillmentServiceProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public LineItemGroupProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> lineItemGroup() {
     LineItemGroupProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemGroupProjection<>(this, getRoot());
     getFields().put("lineItemGroup", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> originalTotalSet() {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet() {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public LineItemSellingPlanProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> sellingPlan(
      ) {
     LineItemSellingPlanProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemSellingPlanProjection<>(this, getRoot());
     getFields().put("sellingPlan", projection);
     return projection;
  }

  public StaffMemberProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public TaxLineProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public TaxLineProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> taxLines(Integer first) {
    TaxLineProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());    
    getFields().put("taxLines", projection);
    getInputArguments().computeIfAbsent("taxLines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("taxLines").add(firstArg);
    return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountSet() {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> unfulfilledDiscountedTotalSet(
      ) {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledDiscountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> unfulfilledOriginalTotalSet(
      ) {
     MoneyBagProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledOriginalTotalSet", projection);
     return projection;
  }

  public ProductVariantProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<LineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public LineItemFragmentProjection<PARENT, ROOT> canRestock() {
    getFields().put("canRestock", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> currentQuantity() {
    getFields().put("currentQuantity", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> discountedUnitPrice() {
    getFields().put("discountedUnitPrice", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> fulfillableQuantity() {
    getFields().put("fulfillableQuantity", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> fulfillmentStatus() {
    getFields().put("fulfillmentStatus", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> merchantEditable() {
    getFields().put("merchantEditable", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> nonFulfillableQuantity() {
    getFields().put("nonFulfillableQuantity", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> originalUnitPrice() {
    getFields().put("originalUnitPrice", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> totalDiscount() {
    getFields().put("totalDiscount", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> unfulfilledDiscountedTotal() {
    getFields().put("unfulfilledDiscountedTotal", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> unfulfilledOriginalTotal() {
    getFields().put("unfulfilledOriginalTotal", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> unfulfilledQuantity() {
    getFields().put("unfulfilledQuantity", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public LineItemFragmentProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on LineItem {");
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
