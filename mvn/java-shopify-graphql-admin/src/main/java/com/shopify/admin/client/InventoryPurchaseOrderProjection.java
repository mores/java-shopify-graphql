package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.PurchaseOrderLineItemSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class InventoryPurchaseOrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryPurchaseOrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryPurchaseOrder"));
  }

  public InventoryPurchaseOrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyCodeProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> currency() {
     CurrencyCodeProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public LocationSnapshotProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> destination(
      ) {
     LocationSnapshotProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new LocationSnapshotProjection<>(this, getRoot());
     getFields().put("destination", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> lineItems(
      String lineItemId, Integer first, String after, Integer last, String before, Boolean reverse,
      PurchaseOrderLineItemSortKeys sortKey, String query) {
    InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument lineItemIdArg = new InputArgument("lineItemId", lineItemId, false, null);
    getInputArguments().get("lineItems").add(lineItemIdArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("lineItems").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> lineItemsWithVariableReferences(
      String lineItemIdReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    InventoryPurchaseOrderLineItemConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());              
    InputArgument lineItemIdArg = new InputArgument("lineItemId", lineItemIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("lineItems").add(lineItemIdArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("PurchaseOrderLineItemSortKeys"));
    getInputArguments().get("lineItems").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public InventorySupplierSnapshotProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     InventorySupplierSnapshotProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventorySupplierSnapshotProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public InventoryPurchaseOrderStatusProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> status(
      ) {
     InventoryPurchaseOrderStatusProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryPurchaseOrderStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public InventoryTransferConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> transfers(
      ) {
     InventoryTransferConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());
     getFields().put("transfers", projection);
     return projection;
  }

  public InventoryTransferConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> transfers(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    InventoryTransferConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());    
    getFields().put("transfers", projection);
    getInputArguments().computeIfAbsent("transfers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("transfers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("transfers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("transfers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("transfers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("transfers").add(reverseArg);
    return projection;
  }

  public InventoryTransferConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> transfersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    InventoryTransferConnectionProjection<InventoryPurchaseOrderProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());    
    getFields().put("transfers", projection);
    getInputArguments().computeIfAbsent("transfers", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transfers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transfers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transfers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transfers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("transfers").add(reverseArg);
    return projection;
  }

  public InventoryPurchaseOrderProjection<PARENT, ROOT> archivedAt() {
    getFields().put("archivedAt", null);
    return this;
  }

  public InventoryPurchaseOrderProjection<PARENT, ROOT> dateCreated() {
    getFields().put("dateCreated", null);
    return this;
  }

  public InventoryPurchaseOrderProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryPurchaseOrderProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryPurchaseOrderProjection<PARENT, ROOT> orderedAt() {
    getFields().put("orderedAt", null);
    return this;
  }
}
