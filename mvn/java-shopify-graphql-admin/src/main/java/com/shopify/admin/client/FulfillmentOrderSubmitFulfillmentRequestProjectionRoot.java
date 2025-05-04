package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderSubmitFulfillmentRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderSubmitFulfillmentRequestPayload"));
  }

  public FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> originalFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("originalFulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> submittedFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("submittedFulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> unsubmittedFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("unsubmittedFulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>, FulfillmentOrderSubmitFulfillmentRequestProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
