package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEmailAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEmailAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerEmailAddress"));
  }

  public CustomerEmailAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerEmailAddressMarketingStateProjection<CustomerEmailAddressProjection<PARENT, ROOT>, ROOT> marketingState(
      ) {
     CustomerEmailAddressMarketingStateProjection<CustomerEmailAddressProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailAddressMarketingStateProjection<>(this, getRoot());
     getFields().put("marketingState", projection);
     return projection;
  }

  public CustomerEmailAddressOpenTrackingLevelProjection<CustomerEmailAddressProjection<PARENT, ROOT>, ROOT> openTrackingLevel(
      ) {
     CustomerEmailAddressOpenTrackingLevelProjection<CustomerEmailAddressProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailAddressOpenTrackingLevelProjection<>(this, getRoot());
     getFields().put("openTrackingLevel", projection);
     return projection;
  }

  public CustomerEmailAddressProjection<PARENT, ROOT> emailAddress() {
    getFields().put("emailAddress", null);
    return this;
  }

  public CustomerEmailAddressProjection<PARENT, ROOT> marketingUnsubscribeUrl() {
    getFields().put("marketingUnsubscribeUrl", null);
    return this;
  }

  public CustomerEmailAddressProjection<PARENT, ROOT> openTrackingUrl() {
    getFields().put("openTrackingUrl", null);
    return this;
  }
}
