package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreThemeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreThemeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStoreThemeEdge"));
  }

  public OnlineStoreThemeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStoreThemeProjection<OnlineStoreThemeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     OnlineStoreThemeProjection<OnlineStoreThemeEdgeProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OnlineStoreThemeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
