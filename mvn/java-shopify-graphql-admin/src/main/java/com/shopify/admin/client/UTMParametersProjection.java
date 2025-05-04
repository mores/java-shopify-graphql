package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UTMParametersProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UTMParametersProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UTMParameters"));
  }

  public UTMParametersProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UTMParametersProjection<PARENT, ROOT> campaign() {
    getFields().put("campaign", null);
    return this;
  }

  public UTMParametersProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public UTMParametersProjection<PARENT, ROOT> medium() {
    getFields().put("medium", null);
    return this;
  }

  public UTMParametersProjection<PARENT, ROOT> source() {
    getFields().put("source", null);
    return this;
  }

  public UTMParametersProjection<PARENT, ROOT> term() {
    getFields().put("term", null);
    return this;
  }
}
