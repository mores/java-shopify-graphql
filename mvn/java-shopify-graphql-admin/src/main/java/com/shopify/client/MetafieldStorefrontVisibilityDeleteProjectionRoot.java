package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilityDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldStorefrontVisibilityDeletePayload"));
  }

  public MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MetafieldStorefrontVisibilityDeleteProjectionRoot<PARENT, ROOT> deletedMetafieldStorefrontVisibilityId(
      ) {
    getFields().put("deletedMetafieldStorefrontVisibilityId", null);
    return this;
  }
}
