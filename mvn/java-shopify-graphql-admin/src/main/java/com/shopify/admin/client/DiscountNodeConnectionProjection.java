package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountNodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountNodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountNodeConnection"));
  }

  public DiscountNodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountNodeEdgeProjection<DiscountNodeConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     DiscountNodeEdgeProjection<DiscountNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountNodeProjection<DiscountNodeConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     DiscountNodeProjection<DiscountNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountNodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DiscountNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
