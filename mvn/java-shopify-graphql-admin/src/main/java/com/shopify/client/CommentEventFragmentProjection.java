package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CommentEventFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CommentEventFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CommentEvent"));
  }

  public CommentEventFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CommentEventAttachmentProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> attachments(
      ) {
     CommentEventAttachmentProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentEventAttachmentProjection<>(this, getRoot());
     getFields().put("attachments", projection);
     return projection;
  }

  public StaffMemberProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> author() {
     StaffMemberProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("author", projection);
     return projection;
  }

  public CommentEventEmbedProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> embed() {
     CommentEventEmbedProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentEventEmbedProjection<>(this, getRoot());
     getFields().put("embed", projection);
     return projection;
  }

  public CommentEventSubjectProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> subject(
      ) {
     CommentEventSubjectProjection<CommentEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new CommentEventSubjectProjection<>(this, getRoot());
     getFields().put("subject", projection);
     return projection;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> action() {
    getFields().put("action", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> appTitle() {
    getFields().put("appTitle", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> attributeToApp() {
    getFields().put("attributeToApp", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> attributeToUser() {
    getFields().put("attributeToUser", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> canDelete() {
    getFields().put("canDelete", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> canEdit() {
    getFields().put("canEdit", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> criticalAlert() {
    getFields().put("criticalAlert", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> edited() {
    getFields().put("edited", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public CommentEventFragmentProjection<PARENT, ROOT> rawMessage() {
    getFields().put("rawMessage", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CommentEvent {");
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
