package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMergeUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMergeUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderMergeUserError"));
  }

  public FulfillmentOrderMergeUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderMergeUserErrorCodeProjection<FulfillmentOrderMergeUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderMergeUserErrorCodeProjection<FulfillmentOrderMergeUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMergeUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderMergeUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderMergeUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
