package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSmsMarketingConsentErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSmsMarketingConsentErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSmsMarketingConsentError"));
  }

  public CustomerSmsMarketingConsentErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSmsMarketingConsentErrorCodeProjection<CustomerSmsMarketingConsentErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerSmsMarketingConsentErrorCodeProjection<CustomerSmsMarketingConsentErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerSmsMarketingConsentErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerSmsMarketingConsentErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerSmsMarketingConsentErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
