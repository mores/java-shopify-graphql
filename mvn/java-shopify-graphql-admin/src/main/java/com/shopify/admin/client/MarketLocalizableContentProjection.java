package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketLocalizableContentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketLocalizableContentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketLocalizableContent"));
  }

  public MarketLocalizableContentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketLocalizableContentProjection<PARENT, ROOT> digest() {
    getFields().put("digest", null);
    return this;
  }

  public MarketLocalizableContentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MarketLocalizableContentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
