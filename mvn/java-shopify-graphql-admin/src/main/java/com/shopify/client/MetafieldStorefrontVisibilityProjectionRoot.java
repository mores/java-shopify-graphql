package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilityProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilityProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldStorefrontVisibility"));
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT>> ownerType(
      ) {
    MetafieldOwnerTypeProjection<MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT>, MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT>> projection = new MetafieldOwnerTypeProjection<>(this, this);    
    getFields().put("ownerType", projection);
    return projection;
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
