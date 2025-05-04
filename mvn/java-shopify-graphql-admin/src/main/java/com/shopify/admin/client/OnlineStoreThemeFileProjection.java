package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFileProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFileProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFile"));
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileBodyProjection<OnlineStoreThemeFileProjection<PARENT, ROOT>, ROOT> body(
      ) {
     OnlineStoreThemeFileBodyProjection<OnlineStoreThemeFileProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileBodyProjection<>(this, getRoot());
     getFields().put("body", projection);
     return projection;
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> checksumMd5() {
    getFields().put("checksumMd5", null);
    return this;
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> contentType() {
    getFields().put("contentType", null);
    return this;
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> filename() {
    getFields().put("filename", null);
    return this;
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> size() {
    getFields().put("size", null);
    return this;
  }

  public OnlineStoreThemeFileProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
