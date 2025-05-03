package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerResetByUrlProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerResetByUrlProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerResetByUrlPayload"));
  }

  public CustomerResetByUrlProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerAccessTokenProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerResetByUrlProjectionRoot<PARENT, ROOT>, CustomerResetByUrlProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
