package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentCancelPayload"));
  }

  public FulfillmentCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<FulfillmentCancelProjectionRoot<PARENT, ROOT>, FulfillmentCancelProjectionRoot<PARENT, ROOT>> fulfillment(
      ) {
    FulfillmentProjection<FulfillmentCancelProjectionRoot<PARENT, ROOT>, FulfillmentCancelProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillment", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentCancelProjectionRoot<PARENT, ROOT>, FulfillmentCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentCancelProjectionRoot<PARENT, ROOT>, FulfillmentCancelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
