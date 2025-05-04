package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemTypeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemTypeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnLineItemTypeEdge"));
  }

  public ReturnLineItemTypeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnLineItemTypeProjection<ReturnLineItemTypeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ReturnLineItemTypeProjection<ReturnLineItemTypeEdgeProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ReturnLineItemTypeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
