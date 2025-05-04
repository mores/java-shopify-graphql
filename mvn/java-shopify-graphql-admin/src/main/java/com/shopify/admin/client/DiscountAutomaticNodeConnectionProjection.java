package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticNodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticNodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticNodeConnection"));
  }

  public DiscountAutomaticNodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeEdgeProjection<DiscountAutomaticNodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DiscountAutomaticNodeEdgeProjection<DiscountAutomaticNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DiscountAutomaticNodeProjection<DiscountAutomaticNodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DiscountAutomaticNodeProjection<DiscountAutomaticNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DiscountAutomaticNodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DiscountAutomaticNodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
