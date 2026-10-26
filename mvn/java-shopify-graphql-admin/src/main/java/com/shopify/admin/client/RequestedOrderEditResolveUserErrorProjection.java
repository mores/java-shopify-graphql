package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditResolveUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditResolveUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditResolveUserError"));
  }

  public RequestedOrderEditResolveUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditResolveUserErrorCodeProjection<RequestedOrderEditResolveUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     RequestedOrderEditResolveUserErrorCodeProjection<RequestedOrderEditResolveUserErrorProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditResolveUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public RequestedOrderEditResolveUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public RequestedOrderEditResolveUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
