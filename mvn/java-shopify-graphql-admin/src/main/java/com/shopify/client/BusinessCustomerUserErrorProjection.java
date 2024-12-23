package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BusinessCustomerUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BusinessCustomerUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("BusinessCustomerUserError"));
  }

  public BusinessCustomerUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerErrorCodeProjection<BusinessCustomerUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     BusinessCustomerErrorCodeProjection<BusinessCustomerUserErrorProjection<PARENT, ROOT>, ROOT> projection = new BusinessCustomerErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public BusinessCustomerUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
