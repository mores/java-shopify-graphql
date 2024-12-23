package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PrivateMetafieldDeletePayload"));
  }

  public PrivateMetafieldDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<PrivateMetafieldDeleteProjectionRoot<PARENT, ROOT>, PrivateMetafieldDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PrivateMetafieldDeleteProjectionRoot<PARENT, ROOT>, PrivateMetafieldDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PrivateMetafieldDeleteProjectionRoot<PARENT, ROOT> deletedPrivateMetafieldId() {
    getFields().put("deletedPrivateMetafieldId", null);
    return this;
  }
}
