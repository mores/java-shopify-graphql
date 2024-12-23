package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationAssignAddressProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationAssignAddressProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationAssignAddressPayload"));
  }

  public CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyAddressProjection<CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>, CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>> addresses(
      ) {
    CompanyAddressProjection<CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>, CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>> projection = new CompanyAddressProjection<>(this, this);    
    getFields().put("addresses", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>, CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>, CompanyLocationAssignAddressProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
