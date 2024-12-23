package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedDraftOrderLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedDraftOrderLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDraftOrderLineItem"));
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> appliedDiscount(
      ) {
     DraftOrderAppliedDiscountProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountProjection<>(this, getRoot());
     getFields().put("appliedDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> approximateDiscountedUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("approximateDiscountedUnitPriceSet", projection);
     return projection;
  }

  public CalculatedDraftOrderLineItemProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> bundleComponents(
      ) {
     CalculatedDraftOrderLineItemProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("bundleComponents", projection);
     return projection;
  }

  public AttributeProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public TypedAttributeProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> customAttributesV2(
      ) {
     TypedAttributeProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new TypedAttributeProjection<>(this, getRoot());
     getFields().put("customAttributesV2", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> discountedTotal(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedTotal", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPrice(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedUnitPrice", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalTotal(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalTotal", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalTotalSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPrice(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalUnitPrice", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceWithCurrency(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalUnitPriceWithCurrency", projection);
     return projection;
  }

  public ProductProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> totalDiscount(
      ) {
     MoneyV2Projection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> totalDiscountSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public ProductVariantProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public WeightProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<CalculatedDraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> custom() {
    getFields().put("custom", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> uuid() {
    getFields().put("uuid", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public CalculatedDraftOrderLineItemProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
