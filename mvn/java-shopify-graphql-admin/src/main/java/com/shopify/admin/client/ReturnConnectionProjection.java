package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnConnection"));
  }

  public ReturnConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnEdgeProjection<ReturnConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ReturnEdgeProjection<ReturnConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnProjection<ReturnConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ReturnProjection<ReturnConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ReturnConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
