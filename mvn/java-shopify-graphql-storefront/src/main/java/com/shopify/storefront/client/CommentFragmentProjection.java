package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CommentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CommentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Comment"));
  }

  public CommentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentAuthorProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> author() {
     CommentAuthorProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public CommentFragmentProjection<PARENT, ROOT> content() {
    getFields().put("content", null);
    return this;
  }

  public CommentFragmentProjection content(Integer truncateAt) {
    getFields().put("content", null);
    getInputArguments().computeIfAbsent("content", k -> new ArrayList<>());
    InputArgument truncateAtArg = new InputArgument("truncateAt", truncateAt);
    getInputArguments().get("content").add(truncateAtArg);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> contentHtml() {
    getFields().put("contentHtml", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Comment {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
