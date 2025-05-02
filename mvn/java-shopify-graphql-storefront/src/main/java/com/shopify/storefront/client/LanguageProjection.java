package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LanguageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LanguageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Language"));
  }

  public LanguageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LanguageCodeProjection<LanguageProjection<PARENT, ROOT>, ROOT> isoCode() {
     LanguageCodeProjection<LanguageProjection<PARENT, ROOT>, ROOT> projection = new LanguageCodeProjection<>(this, getRoot());
     getFields().put("isoCode", projection);
     return projection;
  }

  public LanguageProjection<PARENT, ROOT> endonymName() {
    getFields().put("endonymName", null);
    return this;
  }

  public LanguageProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
