package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyAddressDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyAddressDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyAddressDeletePayload"));
  }

  public CompanyAddressDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyAddressDeleteProjectionRoot<PARENT, ROOT>, CompanyAddressDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyAddressDeleteProjectionRoot<PARENT, ROOT>, CompanyAddressDeleteProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyAddressDeleteProjectionRoot<PARENT, ROOT> deletedAddressId() {
    getFields().put("deletedAddressId", null);
    return this;
  }
}
