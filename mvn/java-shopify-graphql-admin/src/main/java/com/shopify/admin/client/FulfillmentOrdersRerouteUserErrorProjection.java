package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersRerouteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersRerouteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrdersRerouteUserError"));
  }

  public FulfillmentOrdersRerouteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrdersRerouteUserErrorCodeProjection<FulfillmentOrdersRerouteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrdersRerouteUserErrorCodeProjection<FulfillmentOrdersRerouteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrdersRerouteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrdersRerouteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrdersRerouteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
