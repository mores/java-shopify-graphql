package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderCancelPayload"));
  }

  public FulfillmentOrderCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>, FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>, FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>, FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>> replacementFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>, FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("replacementFulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>, FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>, FulfillmentOrderCancelProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
