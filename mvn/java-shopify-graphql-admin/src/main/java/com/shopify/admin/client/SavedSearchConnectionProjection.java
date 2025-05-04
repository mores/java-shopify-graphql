package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SavedSearchConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SavedSearchConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SavedSearchConnection"));
  }

  public SavedSearchConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SavedSearchEdgeProjection<SavedSearchConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     SavedSearchEdgeProjection<SavedSearchConnectionProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SavedSearchProjection<SavedSearchConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SavedSearchProjection<SavedSearchConnectionProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SavedSearchConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SavedSearchConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
