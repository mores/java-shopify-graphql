package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactsDeletePayload"));
  }

  public CompanyContactsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactsDeleteProjectionRoot<PARENT, ROOT>, CompanyContactsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactsDeleteProjectionRoot<PARENT, ROOT>, CompanyContactsDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyContactsDeleteProjectionRoot<PARENT, ROOT> deletedCompanyContactIds() {
    getFields().put("deletedCompanyContactIds", null);
    return this;
  }
}
