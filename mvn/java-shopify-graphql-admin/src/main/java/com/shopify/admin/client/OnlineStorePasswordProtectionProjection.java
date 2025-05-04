package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStorePasswordProtectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStorePasswordProtectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStorePasswordProtection"));
  }

  public OnlineStorePasswordProtectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStorePasswordProtectionProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }
}
