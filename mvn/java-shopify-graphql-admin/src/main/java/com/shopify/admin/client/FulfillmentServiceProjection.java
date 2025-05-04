package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentServiceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentServiceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentService"));
  }

  public FulfillmentServiceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<FulfillmentServiceProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<FulfillmentServiceProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public FulfillmentServiceTypeProjection<FulfillmentServiceProjection<PARENT, ROOT>, ROOT> type() {
     FulfillmentServiceTypeProjection<FulfillmentServiceProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> callbackUrl() {
    getFields().put("callbackUrl", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> fulfillmentOrdersOptIn() {
    getFields().put("fulfillmentOrdersOptIn", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> inventoryManagement() {
    getFields().put("inventoryManagement", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> permitsSkuSharing() {
    getFields().put("permitsSkuSharing", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> requiresShippingMethod() {
    getFields().put("requiresShippingMethod", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> serviceName() {
    getFields().put("serviceName", null);
    return this;
  }

  public FulfillmentServiceProjection<PARENT, ROOT> trackingSupport() {
    getFields().put("trackingSupport", null);
    return this;
  }
}
