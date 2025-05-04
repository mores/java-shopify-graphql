package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseProviderUpsertUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseProviderUpsertUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseProviderUpsertUserError"));
  }

  public DeliveryPromiseProviderUpsertUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseProviderUpsertUserErrorCodeProjection<DeliveryPromiseProviderUpsertUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     DeliveryPromiseProviderUpsertUserErrorCodeProjection<DeliveryPromiseProviderUpsertUserErrorProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseProviderUpsertUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public DeliveryPromiseProviderUpsertUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DeliveryPromiseProviderUpsertUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
