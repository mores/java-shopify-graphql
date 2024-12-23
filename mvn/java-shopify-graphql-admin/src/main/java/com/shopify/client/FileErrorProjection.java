package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FileError"));
  }

  public FileErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileErrorCodeProjection<FileErrorProjection<PARENT, ROOT>, ROOT> code() {
     FileErrorCodeProjection<FileErrorProjection<PARENT, ROOT>, ROOT> projection = new FileErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FileErrorProjection<PARENT, ROOT> details() {
    getFields().put("details", null);
    return this;
  }

  public FileErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
