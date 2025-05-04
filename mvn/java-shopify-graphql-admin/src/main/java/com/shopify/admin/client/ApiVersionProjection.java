package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ApiVersionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ApiVersionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ApiVersion"));
  }

  public ApiVersionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ApiVersionProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ApiVersionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ApiVersionProjection<PARENT, ROOT> supported() {
    getFields().put("supported", null);
    return this;
  }
}
