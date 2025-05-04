package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Event"));
  }

  public EventProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> action() {
    getFields().put("action", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> appTitle() {
    getFields().put("appTitle", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> attributeToApp() {
    getFields().put("attributeToApp", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> attributeToUser() {
    getFields().put("attributeToUser", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> criticalAlert() {
    getFields().put("criticalAlert", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public EventProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public BasicEventFragmentProjection<EventProjection<PARENT, ROOT>, ROOT> onBasicEvent() {
    BasicEventFragmentProjection<EventProjection<PARENT, ROOT>, ROOT> fragment = new BasicEventFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CommentEventFragmentProjection<EventProjection<PARENT, ROOT>, ROOT> onCommentEvent() {
    CommentEventFragmentProjection<EventProjection<PARENT, ROOT>, ROOT> fragment = new CommentEventFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
