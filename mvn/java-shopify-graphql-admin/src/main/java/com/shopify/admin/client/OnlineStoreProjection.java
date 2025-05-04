package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OnlineStore"));
  }

  public OnlineStoreProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStorePasswordProtectionProjection<OnlineStoreProjection<PARENT, ROOT>, ROOT> passwordProtection(
      ) {
     OnlineStorePasswordProtectionProjection<OnlineStoreProjection<PARENT, ROOT>, ROOT> projection = new OnlineStorePasswordProtectionProjection<>(this, getRoot());
     getFields().put("passwordProtection", projection);
     return projection;
  }
}
