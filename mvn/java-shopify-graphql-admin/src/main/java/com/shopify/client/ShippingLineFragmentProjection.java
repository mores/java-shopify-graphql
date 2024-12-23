package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShippingLineFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShippingLineFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLine"));
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> currentDiscountedPriceSet(
      ) {
     MoneyBagProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("currentDiscountedPriceSet", projection);
     return projection;
  }

  public DiscountAllocationProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> discountAllocations(
      ) {
     DiscountAllocationProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountAllocationProjection<>(this, getRoot());
     getFields().put("discountAllocations", projection);
     return projection;
  }

  public MoneyV2Projection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> discountedPrice() {
     MoneyV2Projection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("discountedPrice", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> discountedPriceSet(
      ) {
     MoneyBagProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedPriceSet", projection);
     return projection;
  }

  public MoneyV2Projection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> originalPrice() {
     MoneyV2Projection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalPrice", projection);
     return projection;
  }

  public MoneyBagProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> originalPriceSet() {
     MoneyBagProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalPriceSet", projection);
     return projection;
  }

  public FulfillmentServiceProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> requestedFulfillmentService(
      ) {
     FulfillmentServiceProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("requestedFulfillmentService", projection);
     return projection;
  }

  public TaxLineProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<ShippingLineFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> carrierIdentifier() {
    getFields().put("carrierIdentifier", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> custom() {
    getFields().put("custom", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> deliveryCategory() {
    getFields().put("deliveryCategory", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> isRemoved() {
    getFields().put("isRemoved", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> shippingRateHandle() {
    getFields().put("shippingRateHandle", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public ShippingLineFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShippingLine {");
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
