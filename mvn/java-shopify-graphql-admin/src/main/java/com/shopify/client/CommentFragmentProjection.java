package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.EventSortKeys;
import java.lang.Boolean;
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

  public ArticleProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> article() {
     ArticleProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("article", projection);
     return projection;
  }

  public CommentAuthorProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> author() {
     CommentAuthorProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public EventConnectionProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public CommentStatusProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> status() {
     CommentStatusProjection<CommentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public CommentFragmentProjection<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> ip() {
    getFields().put("ip", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CommentFragmentProjection<PARENT, ROOT> userAgent() {
    getFields().put("userAgent", null);
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
