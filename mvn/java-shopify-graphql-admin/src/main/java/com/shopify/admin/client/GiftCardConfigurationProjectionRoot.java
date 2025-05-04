package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardConfigurationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardConfigurationProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardConfiguration"));
  }

  public GiftCardConfigurationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardConfigurationProjectionRoot<PARENT, ROOT>, GiftCardConfigurationProjectionRoot<PARENT, ROOT>> issueLimit(
      ) {
    MoneyV2Projection<GiftCardConfigurationProjectionRoot<PARENT, ROOT>, GiftCardConfigurationProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("issueLimit", projection);
    return projection;
  }

  public MoneyV2Projection<GiftCardConfigurationProjectionRoot<PARENT, ROOT>, GiftCardConfigurationProjectionRoot<PARENT, ROOT>> purchaseLimit(
      ) {
    MoneyV2Projection<GiftCardConfigurationProjectionRoot<PARENT, ROOT>, GiftCardConfigurationProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("purchaseLimit", projection);
    return projection;
  }
}
