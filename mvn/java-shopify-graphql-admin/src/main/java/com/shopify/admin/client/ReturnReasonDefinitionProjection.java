package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnReasonDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnReasonDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnReasonDefinition"));
  }

  public ReturnReasonDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnReasonDefinitionProjection<PARENT, ROOT> deleted() {
    getFields().put("deleted", null);
    return this;
  }

  public ReturnReasonDefinitionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ReturnReasonDefinitionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnReasonDefinitionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
