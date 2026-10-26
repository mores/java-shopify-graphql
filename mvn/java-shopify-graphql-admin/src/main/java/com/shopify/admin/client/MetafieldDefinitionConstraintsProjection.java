package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class MetafieldDefinitionConstraintsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionConstraintsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionConstraints"));
  }

  public MetafieldDefinitionConstraintsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionConstraintValueConnectionProjection<MetafieldDefinitionConstraintsProjection<PARENT, ROOT>, ROOT> values(
      ) {
     MetafieldDefinitionConstraintValueConnectionProjection<MetafieldDefinitionConstraintsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintValueConnectionProjection<>(this, getRoot());
     getFields().put("values", projection);
     return projection;
  }

  public MetafieldDefinitionConstraintValueConnectionProjection<MetafieldDefinitionConstraintsProjection<PARENT, ROOT>, ROOT> values(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetafieldDefinitionConstraintValueConnectionProjection<MetafieldDefinitionConstraintsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintValueConnectionProjection<>(this, getRoot());    
    getFields().put("values", projection);
    getInputArguments().computeIfAbsent("values", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("values").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("values").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("values").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("values").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("values").add(reverseArg);
    return projection;
  }

  public MetafieldDefinitionConstraintValueConnectionProjection<MetafieldDefinitionConstraintsProjection<PARENT, ROOT>, ROOT> valuesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MetafieldDefinitionConstraintValueConnectionProjection<MetafieldDefinitionConstraintsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConstraintValueConnectionProjection<>(this, getRoot());    
    getFields().put("values", projection);
    getInputArguments().computeIfAbsent("values", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("values").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("values").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("values").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("values").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("values").add(reverseArg);
    return projection;
  }

  public MetafieldDefinitionConstraintsProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }
}
