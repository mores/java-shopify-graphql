package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public GiftCardsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<GiftCardsCountProjectionRoot<PARENT, ROOT>, GiftCardsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<GiftCardsCountProjectionRoot<PARENT, ROOT>, GiftCardsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public GiftCardsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
