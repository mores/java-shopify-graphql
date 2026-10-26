package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMarketingConsentErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMarketingConsentErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMarketingConsentError"));
  }

  public CustomerMarketingConsentErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMarketingConsentErrorCodeProjection<CustomerMarketingConsentErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerMarketingConsentErrorCodeProjection<CustomerMarketingConsentErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingConsentErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerMarketingConsentErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerMarketingConsentErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
