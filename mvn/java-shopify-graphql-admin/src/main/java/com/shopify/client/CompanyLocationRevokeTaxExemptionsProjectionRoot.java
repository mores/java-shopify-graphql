package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationRevokeTaxExemptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationRevokeTaxExemptionsPayload"));
  }

  public CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
