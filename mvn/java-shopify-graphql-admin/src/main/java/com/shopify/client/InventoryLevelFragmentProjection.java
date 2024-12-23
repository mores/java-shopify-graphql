package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.ScheduledChangeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryLevelFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryLevelFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryLevel"));
  }

  public InventoryLevelFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> item() {
     InventoryItemProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("item", projection);
     return projection;
  }

  public LocationProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public InventoryQuantityProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> quantities(
      ) {
     InventoryQuantityProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryQuantityProjection<>(this, getRoot());
     getFields().put("quantities", projection);
     return projection;
  }

  public InventoryQuantityProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> quantities(
      List<String> names) {
    InventoryQuantityProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryQuantityProjection<>(this, getRoot());    
    getFields().put("quantities", projection);
    getInputArguments().computeIfAbsent("quantities", k -> new ArrayList<>());                      
    InputArgument namesArg = new InputArgument("names", names);
    getInputArguments().get("quantities").add(namesArg);
    return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> scheduledChanges(
      ) {
     InventoryScheduledChangeConnectionProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeConnectionProjection<>(this, getRoot());
     getFields().put("scheduledChanges", projection);
     return projection;
  }

  public InventoryScheduledChangeConnectionProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> scheduledChanges(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ScheduledChangeSortKeys sortKey, String query) {
    InventoryScheduledChangeConnectionProjection<InventoryLevelFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryScheduledChangeConnectionProjection<>(this, getRoot());    
    getFields().put("scheduledChanges", projection);
    getInputArguments().computeIfAbsent("scheduledChanges", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("scheduledChanges").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("scheduledChanges").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("scheduledChanges").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("scheduledChanges").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("scheduledChanges").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("scheduledChanges").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("scheduledChanges").add(queryArg);
    return projection;
  }

  public InventoryLevelFragmentProjection<PARENT, ROOT> canDeactivate() {
    getFields().put("canDeactivate", null);
    return this;
  }

  public InventoryLevelFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryLevelFragmentProjection<PARENT, ROOT> deactivationAlert() {
    getFields().put("deactivationAlert", null);
    return this;
  }

  public InventoryLevelFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryLevelFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryLevel {");
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
