package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ScheduledChangeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryLevelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryLevelProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryLevel"));
  }

  public InventoryLevelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> item(
      ) {
    InventoryItemProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("item", projection);
    return projection;
  }

  public LocationProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public InventoryQuantityProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> quantities(
      ) {
    InventoryQuantityProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryQuantityProjection<>(this, this);    
    getFields().put("quantities", projection);
    return projection;
  }

  public InventoryQuantityProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> quantities(
      List<String> names) {
    InventoryQuantityProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryQuantityProjection<>(this, this);    
    getFields().put("quantities", projection);
    getInputArguments().computeIfAbsent("quantities", k -> new ArrayList<>());                      
    InputArgument namesArg = new InputArgument("names", names, false, null);
    getInputArguments().get("quantities").add(namesArg);
    return projection;
  }

  public InventoryQuantityProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> quantitiesWithVariableReferences(
      String namesReference) {
    InventoryQuantityProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryQuantityProjection<>(this, this);    
    getFields().put("quantities", projection);
    getInputArguments().computeIfAbsent("quantities", k -> new ArrayList<>());              
    InputArgument namesArg = new InputArgument("names", namesReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String")))));
    getInputArguments().get("quantities").add(namesArg);
    return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> scheduledChanges(
      ) {
    InventoryScheduledChangeConnectionProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryScheduledChangeConnectionProjection<>(this, this);    
    getFields().put("scheduledChanges", projection);
    return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> scheduledChanges(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ScheduledChangeSortKeys sortKey, String query) {
    InventoryScheduledChangeConnectionProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryScheduledChangeConnectionProjection<>(this, this);    
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

  public InventoryScheduledChangeConnectionProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> scheduledChangesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    InventoryScheduledChangeConnectionProjection<InventoryLevelProjectionRoot<PARENT, ROOT>, InventoryLevelProjectionRoot<PARENT, ROOT>> projection = new InventoryScheduledChangeConnectionProjection<>(this, this);    
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

  public InventoryLevelProjectionRoot<PARENT, ROOT> canDeactivate() {
    getFields().put("canDeactivate", null);
    return this;
  }

  public InventoryLevelProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryLevelProjectionRoot<PARENT, ROOT> deactivationAlert() {
    getFields().put("deactivationAlert", null);
    return this;
  }

  public InventoryLevelProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryLevelProjectionRoot<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }

  public InventoryLevelProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
