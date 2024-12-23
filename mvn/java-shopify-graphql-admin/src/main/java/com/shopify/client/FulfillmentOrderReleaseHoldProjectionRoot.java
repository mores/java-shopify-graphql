package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderReleaseHoldProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderReleaseHoldProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderReleaseHoldPayload"));
  }

  public FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderReleaseHoldUserErrorProjection<FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderReleaseHoldUserErrorProjection<FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderReleaseHoldProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderReleaseHoldUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
