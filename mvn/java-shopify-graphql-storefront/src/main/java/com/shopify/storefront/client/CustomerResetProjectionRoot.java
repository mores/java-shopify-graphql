package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerResetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerResetProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerResetPayload"));
  }

  public CustomerResetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerAccessTokenProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerResetProjectionRoot<PARENT, ROOT>, CustomerResetProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
