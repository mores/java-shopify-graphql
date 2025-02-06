package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldValidationStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class MetafieldDefinitionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MetafieldDefinitionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinition"));
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldAccessProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> access(
      ) {
     MetafieldAccessProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldAccessProjection<>(this, getRoot());
     getFields().put("access", projection);
     return projection;
  }

  public MetafieldCapabilitiesProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> capabilities(
      ) {
     MetafieldCapabilitiesProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldCapabilitiesProjection<>(this, getRoot());
     getFields().put("capabilities", projection);
     return projection;
  }

  public MetafieldDefinitionConstraintsProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> constraints(
      ) {
     MetafieldDefinitionConstraintsProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintsProjection<>(this, getRoot());
     getFields().put("constraints", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      MetafieldValidationStatus validationStatus, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    MetafieldConnectionProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public MetafieldOwnerTypeProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     MetafieldOwnerTypeProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> standardTemplate(
      ) {
     StandardMetafieldDefinitionTemplateProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateProjection<>(this, getRoot());
     getFields().put("standardTemplate", projection);
     return projection;
  }

  public MetafieldDefinitionTypeProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     MetafieldDefinitionTypeProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MetafieldDefinitionValidationStatusProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> validationStatus(
      ) {
     MetafieldDefinitionValidationStatusProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationStatusProjection<>(this, getRoot());
     getFields().put("validationStatus", projection);
     return projection;
  }

  public MetafieldDefinitionValidationProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> validations(
      ) {
     MetafieldDefinitionValidationProjection<MetafieldDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionValidationProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> metafieldsCount() {
    getFields().put("metafieldsCount", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection metafieldsCount(
      MetafieldValidationStatus validationStatus) {
    getFields().put("metafieldsCount", null);
    getInputArguments().computeIfAbsent("metafieldsCount", k -> new ArrayList<>());
    InputArgument validationStatusArg = new InputArgument("validationStatus", validationStatus);
    getInputArguments().get("metafieldsCount").add(validationStatusArg);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> namespace() {
    getFields().put("namespace", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> pinnedPosition() {
    getFields().put("pinnedPosition", null);
    return this;
  }

  public MetafieldDefinitionFragmentProjection<PARENT, ROOT> useAsCollectionCondition() {
    getFields().put("useAsCollectionCondition", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MetafieldDefinition {");
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
