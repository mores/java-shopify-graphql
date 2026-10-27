package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditDeclineProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditDeclineProjectionRoot() {
    super(null, null, java.util.Optional.of("RequestedOrderEditDeclinePayload"));
  }

  public RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditProjection<RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>, RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>> requestedOrderEdit(
      ) {
    RequestedOrderEditProjection<RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>, RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditProjection<>(this, this);    
    getFields().put("requestedOrderEdit", projection);
    return projection;
  }

  public RequestedOrderEditDeclineUserErrorProjection<RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>, RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    RequestedOrderEditDeclineUserErrorProjection<RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>, RequestedOrderEditDeclineProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditDeclineUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
