package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerDefaultAddressUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerDefaultAddressUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerDefaultAddressUpdatePayload"));
  }

  public CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerDefaultAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
