package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentEventCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentEventCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentEventCreatePayload"));
  }

  public FulfillmentEventCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentEventProjection<FulfillmentEventCreateProjectionRoot<PARENT, ROOT>, FulfillmentEventCreateProjectionRoot<PARENT, ROOT>> fulfillmentEvent(
      ) {
    FulfillmentEventProjection<FulfillmentEventCreateProjectionRoot<PARENT, ROOT>, FulfillmentEventCreateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentEventProjection<>(this, this);    
    getFields().put("fulfillmentEvent", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentEventCreateProjectionRoot<PARENT, ROOT>, FulfillmentEventCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentEventCreateProjectionRoot<PARENT, ROOT>, FulfillmentEventCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
