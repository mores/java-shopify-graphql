package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLine"));
  }

  public ShippingLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> currentDiscountedPriceSet(
      ) {
     MoneyBagProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentDiscountedPriceSet", projection);
     return projection;
  }

  public DiscountAllocationProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<ShippingLineProjection<PARENT, ROOT>, ROOT> discountedPrice() {
     MoneyV2Projection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedPrice", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> discountedPriceSet() {
     MoneyBagProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedPriceSet", projection);
     return projection;
  }

  public MoneyV2Projection<ShippingLineProjection<PARENT, ROOT>, ROOT> originalPrice() {
     MoneyV2Projection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalPrice", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> originalPriceSet() {
     MoneyBagProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> requestedFulfillmentService(
      ) {
     FulfillmentServiceProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("requestedFulfillmentService", projection);
     return projection;
  }

  public TaxLineProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<ShippingLineProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public ShippingLineProjection<PARENT, ROOT> carrierIdentifier() {
    getFields().put("carrierIdentifier", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> custom() {
    getFields().put("custom", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> deliveryCategory() {
    getFields().put("deliveryCategory", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> isRemoved() {
    getFields().put("isRemoved", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> shippingRateHandle() {
    getFields().put("shippingRateHandle", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public ShippingLineProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
