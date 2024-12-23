package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFileConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFileConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFileConnection"));
  }

  public OnlineStoreThemeFileConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileEdgeProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OnlineStoreThemeFileEdgeProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OnlineStoreThemeFileProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     OnlineStoreThemeFileProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }

  public OnlineStoreThemeFileReadResultProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> userErrors(
      ) {
     OnlineStoreThemeFileReadResultProjection<OnlineStoreThemeFileConnectionProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileReadResultProjection<>(this, getRoot());
     getFields().put("userErrors", projection);
     return projection;
  }
}
