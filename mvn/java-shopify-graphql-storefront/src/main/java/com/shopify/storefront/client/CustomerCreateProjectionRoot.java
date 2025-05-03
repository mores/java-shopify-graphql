package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerCreatePayload"));
  }

  public CustomerCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerCreateProjectionRoot<PARENT, ROOT>, CustomerCreateProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerCreateProjectionRoot<PARENT, ROOT>, CustomerCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerCreateProjectionRoot<PARENT, ROOT>, CustomerCreateProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerCreateProjectionRoot<PARENT, ROOT>, CustomerCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerCreateProjectionRoot<PARENT, ROOT>, CustomerCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerCreateProjectionRoot<PARENT, ROOT>, CustomerCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
