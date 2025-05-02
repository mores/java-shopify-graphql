package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAddressCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAddressCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAddressCreatePayload"));
  }

  public CustomerAddressCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> customerAddress(
      ) {
    MailingAddressProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("customerAddress", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAddressCreateProjectionRoot<PARENT, ROOT>, CustomerAddressCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
