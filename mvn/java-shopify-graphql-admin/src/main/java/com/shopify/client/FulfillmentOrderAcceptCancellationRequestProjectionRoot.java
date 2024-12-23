package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderAcceptCancellationRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderAcceptCancellationRequestPayload"));
  }

  public FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderAcceptCancellationRequestProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
