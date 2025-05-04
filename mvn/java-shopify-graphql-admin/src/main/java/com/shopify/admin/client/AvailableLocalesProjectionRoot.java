package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AvailableLocalesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AvailableLocalesProjectionRoot() {
    super(null, null, java.util.Optional.of("Locale"));
  }

  public AvailableLocalesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AvailableLocalesProjectionRoot<PARENT, ROOT> isoCode() {
    getFields().put("isoCode", null);
    return this;
  }

  public AvailableLocalesProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
