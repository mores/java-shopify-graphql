package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderDisplayFinancialStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderDisplayFinancialStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderDisplayFinancialStatus"));
  }

  public OrderDisplayFinancialStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
