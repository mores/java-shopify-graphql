package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEmailMarketingConsentUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEmailMarketingConsentUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerEmailMarketingConsentUpdateUserError"));
  }

  public CustomerEmailMarketingConsentUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerEmailMarketingConsentUpdateUserErrorCodeProjection<CustomerEmailMarketingConsentUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerEmailMarketingConsentUpdateUserErrorCodeProjection<CustomerEmailMarketingConsentUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailMarketingConsentUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerEmailMarketingConsentUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerEmailMarketingConsentUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
