package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAddressUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAddressUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAddressUpdatePayload"));
  }

  public CustomerAddressUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerAddressUpdateProjectionRoot<PARENT, ROOT>> customerAddress(
      ) {
    MailingAddressProjection<CustomerAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("customerAddress", projection);
    return projection;
  }

  public CustomerUserErrorProjection<CustomerAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerAddressUpdateProjectionRoot<PARENT, ROOT>> customerUserErrors(
      ) {
    CustomerUserErrorProjection<CustomerAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerUserErrorProjection<>(this, this);    
    getFields().put("customerUserErrors", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerAddressUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAddressUpdateProjectionRoot<PARENT, ROOT>, CustomerAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
