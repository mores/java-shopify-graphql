package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopLocalesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopLocalesProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopLocale"));
  }

  public ShopLocalesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketWebPresenceProjection<ShopLocalesProjectionRoot<PARENT, ROOT>, ShopLocalesProjectionRoot<PARENT, ROOT>> marketWebPresences(
      ) {
    MarketWebPresenceProjection<ShopLocalesProjectionRoot<PARENT, ROOT>, ShopLocalesProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("marketWebPresences", projection);
    return projection;
  }

  public ShopLocalesProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public ShopLocalesProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ShopLocalesProjectionRoot<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }

  public ShopLocalesProjectionRoot<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }
}
