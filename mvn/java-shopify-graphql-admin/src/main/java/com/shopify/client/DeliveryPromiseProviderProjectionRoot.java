package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseProviderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseProviderProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryPromiseProvider"));
  }

  public DeliveryPromiseProviderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<DeliveryPromiseProviderProjectionRoot<PARENT, ROOT>, DeliveryPromiseProviderProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<DeliveryPromiseProviderProjectionRoot<PARENT, ROOT>, DeliveryPromiseProviderProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public DeliveryPromiseProviderProjectionRoot<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryPromiseProviderProjectionRoot<PARENT, ROOT> fulfillmentDelay() {
    getFields().put("fulfillmentDelay", null);
    return this;
  }

  public DeliveryPromiseProviderProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryPromiseProviderProjectionRoot<PARENT, ROOT> timeZone() {
    getFields().put("timeZone", null);
    return this;
  }
}
