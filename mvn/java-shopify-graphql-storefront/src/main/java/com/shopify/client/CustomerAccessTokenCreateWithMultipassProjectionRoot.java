package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccessTokenCreateWithMultipassProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAccessTokenCreateWithMultipassPayload"));
  }

  public CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccessTokenProjection<CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateWithMultipassProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }
}
