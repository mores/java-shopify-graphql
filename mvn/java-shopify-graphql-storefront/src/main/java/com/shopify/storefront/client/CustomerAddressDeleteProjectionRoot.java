package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAddressDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAddressDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAddressDeletePayload"));
  }

  public CustomerAddressDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerUserErrorProjection<CustomerAddressDeleteProjectionRoot<PARENT, ROOT>, CustomerAddressDeleteProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerAddressDeleteProjectionRoot<PARENT, ROOT>, CustomerAddressDeleteProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAddressDeleteProjectionRoot<PARENT, ROOT>, CustomerAddressDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAddressDeleteProjectionRoot<PARENT, ROOT>, CustomerAddressDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerAddressDeleteProjectionRoot<PARENT, ROOT> deletedCustomerAddressId() {
    getFields().put("deletedCustomerAddressId", null);
    return this;
  }
}
