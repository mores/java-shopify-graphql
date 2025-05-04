package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionType"));
  }

  public MetafieldDefinitionTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionSupportedValidationProjection<MetafieldDefinitionTypeProjection<PARENT, ROOT>, ROOT> supportedValidations(
      ) {
     MetafieldDefinitionSupportedValidationProjection<MetafieldDefinitionTypeProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionSupportedValidationProjection<>(this, getRoot());
     getFields().put("supportedValidations", projection);
     return projection;
  }

  public MetafieldValueTypeProjection<MetafieldDefinitionTypeProjection<PARENT, ROOT>, ROOT> valueType(
      ) {
     MetafieldValueTypeProjection<MetafieldDefinitionTypeProjection<PARENT, ROOT>, ROOT> projection = new MetafieldValueTypeProjection<>(this, getRoot());
     getFields().put("valueType", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<PARENT, ROOT> category() {
    getFields().put("category", null);
    return this;
  }

  public MetafieldDefinitionTypeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldDefinitionTypeProjection<PARENT, ROOT> supportsDefinitionMigrations() {
    getFields().put("supportsDefinitionMigrations", null);
    return this;
  }
}
