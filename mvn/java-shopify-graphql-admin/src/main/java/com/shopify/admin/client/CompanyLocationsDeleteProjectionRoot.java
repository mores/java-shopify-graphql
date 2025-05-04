package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationsDeletePayload"));
  }

  public CompanyLocationsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationsDeleteProjectionRoot<PARENT, ROOT>, CompanyLocationsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationsDeleteProjectionRoot<PARENT, ROOT>, CompanyLocationsDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyLocationsDeleteProjectionRoot<PARENT, ROOT> deletedCompanyLocationIds() {
    getFields().put("deletedCompanyLocationIds", null);
    return this;
  }
}
