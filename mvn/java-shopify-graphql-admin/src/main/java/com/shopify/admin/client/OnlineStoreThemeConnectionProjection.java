package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeConnection"));
  }

  public OnlineStoreThemeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeEdgeProjection<OnlineStoreThemeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OnlineStoreThemeEdgeProjection<OnlineStoreThemeConnectionProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OnlineStoreThemeProjection<OnlineStoreThemeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     OnlineStoreThemeProjection<OnlineStoreThemeConnectionProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OnlineStoreThemeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<OnlineStoreThemeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
