package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryAdjustmentGroupFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryAdjustmentGroupFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryAdjustmentGroup"));
  }

  public InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public InventoryChangeProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> changes(
      ) {
     InventoryChangeProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryChangeProjection<>(this, getRoot());
     getFields().put("changes", projection);
     return projection;
  }

  public InventoryChangeProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> changes(
      List<String> inventoryItemIds, List<String> locationIds, List<String> quantityNames) {
    InventoryChangeProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryChangeProjection<>(this, getRoot());    
    getFields().put("changes", projection);
    getInputArguments().computeIfAbsent("changes", k -> new ArrayList<>());                      
    InputArgument inventoryItemIdsArg = new InputArgument("inventoryItemIds", inventoryItemIds);
    getInputArguments().get("changes").add(inventoryItemIdsArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIds);
    getInputArguments().get("changes").add(locationIdsArg);
    InputArgument quantityNamesArg = new InputArgument("quantityNames", quantityNames);
    getInputArguments().get("changes").add(quantityNamesArg);
    return projection;
  }

  public StaffMemberProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT> reason() {
    getFields().put("reason", null);
    return this;
  }

  public InventoryAdjustmentGroupFragmentProjection<PARENT, ROOT> referenceDocumentUri() {
    getFields().put("referenceDocumentUri", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryAdjustmentGroup {");
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
