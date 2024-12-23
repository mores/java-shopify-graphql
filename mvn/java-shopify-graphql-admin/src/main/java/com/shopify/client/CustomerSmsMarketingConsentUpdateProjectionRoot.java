package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSmsMarketingConsentUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerSmsMarketingConsentUpdatePayload"));
  }

  public CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerSmsMarketingConsentErrorProjection<CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerSmsMarketingConsentErrorProjection<CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerSmsMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerSmsMarketingConsentErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
