package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentServiceCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentServiceCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentServiceCreatePayload"));
  }

  public FulfillmentServiceCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentServiceProjection<FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>, FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>> fulfillmentService(
      ) {
    FulfillmentServiceProjection<FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>, FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentServiceProjection<>(this, this);    
    getFields().put("fulfillmentService", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>, FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>, FulfillmentServiceCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
