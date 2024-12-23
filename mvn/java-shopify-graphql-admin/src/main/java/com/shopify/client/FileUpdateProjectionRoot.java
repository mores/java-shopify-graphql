package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("FileUpdatePayload"));
  }

  public FileUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileProjection<FileUpdateProjectionRoot<PARENT, ROOT>, FileUpdateProjectionRoot<PARENT, ROOT>> files(
      ) {
    FileProjection<FileUpdateProjectionRoot<PARENT, ROOT>, FileUpdateProjectionRoot<PARENT, ROOT>> projection = new FileProjection<>(this, this);    
    getFields().put("files", projection);
    return projection;
  }

  public FilesUserErrorProjection<FileUpdateProjectionRoot<PARENT, ROOT>, FileUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FilesUserErrorProjection<FileUpdateProjectionRoot<PARENT, ROOT>, FileUpdateProjectionRoot<PARENT, ROOT>> projection = new FilesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
