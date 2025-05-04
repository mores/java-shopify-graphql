package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAddressDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAddressDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAddressDeletePayload"));
  }

  public CustomerAddressDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<CustomerAddressDeleteProjectionRoot<PARENT, ROOT>, CustomerAddressDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAddressDeleteProjectionRoot<PARENT, ROOT>, CustomerAddressDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerAddressDeleteProjectionRoot<PARENT, ROOT> deletedAddressId() {
    getFields().put("deletedAddressId", null);
    return this;
  }
}
