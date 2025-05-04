package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CommentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CommentProjectionRoot() {
    super(null, null, java.util.Optional.of("Comment"));
  }

  public CommentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> article(
      ) {
    ArticleProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> projection = new ArticleProjection<>(this, this);    
    getFields().put("article", projection);
    return projection;
  }

  public CommentAuthorProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> author(
      ) {
    CommentAuthorProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> projection = new CommentAuthorProjection<>(this, this);    
    getFields().put("author", projection);
    return projection;
  }

  public EventConnectionProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public CommentStatusProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> status(
      ) {
    CommentStatusProjection<CommentProjectionRoot<PARENT, ROOT>, CommentProjectionRoot<PARENT, ROOT>> projection = new CommentStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public CommentProjectionRoot<PARENT, ROOT> body() {
    getFields().put("body", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> bodyHtml() {
    getFields().put("bodyHtml", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> ip() {
    getFields().put("ip", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> publishedAt() {
    getFields().put("publishedAt", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CommentProjectionRoot<PARENT, ROOT> userAgent() {
    getFields().put("userAgent", null);
    return this;
  }
}
