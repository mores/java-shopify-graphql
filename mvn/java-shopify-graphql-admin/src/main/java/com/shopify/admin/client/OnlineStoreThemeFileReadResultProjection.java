package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFileReadResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFileReadResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFileReadResult"));
  }

  public OnlineStoreThemeFileReadResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileResultTypeProjection<OnlineStoreThemeFileReadResultProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OnlineStoreThemeFileResultTypeProjection<OnlineStoreThemeFileReadResultProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileResultTypeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OnlineStoreThemeFileReadResultProjection<PARENT, ROOT> filename() {
    getFields().put("filename", null);
    return this;
  }
}
