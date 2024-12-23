package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FileEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FileEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FileEdge"));
  }

  public FileEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FileProjection<FileEdgeProjection<PARENT, ROOT>, ROOT> node() {
     FileProjection<FileEdgeProjection<PARENT, ROOT>, ROOT> projection = new FileProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public FileEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
