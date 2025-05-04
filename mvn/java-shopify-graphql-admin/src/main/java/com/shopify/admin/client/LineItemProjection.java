package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.ArrayList;

public class LineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItem"));
  }

  public LineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<LineItemProjection<PARENT, ROOT>, ROOT> contract() {
     SubscriptionContractProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("contract", projection);
     return projection;
  }

  public AttributeProjection<LineItemProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public DiscountAllocationProjection<LineItemProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> discountedTotalSet() {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      Boolean withCodeDiscounts) {
    MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());    
    getFields().put("discountedTotalSet", projection);
    getInputArguments().computeIfAbsent("discountedTotalSet", k -> new ArrayList<>());                      
    InputArgument withCodeDiscountsArg = new InputArgument("withCodeDiscounts", withCodeDiscounts);
    getInputArguments().get("discountedTotalSet").add(withCodeDiscountsArg);
    return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceAfterAllDiscountsSet(
      ) {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceAfterAllDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet() {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public DutyProjection<LineItemProjection<PARENT, ROOT>, ROOT> duties() {
     DutyProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new DutyProjection<>(this, getRoot());
     getFields().put("duties", projection);
     return projection;
  }

  public FulfillmentServiceProjection<LineItemProjection<PARENT, ROOT>, ROOT> fulfillmentService() {
     FulfillmentServiceProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<LineItemProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public LineItemGroupProjection<LineItemProjection<PARENT, ROOT>, ROOT> lineItemGroup() {
     LineItemGroupProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemGroupProjection<>(this, getRoot());
     getFields().put("lineItemGroup", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> originalTotalSet() {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet() {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductProjection<LineItemProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public LineItemSellingPlanProjection<LineItemProjection<PARENT, ROOT>, ROOT> sellingPlan() {
     LineItemSellingPlanProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemSellingPlanProjection<>(this, getRoot());
     getFields().put("sellingPlan", projection);
     return projection;
  }

  public StaffMemberProjection<LineItemProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public TaxLineProjection<LineItemProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public TaxLineProjection<LineItemProjection<PARENT, ROOT>, ROOT> taxLines(Integer first) {
    TaxLineProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());    
    getFields().put("taxLines", projection);
    getInputArguments().computeIfAbsent("taxLines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("taxLines").add(firstArg);
    return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> totalDiscountSet() {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> unfulfilledDiscountedTotalSet(
      ) {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledDiscountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> unfulfilledOriginalTotalSet() {
     MoneyBagProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("unfulfilledOriginalTotalSet", projection);
     return projection;
  }

  public ProductVariantProjection<LineItemProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<LineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public LineItemProjection<PARENT, ROOT> canRestock() {
    getFields().put("canRestock", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> currentQuantity() {
    getFields().put("currentQuantity", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> discountedUnitPrice() {
    getFields().put("discountedUnitPrice", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> fulfillableQuantity() {
    getFields().put("fulfillableQuantity", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> fulfillmentStatus() {
    getFields().put("fulfillmentStatus", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> merchantEditable() {
    getFields().put("merchantEditable", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> nonFulfillableQuantity() {
    getFields().put("nonFulfillableQuantity", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> originalUnitPrice() {
    getFields().put("originalUnitPrice", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> refundableQuantity() {
    getFields().put("refundableQuantity", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> restockable() {
    getFields().put("restockable", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> totalDiscount() {
    getFields().put("totalDiscount", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> unfulfilledDiscountedTotal() {
    getFields().put("unfulfilledDiscountedTotal", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> unfulfilledOriginalTotal() {
    getFields().put("unfulfilledOriginalTotal", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> unfulfilledQuantity() {
    getFields().put("unfulfilledQuantity", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public LineItemProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
