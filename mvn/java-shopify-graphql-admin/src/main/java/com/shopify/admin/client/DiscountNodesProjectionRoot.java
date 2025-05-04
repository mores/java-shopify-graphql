package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountNodesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountNodesProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountNodeConnection"));
  }

  public DiscountNodesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountNodeEdgeProjection<DiscountNodesProjectionRoot<PARENT, ROOT>, DiscountNodesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DiscountNodeEdgeProjection<DiscountNodesProjectionRoot<PARENT, ROOT>, DiscountNodesProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DiscountNodeProjection<DiscountNodesProjectionRoot<PARENT, ROOT>, DiscountNodesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DiscountNodeProjection<DiscountNodesProjectionRoot<PARENT, ROOT>, DiscountNodesProjectionRoot<PARENT, ROOT>> projection = new DiscountNodeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DiscountNodesProjectionRoot<PARENT, ROOT>, DiscountNodesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DiscountNodesProjectionRoot<PARENT, ROOT>, DiscountNodesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
