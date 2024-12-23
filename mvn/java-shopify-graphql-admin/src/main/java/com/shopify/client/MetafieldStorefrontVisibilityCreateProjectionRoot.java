package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilityCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldStorefrontVisibilityCreatePayload"));
  }

  public MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>> metafieldStorefrontVisibility(
      ) {
    MetafieldStorefrontVisibilityProjection<MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>> projection = new MetafieldStorefrontVisibilityProjection<>(this, this);    
    getFields().put("metafieldStorefrontVisibility", projection);
    return projection;
  }

  public UserErrorProjection<MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
