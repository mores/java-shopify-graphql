package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentServiceUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentServiceUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentServiceUpdatePayload"));
  }

  public FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentServiceProjection<FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>, FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>> fulfillmentService(
      ) {
    FulfillmentServiceProjection<FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>, FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentServiceProjection<>(this, this);    
    getFields().put("fulfillmentService", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>, FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>, FulfillmentServiceUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
