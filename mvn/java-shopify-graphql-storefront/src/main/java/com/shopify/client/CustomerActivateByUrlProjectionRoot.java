package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerActivateByUrlProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerActivateByUrlProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerActivateByUrlPayload"));
  }

  public CustomerActivateByUrlProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerActivateByUrlProjectionRoot<PARENT, ROOT>, CustomerActivateByUrlProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerActivateByUrlProjectionRoot<PARENT, ROOT>, CustomerActivateByUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerAccessTokenProjection<CustomerActivateByUrlProjectionRoot<PARENT, ROOT>, CustomerActivateByUrlProjectionRoot<PARENT, ROOT>> customerAccessToken(
      ) {
    CustomerAccessTokenProjection<CustomerActivateByUrlProjectionRoot<PARENT, ROOT>, CustomerActivateByUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerAccessTokenProjection<>(this, this);    
    getFields().put("customerAccessToken", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerActivateByUrlProjectionRoot<PARENT, ROOT>, CustomerActivateByUrlProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerActivateByUrlProjectionRoot<PARENT, ROOT>, CustomerActivateByUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }
}
