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
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("values").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("values").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("values").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("values").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("values").add(reverseArg);
    return projection;
  }

  public MetafieldDefinitionConstraintsProjection<PARENT, ROOT> key() {
    getFields().put("key", null);
    return this;
  }
}
