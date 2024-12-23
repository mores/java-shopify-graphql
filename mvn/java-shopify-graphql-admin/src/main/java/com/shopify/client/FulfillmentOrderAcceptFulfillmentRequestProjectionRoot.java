package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderAcceptFulfillmentRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderAcceptFulfillmentRequestPayload"));
  }

  public FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
