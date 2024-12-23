package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SavedSearchEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SavedSearchEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SavedSearchEdge"));
  }

  public SavedSearchEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchProjection<SavedSearchEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SavedSearchProjection<SavedSearchEdgeProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SavedSearchEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
