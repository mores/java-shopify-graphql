package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderPaymentStatusResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderPaymentStatusResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderPaymentStatusResult"));
  }

  public OrderPaymentStatusResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
