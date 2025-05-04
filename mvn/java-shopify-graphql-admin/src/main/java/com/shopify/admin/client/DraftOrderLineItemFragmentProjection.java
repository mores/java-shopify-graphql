package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DraftOrderLineItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DraftOrderLineItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderLineItem"));
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderAppliedDiscountProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> appliedDiscount(
      ) {
     DraftOrderAppliedDiscountProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountProjection<>(this, getRoot());
     getFields().put("appliedDiscount", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> approximateDiscountedUnitPriceSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("approximateDiscountedUnitPriceSet", projection);
     return projection;
  }

  public DraftOrderLineItemProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> bundleComponents(
      ) {
     DraftOrderLineItemProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("bundleComponents", projection);
     return projection;
  }

  public DraftOrderLineItemProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> components(
      ) {
     DraftOrderLineItemProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }

  public AttributeProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributes(
      ) {
     AttributeProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new AttributeProjection<>(this, getRoot());
     getFields().put("customAttributes", projection);
     return projection;
  }

  public TypedAttributeProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> customAttributesV2(
      ) {
     TypedAttributeProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new TypedAttributeProjection<>(this, getRoot());
     getFields().put("customAttributesV2", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> discountedUnitPriceSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedUnitPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public ImageProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalTotalSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public MoneyV2Projection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> originalUnitPriceWithCurrency(
      ) {
     MoneyV2Projection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalUnitPriceWithCurrency", projection);
     return projection;
  }

  public MoneyV2Projection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> priceOverride(
      ) {
     MoneyV2Projection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("priceOverride", projection);
     return projection;
  }

  public ProductProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public TaxLineProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> totalDiscountSet(
      ) {
     MoneyBagProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountSet", projection);
     return projection;
  }

  public ProductVariantProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public WeightProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<DraftOrderLineItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> custom() {
    getFields().put("custom", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> discountedUnitPrice() {
    getFields().put("discountedUnitPrice", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> grams() {
    getFields().put("grams", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> isGiftCard() {
    getFields().put("isGiftCard", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> originalUnitPrice() {
    getFields().put("originalUnitPrice", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> taxable() {
    getFields().put("taxable", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> totalDiscount() {
    getFields().put("totalDiscount", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> uuid() {
    getFields().put("uuid", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public DraftOrderLineItemFragmentProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DraftOrderLineItem {");
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
