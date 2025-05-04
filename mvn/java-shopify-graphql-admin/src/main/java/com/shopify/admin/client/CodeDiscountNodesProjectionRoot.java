package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CodeDiscountNodesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CodeDiscountNodesProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountCodeNodeConnection"));
  }

  public CodeDiscountNodesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeNodeEdgeProjection<CodeDiscountNodesProjectionRoot<PARENT, ROOT>, CodeDiscountNodesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DiscountCodeNodeEdgeProjection<CodeDiscountNodesProjectionRoot<PARENT, ROOT>, CodeDiscountNodesProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DiscountCodeNodeProjection<CodeDiscountNodesProjectionRoot<PARENT, ROOT>, CodeDiscountNodesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DiscountCodeNodeProjection<CodeDiscountNodesProjectionRoot<PARENT, ROOT>, CodeDiscountNodesProjectionRoot<PARENT, ROOT>> projection = new DiscountCodeNodeProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CodeDiscountNodesProjectionRoot<PARENT, ROOT>, CodeDiscountNodesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CodeDiscountNodesProjectionRoot<PARENT, ROOT>, CodeDiscountNodesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
