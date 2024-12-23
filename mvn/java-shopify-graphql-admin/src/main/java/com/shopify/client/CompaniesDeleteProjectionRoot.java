package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompaniesDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompaniesDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompaniesDeletePayload"));
  }

  public CompaniesDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompaniesDeleteProjectionRoot<PARENT, ROOT>, CompaniesDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompaniesDeleteProjectionRoot<PARENT, ROOT>, CompaniesDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompaniesDeleteProjectionRoot<PARENT, ROOT> deletedCompanyIds() {
    getFields().put("deletedCompanyIds", null);
    return this;
  }
}
