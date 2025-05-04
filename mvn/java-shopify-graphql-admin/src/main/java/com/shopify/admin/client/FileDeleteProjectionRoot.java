package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("FileDeletePayload"));
  }

  public FileDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FilesUserErrorProjection<FileDeleteProjectionRoot<PARENT, ROOT>, FileDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FilesUserErrorProjection<FileDeleteProjectionRoot<PARENT, ROOT>, FileDeleteProjectionRoot<PARENT, ROOT>> projection = new FilesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public FileDeleteProjectionRoot<PARENT, ROOT> deletedFileIds() {
    getFields().put("deletedFileIds", null);
    return this;
  }
}
