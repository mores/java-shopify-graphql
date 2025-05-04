package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FilesUserError"));
  }

  public FilesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FilesErrorCodeProjection<FilesUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     FilesErrorCodeProjection<FilesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FilesErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FilesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FilesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
