package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class RolloutTreatmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RolloutTreatmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutTreatment"));
  }

  public RolloutTreatmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutChangeConnectionProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> changes(
      ) {
     RolloutChangeConnectionProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeConnectionProjection<>(this, getRoot());
     getFields().put("changes", projection);
     return projection;
  }

  public RolloutChangeConnectionProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> changes(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    RolloutChangeConnectionProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeConnectionProjection<>(this, getRoot());    
    getFields().put("changes", projection);
    getInputArguments().computeIfAbsent("changes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("changes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("changes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("changes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("changes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("changes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("changes").add(queryArg);
    return projection;
  }

  public RolloutChangeConnectionProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> changesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    RolloutChangeConnectionProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeConnectionProjection<>(this, getRoot());    
    getFields().put("changes", projection);
    getInputArguments().computeIfAbsent("changes", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("changes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("changes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("changes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("changes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("changes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("changes").add(queryArg);
    return projection;
  }

  public RolloutProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> rollout() {
     RolloutProjection<RolloutTreatmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutProjection<>(this, getRoot());
     getFields().put("rollout", projection);
     return projection;
  }

  public RolloutTreatmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RolloutTreatmentFragmentProjection<PARENT, ROOT> split() {
    getFields().put("split", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RolloutTreatment {");
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
