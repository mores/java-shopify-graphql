package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrdersSetFulfillmentDeadlinePayload"));
  }

  public FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT, ROOT>, FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT, ROOT>, FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public FulfillmentOrdersSetFulfillmentDeadlineProjectionRoot<PARENT, ROOT> success() {
    getFields().put("success", null);
    return this;
  }
}
