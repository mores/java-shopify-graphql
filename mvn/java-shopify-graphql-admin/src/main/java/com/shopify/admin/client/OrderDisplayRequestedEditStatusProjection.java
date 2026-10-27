package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderDisplayRequestedEditStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderDisplayRequestedEditStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderDisplayRequestedEditStatus"));
  }

  public OrderDisplayRequestedEditStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
