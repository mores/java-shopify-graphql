package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerRequestDataErasureErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerRequestDataErasureErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerRequestDataErasureErrorCode"));
  }

  public CustomerRequestDataErasureErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
