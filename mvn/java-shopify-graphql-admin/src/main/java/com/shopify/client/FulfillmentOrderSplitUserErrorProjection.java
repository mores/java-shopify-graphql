package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderSplitUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderSplitUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderSplitUserError"));
  }

  public FulfillmentOrderSplitUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderSplitUserErrorCodeProjection<FulfillmentOrderSplitUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderSplitUserErrorCodeProjection<FulfillmentOrderSplitUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderSplitUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderSplitUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderSplitUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
