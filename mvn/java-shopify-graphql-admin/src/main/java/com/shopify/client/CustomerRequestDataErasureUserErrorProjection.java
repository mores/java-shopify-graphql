package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerRequestDataErasureUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerRequestDataErasureUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerRequestDataErasureUserError"));
  }

  public CustomerRequestDataErasureUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerRequestDataErasureErrorCodeProjection<CustomerRequestDataErasureUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerRequestDataErasureErrorCodeProjection<CustomerRequestDataErasureUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerRequestDataErasureErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerRequestDataErasureUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerRequestDataErasureUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
