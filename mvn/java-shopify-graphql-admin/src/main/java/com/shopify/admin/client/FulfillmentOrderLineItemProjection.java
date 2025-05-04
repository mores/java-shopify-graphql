package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItem"));
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemFinancialSummaryProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> financialSummaries(
      ) {
     FulfillmentOrderLineItemFinancialSummaryProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemFinancialSummaryProjection<>(this, getRoot());
     getFields().put("financialSummaries", projection);
     return projection;
  }

  public ImageProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public LineItemProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public MoneyBagProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> originalUnitPriceSet(
      ) {
     MoneyBagProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalUnitPriceSet", projection);
     return projection;
  }

  public ProductVariantProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> variant(
      ) {
     ProductVariantProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public FulfillmentOrderLineItemWarningProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> warnings(
      ) {
     FulfillmentOrderLineItemWarningProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemWarningProjection<>(this, getRoot());
     getFields().put("warnings", projection);
     return projection;
  }

  public WeightProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<FulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> inventoryItemId() {
    getFields().put("inventoryItemId", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> productTitle() {
    getFields().put("productTitle", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> remainingQuantity() {
    getFields().put("remainingQuantity", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> variantTitle() {
    getFields().put("variantTitle", null);
    return this;
  }

  public FulfillmentOrderLineItemProjection<PARENT, ROOT> vendor() {
    getFields().put("vendor", null);
    return this;
  }
}
