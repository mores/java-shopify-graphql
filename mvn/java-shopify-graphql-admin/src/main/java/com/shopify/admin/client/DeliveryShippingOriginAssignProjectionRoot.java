package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryShippingOriginAssignProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryShippingOriginAssignProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryShippingOriginAssignPayload"));
  }

  public DeliveryShippingOriginAssignProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<DeliveryShippingOriginAssignProjectionRoot<PARENT, ROOT>, DeliveryShippingOriginAssignProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DeliveryShippingOriginAssignProjectionRoot<PARENT, ROOT>, DeliveryShippingOriginAssignProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
