package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccessTokenRenewProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccessTokenRenewProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAccessTokenRenewPayload"));
  }

  public CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccessTokenProjection<CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>, CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>, CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>, CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>, CustomerAccessTokenRenewProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
