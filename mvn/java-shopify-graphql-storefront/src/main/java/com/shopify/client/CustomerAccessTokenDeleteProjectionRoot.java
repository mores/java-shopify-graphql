package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccessTokenDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccessTokenDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAccessTokenDeletePayload"));
  }

  public CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT>, CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT>, CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT> deletedAccessToken() {
    getFields().put("deletedAccessToken", null);
    return this;
  }

  public CustomerAccessTokenDeleteProjectionRoot<PARENT, ROOT> deletedCustomerAccessTokenId() {
    getFields().put("deletedCustomerAccessTokenId", null);
    return this;
  }
}
