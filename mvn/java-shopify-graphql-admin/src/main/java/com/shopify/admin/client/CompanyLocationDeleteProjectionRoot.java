package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationDeletePayload"));
  }

  public CompanyLocationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationDeleteProjectionRoot<PARENT, ROOT>, CompanyLocationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationDeleteProjectionRoot<PARENT, ROOT>, CompanyLocationDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyLocationDeleteProjectionRoot<PARENT, ROOT> deletedCompanyLocationId() {
    getFields().put("deletedCompanyLocationId", null);
    return this;
  }
}
