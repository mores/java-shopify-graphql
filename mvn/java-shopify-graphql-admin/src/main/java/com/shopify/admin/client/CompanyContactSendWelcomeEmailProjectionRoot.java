package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactSendWelcomeEmailProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactSendWelcomeEmailProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactSendWelcomeEmailPayload"));
  }

  public CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactProjection<CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>, CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>> companyContact(
      ) {
    CompanyContactProjection<CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>, CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>> projection = new CompanyContactProjection<>(this, this);    
    getFields().put("companyContact", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>, CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>, CompanyContactSendWelcomeEmailProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
