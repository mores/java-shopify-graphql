package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAddressCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAddressCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAddressCreatePayload"));
  }

  public CustomerAddressCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> address(
      ) {
    MailingAddressProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("address", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
