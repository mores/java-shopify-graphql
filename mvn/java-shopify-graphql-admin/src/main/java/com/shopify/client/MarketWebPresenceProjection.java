package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketWebPresenceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketWebPresenceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketWebPresence"));
  }

  public MarketWebPresenceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> alternateLocales() {
     ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("alternateLocales", projection);
     return projection;
  }

  public ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> defaultLocale() {
     ShopLocaleProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("defaultLocale", projection);
     return projection;
  }

  public DomainProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> domain() {
     DomainProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("domain", projection);
     return projection;
  }

  public MarketProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MarketWebPresenceRootUrlProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> rootUrls(
      ) {
     MarketWebPresenceRootUrlProjection<MarketWebPresenceProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceRootUrlProjection<>(this, getRoot());
     getFields().put("rootUrls", projection);
     return projection;
  }

  public MarketWebPresenceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketWebPresenceProjection<PARENT, ROOT> subfolderSuffix() {
    getFields().put("subfolderSuffix", null);
    return this;
  }
}
