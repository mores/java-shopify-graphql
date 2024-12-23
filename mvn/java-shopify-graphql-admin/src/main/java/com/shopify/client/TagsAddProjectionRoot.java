package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TagsAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TagsAddProjectionRoot() {
    super(null, null, java.util.Optional.of("TagsAddPayload"));
  }

  public TagsAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NodeProjection<TagsAddProjectionRoot<PARENT, ROOT>, TagsAddProjectionRoot<PARENT, ROOT>> node(
      ) {
    NodeProjection<TagsAddProjectionRoot<PARENT, ROOT>, TagsAddProjectionRoot<PARENT, ROOT>> projection = new NodeProjection<>(this, this);    
    getFields().put("node", projection);
    return projection;
  }

  public UserErrorProjection<TagsAddProjectionRoot<PARENT, ROOT>, TagsAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<TagsAddProjectionRoot<PARENT, ROOT>, TagsAddProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
