package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.util.ArrayList;

public class CommentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Comment"));
  }

  public CommentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentAuthorProjection<CommentProjection<PARENT, ROOT>, ROOT> author() {
     CommentAuthorProjection<CommentProjection<PARENT, ROOT>, ROOT> projection = new CommentAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public CommentProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public CommentProjection content(Integer truncateAt) {
    getFields().put("content", null);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("content").add(truncateAtArg);
    return this;
  }

  public CommentProjection<PARENT, ROOT> contentHtml() {
    getFields().put("contentHtml", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
