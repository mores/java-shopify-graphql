package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditDeclineUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditDeclineUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditDeclineUserError"));
  }

  public RequestedOrderEditDeclineUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditDeclineUserErrorCodeProjection<RequestedOrderEditDeclineUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     RequestedOrderEditDeclineUserErrorCodeProjection<RequestedOrderEditDeclineUserErrorProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditDeclineUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public RequestedOrderEditDeclineUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public RequestedOrderEditDeclineUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
