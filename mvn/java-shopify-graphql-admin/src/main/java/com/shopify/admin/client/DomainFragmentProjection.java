package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DomainFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DomainFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Domain"));
  }

  public DomainFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DomainLocalizationProjection<DomainFragmentProjection<PARENT, ROOT>, ROOT> localization() {
     DomainLocalizationProjection<DomainFragmentProjection<PARENT, ROOT>, ROOT> projection = new DomainLocalizationProjection<>(this, getRoot());
     getFields().put("localization", projection);
     return projection;
  }

  public MarketWebPresenceProjection<DomainFragmentProjection<PARENT, ROOT>, ROOT> marketWebPresence(
      ) {
     MarketWebPresenceProjection<DomainFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceProjection<>(this, getRoot());
     getFields().put("marketWebPresence", projection);
     return projection;
  }

  public DomainFragmentProjection<PARENT, ROOT> host() {
    getFields().put("host", null);
    return this;
  }

  public DomainFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DomainFragmentProjection<PARENT, ROOT> sslEnabled() {
    getFields().put("sslEnabled", null);
    return this;
  }

  public DomainFragmentProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Domain {");
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
