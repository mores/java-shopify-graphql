package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactDeletePayload"));
  }

  public CompanyContactDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactDeleteProjectionRoot<PARENT, ROOT>, CompanyContactDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactDeleteProjectionRoot<PARENT, ROOT>, CompanyContactDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyContactDeleteProjectionRoot<PARENT, ROOT> deletedCompanyContactId() {
    getFields().put("deletedCompanyContactId", null);
    return this;
  }
}
