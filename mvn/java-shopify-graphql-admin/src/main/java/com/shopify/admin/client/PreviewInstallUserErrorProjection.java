package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PreviewInstallUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PreviewInstallUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PreviewInstallUserError"));
  }

  public PreviewInstallUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PreviewInstallUserErrorCodeProjection<PreviewInstallUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PreviewInstallUserErrorCodeProjection<PreviewInstallUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PreviewInstallUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PreviewInstallUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PreviewInstallUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
