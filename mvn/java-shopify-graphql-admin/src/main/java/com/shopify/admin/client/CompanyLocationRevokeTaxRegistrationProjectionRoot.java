package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationRevokeTaxRegistrationProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationRevokeTaxRegistrationPayload"));
  }

  public CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxRegistrationProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
