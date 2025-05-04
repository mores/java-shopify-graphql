package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemsPreparedForPickupUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemsPreparedForPickupUserErrorCodeProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItemsPreparedForPickupUserErrorCode"));
  }

  public FulfillmentOrderLineItemsPreparedForPickupUserErrorCodeProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
