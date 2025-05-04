package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationUpdatePayload"));
  }

  public CompanyLocationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationUpdateProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationUpdateProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationUpdateProjectionRoot<PARENT, ROOT>, CompanyLocationUpdateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
