package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DomainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DomainProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Domain"));
  }

  public DomainProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DomainLocalizationProjection<DomainProjection<PARENT, ROOT>, ROOT> localization() {
     DomainLocalizationProjection<DomainProjection<PARENT, ROOT>, ROOT> projection = new DomainLocalizationProjection<>(this, getRoot());
     getFields().put("localization", projection);
     return projection;
  }

  public MarketWebPresenceProjection<DomainProjection<PARENT, ROOT>, ROOT> marketWebPresence() {
     MarketWebPresenceProjection<DomainProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("marketWebPresence", projection);
     return projection;
  }

  public DomainProjection<PARENT, ROOT> host() {
    getFields().put("host", null);
    return this;
  }

  public DomainProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DomainProjection<PARENT, ROOT> sslEnabled() {
    getFields().put("sslEnabled", null);
    return this;
  }

  public DomainProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
