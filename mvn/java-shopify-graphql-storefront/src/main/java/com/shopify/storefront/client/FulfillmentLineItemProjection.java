package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentLineItem"));
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderLineItemProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> lineItem() {
     OrderLineItemProjection<FulfillmentLineItemProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public FulfillmentLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
