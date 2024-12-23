package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationAssignTaxExemptionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationAssignTaxExemptionsPayload"));
  }

  public CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>, CompanyLocationAssignTaxExemptionsProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
