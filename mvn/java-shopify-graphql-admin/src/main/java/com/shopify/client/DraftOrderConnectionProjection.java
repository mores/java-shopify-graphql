package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderConnection"));
  }

  public DraftOrderConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderEdgeProjection<DraftOrderConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     DraftOrderEdgeProjection<DraftOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DraftOrderProjection<DraftOrderConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     DraftOrderProjection<DraftOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DraftOrderConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DraftOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
