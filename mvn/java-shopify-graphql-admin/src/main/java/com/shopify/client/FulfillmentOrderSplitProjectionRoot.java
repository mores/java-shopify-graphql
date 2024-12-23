package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderSplitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderSplitProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderSplitPayload"));
  }

  public FulfillmentOrderSplitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderSplitResultProjection<FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>, FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>> fulfillmentOrderSplits(
      ) {
    FulfillmentOrderSplitResultProjection<FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>, FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderSplitResultProjection<>(this, this);    
    getFields().put("fulfillmentOrderSplits", projection);
    return projection;
  }

  public FulfillmentOrderSplitUserErrorProjection<FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>, FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderSplitUserErrorProjection<FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>, FulfillmentOrderSplitProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderSplitUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
