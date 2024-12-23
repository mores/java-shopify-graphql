package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderLineItem"));
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> appliedDiscount(
      ) {
     DraftOrderAppliedDiscountProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountProjection<>(this, getRoot());
     getFields().put("appliedDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> approximateDiscountedUnitPriceSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("approximateDiscountedUnitPriceSet", projection);
     return projection;
  }

  public DraftOrderLineItemProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> bundleComponents(
      ) {
     DraftOrderLineItemProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("bundleComponents", projection);
     return projection;
  }

  public AttributeProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> customAttributes() {
     AttributeProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public TypedAttributeProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> customAttributesV2(
      ) {
     TypedAttributeProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new TypedAttributeProjection<>(this, getRoot());
     getFields().put("customAttributesV2", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> discountedTotalSet() {
     MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalTotalSet() {
     MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public MoneyV2Projection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceWithCurrency(
      ) {
     MoneyV2Projection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalUnitPriceWithCurrency", projection);
     return projection;
  }

  public ProductProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public TaxLineProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> totalDiscountSet() {
     MoneyBagProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public ProductVariantProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public WeightProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<DraftOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> custom() {
    getFields().put("custom", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> discountedUnitPrice() {
    getFields().put("discountedUnitPrice", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> grams() {
    getFields().put("grams", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> originalUnitPrice() {
    getFields().put("originalUnitPrice", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> totalDiscount() {
    getFields().put("totalDiscount", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> uuid() {
    getFields().put("uuid", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public DraftOrderLineItemProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
