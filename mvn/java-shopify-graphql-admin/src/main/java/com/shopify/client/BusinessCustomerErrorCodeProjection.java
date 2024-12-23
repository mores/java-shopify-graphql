package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BusinessCustomerErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BusinessCustomerErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BusinessCustomerErrorCode"));
  }

  public BusinessCustomerErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
