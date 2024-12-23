package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeNodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeNodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCodeNodeConnection"));
  }

  public DiscountCodeNodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeEdgeProjection<DiscountCodeNodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountCodeNodeEdgeProjection<DiscountCodeNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountCodeNodeProjection<DiscountCodeNodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountCodeNodeProjection<DiscountCodeNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountCodeNodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DiscountCodeNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
