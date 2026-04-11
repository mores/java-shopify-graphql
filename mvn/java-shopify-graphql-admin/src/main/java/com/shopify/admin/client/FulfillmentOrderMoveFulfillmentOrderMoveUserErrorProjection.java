package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMoveFulfillmentOrderMoveUserError"));
  }

  public FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderMoveFulfillmentOrderMoveUserErrorCodeProjection<FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderMoveFulfillmentOrderMoveUserErrorCodeProjection<FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMoveFulfillmentOrderMoveUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderMoveFulfillmentOrderMoveUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
