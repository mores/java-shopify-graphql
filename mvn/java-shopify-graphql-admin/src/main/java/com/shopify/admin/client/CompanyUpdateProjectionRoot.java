package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyUpdatePayload"));
  }

  public CompanyUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyUpdateProjectionRoot<PARENT, ROOT>, CompanyUpdateProjectionRoot<PARENT, ROOT>> company(
      ) {
    CompanyProjection<CompanyUpdateProjectionRoot<PARENT, ROOT>, CompanyUpdateProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("company", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyUpdateProjectionRoot<PARENT, ROOT>, CompanyUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyUpdateProjectionRoot<PARENT, ROOT>, CompanyUpdateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
