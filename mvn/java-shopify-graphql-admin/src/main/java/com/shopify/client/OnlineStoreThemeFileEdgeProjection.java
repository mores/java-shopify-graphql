package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeFileEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeFileEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeFileEdge"));
  }

  public OnlineStoreThemeFileEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeFileProjection<OnlineStoreThemeFileEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     OnlineStoreThemeFileProjection<OnlineStoreThemeFileEdgeProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeFileProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OnlineStoreThemeFileEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
