package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AutomaticDiscountNodesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AutomaticDiscountNodesProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomaticNodeConnection"));
  }

  public AutomaticDiscountNodesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticNodeEdgeProjection<AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>, AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DiscountAutomaticNodeEdgeProjection<AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>, AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DiscountAutomaticNodeProjection<AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>, AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DiscountAutomaticNodeProjection<AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>, AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>> projection = new DiscountAutomaticNodeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>, AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>, AutomaticDiscountNodesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
