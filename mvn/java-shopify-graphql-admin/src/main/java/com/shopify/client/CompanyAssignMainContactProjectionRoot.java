package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyAssignMainContactProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyAssignMainContactProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyAssignMainContactPayload"));
  }

  public CompanyAssignMainContactProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyAssignMainContactProjectionRoot<PARENT, ROOT>, CompanyAssignMainContactProjectionRoot<PARENT, ROOT>> company(
      ) {
    CompanyProjection<CompanyAssignMainContactProjectionRoot<PARENT, ROOT>, CompanyAssignMainContactProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("company", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyAssignMainContactProjectionRoot<PARENT, ROOT>, CompanyAssignMainContactProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyAssignMainContactProjectionRoot<PARENT, ROOT>, CompanyAssignMainContactProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
