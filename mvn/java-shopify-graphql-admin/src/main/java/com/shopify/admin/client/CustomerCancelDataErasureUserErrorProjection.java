package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerCancelDataErasureUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerCancelDataErasureUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerCancelDataErasureUserError"));
  }

  public CustomerCancelDataErasureUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerCancelDataErasureErrorCodeProjection<CustomerCancelDataErasureUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerCancelDataErasureErrorCodeProjection<CustomerCancelDataErasureUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerCancelDataErasureErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerCancelDataErasureUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerCancelDataErasureUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
