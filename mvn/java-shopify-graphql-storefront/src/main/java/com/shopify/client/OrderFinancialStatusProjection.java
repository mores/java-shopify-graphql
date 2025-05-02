package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderFinancialStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderFinancialStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderFinancialStatus"));
  }

  public OrderFinancialStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
