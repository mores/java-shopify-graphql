package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CollectionSourceExclusionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionSourceExclusionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionSourceExclusion"));
  }

  public CollectionSourceExclusionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionSourceExclusionConditionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> conditions(
      ) {
     CollectionSourceExclusionConditionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> projection = new CollectionSourceExclusionConditionProjection<>(this, getRoot());
     getFields().put("conditions", projection);
     return projection;
  }

  public CollectionConditionMatchTypeProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> matchType(
      ) {
     CollectionConditionMatchTypeProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionMatchTypeProjection<>(this, getRoot());
     getFields().put("matchType", projection);
     return projection;
  }

  public CollectionExclusionProductSelectionConnectionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> selections(
      ) {
     CollectionExclusionProductSelectionConnectionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> projection = new CollectionExclusionProductSelectionConnectionProjection<>(this, getRoot());
     getFields().put("selections", projection);
     return projection;
  }

  public CollectionExclusionProductSelectionConnectionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> selections(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CollectionExclusionProductSelectionConnectionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> projection = new CollectionExclusionProductSelectionConnectionProjection<>(this, getRoot());    
    getFields().put("selections", projection);
    getInputArguments().computeIfAbsent("selections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("selections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("selections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("selections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("selections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("selections").add(reverseArg);
    return projection;
  }

  public CollectionExclusionProductSelectionConnectionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> selectionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CollectionExclusionProductSelectionConnectionProjection<CollectionSourceExclusionProjection<PARENT, ROOT>, ROOT> projection = new CollectionExclusionProductSelectionConnectionProjection<>(this, getRoot());    
    getFields().put("selections", projection);
    getInputArguments().computeIfAbsent("selections", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("selections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("selections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("selections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("selections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("selections").add(reverseArg);
    return projection;
  }
}
