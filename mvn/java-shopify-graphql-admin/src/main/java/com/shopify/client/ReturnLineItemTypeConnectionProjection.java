package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemTypeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemTypeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItemTypeConnection"));
  }

  public ReturnLineItemTypeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnLineItemTypeEdgeProjection<ReturnLineItemTypeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReturnLineItemTypeEdgeProjection<ReturnLineItemTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnLineItemTypeProjection<ReturnLineItemTypeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReturnLineItemTypeProjection<ReturnLineItemTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnLineItemTypeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ReturnLineItemTypeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
