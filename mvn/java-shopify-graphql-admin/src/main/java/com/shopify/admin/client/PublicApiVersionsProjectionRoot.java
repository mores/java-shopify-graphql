package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicApiVersionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicApiVersionsProjectionRoot() {
    super(null, null, java.util.Optional.of("ApiVersion"));
  }

  public PublicApiVersionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicApiVersionsProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public PublicApiVersionsProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public PublicApiVersionsProjectionRoot<PARENT, ROOT> supported() {
    getFields().put("supported", null);
    return this;
  }
}
