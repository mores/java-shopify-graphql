package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderHoldProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderHoldProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderHoldPayload"));
  }

  public FulfillmentOrderHoldProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentHoldProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> fulfillmentHold(
      ) {
    FulfillmentHoldProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> projection = new FulfillmentHoldProjection<>(this, this);    
    getFields().put("fulfillmentHold", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> remainingFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("remainingFulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderHoldUserErrorProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderHoldUserErrorProjection<FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>, FulfillmentOrderHoldProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderHoldUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
