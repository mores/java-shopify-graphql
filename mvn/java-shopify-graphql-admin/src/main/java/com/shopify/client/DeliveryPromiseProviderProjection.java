package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseProviderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseProviderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseProvider"));
  }

  public DeliveryPromiseProviderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<DeliveryPromiseProviderProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<DeliveryPromiseProviderProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public DeliveryPromiseProviderProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryPromiseProviderProjection<PARENT, ROOT> fulfillmentDelay() {
    getFields().put("fulfillmentDelay", null);
    return this;
  }

  public DeliveryPromiseProviderProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryPromiseProviderProjection<PARENT, ROOT> timeZone() {
    getFields().put("timeZone", null);
    return this;
  }
}
