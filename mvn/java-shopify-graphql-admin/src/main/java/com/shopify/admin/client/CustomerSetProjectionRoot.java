package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSetProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerSetPayload"));
  }

  public CustomerSetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerSetProjectionRoot<PARENT, ROOT>, CustomerSetProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerSetProjectionRoot<PARENT, ROOT>, CustomerSetProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerSetUserErrorProjection<CustomerSetProjectionRoot<PARENT, ROOT>, CustomerSetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerSetUserErrorProjection<CustomerSetProjectionRoot<PARENT, ROOT>, CustomerSetProjectionRoot<PARENT, ROOT>> projection = new CustomerSetUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
