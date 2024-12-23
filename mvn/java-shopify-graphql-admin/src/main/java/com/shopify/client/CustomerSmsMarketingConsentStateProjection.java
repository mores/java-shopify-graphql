package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSmsMarketingConsentStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSmsMarketingConsentStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSmsMarketingConsentState"));
  }

  public CustomerSmsMarketingConsentStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerConsentCollectedFromProjection<CustomerSmsMarketingConsentStateProjection<PARENT, ROOT>, ROOT> consentCollectedFrom(
      ) {
     CustomerConsentCollectedFromProjection<CustomerSmsMarketingConsentStateProjection<PARENT, ROOT>, ROOT> projection = new CustomerConsentCollectedFromProjection<>(this, getRoot());
     getFields().put("consentCollectedFrom", projection);
     return projection;
  }

  public CustomerMarketingOptInLevelProjection<CustomerSmsMarketingConsentStateProjection<PARENT, ROOT>, ROOT> marketingOptInLevel(
      ) {
     CustomerMarketingOptInLevelProjection<CustomerSmsMarketingConsentStateProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingOptInLevelProjection<>(this, getRoot());
     getFields().put("marketingOptInLevel", projection);
     return projection;
  }

  public CustomerSmsMarketingStateProjection<CustomerSmsMarketingConsentStateProjection<PARENT, ROOT>, ROOT> marketingState(
      ) {
     CustomerSmsMarketingStateProjection<CustomerSmsMarketingConsentStateProjection<PARENT, ROOT>, ROOT> projection = new CustomerSmsMarketingStateProjection<>(this, getRoot());
     getFields().put("marketingState", projection);
     return projection;
  }

  public CustomerSmsMarketingConsentStateProjection<PARENT, ROOT> consentUpdatedAt() {
    getFields().put("consentUpdatedAt", null);
    return this;
  }
}
