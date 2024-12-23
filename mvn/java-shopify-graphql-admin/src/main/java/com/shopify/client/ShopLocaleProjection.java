package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopLocaleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopLocaleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopLocale"));
  }

  public ShopLocaleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketWebPresenceProjection<ShopLocaleProjection<PARENT, ROOT>, ROOT> marketWebPresences(
      ) {
     MarketWebPresenceProjection<ShopLocaleProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("marketWebPresences", projection);
     return projection;
  }

  public ShopLocaleProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public ShopLocaleProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopLocaleProjection<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }

  public ShopLocaleProjection<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }
}
