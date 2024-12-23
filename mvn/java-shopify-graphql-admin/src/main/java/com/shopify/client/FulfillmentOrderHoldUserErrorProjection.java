package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderHoldUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderHoldUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderHoldUserError"));
  }

  public FulfillmentOrderHoldUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderHoldUserErrorCodeProjection<FulfillmentOrderHoldUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderHoldUserErrorCodeProjection<FulfillmentOrderHoldUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderHoldUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderHoldUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderHoldUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
