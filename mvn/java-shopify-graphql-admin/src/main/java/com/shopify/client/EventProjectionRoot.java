package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventProjectionRoot() {
    super(null, null, java.util.Optional.of("Event"));
  }

  public EventProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> action() {
    getFields().put("action", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> appTitle() {
    getFields().put("appTitle", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> attributeToApp() {
    getFields().put("attributeToApp", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> attributeToUser() {
    getFields().put("attributeToUser", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> criticalAlert() {
    getFields().put("criticalAlert", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public EventProjectionRoot<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public BasicEventFragmentProjection<EventProjectionRoot<PARENT, ROOT>, EventProjectionRoot<PARENT, ROOT>> onBasicEvent(
      ) {
    BasicEventFragmentProjection<EventProjectionRoot<PARENT, ROOT>, EventProjectionRoot<PARENT, ROOT>> fragment = new BasicEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CommentEventFragmentProjection<EventProjectionRoot<PARENT, ROOT>, EventProjectionRoot<PARENT, ROOT>> onCommentEvent(
      ) {
    CommentEventFragmentProjection<EventProjectionRoot<PARENT, ROOT>, EventProjectionRoot<PARENT, ROOT>> fragment = new CommentEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
