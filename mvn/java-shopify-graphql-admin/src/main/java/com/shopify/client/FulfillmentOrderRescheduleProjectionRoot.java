package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderRescheduleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderRescheduleProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderReschedulePayload"));
  }

  public FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>, FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>, FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderRescheduleUserErrorProjection<FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>, FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderRescheduleUserErrorProjection<FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>, FulfillmentOrderRescheduleProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderRescheduleUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
