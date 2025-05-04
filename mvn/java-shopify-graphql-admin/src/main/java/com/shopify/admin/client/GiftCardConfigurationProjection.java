package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardConfiguration"));
  }

  public GiftCardConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardConfigurationProjection<PARENT, ROOT>, ROOT> issueLimit() {
     MoneyV2Projection<GiftCardConfigurationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("issueLimit", projection);
     return projection;
  }

  public MoneyV2Projection<GiftCardConfigurationProjection<PARENT, ROOT>, ROOT> purchaseLimit() {
     MoneyV2Projection<GiftCardConfigurationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("purchaseLimit", projection);
     return projection;
  }
}
