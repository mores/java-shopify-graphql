package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldStorefrontVisibilityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldStorefrontVisibilityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldStorefrontVisibility"));
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldOwnerTypeProjection<MetafieldStorefrontVisibilityProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<MetafieldStorefrontVisibilityProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldStorefrontVisibilityProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
