package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerRemoveTaxExemptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerRemoveTaxExemptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerRemoveTaxExemptionsPayload"));
  }

  public CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerRemoveTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
