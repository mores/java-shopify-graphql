package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactUpdatePayload"));
  }

  public CompanyContactUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactProjection<CompanyContactUpdateProjectionRoot<PARENT, ROOT>, CompanyContactUpdateProjectionRoot<PARENT, ROOT>> companyContact(
      ) {
    CompanyContactProjection<CompanyContactUpdateProjectionRoot<PARENT, ROOT>, CompanyContactUpdateProjectionRoot<PARENT, ROOT>> projection = new CompanyContactProjection<>(this, this);    
    getFields().put("companyContact", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactUpdateProjectionRoot<PARENT, ROOT>, CompanyContactUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactUpdateProjectionRoot<PARENT, ROOT>, CompanyContactUpdateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
