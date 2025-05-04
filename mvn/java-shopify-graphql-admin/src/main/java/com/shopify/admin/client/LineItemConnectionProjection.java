package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LineItemConnection"));
  }

  public LineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LineItemEdgeProjection<LineItemConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     LineItemEdgeProjection<LineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new LineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public LineItemProjection<LineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     LineItemProjection<LineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<LineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<LineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
