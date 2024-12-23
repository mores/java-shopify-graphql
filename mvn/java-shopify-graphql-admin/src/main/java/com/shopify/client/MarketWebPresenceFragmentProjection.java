package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MarketWebPresenceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketWebPresenceFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketWebPresence"));
  }

  public MarketWebPresenceFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopLocaleProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> alternateLocales(
      ) {
     ShopLocaleProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("alternateLocales", projection);
     return projection;
  }

  public ShopLocaleProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> defaultLocale(
      ) {
     ShopLocaleProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("defaultLocale", projection);
     return projection;
  }

  public DomainProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> domain() {
     DomainProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("domain", projection);
     return projection;
  }

  public MarketProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MarketWebPresenceRootUrlProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> rootUrls(
      ) {
     MarketWebPresenceRootUrlProjection<MarketWebPresenceFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceRootUrlProjection<>(this, getRoot());
     getFields().put("rootUrls", projection);
     return projection;
  }

  public MarketWebPresenceFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketWebPresenceFragmentProjection<PARENT, ROOT> subfolderSuffix() {
    getFields().put("subfolderSuffix", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketWebPresence {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
