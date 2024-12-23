package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderReleaseHoldUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderReleaseHoldUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderReleaseHoldUserError"));
  }

  public FulfillmentOrderReleaseHoldUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderReleaseHoldUserErrorCodeProjection<FulfillmentOrderReleaseHoldUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderReleaseHoldUserErrorCodeProjection<FulfillmentOrderReleaseHoldUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderReleaseHoldUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderReleaseHoldUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderReleaseHoldUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
