package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryAdjustmentGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryAdjustmentGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryAdjustmentGroup"));
  }

  public InventoryAdjustmentGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public InventoryChangeProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> changes(
      ) {
     InventoryChangeProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> projection = new InventoryChangeProjection<>(this, getRoot());
     getFields().put("changes", projection);
     return projection;
  }

  public InventoryChangeProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> changes(
      List<String> inventoryItemIds, List<String> locationIds, List<String> quantityNames) {
    InventoryChangeProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> projection = new InventoryChangeProjection<>(this, getRoot());    
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

  public StaffMemberProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<InventoryAdjustmentGroupProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public InventoryAdjustmentGroupProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<PARENT, ROOT> reason() {
    getFields().put("reason", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<PARENT, ROOT> referenceDocumentUri() {
    getFields().put("referenceDocumentUri", null);
    return this;
  }
}
