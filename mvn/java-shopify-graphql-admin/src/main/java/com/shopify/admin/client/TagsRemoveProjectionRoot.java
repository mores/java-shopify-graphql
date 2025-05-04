package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TagsRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TagsRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("TagsRemovePayload"));
  }

  public TagsRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NodeProjection<TagsRemoveProjectionRoot<PARENT, ROOT>, TagsRemoveProjectionRoot<PARENT, ROOT>> node(
      ) {
    NodeProjection<TagsRemoveProjectionRoot<PARENT, ROOT>, TagsRemoveProjectionRoot<PARENT, ROOT>> projection = new NodeProjection<>(this, this);    
    getFields().put("node", projection);
    return projection;
  }

  public UserErrorProjection<TagsRemoveProjectionRoot<PARENT, ROOT>, TagsRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<TagsRemoveProjectionRoot<PARENT, ROOT>, TagsRemoveProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
