package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FilesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FilesProjectionRoot() {
    super(null, null, java.util.Optional.of("FileConnection"));
  }

  public FilesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileEdgeProjection<FilesProjectionRoot<PARENT, ROOT>, FilesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    FileEdgeProjection<FilesProjectionRoot<PARENT, ROOT>, FilesProjectionRoot<PARENT, ROOT>> projection = new FileEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public FileProjection<FilesProjectionRoot<PARENT, ROOT>, FilesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    FileProjection<FilesProjectionRoot<PARENT, ROOT>, FilesProjectionRoot<PARENT, ROOT>> projection = new FileProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<FilesProjectionRoot<PARENT, ROOT>, FilesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<FilesProjectionRoot<PARENT, ROOT>, FilesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
