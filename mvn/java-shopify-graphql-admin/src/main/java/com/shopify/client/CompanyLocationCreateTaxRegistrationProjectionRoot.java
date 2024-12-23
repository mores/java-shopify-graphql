package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationCreateTaxRegistrationProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationCreateTaxRegistrationPayload"));
  }

  public CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>, CompanyLocationCreateTaxRegistrationProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
