package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderSubmitCancellationRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderSubmitCancellationRequestPayload"));
  }

  public FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitCancellationRequestProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
