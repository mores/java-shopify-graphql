package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentTrackingInfoUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentTrackingInfoUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentTrackingInfoUpdatePayload"));
  }

  public FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>> fulfillment(
      ) {
    FulfillmentProjection<FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillment", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
