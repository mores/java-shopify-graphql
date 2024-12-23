package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyAssignCustomerAsContactProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyAssignCustomerAsContactProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyAssignCustomerAsContactPayload"));
  }

  public CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactProjection<CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>, CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>> companyContact(
      ) {
    CompanyContactProjection<CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>, CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>> projection = new CompanyContactProjection<>(this, this);    
    getFields().put("companyContact", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>, CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>, CompanyAssignCustomerAsContactProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
