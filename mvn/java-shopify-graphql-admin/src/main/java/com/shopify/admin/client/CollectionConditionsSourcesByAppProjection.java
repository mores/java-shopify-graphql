package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CollectionConditionsSourceSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CollectionConditionsSourcesByAppProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourcesByAppProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionConditionsSourcesByApp"));
  }

  public CollectionConditionsSourcesByAppProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public CollectionConditionsSourceConnectionProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> sources(
      ) {
     CollectionConditionsSourceConnectionProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourceConnectionProjection<>(this, getRoot());
     getFields().put("sources", projection);
     return projection;
  }

  public CollectionConditionsSourceConnectionProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> sources(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionConditionsSourceSortKeys sortKey) {
    CollectionConditionsSourceConnectionProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourceConnectionProjection<>(this, getRoot());    
    getFields().put("sources", projection);
    getInputArguments().computeIfAbsent("sources", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("sources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("sources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("sources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("sources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("sources").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("sources").add(sortKeyArg);
    return projection;
  }

  public CollectionConditionsSourceConnectionProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> sourcesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference) {
    CollectionConditionsSourceConnectionProjection<CollectionConditionsSourcesByAppProjection<PARENT, ROOT>, ROOT> projection = new CollectionConditionsSourceConnectionProjection<>(this, getRoot());    
    getFields().put("sources", projection);
    getInputArguments().computeIfAbsent("sources", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("sources").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("CollectionConditionsSourceSortKeys"));
    getInputArguments().get("sources").add(sortKeyArg);
    return projection;
  }
}
