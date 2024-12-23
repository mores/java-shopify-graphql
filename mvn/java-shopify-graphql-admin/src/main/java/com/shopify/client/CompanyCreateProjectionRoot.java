package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyCreatePayload"));
  }

  public CompanyCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyCreateProjectionRoot<PARENT, ROOT>, CompanyCreateProjectionRoot<PARENT, ROOT>> company(
      ) {
    CompanyProjection<CompanyCreateProjectionRoot<PARENT, ROOT>, CompanyCreateProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("company", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyCreateProjectionRoot<PARENT, ROOT>, CompanyCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyCreateProjectionRoot<PARENT, ROOT>, CompanyCreateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
