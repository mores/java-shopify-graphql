package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderRescheduleUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderRescheduleUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderRescheduleUserError"));
  }

  public FulfillmentOrderRescheduleUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderRescheduleUserErrorCodeProjection<FulfillmentOrderRescheduleUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderRescheduleUserErrorCodeProjection<FulfillmentOrderRescheduleUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderRescheduleUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderRescheduleUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderRescheduleUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
