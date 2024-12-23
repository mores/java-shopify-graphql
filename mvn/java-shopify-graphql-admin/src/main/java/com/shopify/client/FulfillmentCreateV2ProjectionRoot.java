package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentCreateV2ProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentCreateV2ProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentCreateV2Payload"));
  }

  public FulfillmentCreateV2ProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>, FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>> fulfillment(
      ) {
    FulfillmentProjection<FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>, FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillment", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>, FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>, FulfillmentCreateV2ProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
