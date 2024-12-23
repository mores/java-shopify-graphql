package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPhoneNumberProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPhoneNumberProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPhoneNumber"));
  }

  public CustomerPhoneNumberProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerSmsMarketingStateProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> marketingState(
      ) {
     CustomerSmsMarketingStateProjection<CustomerPhoneNumberProjection<PARENT, ROOT>, ROOT> projection = new CustomerSmsMarketingStateProjection<>(this, getRoot());
     getFields().put("marketingState", projection);
     return projection;
  }

  public CustomerPhoneNumberProjection<PARENT, ROOT> phoneNumber() {
    getFields().put("phoneNumber", null);
    return this;
  }
}
