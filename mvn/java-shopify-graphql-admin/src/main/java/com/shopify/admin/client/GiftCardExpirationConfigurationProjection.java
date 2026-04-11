package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardExpirationConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardExpirationConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardExpirationConfiguration"));
  }

  public GiftCardExpirationConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardConfigurationExpirationUnitProjection<GiftCardExpirationConfigurationProjection<PARENT, ROOT>, ROOT> expirationUnit(
      ) {
     GiftCardConfigurationExpirationUnitProjection<GiftCardExpirationConfigurationProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConfigurationExpirationUnitProjection<>(this, getRoot());
     getFields().put("expirationUnit", projection);
     return projection;
  }

  public GiftCardExpirationConfigurationProjection<PARENT, ROOT> expirationValue() {
    getFields().put("expirationValue", null);
    return this;
  }
}
