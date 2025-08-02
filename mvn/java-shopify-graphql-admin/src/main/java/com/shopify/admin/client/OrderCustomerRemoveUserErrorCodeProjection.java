package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCustomerRemoveUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCustomerRemoveUserErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCustomerRemoveUserErrorCode"));
  }

  public OrderCustomerRemoveUserErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
