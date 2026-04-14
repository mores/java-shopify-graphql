package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderCancelErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderCancelErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderCancelError"));
  }

  public FulfillmentOrderCancelErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderCancelErrorCodeProjection<FulfillmentOrderCancelErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderCancelErrorCodeProjection<FulfillmentOrderCancelErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderCancelErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderCancelErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderCancelErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
