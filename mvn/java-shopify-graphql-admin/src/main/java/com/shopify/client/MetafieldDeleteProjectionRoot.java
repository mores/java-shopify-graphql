package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDeletePayload"));
  }

  public MetafieldDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<MetafieldDeleteProjectionRoot<PARENT, ROOT>, MetafieldDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<MetafieldDeleteProjectionRoot<PARENT, ROOT>, MetafieldDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MetafieldDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
