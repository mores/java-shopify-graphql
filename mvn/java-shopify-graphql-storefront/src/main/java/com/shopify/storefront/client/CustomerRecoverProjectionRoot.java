package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerRecoverProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerRecoverProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerRecoverPayload"));
  }

  public CustomerRecoverProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerUserErrorProjection<CustomerRecoverProjectionRoot<PARENT, ROOT>, CustomerRecoverProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerRecoverProjectionRoot<PARENT, ROOT>, CustomerRecoverProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerRecoverProjectionRoot<PARENT, ROOT>, CustomerRecoverProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerRecoverProjectionRoot<PARENT, ROOT>, CustomerRecoverProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
