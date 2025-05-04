package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketLocalization"));
  }

  public MarketLocalizationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketProjection<MarketLocalizationProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<MarketLocalizationProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MarketLocalizationProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MarketLocalizationProjection<PARENT, ROOT> outdated() {
    getFields().put("outdated", null);
    return this;
  }

  public MarketLocalizationProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MarketLocalizationProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
