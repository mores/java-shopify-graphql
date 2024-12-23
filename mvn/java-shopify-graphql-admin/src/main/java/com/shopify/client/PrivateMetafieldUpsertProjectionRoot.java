package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PrivateMetafieldUpsertProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PrivateMetafieldUpsertProjectionRoot() {
    super(null, null, java.util.Optional.of("PrivateMetafieldUpsertPayload"));
  }

  public PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PrivateMetafieldProjection<PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>, PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>, PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public UserErrorProjection<PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>, PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>, PrivateMetafieldUpsertProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
