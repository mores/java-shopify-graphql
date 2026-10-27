package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditResolveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditResolveProjectionRoot() {
    super(null, null, java.util.Optional.of("RequestedOrderEditResolvePayload"));
  }

  public RequestedOrderEditResolveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditProjection<RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>, RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>> requestedOrderEdit(
      ) {
    RequestedOrderEditProjection<RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>, RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditProjection<>(this, this);    
    getFields().put("requestedOrderEdit", projection);
    return projection;
  }

  public RequestedOrderEditResolveUserErrorProjection<RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>, RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    RequestedOrderEditResolveUserErrorProjection<RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>, RequestedOrderEditResolveProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditResolveUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
