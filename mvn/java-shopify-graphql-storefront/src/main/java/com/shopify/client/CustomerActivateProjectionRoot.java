package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerActivatePayload"));
  }

  public CustomerActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerAccessTokenProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerActivateProjectionRoot<PARENT, ROOT>, CustomerActivateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
