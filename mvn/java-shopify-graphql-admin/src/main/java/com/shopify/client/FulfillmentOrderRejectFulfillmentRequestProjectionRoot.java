package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderRejectFulfillmentRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderRejectFulfillmentRequestPayload"));
  }

  public FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
