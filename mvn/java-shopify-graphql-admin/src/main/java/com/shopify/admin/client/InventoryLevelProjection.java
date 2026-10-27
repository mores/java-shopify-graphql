package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ScheduledChangeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryLevel"));
  }

  public InventoryLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> item() {
     InventoryItemProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("item", projection);
     return projection;
  }

  public LocationProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public InventoryQuantityProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> quantities() {
     InventoryQuantityProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryQuantityProjection<>(this, getRoot());
     getFields().put("quantities", projection);
     return projection;
  }

  public InventoryQuantityProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> quantities(
      List<String> names) {
    InventoryQuantityProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryQuantityProjection<>(this, getRoot());    
    getFields().put("quantities", projection);
    getInputArguments().computeIfAbsent("quantities", k -> new ArrayList<>());                      
    InputArgument namesArg = new InputArgument("names", names, false, null);
    getInputArguments().get("quantities").add(namesArg);
    return projection;
  }

  public InventoryQuantityProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> quantitiesWithVariableReferences(
      String namesReference) {
    InventoryQuantityProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryQuantityProjection<>(this, getRoot());    
    getFields().put("quantities", projection);
    getInputArguments().computeIfAbsent("quantities", k -> new ArrayList<>());              
    InputArgument namesArg = new InputArgument("names", namesReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String")))));
    getInputArguments().get("quantities").add(namesArg);
    return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> scheduledChanges(
      ) {
     InventoryScheduledChangeConnectionProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeConnectionProjection<>(this, getRoot());
     getFields().put("scheduledChanges", projection);
     return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> scheduledChanges(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ScheduledChangeSortKeys sortKey, String query) {
    InventoryScheduledChangeConnectionProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeConnectionProjection<>(this, getRoot());    
    getFields().put("scheduledChanges", projection);
    getInputArguments().computeIfAbsent("scheduledChanges", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("scheduledChanges").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("scheduledChanges").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("scheduledChanges").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("scheduledChanges").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("scheduledChanges").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("scheduledChanges").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("scheduledChanges").add(queryArg);
    return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> scheduledChangesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    InventoryScheduledChangeConnectionProjection<InventoryLevelProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeConnectionProjection<>(this, getRoot());    
    getFields().put("scheduledChanges", projection);
    getInputArguments().computeIfAbsent("scheduledChanges", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("scheduledChanges").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("scheduledChanges").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("scheduledChanges").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("scheduledChanges").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("scheduledChanges").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ScheduledChangeSortKeys"));
    getInputArguments().get("scheduledChanges").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("scheduledChanges").add(queryArg);
    return projection;
  }

  public InventoryLevelProjection<PARENT, ROOT> canDeactivate() {
    getFields().put("canDeactivate", null);
    return this;
  }

  public InventoryLevelProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryLevelProjection<PARENT, ROOT> deactivationAlert() {
    getFields().put("deactivationAlert", null);
    return this;
  }

  public InventoryLevelProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryLevelProjection<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }

  public InventoryLevelProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
