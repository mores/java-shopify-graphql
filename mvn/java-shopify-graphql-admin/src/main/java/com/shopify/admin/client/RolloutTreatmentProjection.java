package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class RolloutTreatmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutTreatmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutTreatment"));
  }

  public RolloutTreatmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutChangeConnectionProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> changes(
      ) {
     RolloutChangeConnectionProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeConnectionProjection<>(this, getRoot());
     getFields().put("changes", projection);
     return projection;
  }

  public RolloutChangeConnectionProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> changes(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    RolloutChangeConnectionProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeConnectionProjection<>(this, getRoot());    
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

  public RolloutChangeConnectionProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> changesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    RolloutChangeConnectionProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeConnectionProjection<>(this, getRoot());    
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

  public RolloutProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> rollout() {
     RolloutProjection<RolloutTreatmentProjection<PARENT, ROOT>, ROOT> projection = new RolloutProjection<>(this, getRoot());
     getFields().put("rollout", projection);
     return projection;
  }

  public RolloutTreatmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RolloutTreatmentProjection<PARENT, ROOT> split() {
    getFields().put("split", null);
    return this;
  }
}
