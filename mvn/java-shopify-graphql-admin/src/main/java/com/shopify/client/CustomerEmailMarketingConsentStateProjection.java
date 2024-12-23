package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEmailMarketingConsentStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEmailMarketingConsentStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerEmailMarketingConsentState"));
  }

  public CustomerEmailMarketingConsentStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMarketingOptInLevelProjection<CustomerEmailMarketingConsentStateProjection<PARENT, ROOT>, ROOT> marketingOptInLevel(
      ) {
     CustomerMarketingOptInLevelProjection<CustomerEmailMarketingConsentStateProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingOptInLevelProjection<>(this, getRoot());
     getFields().put("marketingOptInLevel", projection);
     return projection;
  }

  public CustomerEmailMarketingStateProjection<CustomerEmailMarketingConsentStateProjection<PARENT, ROOT>, ROOT> marketingState(
      ) {
     CustomerEmailMarketingStateProjection<CustomerEmailMarketingConsentStateProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailMarketingStateProjection<>(this, getRoot());
     getFields().put("marketingState", projection);
     return projection;
  }

  public CustomerEmailMarketingConsentStateProjection<PARENT, ROOT> consentUpdatedAt() {
    getFields().put("consentUpdatedAt", null);
    return this;
  }
}
