package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerWhatsAppMarketingConsentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerWhatsAppMarketingConsentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerWhatsAppMarketingConsent"));
  }

  public CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerConsentCollectedFromProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> collectedFrom(
      ) {
     CustomerConsentCollectedFromProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new CustomerConsentCollectedFromProjection<>(this, getRoot());
     getFields().put("collectedFrom", projection);
     return projection;
  }

  public CustomerMarketingOptInLevelProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> optInLevel(
      ) {
     CustomerMarketingOptInLevelProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingOptInLevelProjection<>(this, getRoot());
     getFields().put("optInLevel", projection);
     return projection;
  }

  public LocationProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> sourceLocation(
      ) {
     LocationProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("sourceLocation", projection);
     return projection;
  }

  public CustomerMarketingConsentStateProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> state(
      ) {
     CustomerMarketingConsentStateProjection<CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingConsentStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public CustomerWhatsAppMarketingConsentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
