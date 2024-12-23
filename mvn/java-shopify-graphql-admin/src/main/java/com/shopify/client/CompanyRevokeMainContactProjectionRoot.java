package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyRevokeMainContactProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyRevokeMainContactProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyRevokeMainContactPayload"));
  }

  public CompanyRevokeMainContactProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>, CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>> company(
      ) {
    CompanyProjection<CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>, CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("company", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>, CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>, CompanyRevokeMainContactProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
