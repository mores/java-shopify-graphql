package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionTypesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionTypesProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionType"));
  }

  public MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionSupportedValidationProjection<MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>, MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>> supportedValidations(
      ) {
    MetafieldDefinitionSupportedValidationProjection<MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>, MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionSupportedValidationProjection<>(this, this);    
    getFields().put("supportedValidations", projection);
    return projection;
  }

  public MetafieldValueTypeProjection<MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>, MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>> valueType(
      ) {
    MetafieldValueTypeProjection<MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>, MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT>> projection = new MetafieldValueTypeProjection<>(this, this);    
    getFields().put("valueType", projection);
    return projection;
  }

  public MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT> category() {
    getFields().put("category", null);
    return this;
  }

  public MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldDefinitionTypesProjectionRoot<PARENT, ROOT> supportsDefinitionMigrations() {
    getFields().put("supportsDefinitionMigrations", null);
    return this;
  }
}
