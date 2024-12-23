package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundLineItem"));
  }

  public RefundLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public LocationProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyBagProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> priceSet() {
     MoneyBagProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("priceSet", projection);
     return projection;
  }

  public RefundLineItemRestockTypeProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> restockType(
      ) {
     RefundLineItemRestockTypeProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemRestockTypeProjection<>(this, getRoot());
     getFields().put("restockType", projection);
     return projection;
  }

  public MoneyBagProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> subtotalSet() {
     MoneyBagProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalSet", projection);
     return projection;
  }

  public MoneyBagProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<RefundLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public RefundLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RefundLineItemProjection<PARENT, ROOT> price() {
    getFields().put("price", null);
    return this;
  }

  public RefundLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public RefundLineItemProjection<PARENT, ROOT> restocked() {
    getFields().put("restocked", null);
    return this;
  }

  public RefundLineItemProjection<PARENT, ROOT> subtotal() {
    getFields().put("subtotal", null);
    return this;
  }

  public RefundLineItemProjection<PARENT, ROOT> totalTax() {
    getFields().put("totalTax", null);
    return this;
  }
}
