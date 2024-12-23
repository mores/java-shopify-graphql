package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileAcknowledgeUpdateFailedProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileAcknowledgeUpdateFailedProjectionRoot() {
    super(null, null, java.util.Optional.of("FileAcknowledgeUpdateFailedPayload"));
  }

  public FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileProjection<FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>, FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>> files(
      ) {
    FileProjection<FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>, FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>> projection = new FileProjection<>(this, this);    
    getFields().put("files", projection);
    return projection;
  }

  public FilesUserErrorProjection<FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>, FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FilesUserErrorProjection<FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>, FileAcknowledgeUpdateFailedProjectionRoot<PARENT, ROOT>> projection = new FilesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
