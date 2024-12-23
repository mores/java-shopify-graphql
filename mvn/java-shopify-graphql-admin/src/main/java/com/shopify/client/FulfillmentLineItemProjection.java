package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentLineItem"));
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> discountedTotalSet(
      ) {
     MoneyBagProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("discountedTotalSet", projection);
     return projection;
  }

  public LineItemProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public MoneyBagProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> originalTotalSet() {
     MoneyBagProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("originalTotalSet", projection);
     return projection;
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> discountedTotal() {
    getFields().put("discountedTotal", null);
    return this;
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> originalTotal() {
    getFields().put("originalTotal", null);
    return this;
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
