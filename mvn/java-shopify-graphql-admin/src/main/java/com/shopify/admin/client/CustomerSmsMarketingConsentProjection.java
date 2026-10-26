package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSmsMarketingConsentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSmsMarketingConsentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSmsMarketingConsent"));
  }

  public CustomerSmsMarketingConsentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerConsentCollectedFromProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> collectedFrom(
      ) {
     CustomerConsentCollectedFromProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new CustomerConsentCollectedFromProjection<>(this, getRoot());
     getFields().put("collectedFrom", projection);
     return projection;
  }

  public CustomerMarketingOptInLevelProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> optInLevel(
      ) {
     CustomerMarketingOptInLevelProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingOptInLevelProjection<>(this, getRoot());
     getFields().put("optInLevel", projection);
     return projection;
  }

  public LocationProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> sourceLocation(
      ) {
     LocationProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("sourceLocation", projection);
     return projection;
  }

  public CustomerMarketingConsentStateProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> state(
      ) {
     CustomerMarketingConsentStateProjection<CustomerSmsMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingConsentStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public CustomerSmsMarketingConsentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
