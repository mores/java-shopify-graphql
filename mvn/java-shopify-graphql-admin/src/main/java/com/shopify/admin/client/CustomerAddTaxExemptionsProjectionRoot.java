package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAddTaxExemptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAddTaxExemptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerAddTaxExemptionsPayload"));
  }

  public CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerAddTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
