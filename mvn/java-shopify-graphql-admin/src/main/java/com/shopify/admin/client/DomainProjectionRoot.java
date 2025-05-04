package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DomainProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DomainProjectionRoot() {
    super(null, null, java.util.Optional.of("Domain"));
  }

  public DomainProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DomainLocalizationProjection<DomainProjectionRoot<PARENT, ROOT>, DomainProjectionRoot<PARENT, ROOT>> localization(
      ) {
    DomainLocalizationProjection<DomainProjectionRoot<PARENT, ROOT>, DomainProjectionRoot<PARENT, ROOT>> projection = new DomainLocalizationProjection<>(this, this);    
    getFields().put("localization", projection);
    return projection;
  }

  public MarketWebPresenceProjection<DomainProjectionRoot<PARENT, ROOT>, DomainProjectionRoot<PARENT, ROOT>> marketWebPresence(
      ) {
    MarketWebPresenceProjection<DomainProjectionRoot<PARENT, ROOT>, DomainProjectionRoot<PARENT, ROOT>> projection = new MarketWebPresenceProjection<>(this, this);    
    getFields().put("marketWebPresence", projection);
    return projection;
  }

  public DomainProjectionRoot<PARENT, ROOT> host() {
    getFields().put("host", null);
    return this;
  }

  public DomainProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DomainProjectionRoot<PARENT, ROOT> sslEnabled() {
    getFields().put("sslEnabled", null);
    return this;
  }

  public DomainProjectionRoot<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
