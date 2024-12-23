package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DomainLocalizationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DomainLocalizationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DomainLocalization"));
  }

  public DomainLocalizationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DomainLocalizationProjection<PARENT, ROOT> alternateLocales() {
    getFields().put("alternateLocales", null);
    return this;
  }

  public DomainLocalizationProjection<PARENT, ROOT> country() {
    getFields().put("country", null);
    return this;
  }

  public DomainLocalizationProjection<PARENT, ROOT> defaultLocale() {
    getFields().put("defaultLocale", null);
    return this;
  }
}
