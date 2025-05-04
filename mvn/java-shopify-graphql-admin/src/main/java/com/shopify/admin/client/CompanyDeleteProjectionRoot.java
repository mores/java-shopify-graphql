package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyDeletePayload"));
  }

  public CompanyDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyDeleteProjectionRoot<PARENT, ROOT>, CompanyDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyDeleteProjectionRoot<PARENT, ROOT>, CompanyDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyDeleteProjectionRoot<PARENT, ROOT> deletedCompanyId() {
    getFields().put("deletedCompanyId", null);
    return this;
  }
}
