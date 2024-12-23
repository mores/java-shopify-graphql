package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("FileCreatePayload"));
  }

  public FileCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileProjection<FileCreateProjectionRoot<PARENT, ROOT>, FileCreateProjectionRoot<PARENT, ROOT>> files(
      ) {
    FileProjection<FileCreateProjectionRoot<PARENT, ROOT>, FileCreateProjectionRoot<PARENT, ROOT>> projection = new FileProjection<>(this, this);    
    getFields().put("files", projection);
    return projection;
  }

  public FilesUserErrorProjection<FileCreateProjectionRoot<PARENT, ROOT>, FileCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FilesUserErrorProjection<FileCreateProjectionRoot<PARENT, ROOT>, FileCreateProjectionRoot<PARENT, ROOT>> projection = new FilesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
