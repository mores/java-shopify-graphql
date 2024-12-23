package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FileConnection"));
  }

  public FileConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileEdgeProjection<FileConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     FileEdgeProjection<FileConnectionProjection<PARENT, ROOT>, ROOT> projection = new FileEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FileProjection<FileConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     FileProjection<FileConnectionProjection<PARENT, ROOT>, ROOT> projection = new FileProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FileConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<FileConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
