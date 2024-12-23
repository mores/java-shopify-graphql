package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryAvailableServiceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryAvailableServiceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryAvailableService"));
  }

  public DeliveryAvailableServiceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCountryCodesOrRestOfWorldProjection<DeliveryAvailableServiceProjection<PARENT, ROOT>, ROOT> countries(
      ) {
     DeliveryCountryCodesOrRestOfWorldProjection<DeliveryAvailableServiceProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCountryCodesOrRestOfWorldProjection<>(this, getRoot());
     getFields().put("countries", projection);
     return projection;
  }

  public DeliveryAvailableServiceProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
