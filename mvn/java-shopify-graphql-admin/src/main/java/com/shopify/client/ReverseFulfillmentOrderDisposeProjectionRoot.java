package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderDisposeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderDisposeProjectionRoot() {
    super(null, null, java.util.Optional.of("ReverseFulfillmentOrderDisposePayload"));
  }

  public ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemProjection<ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>> reverseFulfillmentOrderLineItems(
      ) {
    ReverseFulfillmentOrderLineItemProjection<ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderLineItemProjection<>(this, this);    
    getFields().put("reverseFulfillmentOrderLineItems", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderDisposeProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
