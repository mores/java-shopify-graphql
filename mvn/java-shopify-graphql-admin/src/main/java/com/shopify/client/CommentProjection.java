package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.EventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CommentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Comment"));
  }

  public CommentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<CommentProjection<PARENT, ROOT>, ROOT> article() {
     ArticleProjection<CommentProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("article", projection);
     return projection;
  }

  public CommentAuthorProjection<CommentProjection<PARENT, ROOT>, ROOT> author() {
     CommentAuthorProjection<CommentProjection<PARENT, ROOT>, ROOT> projection = new CommentAuthorProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public EventConnectionProjection<CommentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CommentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CommentProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<CommentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public CommentStatusProjection<CommentProjection<PARENT, ROOT>, ROOT> status() {
     CommentStatusProjection<CommentProjection<PARENT, ROOT>, ROOT> projection = new CommentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public CommentProjection<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> ip() {
    getFields().put("ip", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CommentProjection<PARENT, ROOT> userAgent() {
    getFields().put("userAgent", null);
    return this;
  }
}
