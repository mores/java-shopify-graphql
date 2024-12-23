package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEmailMarketingConsentUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerEmailMarketingConsentUpdatePayload"));
  }

  public CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public CustomerEmailMarketingConsentUpdateUserErrorProjection<CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerEmailMarketingConsentUpdateUserErrorProjection<CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>, CustomerEmailMarketingConsentUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerEmailMarketingConsentUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
