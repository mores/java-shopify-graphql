package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RequestedOrderEditCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("RequestedOrderEditCreatePayload"));
  }

  public RequestedOrderEditCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditProjection<RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>> requestedOrderEdit(
      ) {
    RequestedOrderEditProjection<RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditProjection<>(this, this);    
    getFields().put("requestedOrderEdit", projection);
    return projection;
  }

  public RequestedOrderEditCreateUserErrorProjection<RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    RequestedOrderEditCreateUserErrorProjection<RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>, RequestedOrderEditCreateProjectionRoot<PARENT, ROOT>> projection = new RequestedOrderEditCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
