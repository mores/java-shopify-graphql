package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionValidationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionValidationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionValidation"));
  }

  public MetafieldDefinitionValidationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionValidationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldDefinitionValidationProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public MetafieldDefinitionValidationProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
