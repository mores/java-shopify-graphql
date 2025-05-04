package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OnlineStoreProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OnlineStoreProjectionRoot() {
    super(null, null, java.util.Optional.of("OnlineStore"));
  }

  public OnlineStoreProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OnlineStorePasswordProtectionProjection<OnlineStoreProjectionRoot<PARENT, ROOT>, OnlineStoreProjectionRoot<PARENT, ROOT>> passwordProtection(
      ) {
    OnlineStorePasswordProtectionProjection<OnlineStoreProjectionRoot<PARENT, ROOT>, OnlineStoreProjectionRoot<PARENT, ROOT>> projection = new OnlineStorePasswordProtectionProjection<>(this, this);    
    getFields().put("passwordProtection", projection);
    return projection;
  }
}
