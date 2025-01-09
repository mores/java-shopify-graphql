package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldValidationStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetafieldDefinitionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinition"));
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldAccessProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> access(
      ) {
    MetafieldAccessProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldAccessProjection<>(this, this);    
    getFields().put("access", projection);
    return projection;
  }

  public MetafieldCapabilitiesProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> capabilities(
      ) {
    MetafieldCapabilitiesProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldCapabilitiesProjection<>(this, this);    
    getFields().put("capabilities", projection);
    return projection;
  }

  public MetafieldDefinitionConstraintsProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> constraints(
      ) {
    MetafieldDefinitionConstraintsProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConstraintsProjection<>(this, this);    
    getFields().put("constraints", projection);
    return projection;
  }

  public MetafieldConnectionProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> metafields(
      MetafieldValidationStatus validationStatus, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    MetafieldConnectionProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument validationStatusArg = new InputArgument("validationStatus", validationStatus);
    getInputArguments().get("metafields").add(validationStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public IntProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> metafieldsCount(
      MetafieldValidationStatus validationStatus) {
    IntProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new IntProjection<>(this, this);    
    getFields().put("metafieldsCount", projection);
    getInputArguments().computeIfAbsent("metafieldsCount", k -> new ArrayList<>());                      
    InputArgument validationStatusArg = new InputArgument("validationStatus", validationStatus);
    getInputArguments().get("metafieldsCount").add(validationStatusArg);
    return projection;
  }

  public MetafieldOwnerTypeProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> ownerType(
      ) {
    MetafieldOwnerTypeProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldOwnerTypeProjection<>(this, this);    
    getFields().put("ownerType", projection);
    return projection;
  }

  public StandardMetafieldDefinitionTemplateProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> standardTemplate(
      ) {
    StandardMetafieldDefinitionTemplateProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new StandardMetafieldDefinitionTemplateProjection<>(this, this);    
    getFields().put("standardTemplate", projection);
    return projection;
  }

  public MetafieldDefinitionTypeProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> type(
      ) {
    MetafieldDefinitionTypeProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionTypeProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public MetafieldDefinitionValidationStatusProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> validationStatus(
      ) {
    MetafieldDefinitionValidationStatusProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionValidationStatusProjection<>(this, this);    
    getFields().put("validationStatus", projection);
    return projection;
  }

  public MetafieldDefinitionValidationProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> validations(
      ) {
    MetafieldDefinitionValidationProjection<MetafieldDefinitionProjectionRoot<PARENT, ROOT>, MetafieldDefinitionProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionValidationProjection<>(this, this);    
    getFields().put("validations", projection);
    return projection;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> metafieldsCount() {
    getFields().put("metafieldsCount", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> pinnedPosition() {
    getFields().put("pinnedPosition", null);
    return this;
  }

  public MetafieldDefinitionProjectionRoot<PARENT, ROOT> useAsCollectionCondition() {
    getFields().put("useAsCollectionCondition", null);
    return this;
  }
}
