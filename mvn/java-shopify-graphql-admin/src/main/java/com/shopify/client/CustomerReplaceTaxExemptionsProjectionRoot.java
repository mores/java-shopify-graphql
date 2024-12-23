package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerReplaceTaxExemptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerReplaceTaxExemptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerReplaceTaxExemptionsPayload"));
  }

  public CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>, CustomerReplaceTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
