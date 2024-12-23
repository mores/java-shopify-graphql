package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationCreatePayload"));
  }

  public CompanyLocationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationCreateProjectionRoot<PARENT, ROOT>, CompanyLocationCreateProjectionRoot<PARENT, ROOT>> companyLocation(
      ) {
    CompanyLocationProjection<CompanyLocationCreateProjectionRoot<PARENT, ROOT>, CompanyLocationCreateProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationProjection<>(this, this);    
    getFields().put("companyLocation", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationCreateProjectionRoot<PARENT, ROOT>, CompanyLocationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationCreateProjectionRoot<PARENT, ROOT>, CompanyLocationCreateProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
