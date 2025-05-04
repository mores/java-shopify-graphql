package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentTrackingInfoUpdateV2ProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentTrackingInfoUpdateV2Payload"));
  }

  public FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>> fulfillment(
      ) {
    FulfillmentProjection<FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillment", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>, FulfillmentTrackingInfoUpdateV2ProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
