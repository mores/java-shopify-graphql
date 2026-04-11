package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersRerouteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersRerouteProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrdersReroutePayload"));
  }

  public FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>, FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>> movedFulfillmentOrders(
      ) {
    FulfillmentOrderProjection<FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>, FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("movedFulfillmentOrders", projection);
    return projection;
  }

  public FulfillmentOrdersRerouteUserErrorProjection<FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>, FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrdersRerouteUserErrorProjection<FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>, FulfillmentOrdersRerouteProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrdersRerouteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
