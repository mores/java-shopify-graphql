package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerUpdatePayload"));
  }

  public CustomerUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerUpdateProjectionRoot<PARENT, ROOT>, CustomerUpdateProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerUpdateProjectionRoot<PARENT, ROOT>, CustomerUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<CustomerUpdateProjectionRoot<PARENT, ROOT>, CustomerUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerUpdateProjectionRoot<PARENT, ROOT>, CustomerUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
