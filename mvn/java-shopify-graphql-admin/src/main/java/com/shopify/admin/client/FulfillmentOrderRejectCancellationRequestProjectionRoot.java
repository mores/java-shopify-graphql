package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderRejectCancellationRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderRejectCancellationRequestPayload"));
  }

  public FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderRejectCancellationRequestProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
