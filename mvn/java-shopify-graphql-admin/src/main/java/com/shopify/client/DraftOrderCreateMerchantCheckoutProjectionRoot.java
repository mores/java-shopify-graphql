package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderCreateMerchantCheckoutProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderCreateMerchantCheckoutProjectionRoot() {
    super(null, null, java.util.Optional.of("DraftOrderCreateMerchantCheckoutPayload"));
  }

  public DraftOrderCreateMerchantCheckoutProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<DraftOrderCreateMerchantCheckoutProjectionRoot<PARENT, ROOT>, DraftOrderCreateMerchantCheckoutProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DraftOrderCreateMerchantCheckoutProjectionRoot<PARENT, ROOT>, DraftOrderCreateMerchantCheckoutProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
