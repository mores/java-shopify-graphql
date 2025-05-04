package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionUpdatePayload"));
  }

  public MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>> updatedDefinition(
      ) {
    MetafieldDefinitionProjection<MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionProjection<>(this, this);    
    getFields().put("updatedDefinition", projection);
    return projection;
  }

  public MetafieldDefinitionUpdateUserErrorProjection<MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldDefinitionUpdateUserErrorProjection<MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public JobProjection<MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>> validationJob(
      ) {
    JobProjection<MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUpdateProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("validationJob", projection);
    return projection;
  }
}
