package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRemoveFromCompanyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRemoveFromCompanyProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactRemoveFromCompanyPayload"));
  }

  public CompanyContactRemoveFromCompanyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactRemoveFromCompanyProjectionRoot<PARENT, ROOT>, CompanyContactRemoveFromCompanyProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactRemoveFromCompanyProjectionRoot<PARENT, ROOT>, CompanyContactRemoveFromCompanyProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyContactRemoveFromCompanyProjectionRoot<PARENT, ROOT> removedCompanyContactId() {
    getFields().put("removedCompanyContactId", null);
    return this;
  }
}
