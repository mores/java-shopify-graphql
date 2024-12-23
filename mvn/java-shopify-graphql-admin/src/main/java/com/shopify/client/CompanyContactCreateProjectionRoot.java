package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactCreatePayload"));
  }

  public CompanyContactCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactProjection<CompanyContactCreateProjectionRoot<PARENT, ROOT>, CompanyContactCreateProjectionRoot<PARENT, ROOT>> companyContact(
      ) {
    CompanyContactProjection<CompanyContactCreateProjectionRoot<PARENT, ROOT>, CompanyContactCreateProjectionRoot<PARENT, ROOT>> projection = new CompanyContactProjection<>(this, this);    
    getFields().put("companyContact", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactCreateProjectionRoot<PARENT, ROOT>, CompanyContactCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactCreateProjectionRoot<PARENT, ROOT>, CompanyContactCreateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
