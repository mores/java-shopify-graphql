package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentServiceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentServiceProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentService"));
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<FulfillmentServiceProjectionRoot<PARENT, ROOT>, FulfillmentServiceProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<FulfillmentServiceProjectionRoot<PARENT, ROOT>, FulfillmentServiceProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public FulfillmentServiceTypeProjection<FulfillmentServiceProjectionRoot<PARENT, ROOT>, FulfillmentServiceProjectionRoot<PARENT, ROOT>> type(
      ) {
    FulfillmentServiceTypeProjection<FulfillmentServiceProjectionRoot<PARENT, ROOT>, FulfillmentServiceProjectionRoot<PARENT, ROOT>> projection = new FulfillmentServiceTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> fulfillmentOrdersOptIn() {
    getFields().put("fulfillmentOrdersOptIn", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> inventoryManagement() {
    getFields().put("inventoryManagement", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> permitsSkuSharing() {
    getFields().put("permitsSkuSharing", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> serviceName() {
    getFields().put("serviceName", null);
    return this;
  }

  public FulfillmentServiceProjectionRoot<PARENT, ROOT> trackingSupport() {
    getFields().put("trackingSupport", null);
    return this;
  }
}
