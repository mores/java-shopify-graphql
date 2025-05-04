package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseProviderUpsertProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseProviderUpsertProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryPromiseProviderUpsertPayload"));
  }

  public DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseProviderProjection<DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>, DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>> deliveryPromiseProvider(
      ) {
    DeliveryPromiseProviderProjection<DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>, DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>> projection = new DeliveryPromiseProviderProjection<>(this, this);    
    getFields().put("deliveryPromiseProvider", projection);
    return projection;
  }

  public DeliveryPromiseProviderUpsertUserErrorProjection<DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>, DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryPromiseProviderUpsertUserErrorProjection<DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>, DeliveryPromiseProviderUpsertProjectionRoot<PARENT, ROOT>> projection = new DeliveryPromiseProviderUpsertUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
