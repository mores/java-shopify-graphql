package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccessTokenCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccessTokenCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAccessTokenCreatePayload"));
  }

  public CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccessTokenProjection<CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>, CustomerAccessTokenCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
