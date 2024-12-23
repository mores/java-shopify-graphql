package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldValidationStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetafieldDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinition"));
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldAccessProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> access() {
     MetafieldAccessProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldAccessProjection<>(this, getRoot());
     getFields().put("access", projection);
     return projection;
  }

  public MetafieldCapabilitiesProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> capabilities(
      ) {
     MetafieldCapabilitiesProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldCapabilitiesProjection<>(this, getRoot());
     getFields().put("capabilities", projection);
     return projection;
  }

  public MetafieldDefinitionConstraintsProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> constraints(
      ) {
     MetafieldDefinitionConstraintsProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintsProjection<>(this, getRoot());
     getFields().put("constraints", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> metafields(
      MetafieldValidationStatus validationStatus, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    MetafieldConnectionProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public MetafieldOwnerTypeProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> standardTemplate(
      ) {
     StandardMetafieldDefinitionTemplateProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateProjection<>(this, getRoot());
     getFields().put("standardTemplate", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationStatusProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> validationStatus(
      ) {
     MetafieldDefinitionValidationStatusProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationStatusProjection<>(this, getRoot());
     getFields().put("validationStatus", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<MetafieldDefinitionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> metafieldsCount() {
    getFields().put("metafieldsCount", null);
    return this;
  }

  public MetafieldDefinitionProjection metafieldsCount(MetafieldValidationStatus validationStatus) {
    getFields().put("metafieldsCount", null);
    getInputArguments().computeIfAbsent("metafieldsCount", k -> new ArrayList<>());
    InputArgument validationStatusArg = new InputArgument("validationStatus", validationStatus);
    getInputArguments().get("metafieldsCount").add(validationStatusArg);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> pinnedPosition() {
    getFields().put("pinnedPosition", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> useAsCollectionCondition() {
    getFields().put("useAsCollectionCondition", null);
    return this;
  }

  public MetafieldDefinitionProjection<PARENT, ROOT> visibleToStorefrontApi() {
    getFields().put("visibleToStorefrontApi", null);
    return this;
  }
}
