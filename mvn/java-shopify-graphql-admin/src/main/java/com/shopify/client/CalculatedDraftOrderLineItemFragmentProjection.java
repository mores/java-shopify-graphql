package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CalculatedDraftOrderLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CalculatedDraftOrderLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDraftOrderLineItem"));
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> appliedDiscount(
      ) {
     DraftOrderAppliedDiscountProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountProjection<>(this, getRoot());
     getFields().put("appliedDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> approximateDiscountedUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("approximateDiscountedUnitPriceSet", projection);
     return projection;
  }

  public CalculatedDraftOrderLineItemProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> bundleComponents(
      ) {
     CalculatedDraftOrderLineItemProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("bundleComponents", projection);
     return projection;
  }

  public AttributeProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public TypedAttributeProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributesV2(
      ) {
     TypedAttributeProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new TypedAttributeProjection<>(this, getRoot());
     getFields().put("customAttributesV2", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotal(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedTotal", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPrice(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedUnitPrice", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> image(
      ) {
     ImageProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalTotal(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotal", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalTotalSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPrice(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalUnitPrice", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceWithCurrency(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalUnitPriceWithCurrency", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> priceOverride(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("priceOverride", projection);
     return projection;
  }

  public ProductProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> product(
      ) {
     ProductProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> totalDiscount(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public ProductVariantProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public WeightProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> weight(
      ) {
     WeightProjection<CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> custom() {
    getFields().put("custom", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> uuid() {
    getFields().put("uuid", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public CalculatedDraftOrderLineItemFragmentProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CalculatedDraftOrderLineItem {");
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
