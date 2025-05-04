package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerUpdateDefaultAddressProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerUpdateDefaultAddressProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerUpdateDefaultAddressPayload"));
  }

  public CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>, CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>, CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>, CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>, CustomerUpdateDefaultAddressProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
