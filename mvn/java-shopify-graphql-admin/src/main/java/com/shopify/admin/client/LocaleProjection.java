package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocaleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocaleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Locale"));
  }

  public LocaleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocaleProjection<PARENT, ROOT> isoCode() {
    getFields().put("isoCode", null);
    return this;
  }

  public LocaleProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
