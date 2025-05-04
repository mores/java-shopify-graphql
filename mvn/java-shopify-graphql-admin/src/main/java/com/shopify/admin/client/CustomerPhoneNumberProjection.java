package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPhoneNumberProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPhoneNumberProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPhoneNumber"));
  }

  public CustomerPhoneNumberProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerConsentCollectedFromProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> marketingCollectedFrom(
      ) {
     CustomerConsentCollectedFromProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> projection = new CustomerConsentCollectedFromProjection<>(this, getRoot());
     getFields().put("marketingCollectedFrom", projection);
     return projection;
  }

  public CustomerMarketingOptInLevelProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> marketingOptInLevel(
      ) {
     CustomerMarketingOptInLevelProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> projection = new CustomerMarketingOptInLevelProjection<>(this, getRoot());
     getFields().put("marketingOptInLevel", projection);
     return projection;
  }

  public CustomerSmsMarketingStateProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> marketingState(
      ) {
     CustomerSmsMarketingStateProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> projection = new CustomerSmsMarketingStateProjection<>(this, getRoot());
     getFields().put("marketingState", projection);
     return projection;
  }

  public LocationProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> sourceLocation() {
     LocationProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("sourceLocation", projection);
     return projection;
  }

  public CustomerPhoneNumberProjection<PARENT, ROOT> marketingUpdatedAt() {
    getFields().put("marketingUpdatedAt", null);
    return this;
  }

  public CustomerPhoneNumberProjection<PARENT, ROOT> phoneNumber() {
    getFields().put("phoneNumber", null);
    return this;
  }
}
