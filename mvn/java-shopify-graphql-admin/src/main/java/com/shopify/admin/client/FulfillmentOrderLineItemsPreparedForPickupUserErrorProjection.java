package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItemsPreparedForPickupUserError"));
  }

  public FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemsPreparedForPickupUserErrorCodeProjection<FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderLineItemsPreparedForPickupUserErrorCodeProjection<FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemsPreparedForPickupUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
